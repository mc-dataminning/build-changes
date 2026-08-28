import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dth extends dkm {
   public static final MapCodec<dth> a = b(dth::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final fcs g = dkm.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fcs h = dkm.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dyu e = dyl.aF;
   public static final dyu f = dyl.aE;

   @Override
   public MapCodec<dth> a() {
      return a;
   }

   public dth(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bvk $$3) {
      if (!$$3.ce()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhi $$0, dxv $$1, jh $$2, bvk $$3, float $$4) {
      if (!($$3 instanceof cnq)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dhi $$0, dxv $$1, jh $$2, bvk $$3, int $$4) {
      if ($$1.a(dko.mA) && $$0 instanceof ash $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(dhi $$0, jh $$1, dxv $$2) {
      $$0.a(null, $$1, axf.AH, axg.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(ecr.f, $$1, ecr.a.a($$2));
         $$0.c(2001, $$1, dkm.j($$2));
      }
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, axf.AI, axg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(ecr.c, $$2, ecr.a.a($$0));
         } else {
            $$1.a(null, $$2, axf.AJ, axg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(ecr.f, $$2, ecr.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dkm.j($$0));
               ciy $$6 = bvr.bB.a($$1, bvq.e);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dgn $$0, jh $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dgn $$0, jh $$1) {
      return $$0.a_($$1).a(axu.J);
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dhi $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dhi $$0, cpx $$1, jh $$2, dxv $$3, @Nullable dux $$4, cxp $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dxv $$0, dbg $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(e, f);
   }

   private boolean a(ash $$0, bvk $$1) {
      if ($$1 instanceof ciy || $$1 instanceof chr) {
         return false;
      } else {
         return !($$1 instanceof bwg) ? false : $$1 instanceof cpx || $$0.N().b(dhe.c);
      }
   }
}
