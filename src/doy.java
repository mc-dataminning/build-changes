import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doy extends dhq implements dpf {
   public static final MapCodec<doy> a = b(doy::new);
   public static final dwa b = dvz.F;
   public static final dwa c = dvz.C;
   public static final dwa d = dvz.G;
   protected static final fah e = die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jm.a.b);

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   public doy(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bue $$3) {
      if ($$0 instanceof arn $$4) {
         aro $$5 = dtw.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dso.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if ($$1 instanceof arn $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dso.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dso.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return e;
   }

   @Override
   protected fah d_(dvj $$0) {
      return e;
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtw($$0, $$1);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == erl.c));
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(c) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, cwb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brf.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return !$$0.C ? dhq.a($$2, dso.L, ($$0x, $$1x, $$2x, $$3) -> eap.c.a($$0x, $$3.gw(), $$3.gx())) : null;
   }
}
