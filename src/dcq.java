import com.mojang.serialization.MapCodec;

public class dcq extends deq {
   public static final MapCodec<dcq> a = b(dcq::new);
   public static final int b = 3;
   public static final dqy c = dqo.as;
   private static final ety[] g = new ety[]{
      dcv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   public dcq(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected dqy b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected czt d() {
      return csg.vl;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(czu $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return g[this.g($$0)];
   }
}
