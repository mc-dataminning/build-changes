import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dpc extends dkm implements drq {
   public static final MapCodec<dpc> a = b(dpc::new);
   public static final int b = 15;
   public static final dyu c = dyl.aQ;
   public static final dym d = dyl.D;
   public static final ToIntFunction<dxv> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   public dpc(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C && $$3.gG()) {
         $$1.a($$2, $$0.a(c), 2);
         return btj.b;
      } else {
         return btj.c;
      }
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return $$3.a(cxt.hQ) ? fcp.b() : fcp.a();
   }

   @Override
   protected boolean e_(dxv $$0) {
      return $$0.y().c();
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.a;
   }

   @Override
   protected float c(dxv $$0, dgn $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(d) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cxp a(cxp $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(ku.am, czr.a.a(c, $$1));
      }

      return $$0;
   }
}
