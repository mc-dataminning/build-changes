import com.mojang.serialization.Codec;

public class eab extends dyu<ebq> {
   public eab(Codec<ebq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebq> $$0) {
      ebq $$1 = $$0.f();
      dap $$2 = $$0.b();
      im $$3 = $$0.e();
      dpy $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dfd) {
            if (!$$2.u($$3.c())) {
               return false;
            }

            dfd.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
