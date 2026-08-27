import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhp extends dcq {
   public static final MapCodec<dhp> a = b(dhp::new);
   public static final drb b = dha.aE;
   public static final dqy c = dqx.w;
   public static final dqy d = dqx.o;
   public static final eui e = dde.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eui f = dde.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eui g = euf.a(e, f);
   public static final eui h = dde.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eui i = euf.a(g, h);
   public static final eui j = euf.a(
      dde.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dde.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dde.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final eui k = euf.a(
      dde.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dde.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dde.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final eui l = euf.a(
      dde.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dde.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dde.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final eui m = euf.a(
      dde.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dde.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dde.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   protected dhp(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected eui f(dqh $$0, czj $$1, in $$2) {
      return g;
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   public dqh a(cwi $$0) {
      dad $$1 = $$0.q();
      csz $$2 = $$0.n();
      clh $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gx()) {
         cvm $$5 = $$2.a(ka.M, cvm.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return i;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      switch ((is)$$0.c(b)) {
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
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new doo($$0, $$1);
   }

   public static boolean a(@Nullable brh $$0, dad $$1, in $$2, dqh $$3, csz $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable brh $$0, dad $$1, in $$2, dqh $$3, csz $$4) {
      if ($$1.c_($$2) instanceof doo $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avc.cz, avd.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable brh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      dqh $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dva.c, $$2, dva.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dad $$0, in $$1, dqh $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dad $$0, in $$1, dqh $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dad $$0, in $$1, dqh $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
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

   private void d(dqh $$0, dad $$1, in $$2) {
      if ($$1.c_($$2) instanceof doo $$4) {
         is $$5 = $$0.c(b);
         csz $$6 = $$4.b().r();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         chr $$9 = new chr($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$3 == is.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      if ($$0.c(d)) {
         dnm $$3 = $$1.c_($$2);
         if ($$3 instanceof doo) {
            return ((doo)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$1.c(d)) {
         return bpo.d;
      } else if ($$0.a(avz.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bpo.a($$2.B) : bpo.e;
      } else {
         return $$0.d() && $$5 == bpl.a ? bpo.e : bpo.d;
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bpm.a($$1.B);
      } else {
         return bpm.b;
      }
   }

   @Nullable
   @Override
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dad $$0, in $$1, clh $$2) {
      dnm $$3 = $$0.c_($$1);
      if ($$3 instanceof doo) {
         $$2.a((doo)$$3);
         $$2.a(avm.au);
      }
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
