import com.mojang.serialization.Codec;
import java.util.Optional;

public class eeq extends edu<egh> {
   public eeq(Codec<egh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egh> $$0) {
      dek $$1 = $$0.b();
      jf $$2 = $$0.e();
      azn $$3 = $$0.d();
      egh $$4 = $$0.f();
      Optional<jk> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jf $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && edp.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         edp.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jk> a(dek $$0, jf $$1, azn $$2) {
      boolean $$3 = edp.b($$0.a_($$1.d()));
      boolean $$4 = edp.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jk.a : jk.b);
      } else if ($$3) {
         return Optional.of(jk.a);
      } else {
         return $$4 ? Optional.of(jk.b) : Optional.empty();
      }
   }

   private static void a(dek $$0, azn $$1, jf $$2, egh $$3) {
      edp.c($$0, $$2);

      for (jk $$4 : jk.c.a) {
         if (!($$1.i() > $$3.c)) {
            jf $$5 = $$2.a($$4);
            edp.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               jf $$6 = $$5.a(jk.b($$1));
               edp.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  jf $$7 = $$6.a(jk.b($$1));
                  edp.c($$0, $$7);
               }
            }
         }
      }
   }
}
