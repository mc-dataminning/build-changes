import com.mojang.serialization.Codec;

public class dqz extends dpj<dru> {
   public dqz(Codec<dru> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<dru> $$0) {
      csm $$1 = $$0.b();
      ht $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (hx $$3 : hx.values()) {
            if ($$3 != hx.a && ddl.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cuv.ff.o().a(ddl.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
