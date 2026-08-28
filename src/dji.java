import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dji extends dej {
   public static final MapCodec<dji> a = b(dji::new);
   public static final dsu b = dit.aE;
   public static final dsr c = dsq.w;
   public static final dsr d = dsq.o;
   public static final ewi e = dex.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ewi f = dex.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ewi g = ewf.a(e, f);
   public static final ewi h = dex.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ewi i = ewf.a(g, h);
   public static final ewi j = ewf.a(
      dex.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dex.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dex.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ewi k = ewf.a(
      dex.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dex.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dex.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ewi l = ewf.a(
      dex.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dex.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dex.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ewi m = ewf.a(
      dex.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dex.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dex.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   protected dji(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected ewi f(dsa $$0, dbc $$1, iz $$2) {
      return g;
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Override
   public dsa a(cxy $$0) {
      dbw $$1 = $$0.q();
      cun $$2 = $$0.n();
      cmv $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gz()) {
         cxc $$5 = $$2.a(km.N, cxc.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return i;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      switch ((je)$$0.c(b)) {
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
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqh($$0, $$1);
   }

   public static boolean a(@Nullable bss $$0, dbw $$1, iz $$2, dsa $$3, cun $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bss $$0, dbw $$1, iz $$2, dsa $$3, cun $$4) {
      if ($$1.c_($$2) instanceof dqh $$6) {
         $$6.b($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avz.cz, awa.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bss $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      dsa $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dwt.c, $$2, dwt.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dbw $$0, iz $$1, dsa $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dbw $$0, iz $$1, dsa $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dbw $$0, iz $$1, dsa $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
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

   private void d(dsa $$0, dbw $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqh $$4) {
         je $$5 = $$0.c(b);
         cun $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cjf $$9 = new cjf($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$3 == je.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      if ($$0.c(d)) {
         dpf $$3 = $$1.c_($$2);
         if ($$3 instanceof dqh) {
            return ((dqh)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$1.c(d)) {
         return bqu.d;
      } else if ($$0.a(awx.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqu.a($$2.B) : bqu.e;
      } else {
         return $$0.e() && $$5 == bqr.a ? bqu.e : bqu.d;
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bqs.a($$1.B);
      } else {
         return bqs.c;
      }
   }

   @Nullable
   @Override
   protected bqw b(dsa $$0, dbw $$1, iz $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dbw $$0, iz $$1, cmv $$2) {
      dpf $$3 = $$0.c_($$1);
      if ($$3 instanceof dqh) {
         $$2.a((dqh)$$3);
         $$2.a(awj.au);
      }
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
