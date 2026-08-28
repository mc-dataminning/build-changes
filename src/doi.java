import com.mojang.serialization.MapCodec;

public class doi extends dhr {
   public static final MapCodec<doi> a = b(doi::new);
   public static final int b = 2;
   public static final dua c = dtq.aq;
   private static final float g = 3.0F;
   private static final exp[] h = new exp[]{dfw.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dfw.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   public doi(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }

   @Override
   public exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dua b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dct d() {
      return cur.vi;
   }

   @Override
   public dta b(int $$0) {
      return $$0 == 2 ? dfy.bS.o() : super.b($$0);
   }

   @Override
   public void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dcu $$0) {
      return 1;
   }
}
