import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dph extends dis implements dim, dmz {
   public static final MapCodec<dph> a = b(dph::new);
   protected static final float b = 6.0F;
   protected static final fal c = dij.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dph> a() {
      return a;
   }

   protected dph(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dil.kJ);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      return $$1.a(axj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      dvo $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$0.a_($$1.d()).a(dil.G);
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   protected ero b_(dvo $$0) {
      return erp.c.a(false);
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      dvo $$4 = dil.bx.m();
      dvo $$5 = $$4.b(dqp.d, dwj.a);
      jh $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cor $$0, dek $$1, jh $$2, dvo $$3, ern $$4) {
      return false;
   }

   @Override
   public boolean a(dfg $$0, jh $$1, dvo $$2, ero $$3) {
      return false;
   }
}
