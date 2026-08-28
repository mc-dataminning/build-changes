import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djr extends dfi {
   public static final MapCodec<djr> a = b(djr::new);
   public static final dtu b = dtq.Q;
   public static final dtr c = dtq.f;
   private static final exp d = dfw.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final exp e = dfw.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final exp f = exm.a(e, d);
   private static final exp g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final exp h = exm.a(f, g, exa.e);
   private static final exp i = exm.a(h, dfw.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final exp j = exm.a(h, dfw.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final exp k = exm.a(h, dfw.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final exp l = exm.a(h, dfw.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final exp m = exm.a(h, dfw.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final exp n = g;
   private static final exp o = exm.a(g, dfw.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final exp F = exm.a(g, dfw.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final exp G = exm.a(g, dfw.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final exp H = exm.a(g, dfw.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   public djr(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      switch ((ji)$$0.c(b)) {
         case a:
            return i;
         case c:
            return k;
         case d:
            return l;
         case e:
            return m;
         case f:
            return j;
         default:
            return h;
      }
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2) {
      switch ((ji)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public dta a(cyb $$0) {
      ji $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ji.a.b ? ji.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$0.B ? null : a($$2, dqh.r, drf::a);
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         dqf $$5 = $$1.c_($$2);
         if ($$5 instanceof drf) {
            $$3.a((drf)$$5);
            $$3.a(avy.ad);
         }

         return bqq.c;
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dcu $$0, jd $$1, dta $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      bqm.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      dqf $$4 = $$1.c_($$2);
      if ($$4 instanceof drf) {
         drf.a($$1, $$2, $$0, $$3, (drf)$$4);
      }
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
