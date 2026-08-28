import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diw extends den {
   public static final MapCodec<diw> a = b(diw::new);
   public static final dsy b = dsu.Q;
   public static final dsv c = dsu.f;
   private static final ewm d = dfb.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewm e = dfb.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ewm f = ewj.a(e, d);
   private static final ewm g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ewm h = ewj.a(f, g, evx.e);
   private static final ewm i = ewj.a(h, dfb.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ewm j = ewj.a(h, dfb.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ewm k = ewj.a(h, dfb.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ewm l = ewj.a(h, dfb.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ewm m = ewj.a(h, dfb.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ewm n = g;
   private static final ewm o = ewj.a(g, dfb.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ewm F = ewj.a(g, dfb.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ewm G = ewj.a(g, dfb.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ewm H = ewj.a(g, dfb.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      switch ((je)$$0.c(b)) {
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
   protected ewm a(dse $$0, dbg $$1, iz $$2) {
      switch ((je)$$0.c(b)) {
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
   public dse a(cyc $$0) {
      je $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == je.a.b ? je.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$0.B ? null : a($$2, dpl.r, dqi::a);
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         dpj $$5 = $$1.c_($$2);
         if ($$5 instanceof dqi) {
            $$3.a((dqi)$$5);
            $$3.a(awk.ad);
         }

         return bqw.c;
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dca $$0, iz $$1, dse $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      bqs.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return cpw.a($$1.c_($$2));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      dpj $$4 = $$1.c_($$2);
      if ($$4 instanceof dqi) {
         dqi.a($$1, $$2, $$0, $$3, (dqi)$$4);
      }
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
