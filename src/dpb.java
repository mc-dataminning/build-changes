import com.mojang.serialization.Codec;

public class dpb extends dnl<dpw> {
   public dpb(Codec<dpw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpw> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (hb $$3 : hb.values()) {
            if ($$3 != hb.a && dbe.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, csl.ff.n().a(dbe.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
