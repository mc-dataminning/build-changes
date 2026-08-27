import com.mojang.serialization.MapCodec;

public class doc extends dgy {
   public static final MapCodec<doc> a = b(doc::new);
   public static final int b = 2;
   public static final duc c = dts.aq;
   private static final float g = 3.0F;
   private static final exn[] h = new exn[]{dfc.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dfc.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   public doc(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   public exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected duc b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dbz d() {
      return cuk.wT;
   }

   @Override
   public dtc a(int $$0, dtc $$1) {
      return $$0 == 2 ? dfe.cC.n() : super.a($$0, $$1);
   }

   @Override
   public void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dca $$0) {
      return 1;
   }
}
