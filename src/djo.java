import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class djo extends dkg implements dkw {
   public static final MapCodec<djo> a = b(djo::new);
   public static final dwh<dwc> b = dvz.bd;

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   public djo(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(d, Boolean.valueOf(false)).b(b, dwc.a));
   }

   @Override
   protected int h(dvj $$0) {
      return 2;
   }

   @Override
   public dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.a && !this.b($$3, $$5, $$2) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(deg $$0, jh $$1, dvj $$2) {
      dsm $$3 = $$0.c_($$1);
      return $$3 instanceof dsx ? ((dsx)$$3).b() : 0;
   }

   private int e(dfb $$0, jh $$1, dvj $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dfs)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dwc.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dfb $$0, jh $$1, dvj $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dfs)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dwc.a;
      }
   }

   @Override
   protected int b(dfb $$0, jh $$1, dvj $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jm $$4 = $$2.c(aF);
      jh $$5 = $$1.a($$4);
      dvj $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cko $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.F(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cko a(dfb $$0, jm $$1, jh $$2) {
      List<cko> $$3 = $$0.a(
         cko.class,
         new ezi((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cP() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$3.gl().e) {
         return bsd.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dwc.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awl.fs, awm.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bsd.a;
      }
   }

   @Override
   protected void c(dfb $$0, jh $$1, dvj $$2) {
      if (!$$0.R().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dsm $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dsx ? ((dsx)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fbj $$6 = this.b($$0, $$1, $$2) ? fbj.c : fbj.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dfb $$0, jh $$1, dvj $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dsm $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dsx $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dwc.a) {
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
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dvj $$0, dfb $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dsm $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsx($$0, $$1);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(aF, b, d);
   }
}
