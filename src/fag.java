import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fag(ahg c) implements fae {
   public static final MapCodec<fag> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ahg.a.fieldOf("id").forGetter(fag::c)).apply($$0, fag::new));

   @Override
   public faf a() {
      return faf.e;
   }

   @Override
   public Either<fae.a, fae.b> b() {
      return Either.right(new fae.b(this.c));
   }
}
