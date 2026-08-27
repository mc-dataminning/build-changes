import com.mojang.serialization.Codec;

public class dpd extends dnn<dpy> {
   public dpd(Codec<dpy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dpy> $$0) {
      cqg $$1 = $$0.b();
      gu $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (ha $$3 : ha.values()) {
            if ($$3 != ha.a && dbg.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, csn.ff.n().a(dbg.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
