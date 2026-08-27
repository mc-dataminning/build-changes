import com.mojang.serialization.MapCodec;

public class dea extends cwp {
   public static final MapCodec<dea> a = b(dea::new);
   protected static final eml b = cwp.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public dea(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   public eml b_(djg $$0, csu $$1, hx $$2) {
      return emi.b();
   }

   @Override
   public eml c(djg $$0, csu $$1, hx $$2, elx $$3) {
      return emi.b();
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      cwv.b($$1, $$2.c(), $$0);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && $$2.a(cwr.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public float d(djg $$0, csu $$1, hx $$2) {
      return 0.2F;
   }
}
