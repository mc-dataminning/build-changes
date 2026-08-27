import java.util.List;
import javax.annotation.Nullable;

public class ctt extends cuj implements cuz {
   public static final dfx<dfs> a = dfp.bd;

   public ctt(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, ha.c).a(c, Boolean.valueOf(false)).a(a, dfs.a));
   }

   @Override
   protected int g(dez $$0) {
      return 2;
   }

   @Override
   protected int b(cor $$0, gu $$1, dez $$2) {
      dcl $$3 = $$0.c_($$1);
      return $$3 instanceof dcw ? ((dcw)$$3).c() : 0;
   }

   private int e(cpl $$0, gu $$1, dez $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cqb)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(a) == dfs.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cpl $$0, gu $$1, dez $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cqb)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(a) == dfs.a;
      }
   }

   @Override
   protected int b(cpl $$0, gu $$1, dez $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ha $$4 = $$2.c(aC);
      gu $$5 = $$1.a($$4);
      dez $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         bxy $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.E(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private bxy a(cpl $$0, ha $$1, gu $$2) {
      List<bxy> $$3 = $$0.a(
         bxy.class,
         new egy((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cD() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if (!$$3.fR().e) {
         return bgq.d;
      } else {
         $$0 = $$0.a(a);
         float $$6 = $$0.c(a) == dfs.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, aow.eF, aox.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bgq.a($$1.B);
      }
   }

   @Override
   protected void c(cpl $$0, gu $$1, dez $$2) {
      if (!$$0.L().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dcl $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dcw ? ((dcw)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            eit $$6 = this.c($$0, $$1, $$2) ? eit.c : eit.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cpl $$0, gu $$1, dez $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dcl $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dcw $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(a) == dfs.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(c);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(c, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dez $$0, cpl $$1, gu $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcl $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dcw($$0, $$1);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(aC, a, c);
   }
}
