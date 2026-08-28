import com.mojang.serialization.MapCodec;

public class dpf extends diq implements dpr {
   public static final MapCodec<dpf> a = b(dpf::new);
   private static final int f = 1;
   private static final fas g;
   private static final fas h;
   private static final fas i = diq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fas j = fap.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dwu c = dwl.aW;
   public static final dwm d = dwl.C;
   public static final dwm e = dwl.b;

   @Override
   public MapCodec<dpf> a() {
      return a;
   }

   protected dpf(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fap.b();
      }
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2) {
      return fap.b();
   }

   @Override
   protected boolean a(dvv $$0, dad $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dvv a(dad $$0) {
      jh $$1 = $$0.a();
      dfm $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == erw.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      if (!$$1.A_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      int $$4 = a($$1, $$2);
      dvv $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            clb.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      if ($$3.a(fap.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fap.a();
      }
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(d) ? erw.c.a(false) : super.b_($$0);
   }

   private boolean a(der $$0, jh $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(der $$0, jh $$1) {
      jh.a $$2 = $$1.k().c(jm.a);
      dvv $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dis.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jm.b)) {
         return 0;
      }

      for (jm $$5 : jm.c.a) {
         dvv $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dis.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fas $$0 = diq.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fas $$1 = diq.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fas $$2 = diq.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fas $$3 = diq.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fas $$4 = diq.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fap.a($$0, $$1, $$2, $$3, $$4);
      fas $$5 = diq.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fas $$6 = diq.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fas $$7 = diq.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fas $$8 = diq.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fap.a(dpf.i, g, $$6, $$5, $$8, $$7);
   }
}
