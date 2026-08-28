import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fad(fau b) implements ezy {
   public static final MapCodec<fad> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fav.a.fieldOf("chance").forGetter(fad::c)).apply($$0, fad::new));

   @Override
   public ezz b() {
      return faa.d;
   }

   public boolean a(ewp $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static ezy.a a(float $$0) {
      return () -> new fad(far.a($$0));
   }

   public static ezy.a a(fau $$0) {
      return () -> new fad($$0);
   }

   public fau c() {
      return this.b;
   }
}
