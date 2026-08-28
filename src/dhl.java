import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhl extends die implements dpf {
   public static final MapCodec<dhl> a = b(dhl::new);
   public static final dwa b = dvz.C;

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   protected dhl(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dvj $$0) {
      return $$0.y().c();
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.a;
   }

   @Override
   protected float c(dvj $$0, deg $$1, jh $$2) {
      return 1.0F;
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

   @Nullable
   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == erl.c));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   public cwb a(@Nullable com $$0, dfc $$1, jh $$2, dvj $$3) {
      return $$0 != null && $$0.f() ? dpf.super.a($$0, $$1, $$2, $$3) : cwb.k;
   }

   @Override
   public boolean a(@Nullable com $$0, deg $$1, jh $$2, dvj $$3, erj $$4) {
      return $$0 != null && $$0.f() ? dpf.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
