import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyu extends cum {
   public static final MapCodec<cyu> a = b(cyu::new);
   public static final dic b = dhy.Q;
   public static final dhz c = dhy.f;
   private static final ekn d = cva.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekn e = cva.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ekn f = ekk.a(e, d);
   private static final ekn g = ekk.a(f, dgb.c, ejy.e);
   private static final ekn h = ekk.a(g, cva.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ekn i = ekk.a(g, cva.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ekn j = ekk.a(g, cva.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ekn k = ekk.a(g, cva.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ekn l = ekk.a(g, cva.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ekn m = dgb.c;
   private static final ekn n = ekk.a(dgb.c, cva.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ekn o = ekk.a(dgb.c, cva.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ekn F = ekk.a(dgb.c, cva.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ekn G = ekk.a(dgb.c, cva.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<cyu> a() {
      return a;
   }

   public cyu(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
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
   public ekn a(dhi $$0, crg $$1, ht $$2) {
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
            return dgb.c;
      }
   }

   @Override
   public dhi a(cnr $$0) {
      hx $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == hx.a.b ? hx.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return $$0.B ? null : a($$2, dff.r, dgc::a);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if ($$4.A()) {
         dfd $$5 = $$0.c_($$1);
         if ($$5 instanceof dgc) {
            ((dgc)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         dfd $$6 = $$1.c_($$2);
         if ($$6 instanceof dgc) {
            $$3.a((dgc)$$6);
            $$3.a(arb.ad);
         }

         return bix.b;
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(csa $$0, ht $$1, dhi $$2) {
      boolean $$3 = !$$0.B($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      bit.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return cgm.a($$1.c_($$2));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      dfd $$4 = $$1.c_($$2);
      if ($$4 instanceof dgc) {
         dgc.a($$1, $$2, $$0, $$3, (dgc)$$4);
      }
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
