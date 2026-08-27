import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dek extends czm {
   public static final MapCodec<dek> a = b(dek::new);
   public static final dnt b = ddv.aE;
   public static final dnq c = dnp.w;
   public static final dnq d = dnp.o;
   public static final eqk e = daa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eqk f = daa.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eqk g = eqh.a(e, f);
   public static final eqk h = daa.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eqk i = eqh.a(g, h);
   public static final eqk j = eqh.a(
      daa.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), daa.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), daa.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final eqk k = eqh.a(
      daa.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), daa.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), daa.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final eqk l = eqh.a(
      daa.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), daa.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), daa.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final eqk m = eqh.a(
      daa.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), daa.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), daa.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   protected dek(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected eqk f(dmz $$0, cwf $$1, ib $$2) {
      return g;
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   public dmz a(css $$0) {
      cwz $$1 = $$0.q();
      cqk $$2 = $$0.n();
      cis $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gw()) {
         ta $$5 = cof.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return i;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      switch ((ih)$$0.c(b)) {
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
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dli($$0, $$1);
   }

   public static boolean a(@Nullable bow $$0, cwz $$1, ib $$2, dmz $$3, cqk $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bow $$0, cwz $$1, ib $$2, dmz $$3, cqk $$4) {
      if ($$1.c_($$2) instanceof dli $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aty.cu, atz.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bow $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      dmz $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(drn.c, $$2, drn.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cwz $$0, ib $$1, dmz $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cwz $$0, ib $$1, dmz $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cwz $$0, ib $$1, dmz $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
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

   private void d(dmz $$0, cwz $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dli $$4) {
         ih $$5 = $$0.c(b);
         cqk $$6 = $$4.b().q();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cfd $$9 = new cfd($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.s();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$3 == ih.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      if ($$0.c(d)) {
         dkg $$3 = $$1.c_($$2);
         if ($$3 instanceof dli) {
            return ((dli)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$1.c(d)) {
         return bne.d;
      } else if ($$0.a(auv.au)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bne.a($$2.B) : bne.e;
      } else {
         return $$0.b() && $$5 == bnb.a ? bne.e : bne.d;
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bnc.a($$1.B);
      } else {
         return bnc.b;
      }
   }

   @Nullable
   @Override
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cwz $$0, ib $$1, cis $$2) {
      dkg $$3 = $$0.c_($$1);
      if ($$3 instanceof dli) {
         $$2.a((dli)$$3);
         $$2.a(aui.au);
      }
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
