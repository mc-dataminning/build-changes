import com.mojang.serialization.Codec;
import java.util.Optional;

public class eca extends ebe<edr> {
   public eca(Codec<edr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edr> $$0) {
      dce $$1 = $$0.b();
      ja $$2 = $$0.e();
      aym $$3 = $$0.d();
      edr $$4 = $$0.f();
      Optional<jf> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ja $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && eba.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         eba.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jf> a(dce $$0, ja $$1, aym $$2) {
      boolean $$3 = eba.b($$0.a_($$1.c()));
      boolean $$4 = eba.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jf.a : jf.b);
      } else if ($$3) {
         return Optional.of(jf.a);
      } else {
         return $$4 ? Optional.of(jf.b) : Optional.empty();
      }
   }

   private static void a(dce $$0, aym $$1, ja $$2, edr $$3) {
      eba.c($$0, $$2);

      for (jf $$4 : jf.c.a) {
         if (!($$1.i() > $$3.c)) {
            ja $$5 = $$2.a($$4);
            eba.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               ja $$6 = $$5.a(jf.b($$1));
               eba.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  ja $$7 = $$6.a(jf.b($$1));
                  eba.c($$0, $$7);
               }
            }
         }
      }
   }
}
