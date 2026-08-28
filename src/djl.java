import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends dem {
   public static final MapCodec<djl> a = b(djl::new);
   public static final dsx b = diw.aE;
   public static final dsu c = dst.w;
   public static final dsu d = dst.o;
   public static final ewl e = dfa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ewl f = dfa.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ewl g = ewi.a(e, f);
   public static final ewl h = dfa.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ewl i = ewi.a(g, h);
   public static final ewl j = ewi.a(
      dfa.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dfa.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dfa.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ewl k = ewi.a(
      dfa.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dfa.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dfa.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ewl l = ewi.a(
      dfa.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dfa.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dfa.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ewl m = ewi.a(
      dfa.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dfa.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dfa.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   protected djl(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected ewl f(dsd $$0, dbf $$1, iz $$2) {
      return g;
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Override
   public dsd a(cyb $$0) {
      dbz $$1 = $$0.q();
      cuq $$2 = $$0.n();
      cmy $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gz()) {
         cxf $$5 = $$2.a(km.O, cxf.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return i;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
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
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqk($$0, $$1);
   }

   public static boolean a(@Nullable bsv $$0, dbz $$1, iz $$2, dsd $$3, cuq $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bsv $$0, dbz $$1, iz $$2, dsd $$3, cuq $$4) {
      if ($$1.c_($$2) instanceof dqk $$6) {
         $$6.b($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awa.cz, awb.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bsv $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      dsd $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dww.c, $$2, dww.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dbz $$0, iz $$1, dsd $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dbz $$0, iz $$1, dsd $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dbz $$0, iz $$1, dsd $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
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

   private void d(dsd $$0, dbz $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqk $$4) {
         je $$5 = $$0.c(b);
         cuq $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cji $$9 = new cji($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$3 == je.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      if ($$0.c(d)) {
         dpi $$3 = $$1.c_($$2);
         if ($$3 instanceof dqk) {
            return ((dqk)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$1.c(d)) {
         return bqx.d;
      } else if ($$0.a(awy.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqx.a($$2.B) : bqx.e;
      } else {
         return $$0.e() && $$5 == bqu.a ? bqx.e : bqx.d;
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bqv.a($$1.B);
      } else {
         return bqv.c;
      }
   }

   @Nullable
   @Override
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dbz $$0, iz $$1, cmy $$2) {
      dpi $$3 = $$0.c_($$1);
      if ($$3 instanceof dqk) {
         $$2.a((dqk)$$3);
         $$2.a(awk.au);
      }
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
