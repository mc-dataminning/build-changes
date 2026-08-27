import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dat extends cvv {
   public static final MapCodec<dat> a = b(dat::new);
   public static final dju b = dae.aE;
   public static final djr c = djq.w;
   public static final djr d = djq.o;
   public static final emf e = cwj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final emf f = cwj.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final emf g = emc.a(e, f);
   public static final emf h = cwj.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final emf i = emc.a(g, h);
   public static final emf j = emc.a(
      cwj.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cwj.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cwj.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final emf k = emc.a(
      cwj.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cwj.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cwj.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final emf l = emc.a(
      cwj.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cwj.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cwj.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final emf m = emc.a(
      cwj.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cwj.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cwj.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dat> a() {
      return a;
   }

   protected dat(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public emf f(dja $$0, cso $$1, hx $$2) {
      return g;
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public dja a(cpa $$0) {
      cti $$1 = $$0.q();
      cmr $$2 = $$0.n();
      cfb $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gp()) {
         sl $$5 = ckk.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return i;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
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
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhq($$0, $$1);
   }

   public static boolean a(@Nullable blp $$0, cti $$1, hx $$2, dja $$3, cmr $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable blp $$0, cti $$1, hx $$2, dja $$3, cmr $$4) {
      if ($$1.c_($$2) instanceof dhq $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, arm.cf, arn.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable blp $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      dja $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dnk.c, $$2, dnk.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cti $$0, hx $$1, dja $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cti $$0, hx $$1, dja $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cti $$0, hx $$1, dja $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
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

   private void d(dja $$0, cti $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhq $$4) {
         ic $$5 = $$0.c(b);
         cmr $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cbo $$9 = new cbo($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$3 == ic.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      if ($$0.c(d)) {
         dgo $$3 = $$1.c_($$2);
         if ($$3 instanceof dhq) {
            return ((dhq)$$3).k();
         }
      }

      return 0;
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bjv.a($$1.B);
      } else {
         cmr $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(asj.au) ? bjv.b : bjv.d;
      }
   }

   @Nullable
   @Override
   public bjy b(dja $$0, cti $$1, hx $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cti $$0, hx $$1, cfb $$2) {
      dgo $$3 = $$0.c_($$1);
      if ($$3 instanceof dhq) {
         $$2.a((dhq)$$3);
         $$2.a(arw.au);
      }
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
