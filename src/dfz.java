import com.mojang.serialization.MapCodec;

public class dfz extends cyo {
   public static final MapCodec<dfz> a = b(dfz::new);
   protected static final eol b = cyo.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   public dfz(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected eol b_(dlf $$0, cut $$1, hz $$2) {
      return eoi.b();
   }

   @Override
   protected eol c(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return eoi.b();
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      cyu.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == ie.b && $$2.a(cyq.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Override
   protected float d(dlf $$0, cut $$1, hz $$2) {
      return 0.2F;
   }
}
