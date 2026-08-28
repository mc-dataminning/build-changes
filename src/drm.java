import com.mojang.serialization.MapCodec;

public class drm extends dth implements duc {
   public static final MapCodec<drm> b = b(drm::new);
   public static final ebk c = ebj.I;
   public static final ebk d = ebj.A;
   private static final int f = 8;
   public static final int e = 128;
   private static final int g = 200;

   @Override
   public MapCodec<drm> a() {
      return b;
   }

   public drm(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exb.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(c) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(eat $$0, djm $$1, iv $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(eat $$0, djm $$1, iv $$2) {
      jb $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, eye.a($$1, $$3, null));
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$1.ag() && (long)$$1.A.a(200) <= $$1.ae() % 200L && $$2.v() == $$1.a(egs.a.b, $$2.u(), $$2.w()) - 1) {
         azq.a($$0.c(a).o(), $$1, $$2, 0.125, ly.aW, btr.a(1, 2));
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      if ($$0.c(d)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }
}
