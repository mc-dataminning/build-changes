import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dru extends dmw implements dkp, drq {
   public static final MapCodec<dru> c = b(dru::new);
   private static final dym g = dyl.D;
   public static final dys<jm> d = dyl.S;
   protected static final float e = 6.0F;
   protected static final fcs f = dkm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dru> a() {
      return c;
   }

   public dru(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyq.b).b(g, Boolean.valueOf(false)).b(d, jm.c));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return f;
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a(axu.bz) || $$1.b_($$2.d()).a(ety.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bwg $$3, cxp $$4) {
      if (!$$0.B_()) {
         jh $$5 = $$1.d();
         dxv $$6 = dmw.c($$0, $$5, this.m().b(b, dyq.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(g) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      if ($$0.c(b) == dyq.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jh $$3 = $$2.e();
         dxv $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return true;
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      if ($$3.c(dmw.b) == dyq.b) {
         jh $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dkj.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jh $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}
