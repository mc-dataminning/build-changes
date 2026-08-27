import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dba extends cwc {
   public static final MapCodec<dba> a = b(dba::new);
   public static final dkb b = dal.aE;
   public static final djy c = djx.w;
   public static final djy d = djx.o;
   public static final emm e = cwq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final emm f = cwq.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final emm g = emj.a(e, f);
   public static final emm h = cwq.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final emm i = emj.a(g, h);
   public static final emm j = emj.a(
      cwq.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cwq.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cwq.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final emm k = emj.a(
      cwq.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cwq.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cwq.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final emm l = emj.a(
      cwq.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cwq.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cwq.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final emm m = emj.a(
      cwq.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cwq.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cwq.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dba> a() {
      return a;
   }

   protected dba(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public emm f(djh $$0, csv $$1, hx $$2) {
      return g;
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public djh a(cph $$0) {
      ctp $$1 = $$0.q();
      cmy $$2 = $$0.n();
      cfi $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gp()) {
         sn $$5 = ckr.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return i;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
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
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhx($$0, $$1);
   }

   public static boolean a(@Nullable blv $$0, ctp $$1, hx $$2, djh $$3, cmy $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable blv $$0, ctp $$1, hx $$2, djh $$3, cmy $$4) {
      if ($$1.c_($$2) instanceof dhx $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, ars.cf, art.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable blv $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      djh $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dnr.c, $$2, dnr.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(ctp $$0, hx $$1, djh $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(ctp $$0, hx $$1, djh $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(ctp $$0, hx $$1, djh $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
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

   private void d(djh $$0, ctp $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhx $$4) {
         ic $$5 = $$0.c(b);
         cmy $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cbu $$9 = new cbu($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$3 == ic.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      if ($$0.c(d)) {
         dgv $$3 = $$1.c_($$2);
         if ($$3 instanceof dhx) {
            return ((dhx)$$3).k();
         }
      }

      return 0;
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bkb.a($$1.B);
      } else {
         cmy $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(asp.au) ? bkb.b : bkb.d;
      }
   }

   @Nullable
   @Override
   public bke b(djh $$0, ctp $$1, hx $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(ctp $$0, hx $$1, cfi $$2) {
      dgv $$3 = $$0.c_($$1);
      if ($$3 instanceof dhx) {
         $$2.a((dhx)$$3);
         $$2.a(asc.au);
      }
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
