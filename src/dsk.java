import com.mojang.serialization.MapCodec;

public class dsk extends dko implements dkh {
   public static final MapCodec<dsk> a = b(dsk::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dym c = dyd.at;
   private static final fcm e = dke.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fcm f = dke.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dsk> a() {
      return a;
   }

   public dsk(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk(cxo.xl);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dxn $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dxn $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(ecj.c, $$2, ecj.a.a($$5));
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if ($$3 instanceof bwb && $$3.aq() != bvm.ab && $$3.aq() != bvm.l) {
         $$3.a($$0, new fbs(0.8F, 0.75, 0.8F));
         if ($$1 instanceof ash $$4 && $$0.c(c) != 0) {
            fbs $$6 = $$3 instanceof asi ? $$3.ah() : $$3.bC().d($$3.dt());
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
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bte)(!$$8 && $$0.a(cxo.sm) ? bte.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cxk(cxo.xl, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, axf.zQ, axg.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dxn $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(ecj.c, $$2, ecj.a.a($$3, $$8));
         return bte.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
