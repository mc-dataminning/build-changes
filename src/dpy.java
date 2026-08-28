import com.mojang.serialization.MapCodec;

public class dpy extends diq {
   public static final MapCodec<dpy> a = b(dpy::new);
   public static final int b = 2;
   public static final dwu c = dwl.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fas g = diq.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dpy> a() {
      return a;
   }

   public dpy(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }

   @Override
   public fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return g;
   }

   public int o(dvv $$0) {
      return $$0.c(c);
   }

   private boolean q(dvv $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awn.yC, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awn.yD, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cjp $$4 = bus.bf.a($$1, bur.e);
         if ($$4 != null) {
            ezy $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azm.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.A_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(ear.i, $$2, ear.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dvv $$0, esk $$1) {
      return false;
   }

   public static boolean a(der $$0, jh $$1) {
      return $$0.a_($$1.e()).a(axc.cu);
   }
}
