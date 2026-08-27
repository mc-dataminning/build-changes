import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record faf(ahg c) implements fad {
   public static final MapCodec<faf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ahg.a.fieldOf("id").forGetter(faf::c)).apply($$0, faf::new));

   @Override
   public fae a() {
      return fae.e;
   }

   @Override
   public Either<fad.a, fad.b> b() {
      return Either.right(new fad.b(this.c));
   }
}
