import com.mojang.serialization.MapCodec;

public class dlg extends ddy {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final int b = 2;
   public static final dsb c = drr.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final evd g = ddy.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   public dlg(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }

   @Override
   public evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return g;
   }

   public int m(drb $$0) {
      return $$0.c(c);
   }

   private boolean n(drb $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avh.yv, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avh.yw, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cgv $$4 = bsa.aR.a((dax)$$1);
         if ($$4 != null) {
            euk $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayd.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dvu.i, $$2, dvu.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(drb $$0, enj $$1) {
      return false;
   }

   public static boolean a(dad $$0, io $$1) {
      return $$0.a_($$1.d()).a(avw.cs);
   }
}
