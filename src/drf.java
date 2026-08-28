import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drf extends dko implements dkh, dox {
   public static final MapCodec<drf> a = b(drf::new);
   protected static final float b = 6.0F;
   protected static final fcm c = dke.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<drf> a() {
      return a;
   }

   protected drf(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dkg.le);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      return $$1.a(aya.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      dxn $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return $$0.a_($$1.d()).a(dkg.J);
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   protected etp b_(dxn $$0) {
      return etq.c.a(false);
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      dxn $$4 = dkg.bE.m();
      dxn $$5 = $$4.b(dsn.d, dyi.a);
      jh $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cps $$0, dgf $$1, jh $$2, dxn $$3, eto $$4) {
      return false;
   }

   @Override
   public boolean a(dhb $$0, jh $$1, dxn $$2, etp $$3) {
      return false;
   }
}
