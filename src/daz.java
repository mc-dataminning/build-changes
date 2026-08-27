import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daz extends cwb {
   public static final MapCodec<daz> a = b(daz::new);
   public static final dka b = dak.aE;
   public static final djx c = djw.w;
   public static final djx d = djw.o;
   public static final eml e = cwp.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eml f = cwp.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eml g = emi.a(e, f);
   public static final eml h = cwp.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eml i = emi.a(g, h);
   public static final eml j = emi.a(
      cwp.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cwp.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cwp.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final eml k = emi.a(
      cwp.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cwp.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cwp.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final eml l = emi.a(
      cwp.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cwp.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cwp.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final eml m = emi.a(
      cwp.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cwp.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cwp.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<daz> a() {
      return a;
   }

   protected daz(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public eml f(djg $$0, csu $$1, hx $$2) {
      return g;
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public djg a(cpg $$0) {
      cto $$1 = $$0.q();
      cmx $$2 = $$0.n();
      cfh $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gp()) {
         sn $$5 = ckq.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return i;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
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
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhw($$0, $$1);
   }

   public static boolean a(@Nullable blu $$0, cto $$1, hx $$2, djg $$3, cmx $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable blu $$0, cto $$1, hx $$2, djg $$3, cmx $$4) {
      if ($$1.c_($$2) instanceof dhw $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, arr.cf, ars.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable blu $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      djg $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dnq.c, $$2, dnq.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cto $$0, hx $$1, djg $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cto $$0, hx $$1, djg $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cto $$0, hx $$1, djg $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
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

   private void d(djg $$0, cto $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhw $$4) {
         ic $$5 = $$0.c(b);
         cmx $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cbt $$9 = new cbt($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$3 == ic.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      if ($$0.c(d)) {
         dgu $$3 = $$1.c_($$2);
         if ($$3 instanceof dhw) {
            return ((dhw)$$3).k();
         }
      }

      return 0;
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bka.a($$1.B);
      } else {
         cmx $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(aso.au) ? bka.b : bka.d;
      }
   }

   @Nullable
   @Override
   public bkd b(djg $$0, cto $$1, hx $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cto $$0, hx $$1, cfh $$2) {
      dgu $$3 = $$0.c_($$1);
      if ($$3 instanceof dhw) {
         $$2.a((dhw)$$3);
         $$2.a(asb.au);
      }
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
