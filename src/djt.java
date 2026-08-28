import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class djt extends dkl implements dlb {
   public static final MapCodec<djt> a = b(djt::new);
   public static final dwl<dwh> b = dwe.bd;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   public djt(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(d, Boolean.valueOf(false)).b(b, dwh.a));
   }

   @Override
   protected int h(dvo $$0) {
      return 2;
   }

   @Override
   public dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == jm.a && !this.b($$1, $$5, $$6) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dek $$0, jh $$1, dvo $$2) {
      dsr $$3 = $$0.c_($$1);
      return $$3 instanceof dtc ? ((dtc)$$3).b() : 0;
   }

   private int e(dff $$0, jh $$1, dvo $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dfx)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dwh.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dff $$0, jh $$1, dvo $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dfx)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dwh.a;
      }
   }

   @Override
   protected int b(dff $$0, jh $$1, dvo $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jm $$4 = $$2.c(aF);
      jh $$5 = $$1.a($$4);
      dvo $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cks $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.F(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cks a(dff $$0, jm $$1, jh $$2) {
      List<cks> $$3 = $$0.a(
         cks.class,
         new ezm((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cQ() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$3.gm().e) {
         return bsh.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dwh.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awo.fs, awp.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bsh.a;
      }
   }

   @Override
   protected void c(dff $$0, jh $$1, dvo $$2) {
      if (!$$0.R().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dsr $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dtc ? ((dtc)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fbn $$6 = this.b($$0, $$1, $$2) ? fbn.c : fbn.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dff $$0, jh $$1, dvo $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dsr $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dtc $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dwh.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dvo $$0, dff $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dsr $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtc($$0, $$1);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(aF, b, d);
   }
}
