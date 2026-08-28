import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emv extends eni {
   public static final MapCodec<emv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eep.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, emv::new)
   );
   private final eep c;

   private emv(eep $$0) {
      this.c = $$0;
   }

   public static emv a(eep $$0) {
      return new emv($$0);
   }

   @Override
   protected boolean a(enh $$0, bam $$1, jh $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public enk<?> b() {
      return enk.a;
   }
}
