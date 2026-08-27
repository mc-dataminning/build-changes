import com.mojang.serialization.MapCodec;

public class cvr extends cwy implements cws {
   public static final MapCodec<cvr> a = b(cvr::new);
   private static final eml b = emi.a(cwp.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cwp.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cvr> a() {
      return a;
   }

   protected cvr(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(cwr.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      div.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
