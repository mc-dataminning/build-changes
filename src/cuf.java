import java.util.List;
import javax.annotation.Nullable;

public class cuf extends cuv implements cvl {
   public static final dgj<dge> a = dgb.bd;

   public cuf(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hc.c).a(c, Boolean.valueOf(false)).a(a, dge.a));
   }

   @Override
   protected int g(dfl $$0) {
      return 2;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !this.a($$3, $$5, $$2) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int b(cpd $$0, gw $$1, dfl $$2) {
      dcx $$3 = $$0.c_($$1);
      return $$3 instanceof ddi ? ((ddi)$$3).c() : 0;
   }

   private int e(cpx $$0, gw $$1, dfl $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cqn)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(a) == dge.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cpx $$0, gw $$1, dfl $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cqn)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(a) == dge.a;
      }
   }

   @Override
   protected int b(cpx $$0, gw $$1, dfl $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      hc $$4 = $$2.c(aC);
      gw $$5 = $$1.a($$4);
      dfl $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         byi $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private byi a(cpx $$0, hc $$1, gw $$2) {
      List<byi> $$3 = $$0.a(
         byi.class,
         new ehk((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cD() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if (!$$3.fS().e) {
         return bha.d;
      } else {
         $$0 = $$0.a(a);
         float $$6 = $$0.c(a) == dge.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, apf.eF, apg.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bha.a($$1.B);
      }
   }

   @Override
   protected void c(cpx $$0, gw $$1, dfl $$2) {
      if (!$$0.L().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dcx $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof ddi ? ((ddi)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            ejf $$6 = this.c($$0, $$1, $$2) ? ejf.c : ejf.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cpx $$0, gw $$1, dfl $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dcx $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof ddi $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(a) == dge.a) {
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
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dfl $$0, cpx $$1, gw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcx $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddi($$0, $$1);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(aC, a, c);
   }
}
