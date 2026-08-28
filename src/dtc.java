import com.mojang.serialization.MapCodec;

public class dtc extends dmf implements dtq {
   public static final MapCodec<dtc> a = b(dtc::new);
   private static final int f = 1;
   private static final ffk g = ffh.a(dmf.b(16.0, 14.0, 16.0), ffh.c(dmf.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(ffh.a(), ffh::a));
   private static final ffk h = dmf.b(16.0, 0.0, 2.0);
   private static final ffk i = ffh.a(g, h, ffh.c(dmf.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(ffh.a(), ffh::a));
   private static final ffk D = ffh.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final ebh c = eax.aZ;
   public static final eay d = eax.I;
   public static final eay e = eax.d;

   @Override
   public MapCodec<dtc> a() {
      return a;
   }

   protected dtc(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      if (!$$3.a($$0.b().h())) {
         return $$0.c(e) ? i : g;
      } else {
         return ffh.b();
      }
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2) {
      return ffh.b();
   }

   @Override
   protected boolean a(eah $$0, dcw $$1) {
      return $$1.n().a(this.h());
   }

   @Override
   public eah a(dcw $$0) {
      iu $$1 = $$0.a();
      dja $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == ewp.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      if (!$$1.w_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      int $$4 = a($$1, $$2);
      eah $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cng.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      if ($$3.a(ffh.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(D, $$2, true) ? h : ffh.a();
      }
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(d) ? ewp.c.a(false) : super.b_($$0);
   }

   private boolean a(dig $$0, iu $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dig $$0, iu $$1) {
      iu.a $$2 = $$1.k().c(ja.a);
      eah $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dmh.oy)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, ja.b)) {
         return 0;
      }

      for (ja $$5 : ja.c.a) {
         eah $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dmh.oy)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
