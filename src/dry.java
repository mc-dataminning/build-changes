import com.mojang.serialization.Codec;
import java.util.Optional;

public class dry extends drc<dtp> {
   public dry(Codec<dtp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtp> $$0) {
      csz $$1 = $$0.b();
      hv $$2 = $$0.e();
      auf $$3 = $$0.d();
      dtp $$4 = $$0.f();
      Optional<ia> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hv $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dqy.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dqy.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<ia> a(csz $$0, hv $$1, auf $$2) {
      boolean $$3 = dqy.b($$0.a_($$1.c()));
      boolean $$4 = dqy.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? ia.a : ia.b);
      } else if ($$3) {
         return Optional.of(ia.a);
      } else {
         return $$4 ? Optional.of(ia.b) : Optional.empty();
      }
   }

   private static void a(csz $$0, auf $$1, hv $$2, dtp $$3) {
      dqy.c($$0, $$2);

      for (ia $$4 : ia.c.a) {
         if (!($$1.i() > $$3.c)) {
            hv $$5 = $$2.a($$4);
            dqy.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               hv $$6 = $$5.a(ia.b($$1));
               dqy.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  hv $$7 = $$6.a(ia.b($$1));
                  dqy.c($$0, $$7);
               }
            }
         }
      }
   }
}
