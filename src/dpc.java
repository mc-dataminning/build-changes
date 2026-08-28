import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpc extends din implements dih, dmu {
   public static final MapCodec<dpc> a = b(dpc::new);
   protected static final float b = 6.0F;
   protected static final fah c = die.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   protected dpc(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dig.kJ);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      return $$1.a(axg.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      dvj $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.l()) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$0.a_($$1.d()).a(dig.G);
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   protected erk b_(dvj $$0) {
      return erl.c.a(false);
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      dvj $$4 = dig.bx.m();
      dvj $$5 = $$4.b(dqk.d, dwf.a);
      jh $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable com $$0, deg $$1, jh $$2, dvj $$3, erj $$4) {
      return false;
   }

   @Override
   public boolean a(dfc $$0, jh $$1, dvj $$2, erk $$3) {
      return false;
   }
}
