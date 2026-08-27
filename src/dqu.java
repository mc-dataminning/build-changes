import com.mojang.serialization.Codec;

public class dqu extends dpv<dsl> {
   public dqu(Codec<dsl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsl> $$0) {
      dsl $$1 = $$0.f();
      ats $$2 = $$0.d();
      csu $$3 = $$0.b();
      djf $$4 = $$0.c();
      ht $$5 = $$0.e();

      for (drp $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
