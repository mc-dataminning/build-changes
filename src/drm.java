import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drm extends dmo implements dkh, dri {
   public static final MapCodec<drm> c = b(drm::new);
   private static final dye g = dyd.D;
   public static final dyk<jm> d = dyd.S;
   protected static final float e = 6.0F;
   protected static final fcm f = dke.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<drm> a() {
      return c;
   }

   public drm(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyi.b).b(g, Boolean.valueOf(false)).b(d, jm.c));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return f;
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(axu.bz) || $$1.b_($$2.d()).a(etq.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bwb $$3, cxk $$4) {
      if (!$$0.B_()) {
         jh $$5 = $$1.d();
         dxn $$6 = dmo.c($$0, $$5, this.m().b(b, dyi.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(g) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      if ($$0.c(b) == dyi.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jh $$3 = $$2.e();
         dxn $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return true;
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      if ($$3.c(dmo.b) == dyi.b) {
         jh $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dkb.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jh $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}
