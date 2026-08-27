import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbi extends cwk {
   public static final MapCodec<dbi> a = b(dbi::new);
   public static final dkj b = dat.aE;
   public static final dkg c = dkf.w;
   public static final dkg d = dkf.o;
   public static final emv e = cwy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final emv f = cwy.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final emv g = ems.a(e, f);
   public static final emv h = cwy.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final emv i = ems.a(g, h);
   public static final emv j = ems.a(
      cwy.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cwy.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cwy.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final emv k = ems.a(
      cwy.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cwy.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cwy.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final emv l = ems.a(
      cwy.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cwy.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cwy.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final emv m = ems.a(
      cwy.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cwy.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cwy.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dbi> a() {
      return a;
   }

   protected dbi(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public emv f(djp $$0, ctd $$1, hx $$2) {
      return g;
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public djp a(cpp $$0) {
      ctx $$1 = $$0.q();
      cng $$2 = $$0.n();
      cfq $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gp()) {
         so $$5 = cla.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return i;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      switch ((ic)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dif($$0, $$1);
   }

   public static boolean a(@Nullable blw $$0, ctx $$1, hx $$2, djp $$3, cng $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable blw $$0, ctx $$1, hx $$2, djp $$3, cng $$4) {
      if ($$1.c_($$2) instanceof dif $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, art.cr, aru.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable blw $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      djp $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dnz.c, $$2, dnz.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(ctx $$0, hx $$1, djp $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(ctx $$0, hx $$1, djp $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(ctx $$0, hx $$1, djp $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(djp $$0, ctx $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dif $$4) {
         ic $$5 = $$0.c(b);
         cng $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         ccb $$9 = new ccb($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$3 == ic.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      if ($$0.c(d)) {
         dhd $$3 = $$1.c_($$2);
         if ($$3 instanceof dif) {
            return ((dif)$$3).k();
         }
      }

      return 0;
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$1.c(d)) {
         return bke.d;
      } else if ($$0.a(asq.au)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bke.a($$2.B) : bke.e;
      } else {
         return $$0.b() && $$5 == bkb.a ? bke.e : bke.d;
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bkc.a($$1.B);
      } else {
         return bkc.b;
      }
   }

   @Nullable
   @Override
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(ctx $$0, hx $$1, cfq $$2) {
      dhd $$3 = $$0.c_($$1);
      if ($$3 instanceof dif) {
         $$2.a((dif)$$3);
         $$2.a(asd.au);
      }
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
