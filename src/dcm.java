import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcm extends cye {
   public static final MapCodec<dcm> a = b(dcm::new);
   public static final dmd b = dlz.Q;
   public static final dma c = dlz.f;
   private static final eos d = cys.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eos e = cys.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eos f = eop.a(e, d);
   private static final eos g = eop.a(f, djv.z_, eod.e);
   private static final eos h = eop.a(g, cys.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eos i = eop.a(g, cys.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eos j = eop.a(g, cys.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eos k = eop.a(g, cys.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eos l = eop.a(g, cys.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eos m = djv.z_;
   private static final eos n = eop.a(djv.z_, cys.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eos o = eop.a(djv.z_, cys.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eos F = eop.a(djv.z_, cys.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eos G = eop.a(djv.z_, cys.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   public dcm(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      switch ((ie)$$0.c(b)) {
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
   protected eos a(dlj $$0, cux $$1, hz $$2) {
      switch ((ie)$$0.c(b)) {
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
            return djv.z_;
      }
   }

   @Override
   public dlj a(crk $$0) {
      ie $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ie.a.b ? ie.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return $$0.B ? null : a($$2, diz.r, djw::a);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if ($$4.B()) {
         dix $$5 = $$0.c_($$1);
         if ($$5 instanceof djw) {
            ((djw)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         dix $$5 = $$1.c_($$2);
         if ($$5 instanceof djw) {
            $$3.a((djw)$$5);
            $$3.a(atv.ad);
         }

         return blw.b;
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cvr $$0, hz $$1, dlj $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      bls.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return ckf.a($$1.c_($$2));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      dix $$4 = $$1.c_($$2);
      if ($$4 instanceof djw) {
         djw.a($$1, $$2, $$0, $$3, (djw)$$4);
      }
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
