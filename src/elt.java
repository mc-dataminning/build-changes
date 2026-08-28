import com.mojang.serialization.Codec;

public class elt extends ekm<enj> {
   public elt(Codec<enj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<enj> $$0) {
      enj $$1 = $$0.f();
      dky $$2 = $$0.b();
      iw $$3 = $$0.e();
      ebg $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dpn) {
            if (!$$2.v($$3.d())) {
               return false;
            }

            dpn.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dsi) {
            dsi.a($$2, $$3, $$2.G_(), 2);
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
