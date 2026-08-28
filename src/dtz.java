import com.mojang.serialization.MapCodec;

public class dtz extends dnc implements dun {
   public static final MapCodec<dtz> a = b(dtz::new);
   private static final int f = 1;
   private static final fgk g = fgh.a(dnc.b(16.0, 14.0, 16.0), fgh.c(dnc.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(fgh.a(), fgh::a));
   private static final fgk h = dnc.b(16.0, 0.0, 2.0);
   private static final fgk i = fgh.a(g, h, fgh.c(dnc.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(fgh.a(), fgh::a));
   private static final fgk D = fgh.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final ece c = ebu.aZ;
   public static final ebv d = ebu.I;
   public static final ebv e = ebu.d;

   @Override
   public MapCodec<dtz> a() {
      return a;
   }

   protected dtz(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      if (!$$3.a($$0.b().h())) {
         return $$0.c(e) ? i : g;
      } else {
         return fgh.b();
      }
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2) {
      return fgh.b();
   }

   @Override
   protected boolean a(ebe $$0, ddr $$1) {
      return $$1.n().a(this.h());
   }

   @Override
   public ebe a(ddr $$0) {
      iv $$1 = $$0.a();
      djx $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == exp.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      if (!$$1.A_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      int $$4 = a($$1, $$2);
      ebe $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cob.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      if ($$3.c()) {
         return fgh.a();
      } else if ($$3.a(fgh.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(D, $$2, true) ? h : fgh.a();
      }
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(d) ? exp.c.a(false) : super.b_($$0);
   }

   private boolean a(djb $$0, iv $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(djb $$0, iv $$1) {
      iv.a $$2 = $$1.k().c(jb.a);
      ebe $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dne.oy)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jb.b)) {
         return 0;
      }

      for (jb $$5 : jb.c.a) {
         ebe $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dne.oy)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
