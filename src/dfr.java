import com.mojang.serialization.MapCodec;

public class dfr extends dhr {
   public static final MapCodec<dfr> a = b(dfr::new);
   public static final int b = 3;
   public static final dua c = dtq.as;
   private static final exp[] g = new exp[]{
      dfw.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   public dfr(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected dua b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dct d() {
      return cur.vl;
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dcu $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return g[this.g($$0)];
   }
}
