import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqq extends djx implements djq, dog {
   public static final MapCodec<dqq> a = b(dqq::new);
   protected static final float b = 6.0F;
   protected static final fbv c = djn.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   protected dqq(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.c($$1, $$2, jn.b) && !$$0.a(djp.ll);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      dwy $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$0.a_($$1.d()).a(djp.J);
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   protected eta b_(dwy $$0) {
      return etb.c.a(false);
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      dwy $$4 = djp.bE.m();
      dwy $$5 = $$4.b(dry.d, dxt.a);
      ji $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable coy $$0, dfo $$1, ji $$2, dwy $$3, esz $$4) {
      return false;
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dwy $$2, eta $$3) {
      return false;
   }
}
