import com.mojang.serialization.Codec;
import java.util.Optional;

public class efb extends eef<egs> {
   public efb(Codec<egs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egs> $$0) {
      dew $$1 = $$0.b();
      jg $$2 = $$0.e();
      azr $$3 = $$0.d();
      egs $$4 = $$0.f();
      Optional<jl> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jg $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && eea.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         eea.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jl> a(dew $$0, jg $$1, azr $$2) {
      boolean $$3 = eea.b($$0.a_($$1.d()));
      boolean $$4 = eea.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jl.a : jl.b);
      } else if ($$3) {
         return Optional.of(jl.a);
      } else {
         return $$4 ? Optional.of(jl.b) : Optional.empty();
      }
   }

   private static void a(dew $$0, azr $$1, jg $$2, egs $$3) {
      eea.c($$0, $$2);

      for (jl $$4 : jl.c.a) {
         if (!($$1.i() > $$3.c)) {
            jg $$5 = $$2.a($$4);
            eea.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               jg $$6 = $$5.a(jl.b($$1));
               eea.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  jg $$7 = $$6.a(jl.b($$1));
                  eea.c($$0, $$7);
               }
            }
         }
      }
   }
}
