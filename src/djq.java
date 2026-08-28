import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djq extends der {
   public static final MapCodec<djq> a = b(djq::new);
   public static final dtb b = djb.aE;
   public static final dsy c = dsx.w;
   public static final dsy d = dsx.o;
   public static final ews e = dff.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ews f = dff.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ews g = ewp.a(e, f);
   public static final ews h = dff.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ews i = ewp.a(g, h);
   public static final ews j = ewp.a(
      dff.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dff.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dff.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ews k = ewp.a(
      dff.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dff.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dff.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ews l = ewp.a(
      dff.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dff.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dff.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ews m = ewp.a(
      dff.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dff.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dff.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   protected djq(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected ews f(dsh $$0, dbj $$1, ja $$2) {
      return g;
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Override
   public dsh a(cxk $$0) {
      dcd $$1 = $$0.q();
      cua $$2 = $$0.n();
      cmh $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gv()) {
         cwo $$5 = $$2.a(kn.O, cwo.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return i;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      switch ((jf)$$0.c(b)) {
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
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqp($$0, $$1);
   }

   public static boolean a(@Nullable bsd $$0, dcd $$1, ja $$2, dsh $$3, cua $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bsd $$0, dcd $$1, ja $$2, dsh $$3, cua $$4) {
      if ($$1.c_($$2) instanceof dqp $$6) {
         $$6.b($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avf.cz, avg.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bsd $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      dsh $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dxa.c, $$2, dxa.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dcd $$0, ja $$1, dsh $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dcd $$0, ja $$1, dsh $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dcd $$0, ja $$1, dsh $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
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

   private void d(dsh $$0, dcd $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqp $$4) {
         jf $$5 = $$0.c(b);
         cua $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cir $$9 = new cir($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$3 == jf.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      if ($$0.c(d)) {
         dpn $$3 = $$1.c_($$2);
         if ($$3 instanceof dqp) {
            return ((dqp)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$1.c(d)) {
         return bqf.d;
      } else if ($$0.a(awd.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqf.a($$2.B) : bqf.e;
      } else {
         return $$0.e() && $$5 == bqc.a ? bqf.e : bqf.d;
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bqd.a($$1.B);
      } else {
         return bqd.c;
      }
   }

   @Nullable
   @Override
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dcd $$0, ja $$1, cmh $$2) {
      dpn $$3 = $$0.c_($$1);
      if ($$3 instanceof dqp) {
         $$2.a((dqp)$$3);
         $$2.a(avp.au);
      }
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
