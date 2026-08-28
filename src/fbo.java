import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fbo(deo b) implements fbq {
   public static final MapCodec<fbo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deo.b.fieldOf("amount").forGetter(fbo::c)).apply($$0, fbo::new));

   @Override
   public float b(exl $$0) {
      int $$1 = $$0.b(faf.k);
      return this.b.a($$1);
   }

   @Override
   public fbp b() {
      return fbr.g;
   }

   public static fbo a(deo $$0) {
      return new fbo($$0);
   }

   public deo c() {
      return this.b;
   }
}
