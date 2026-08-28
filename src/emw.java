import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emw extends enj {
   public static final MapCodec<emw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eeq.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, emw::new)
   );
   private final eeq c;

   private emw(eeq $$0) {
      this.c = $$0;
   }

   public static emw a(eeq $$0) {
      return new emw($$0);
   }

   @Override
   protected boolean a(eni $$0, bac $$1, jh $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public enl<?> b() {
      return enl.a;
   }
}
