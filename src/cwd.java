import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cwd extends cwu implements cxk {
   public static final MapCodec<cwd> a = b(cwd::new);
   public static final dhu<dhp> b = dhm.bd;

   @Override
   public MapCodec<cwd> a() {
      return a;
   }

   public cwd(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, hx.c).a(d, Boolean.valueOf(false)).a(b, dhp.a));
   }

   @Override
   protected int g(dgw $$0) {
      return 2;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !this.b($$3, $$5, $$2) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cqy $$0, ht $$1, dgw $$2) {
      der $$3 = $$0.c_($$1);
      return $$3 instanceof dfc ? ((dfc)$$3).c() : 0;
   }

   private int e(crs $$0, ht $$1, dgw $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((csi)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dhp.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(crs $$0, ht $$1, dgw $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((csi)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dhp.a;
      }
   }

   @Override
   protected int b(crs $$0, ht $$1, dgw $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      hx $$4 = $$2.c(aE);
      ht $$5 = $$1.a($$4);
      dgw $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         bzy $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private bzy a(crs $$0, hx $$1, ht $$2) {
      List<bzy> $$3 = $$0.a(
         bzy.class,
         new ejd((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cD() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if (!$$3.fT().e) {
         return biq.d;
      } else {
         $$0 = $$0.a(b);
         float $$6 = $$0.c(b) == dhp.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, aqn.eF, aqo.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return biq.a($$1.B);
      }
   }

   @Override
   protected void c(crs $$0, ht $$1, dgw $$2) {
      if (!$$0.L().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         der $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dfc ? ((dfc)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            eky $$6 = this.b($$0, $$1, $$2) ? eky.c : eky.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(crs $$0, ht $$1, dgw $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      der $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dfc $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dhp.a) {
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
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dgw $$0, crs $$1, ht $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      der $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfc($$0, $$1);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(aE, b, d);
   }
}
