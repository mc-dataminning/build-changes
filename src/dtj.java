import com.mojang.serialization.MapCodec;

public class dtj extends dmm implements dtx {
   public static final MapCodec<dtj> a = b(dtj::new);
   private static final int f = 1;
   private static final ffr g = ffo.a(dmm.b(16.0, 14.0, 16.0), ffo.c(dmm.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(ffo.a(), ffo::a));
   private static final ffr h = dmm.b(16.0, 0.0, 2.0);
   private static final ffr i = ffo.a(g, h, ffo.c(dmm.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(ffo.a(), ffo::a));
   private static final ffr D = ffo.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final ebo c = ebe.aZ;
   public static final ebf d = ebe.I;
   public static final ebf e = ebe.d;

   @Override
   public MapCodec<dtj> a() {
      return a;
   }

   protected dtj(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      if (!$$3.a($$0.b().h())) {
         return $$0.c(e) ? i : g;
      } else {
         return ffo.b();
      }
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2) {
      return ffo.b();
   }

   @Override
   protected boolean a(eao $$0, ddd $$1) {
      return $$1.n().a(this.h());
   }

   @Override
   public eao a(ddd $$0) {
      iv $$1 = $$0.a();
      djh $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == eww.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      if (!$$1.w_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      int $$4 = a($$1, $$2);
      eao $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cnn.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      if ($$3.c()) {
         return ffo.a();
      } else if ($$3.a(ffo.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(D, $$2, true) ? h : ffo.a();
      }
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(d) ? eww.c.a(false) : super.b_($$0);
   }

   private boolean a(din $$0, iv $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(din $$0, iv $$1) {
      iv.a $$2 = $$1.k().c(jb.a);
      eao $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dmo.oy)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jb.b)) {
         return 0;
      }

      for (jb $$5 : jb.c.a) {
         eao $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dmo.oy)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
