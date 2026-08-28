import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djr extends dhq implements dpf {
   public static final MapCodec<djr> a = b(djr::new);
   public static final dwa b = dvz.C;
   private static final int d = 3;
   protected static final fah c = die.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   public djr(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$2, dso.z, $$0.C ? dsy::a : dsy::b);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.b;
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(b) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axg.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
