import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class drb extends dgv {
   public static final MapCodec<drb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuy.q.fieldOf("color").forGetter(dgv::b), t()).apply($$0, drb::new));
   public static final dwd b = dlz.aF;
   private static final Map<jm, fah> c = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         die.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         die.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jm.e,
         die.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jm.f,
         die.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(cuy $$0, dvi.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dvj a(czs $$0) {
      dvj $$1 = this.m();
      dfe $$2 = $$0.q();
      jh $$3 = $$0.a();
      jm[] $$4 = $$0.f();

      for (jm $$5 : $$4) {
         if ($$5.o().d()) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
