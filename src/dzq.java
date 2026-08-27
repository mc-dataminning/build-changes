import com.mojang.serialization.Codec;
import java.util.Optional;

public class dzq extends dyu<ebh> {
   public dzq(Codec<ebh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebh> $$0) {
      czv $$1 = $$0.b();
      im $$2 = $$0.e();
      ayd $$3 = $$0.d();
      ebh $$4 = $$0.f();
      Optional<ir> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         im $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dyq.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dyq.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<ir> a(czv $$0, im $$1, ayd $$2) {
      boolean $$3 = dyq.b($$0.a_($$1.c()));
      boolean $$4 = dyq.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? ir.a : ir.b);
      } else if ($$3) {
         return Optional.of(ir.a);
      } else {
         return $$4 ? Optional.of(ir.b) : Optional.empty();
      }
   }

   private static void a(czv $$0, ayd $$1, im $$2, ebh $$3) {
      dyq.c($$0, $$2);

      for (ir $$4 : ir.c.a) {
         if (!($$1.i() > $$3.c)) {
            im $$5 = $$2.a($$4);
            dyq.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               im $$6 = $$5.a(ir.b($$1));
               dyq.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  im $$7 = $$6.a(ir.b($$1));
                  dyq.c($$0, $$7);
               }
            }
         }
      }
   }
}
