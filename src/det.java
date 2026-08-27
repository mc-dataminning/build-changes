import com.mojang.serialization.MapCodec;

public class det extends cwy implements cws {
   public static final MapCodec<det> a = b(det::new);
   protected static final float b = 6.0F;
   protected static final eml c = cwp.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<det> a() {
      return a;
   }

   protected det(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return true;
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      cyx $$4 = (cyx)($$3.a(cwr.bu) ? cwr.iI : cwr.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         cyx.a($$0, $$4.o(), $$2, 2);
      }
   }
}
