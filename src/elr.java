import com.mojang.serialization.Codec;

public class elr extends ekk<enh> {
   public elr(Codec<enh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<enh> $$0) {
      enh $$1 = $$0.f();
      dkw $$2 = $$0.b();
      iv $$3 = $$0.e();
      ebe $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dpl) {
            if (!$$2.v($$3.d())) {
               return false;
            }

            dpl.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dsg) {
            dsg.a($$2, $$3, $$2.G_(), 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         if ($$1.b()) {
            $$2.a($$3, $$2.a_($$3).b(), 1);
         }

         return true;
      } else {
         return false;
      }
   }
}
