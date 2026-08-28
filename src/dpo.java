import com.mojang.serialization.MapCodec;

public class dpo extends die {
   public static final MapCodec<dpo> b = b(dpo::new);
   public static final dwa c = dvz.z;

   @Override
   protected MapCodec<? extends dpo> a() {
      return b;
   }

   protected dpo(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.b ? $$0.b(c, Boolean.valueOf(o($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dvj a(czs $$0) {
      dvj $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   private static boolean o(dvj $$0) {
      return $$0.a(axa.bA);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }
}
