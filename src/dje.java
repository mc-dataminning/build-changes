import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends doq implements dpf {
   public static final MapCodec<dje> a = b(dje::new);
   public static final dwa b = dvz.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fah e = die.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fah f = die.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fah g = die.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   public dje(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jm.a.b));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      switch ((jm.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erl.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(b) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
