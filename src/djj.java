import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djj extends dek {
   public static final MapCodec<djj> a = b(djj::new);
   public static final dsv b = diu.aE;
   public static final dss c = dsr.w;
   public static final dss d = dsr.o;
   public static final ewj e = dey.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ewj f = dey.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ewj g = ewg.a(e, f);
   public static final ewj h = dey.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ewj i = ewg.a(g, h);
   public static final ewj j = ewg.a(
      dey.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dey.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dey.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ewj k = ewg.a(
      dey.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dey.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dey.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ewj l = ewg.a(
      dey.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dey.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dey.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ewj m = ewg.a(
      dey.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dey.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dey.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   protected djj(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected ewj f(dsb $$0, dbd $$1, iz $$2) {
      return g;
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   public dsb a(cxz $$0) {
      dbx $$1 = $$0.q();
      cuo $$2 = $$0.n();
      cmw $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gz()) {
         cxd $$5 = $$2.a(km.O, cxd.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return i;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
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
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqi($$0, $$1);
   }

   public static boolean a(@Nullable bst $$0, dbx $$1, iz $$2, dsb $$3, cuo $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bst $$0, dbx $$1, iz $$2, dsb $$3, cuo $$4) {
      if ($$1.c_($$2) instanceof dqi $$6) {
         $$6.b($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avz.cz, awa.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bst $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      dsb $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dwu.c, $$2, dwu.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dbx $$0, iz $$1, dsb $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dbx $$0, iz $$1, dsb $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dbx $$0, iz $$1, dsb $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
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

   private void d(dsb $$0, dbx $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqi $$4) {
         je $$5 = $$0.c(b);
         cuo $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cjg $$9 = new cjg($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$3 == je.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      if ($$0.c(d)) {
         dpg $$3 = $$1.c_($$2);
         if ($$3 instanceof dqi) {
            return ((dqi)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$1.c(d)) {
         return bqv.d;
      } else if ($$0.a(awx.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqv.a($$2.B) : bqv.e;
      } else {
         return $$0.e() && $$5 == bqs.a ? bqv.e : bqv.d;
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bqt.a($$1.B);
      } else {
         return bqt.c;
      }
   }

   @Nullable
   @Override
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dbx $$0, iz $$1, cmw $$2) {
      dpg $$3 = $$0.c_($$1);
      if ($$3 instanceof dqi) {
         $$2.a((dqi)$$3);
         $$2.a(awj.au);
      }
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
