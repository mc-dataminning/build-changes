import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dxp extends dmr {
   public static final MapCodec<dxp> b = b(dxp::new);
   public static final dys<dyw> c = dyl.bh;
   public static final dym d = dyl.y;
   public static final float e = 4.0F;
   protected static final fcs f = dkm.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcs g = dkm.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fcs h = dkm.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fcs i = dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fcs j = dkm.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcs k = dkm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fcs o = dkm.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fcs G = dkm.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fcs H = dkm.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fcs I = dkm.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fcs J = dkm.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fcs K = dkm.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fcs L = dkm.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fcs M = dkm.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fcs N = dkm.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fcs O = dkm.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fcs P = dkm.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fcs Q = dkm.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fcs[] R = a(true);
   private static final fcs[] S = a(false);

   @Override
   protected MapCodec<dxp> a() {
      return b;
   }

   private static fcs[] a(boolean $$0) {
      return Arrays.stream(jm.values()).map($$1 -> a($$1, $$0)).toArray(fcs[]::new);
   }

   private static fcs a(jm $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fcp.a(k, $$1 ? M : G);
         case b:
            return fcp.a(j, $$1 ? L : o);
         case c:
            return fcp.a(i, $$1 ? O : I);
         case d:
            return fcp.a(h, $$1 ? N : H);
         case e:
            return fcp.a(g, $$1 ? Q : K);
         case f:
            return fcp.a(f, $$1 ? P : J);
      }
   }

   public dxp(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(c, dyw.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dxv $$0, dxv $$1) {
      dkm $$2 = $$0.c(c) == dyw.a ? dko.bF : dko.by;
      return $$1.a($$2) && $$1.c(dxo.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dxv a(dhi $$0, jh $$1, dxv $$2, cpx $$3) {
      if (!$$0.C && $$3.gj().d) {
         jh $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jh $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      dxv $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dko.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if ($$0.a((dhl)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, evb.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp($$2.c(c) == dyw.b ? dko.by : dko.bF);
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
