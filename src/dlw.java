import com.mojang.serialization.MapCodec;

public class dlw extends die implements dpf {
   public static final MapCodec<dlw> a = b(dlw::new);
   private static final fah c = die.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dwa b = dvz.C;

   public dlw(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(b) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(erl.c)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
