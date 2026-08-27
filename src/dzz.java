import com.mojang.serialization.Codec;
import java.util.Optional;

public class dzz extends dzd<ebq> {
   public dzz(Codec<ebq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebq> $$0) {
      dae $$1 = $$0.b();
      in $$2 = $$0.e();
      ayg $$3 = $$0.d();
      ebq $$4 = $$0.f();
      Optional<is> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         in $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dyz.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dyz.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<is> a(dae $$0, in $$1, ayg $$2) {
      boolean $$3 = dyz.b($$0.a_($$1.c()));
      boolean $$4 = dyz.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? is.a : is.b);
      } else if ($$3) {
         return Optional.of(is.a);
      } else {
         return $$4 ? Optional.of(is.b) : Optional.empty();
      }
   }

   private static void a(dae $$0, ayg $$1, in $$2, ebq $$3) {
      dyz.c($$0, $$2);

      for (is $$4 : is.c.a) {
         if (!($$1.i() > $$3.c)) {
            in $$5 = $$2.a($$4);
            dyz.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               in $$6 = $$5.a(is.b($$1));
               dyz.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  in $$7 = $$6.a(is.b($$1));
                  dyz.c($$0, $$7);
               }
            }
         }
      }
   }
}
