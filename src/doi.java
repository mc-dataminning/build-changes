import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doi extends dhs implements dhm, dma {
   public static final MapCodec<doi> a = b(doi::new);
   protected static final float b = 6.0F;
   protected static final ezm c = dhj.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   protected doi(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.c($$1, $$2, jj.b) && !$$0.a(dhl.kJ);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      return $$1.a(awz.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      duo $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.l()) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return $$0.a_($$1.d()).a(dhl.G);
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   protected eqp b_(duo $$0) {
      return eqq.c.a(false);
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      duo $$4 = dhl.bx.o();
      duo $$5 = $$4.b(dpq.d, dvk.a);
      je $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cnu $$0, ddl $$1, je $$2, duo $$3, eqo $$4) {
      return false;
   }

   @Override
   public boolean a(deh $$0, je $$1, duo $$2, eqp $$3) {
      return false;
   }
}
