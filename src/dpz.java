import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpz extends dpe {
   public static final MapCodec<dpz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dww.a.fieldOf("wood_type").forGetter(dpe::d), t()).apply($$0, dpz::new));
   public static final dwj b = dvz.ba;

   @Override
   public MapCodec<dpz> a() {
      return a;
   }

   public dpz(dww $$0, dvi.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dwp.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == erl.c));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.a && !this.a($$0, $$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dvj $$0) {
      return dwp.b($$0.c(b));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, f);
   }
}
