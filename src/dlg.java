import com.mojang.serialization.MapCodec;

public class dlg extends deq {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final int b = 2;
   public static final dqy c = dqo.aq;
   private static final float g = 3.0F;
   private static final ety[] h = new ety[]{dcv.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dcv.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   public dlg(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }

   @Override
   public ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dqy b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected czt d() {
      return csg.vi;
   }

   @Override
   public dpy b(int $$0) {
      return $$0 == 2 ? dcx.bS.n() : super.b($$0);
   }

   @Override
   public void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(czu $$0) {
      return 1;
   }
}
