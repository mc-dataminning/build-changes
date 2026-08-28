import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdh(fdy b) implements fdc {
   public static final MapCodec<fdh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fdz.a.fieldOf("chance").forGetter(fdh::c)).apply($$0, fdh::new));

   @Override
   public fdd b() {
      return fde.d;
   }

   public boolean a(ezt $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static fdc.a a(float $$0) {
      return () -> new fdh(fdv.a($$0));
   }

   public static fdc.a a(fdy $$0) {
      return () -> new fdh($$0);
   }

   public fdy c() {
      return this.b;
   }
}
