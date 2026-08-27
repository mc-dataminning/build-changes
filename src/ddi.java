import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ddi extends dea implements deq {
   public static final MapCodec<ddi> a = b(ddi::new);
   public static final dpx<dps> b = dpp.bd;

   @Override
   public MapCodec<ddi> a() {
      return a;
   }

   public ddi(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(d, Boolean.valueOf(false)).a(b, dps.a));
   }

   @Override
   protected int g(doz $$0) {
      return 2;
   }

   @Override
   public doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.b($$3, $$5, $$2) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cyd $$0, ib $$1, doz $$2) {
      dmf $$3 = $$0.c_($$1);
      return $$3 instanceof dmq ? ((dmq)$$3).b() : 0;
   }

   private int e(cyx $$0, ib $$1, doz $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((czn)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dps.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cyx $$0, ib $$1, doz $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((czn)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dps.a;
      }
   }

   @Override
   protected int b(cyx $$0, ib $$1, doz $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ih $$4 = $$2.c(aE);
      ib $$5 = $$1.a($$4);
      doz $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cfw $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cfw a(cyx $$0, ih $$1, ib $$2) {
      List<cfw> $$3 = $$0.a(
         cfw.class,
         new erv((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cE() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if (!$$3.ga().e) {
         return boa.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dps.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, aum.fm, aun.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return boa.a($$1.B);
      }
   }

   @Override
   protected void c(cyx $$0, ib $$1, doz $$2) {
      if (!$$0.O().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dmf $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dmq ? ((dmq)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            etv $$6 = this.b($$0, $$1, $$2) ? etv.c : etv.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cyx $$0, ib $$1, doz $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dmf $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dmq $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dps.a) {
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
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(doz $$0, cyx $$1, ib $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dmf $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmq($$0, $$1);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(aE, b, d);
   }
}
