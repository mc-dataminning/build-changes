import com.mojang.serialization.MapCodec;

public class dgv extends dip implements djh {
   public static final MapCodec<dgv> b = b(dgv::new);
   public static final dpz c = dpy.C;
   public static final dpz d = dpy.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dgv> a() {
      return b;
   }

   public dgv(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ij.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == elc.c;
      return this.n().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(c) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dpi $$0, czg $$1, id $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dpi $$0, czg $$1, id $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$1.ab() && (long)$$1.z.a(200) <= $$1.Y() % 200L && $$2.v() == $$1.a(dva.a.b, $$2.u(), $$2.w()) - 1) {
         axp.a($$0.c(a).o(), $$1, $$2, 0.125, kn.aR, bnq.a(1, 2));
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
      if ($$0.ab() && $$3 instanceof clf && ((clf)$$3).K()) {
         id $$4 = $$2.a();
         if ($$0.h($$4)) {
            bqs $$5 = bqg.al.a($$0);
            if ($$5 != null) {
               $$5.e(esj.c($$4.c()));
               bqa $$6 = $$3.u();
               $$5.b($$6 instanceof apv ? (apv)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, auo.zl, aup.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }
}
