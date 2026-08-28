import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqn extends dju implements djn, dod {
   public static final MapCodec<dqn> a = b(dqn::new);
   protected static final float b = 6.0F;
   protected static final fbs c = djk.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   protected dqn(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.c($$1, $$2, jn.b) && !$$0.a(djm.ll);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      return $$1.a(awu.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      dwv $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$0.a_($$1.d()).a(djm.J);
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   protected esx b_(dwv $$0) {
      return esy.c.a(false);
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      dwv $$4 = djm.bE.m();
      dwv $$5 = $$4.b(drv.d, dxq.a);
      ji $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cov $$0, dfl $$1, ji $$2, dwv $$3, esw $$4) {
      return false;
   }

   @Override
   public boolean a(dgh $$0, ji $$1, dwv $$2, esx $$3) {
      return false;
   }
}
