import com.mojang.serialization.Codec;

public class ehf extends efy<eiu> {
   public ehf(Codec<eiu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eiu> $$0) {
      eiu $$1 = $$0.f();
      dhg $$2 = $$0.b();
      ji $$3 = $$0.e();
      dwx $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dlv) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dlv.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dom) {
            dom.a($$2, $$3, $$2.H_(), 2);
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
