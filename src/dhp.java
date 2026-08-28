import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dhp extends dhm {
   public static final MapCodec<dhp> b = b(dhp::new);
   public static final dwd c = dlz.aF;
   private static final Map<jm, fah> e = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         die.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jm.d,
         die.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jm.e,
         die.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jm.f,
         die.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dhp> a() {
      return b;
   }

   protected dhp(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dig.a.m() : $$0;
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jm $$3 = $$0.c(c);
      jh $$4 = $$2.a($$3.g());
      dvj $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = super.a($$0);
      dfe $$2 = $$0.q();
      jh $$3 = $$0.a();
      jm[] $$4 = $$0.f();

      for (jm $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
