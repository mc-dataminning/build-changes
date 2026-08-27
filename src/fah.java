import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fah(ahg c) implements faf {
   public static final MapCodec<fah> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ahg.a.fieldOf("id").forGetter(fah::c)).apply($$0, fah::new));

   @Override
   public fag a() {
      return fag.e;
   }

   @Override
   public Either<faf.a, faf.b> b() {
      return Either.right(new faf.b(this.c));
   }
}
