import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drm extends dkv implements dko, dpe {
   public static final MapCodec<drm> a = b(drm::new);
   protected static final float b = 6.0F;
   protected static final fcr c = dkl.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<drm> a() {
      return a;
   }

   protected drm(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dkn.le);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return $$1.a(aya.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      dxu $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$0.a_($$1.d()).a(dkn.J);
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   protected etw b_(dxu $$0) {
      return etx.c.a(false);
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      dxu $$4 = dkn.bE.m();
      dxu $$5 = $$4.b(dsu.d, dyp.a);
      jh $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cpw $$0, dgm $$1, jh $$2, dxu $$3, etv $$4) {
      return false;
   }

   @Override
   public boolean a(dhi $$0, jh $$1, dxu $$2, etw $$3) {
      return false;
   }
}
