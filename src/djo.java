import com.mojang.serialization.MapCodec;

public class djo extends dch {
   public static final MapCodec<djo> a = b(djo::new);
   public static final int b = 2;
   public static final dqi c = dpy.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final etc g = dch.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   public djo(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }

   @Override
   public etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return g;
   }

   public int m(dpi $$0) {
      return $$0.c(c);
   }

   private boolean n(dpi $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, auo.yc, aup.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, auo.yd, aup.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cez $$4 = bqg.aQ.a((czg)$$1);
         if ($$4 != null) {
            esj $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), axm.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dub.i, $$2, dub.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dpi $$0, elq $$1) {
      return false;
   }

   public static boolean a(cym $$0, id $$1) {
      return $$0.a_($$1.d()).a(ave.cm);
   }
}
