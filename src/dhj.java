import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhj extends dgv {
   public static final MapCodec<dhj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuy.q.fieldOf("color").forGetter(dgv::b), t()).apply($$0, dhj::new));
   public static final dwj b = dvz.ba;
   private static final Map<cuy, die> c = Maps.newHashMap();
   private static final fah d = die.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(cuy $$0, dvi.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return d;
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, Integer.valueOf(dwp.a($$0.i() + 180.0F)));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.a && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
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
      $$0.a(b);
   }

   public static die a(cuy $$0) {
      return c.getOrDefault($$0, dig.iJ);
   }
}
