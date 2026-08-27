import com.mojang.serialization.MapCodec;

public class dic extends dde {
   public static final MapCodec<dic> a = b(dic::new);
   public static final int b = 3;
   public static final dqy c = dqo.as;
   private static final ety[] d = new ety[]{
      dcv.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   protected dic(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(dcx.dW);
   }

   @Override
   protected boolean e_(dpy $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd(csg.sj);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }
}
