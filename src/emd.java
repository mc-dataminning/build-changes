import com.mojang.serialization.Codec;

public class emd extends ekw<ent> {
   public emd(Codec<ent> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<ent> $$0) {
      ent $$1 = $$0.f();
      dli $$2 = $$0.b();
      iw $$3 = $$0.e();
      ebq $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dpx) {
            if (!$$2.v($$3.d())) {
               return false;
            }

            dpx.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dss) {
            dss.a($$2, $$3, $$2.G_(), 2);
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
