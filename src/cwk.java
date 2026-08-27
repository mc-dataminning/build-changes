import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cwk extends cxc implements cxs {
   public static final MapCodec<cwk> a = b(cwk::new);
   public static final dig<dib> b = dhy.bd;

   @Override
   public MapCodec<cwk> a() {
      return a;
   }

   public cwk(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, hx.c).a(d, Boolean.valueOf(false)).a(b, dib.a));
   }

   @Override
   protected int g(dhi $$0) {
      return 2;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !this.b($$3, $$5, $$2) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(crg $$0, ht $$1, dhi $$2) {
      dfd $$3 = $$0.c_($$1);
      return $$3 instanceof dfo ? ((dfo)$$3).c() : 0;
   }

   private int e(csa $$0, ht $$1, dhi $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((csq)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dib.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(csa $$0, ht $$1, dhi $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((csq)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dib.a;
      }
   }

   @Override
   protected int b(csa $$0, ht $$1, dhi $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      hx $$4 = $$2.c(aE);
      ht $$5 = $$1.a($$4);
      dhi $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cag $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cag a(csa $$0, hx $$1, ht $$2) {
      List<cag> $$3 = $$0.a(
         cag.class,
         new ejp((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cE() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if (!$$3.fU().e) {
         return bix.d;
      } else {
         $$0 = $$0.a(b);
         float $$6 = $$0.c(b) == dib.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, aqr.eF, aqs.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bix.a($$1.B);
      }
   }

   @Override
   protected void c(csa $$0, ht $$1, dhi $$2) {
      if (!$$0.M().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dfd $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dfo ? ((dfo)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            elk $$6 = this.b($$0, $$1, $$2) ? elk.c : elk.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(csa $$0, ht $$1, dhi $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dfd $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dfo $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dib.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dhi $$0, csa $$1, ht $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dfd $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfo($$0, $$1);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(aE, b, d);
   }
}
