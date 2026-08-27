import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyn extends cuf {
   public static final MapCodec<cyn> a = b(cyn::new);
   public static final dhq b = dhm.Q;
   public static final dhn c = dhm.f;
   private static final ekb d = cut.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekb e = cut.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ekb f = ejy.a(e, d);
   private static final ekb g = ejy.a(f, dfp.c, ejm.e);
   private static final ekb h = ejy.a(g, cut.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ekb i = ejy.a(g, cut.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ekb j = ejy.a(g, cut.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ekb k = ejy.a(g, cut.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ekb l = ejy.a(g, cut.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ekb m = dfp.c;
   private static final ekb n = ejy.a(dfp.c, cut.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ekb o = ejy.a(dfp.c, cut.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ekb F = ejy.a(dfp.c, cut.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ekb G = ejy.a(dfp.c, cut.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<cyn> a() {
      return a;
   }

   public cyn(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      switch ((hx)$$0.c(b)) {
         case a:
            return h;
         case c:
            return j;
         case d:
            return k;
         case e:
            return l;
         case f:
            return i;
         default:
            return g;
      }
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2) {
      switch ((hx)$$0.c(b)) {
         case a:
            return m;
         case c:
            return o;
         case d:
            return F;
         case e:
            return G;
         case f:
            return n;
         default:
            return dfp.c;
      }
   }

   @Override
   public dgw a(cnj $$0) {
      hx $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == hx.a.b ? hx.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return $$0.B ? null : a($$2, det.r, dfq::a);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if ($$4.A()) {
         der $$5 = $$0.c_($$1);
         if ($$5 instanceof dfq) {
            ((dfq)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         der $$6 = $$1.c_($$2);
         if ($$6 instanceof dfq) {
            $$3.a((dfq)$$6);
            $$3.a(aqx.ad);
         }

         return biq.b;
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(crs $$0, ht $$1, dgw $$2) {
      boolean $$3 = !$$0.B($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      bim.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return cge.a($$1.c_($$2));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      der $$4 = $$1.c_($$2);
      if ($$4 instanceof dfq) {
         dfq.a($$1, $$2, $$0, $$3, (dfq)$$4);
      }
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
