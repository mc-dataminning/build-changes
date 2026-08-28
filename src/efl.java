import com.mojang.serialization.Codec;
import java.util.Optional;

public class efl extends eep<ehc> {
   public efl(Codec<ehc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<ehc> $$0) {
      dfg $$1 = $$0.b();
      jh $$2 = $$0.e();
      azv $$3 = $$0.d();
      ehc $$4 = $$0.f();
      Optional<jm> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jh $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && eek.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         eek.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jm> a(dfg $$0, jh $$1, azv $$2) {
      boolean $$3 = eek.b($$0.a_($$1.d()));
      boolean $$4 = eek.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jm.a : jm.b);
      } else if ($$3) {
         return Optional.of(jm.a);
      } else {
         return $$4 ? Optional.of(jm.b) : Optional.empty();
      }
   }

   private static void a(dfg $$0, azv $$1, jh $$2, ehc $$3) {
      eek.c($$0, $$2);

      for (jm $$4 : jm.c.a) {
         if (!($$1.i() > $$3.c)) {
            jh $$5 = $$2.a($$4);
            eek.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               jh $$6 = $$5.a(jm.b($$1));
               eek.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  jh $$7 = $$6.a(jm.b($$1));
                  eek.c($$0, $$7);
               }
            }
         }
      }
   }
}
