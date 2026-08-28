import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dng extends dhy {
   public static final MapCodec<dng> a = b(dng::new);
   public static final dwb<dwe> b = dvt.bf;
   public static final dvu c = dvt.w;
   public static final dwd d = dvt.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwe.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dvd b(dew $$0, jg $$1, dvd $$2) {
      dwe $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dwe $$4 = $$0.a_($$1.e()).E();
         dwe $$5 = $$4.e() ? dwe.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dvd a(czm $$0) {
      return this.b($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      boolean $$6 = $$1.o() == jl.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable btz $$0, dvd $$1, dev $$2, jg $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, eaa.H, $$3);
      }
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      return (bry)($$0.a(axi.bt) && $$6.c() == jl.b ? bry.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awu.ag);
      }

      return bry.a;
   }

   @Override
   protected void a_(dvd $$0, dev $$1, jg $$2, coh $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awu.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dvd $$0, dev $$1, jg $$2, int $$3, int $$4) {
      dwe $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lq.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jp<awj> $$10;
      if ($$5.d()) {
         alh $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jp.a(awj.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awl.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private alh a(dev $$0, jg $$1) {
      return $$0.c_($$1.d()) instanceof dtu $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, d);
   }
}
