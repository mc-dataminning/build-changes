import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqt extends drg {
   public static final Codec<dqt> a = RecordCodecBuilder.create($$0 -> $$0.group(dir.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dqt::new));
   private final dir c;

   private dqt(dir $$0) {
      this.c = $$0;
   }

   public static dqt a(dir $$0) {
      return new dqt($$0);
   }

   @Override
   protected boolean a(drf $$0, apf $$1, gu $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dri<?> b() {
      return dri.a;
   }
}
