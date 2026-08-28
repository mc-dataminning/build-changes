import com.mojang.serialization.MapCodec;

public class dsr extends dkv implements dko {
   public static final MapCodec<dsr> a = b(dsr::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dyt c = dyk.at;
   private static final fcr e = dkl.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fcr f = dkl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dsr> a() {
      return a;
   }

   public dsr(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo(cxs.xl);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dxu $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dxu $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(ecq.c, $$2, ecq.a.a($$5));
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if ($$3 instanceof bwf && $$3.aq() != bvq.ab && $$3.aq() != bvq.l) {
         $$3.a($$0, new fbx(0.8F, 0.75, 0.8F));
         if ($$1 instanceof ash $$4 && $$0.c(c) != 0) {
            fbx $$6 = $$3.dj() ? $$3.ah() : $$3.bC().d($$3.du());
            if ($$6.j() > 0.0) {
               double $$7 = Math.abs($$6.a());
               double $$8 = Math.abs($$6.c());
               if ($$7 >= 0.003F || $$8 >= 0.003F) {
                  $$3.a($$4, $$1.aj().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bti)(!$$8 && $$0.a(cxs.sm) ? bti.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cxo(cxs.xl, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, axf.zR, axg.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dxu $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(ecq.c, $$2, ecq.a.a($$3, $$8));
         return bti.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
