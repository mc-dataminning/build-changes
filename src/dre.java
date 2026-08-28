import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dre extends dpe {
   public static final MapCodec<dre> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dww.a.fieldOf("wood_type").forGetter(dpe::d), t()).apply($$0, dre::new));
   public static final dwd b = dlz.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jm, fah> i = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         die.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         die.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jm.f,
         die.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jm.e,
         die.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   public dre(dww $$0, dvi.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dvj $$1 = this.m();
      erk $$2 = $$0.q().b_($$0.a());
      dfe $$3 = $$0.q();
      jh $$4 = $$0.a();
      jm[] $$5 = $$0.f();

      for (jm $$6 : $$5) {
         if ($$6.o().d()) {
            jm $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == erl.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dvj $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ezn o(dvj $$0) {
      fah $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, f);
   }
}
