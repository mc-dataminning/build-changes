import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fry(akv c) implements frw {
   public static final MapCodec<fry> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akv.a.fieldOf("id").forGetter(fry::c)).apply($$0, fry::new));

   @Override
   public frx a() {
      return frx.e;
   }

   @Override
   public Either<frw.b, frw.c> b() {
      return Either.right(new frw.c(this.c));
   }
}
