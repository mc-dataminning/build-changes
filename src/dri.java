import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dri extends dqq implements dpf {
   public static final MapCodec<dri> a = b(dri::new);
   public static final dwa c = dvz.C;

   @Override
   protected MapCodec<? extends dri> a() {
      return a;
   }

   protected dri(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(erl.c)));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(c) ? erl.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }
}
