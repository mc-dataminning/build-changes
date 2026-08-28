import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dte extends dno {
   public static final MapCodec<dte> a = b(dte::new);
   public static final eco<ecr> b = ecg.bi;
   public static final ech c = ecg.A;
   public static final ecq d = ecg.aU;
   public static final int e = 3;

   @Override
   public MapCodec<dte> a() {
      return a;
   }

   public dte(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecr.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private ebq a(dkm $$0, iw $$1, ebq $$2) {
      ecr $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         ecr $$4 = $$0.a_($$1.e()).E();
         ecr $$5 = $$4.e() ? ecr.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public ebq a(ded $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      boolean $$8 = $$4.o() == jc.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bxe $$0, ebq $$1, dkj $$2, iw $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, egq.H, $$3);
      }
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      return (bvc)($$0.a(axv.by) && $$6.c() == jc.b ? bvc.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axi.ag);
      }

      return bvc.a;
   }

   @Override
   protected void a_(ebq $$0, dkj $$1, iw $$2, csi $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axi.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(ebq $$0, dkj $$1, iw $$2, int $$3, int $$4) {
      ecr $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lz.ad, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jg<awx> $$10;
      if ($$5.d()) {
         alr $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jg.a(awx.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awz.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private alr a(dkj $$0, iw $$1) {
      return $$0.c_($$1.d()) instanceof eae $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d);
   }
}
