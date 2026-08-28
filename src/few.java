import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record few(dhe b) implements fey {
   public static final MapCodec<few> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhe.b.fieldOf("amount").forGetter(few::c)).apply($$0, few::new));

   @Override
   public float b(fat $$0) {
      int $$1 = $$0.b(fdn.k);
      return this.b.a($$1);
   }

   @Override
   public fex b() {
      return fez.g;
   }

   public static few a(dhe $$0) {
      return new few($$0);
   }

   public dhe c() {
      return this.b;
   }
}
