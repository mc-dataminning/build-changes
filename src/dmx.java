import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmx extends diy<dvm> implements dri {
   public static final MapCodec<dmx> b = b(dmx::new);
   public static final dyk<jm> c = doc.aF;
   public static final dye d = dyd.D;
   protected static final fcm e = dke.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xv f = xv.c("container.enderchest");

   @Override
   public MapCodec<dmx> a() {
      return b;
   }

   protected dmx(dxm.d $$0) {
      super($$0, () -> dur.d);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dmn.c<? extends duw> a(dxn $$0, dha $$1, jh $$2, boolean $$3) {
      return dmn.b::b;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return e;
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.b;
   }

   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == etq.c));
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      cul $$5 = $$3.gu();
      if ($$5 != null && $$1.c_($$2) instanceof dvm $$7) {
         jh $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bte.a;
         } else {
            if ($$1 instanceof ash $$10) {
               $$5.a($$7);
               $$3.a(new btm(($$1x, $$2x, $$3x) -> ctg.a($$1x, $$2x, $$5), f));
               $$3.a(axp.aj);
               coh.a($$10, $$3, true);
            }

            return bte.a;
         }
      } else {
         return bte.a;
      }
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$0.C ? a($$2, dur.d, dvm::a) : null;
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ls.ad, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(d) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      dup $$4 = $$1.c_($$2);
      if ($$4 instanceof dvm) {
         ((dvm)$$4).b();
      }
   }
}
