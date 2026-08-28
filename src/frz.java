import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record frz(akv c) implements frx {
   public static final MapCodec<frz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akv.a.fieldOf("id").forGetter(frz::c)).apply($$0, frz::new));

   @Override
   public fry a() {
      return fry.e;
   }

   @Override
   public Either<frx.b, frx.c> b() {
      return Either.right(new frx.c(this.c));
   }
}
