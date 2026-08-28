import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drh extends dko implements dkh, doz {
   public static final MapCodec<drh> a = b(drh::new);
   private static final fcr b = dke.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<drh> a() {
      return a;
   }

   protected drh(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.c($$1, $$2, jn.b) && !$$0.a(dkg.ll);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      dxq $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$0.a_($$1.d()).a(dkg.J);
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   protected etw b_(dxq $$0) {
      return etx.c.a(false);
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      dxq $$4 = dkg.bE.m();
      dxq $$5 = $$4.b(dsq.d, dym.a);
      ji $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable bvy $$0, dgf $$1, ji $$2, dxq $$3, etv $$4) {
      return false;
   }

   @Override
   public boolean a(dha $$0, ji $$1, dxq $$2, etw $$3) {
      return false;
   }
}
