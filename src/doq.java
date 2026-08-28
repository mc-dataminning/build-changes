import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doq extends djp {
   public static final MapCodec<doq> a = b(doq::new);
   public static final dyl<jm> b = dob.aF;
   public static final dyf c = dye.B;
   public static final dyf d = dye.s;
   public static final fcl e = dkd.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fcl f = dkd.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fcl g = fci.a(e, f);
   public static final fcl h = dkd.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fcl i = fci.a(g, h);
   public static final fcl j = fci.a(
      dkd.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dkd.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dkd.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fcl k = fci.a(
      dkd.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dkd.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dkd.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fcl l = fci.a(
      dkd.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dkd.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dkd.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fcl m = fci.a(
      dkd.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dkd.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dkd.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   protected doq(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected fcl d_(dxo $$0) {
      return g;
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   public dxo a(dax $$0) {
      dgz $$1 = $$0.q();
      cxg $$2 = $$0.n();
      cpo $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gG()) {
         czp $$5 = $$2.a(ku.Y, czp.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return i;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      switch ((jm)$$0.c(b)) {
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
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvv($$0, $$1);
   }

   public static boolean a(@Nullable bvx $$0, dgz $$1, jh $$2, dxo $$3, cxg $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bvx $$0, dgz $$1, jh $$2, dxo $$3, cxg $$4) {
      if ($$1.c_($$2) instanceof dvv $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awv.cz, aww.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bvb $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      dxo $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(eck.c, $$2, eck.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dgz $$0, jh $$1, dxo $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dgz $$0, jh $$1, dxo $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dgz $$0, jh $$1, dxo $$2) {
      euy $$3 = euu.a($$0, $$2.c(b).g(), jm.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(c)) {
            b($$1, $$2, $$0);
         }
      }
   }

   private void e(dxo $$0, dgz $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dvv $$4) {
         jm $$5 = $$0.c(b);
         cxg $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cls $$9 = new cls($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.s();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$3 == jm.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      if ($$0.c(d)) {
         duq $$3 = $$1.c_($$2);
         if ($$3 instanceof dvv) {
            return ((dvv)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$1.c(d)) {
         return bta.f;
      } else if ($$0.a(axt.ba)) {
         return (bta)(a($$4, $$2, $$3, $$1, $$0) ? bta.a : bta.e);
      } else {
         return (bta)($$0.f() && $$5 == bsz.a ? bta.e : bta.f);
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bta.a;
      } else {
         return bta.c;
      }
   }

   @Nullable
   @Override
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dgz $$0, jh $$1, cpo $$2) {
      duq $$3 = $$0.c_($$1);
      if ($$3 instanceof dvv) {
         $$2.a((dvv)$$3);
         $$2.a(axf.au);
      }
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
