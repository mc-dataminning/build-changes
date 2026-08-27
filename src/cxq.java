import com.mojang.serialization.MapCodec;

public class cxq extends cyx implements cyr {
   public static final MapCodec<cxq> a = b(cxq::new);
   private static final eol b = eoi.a(cyo.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cyo.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cxq> a() {
      return a;
   }

   protected cxq(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.a(cyq.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      dku.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
