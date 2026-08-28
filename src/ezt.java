import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezt(ddf b) implements ezv {
   public static final MapCodec<ezt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddf.b.fieldOf("amount").forGetter(ezt::c)).apply($$0, ezt::new));

   @Override
   public float b(evq $$0) {
      int $$1 = $$0.b(eyk.k);
      return this.b.a($$1);
   }

   @Override
   public ezu b() {
      return ezw.g;
   }

   public static ezt a(ddf $$0) {
      return new ezt($$0);
   }

   public ddf c() {
      return this.b;
   }
}
