import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record flk(akq c) implements fli {
   public static final MapCodec<flk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akq.a.fieldOf("id").forGetter(flk::c)).apply($$0, flk::new));

   @Override
   public flj a() {
      return flj.e;
   }

   @Override
   public Either<fli.b, fli.c> b() {
      return Either.right(new fli.c(this.c));
   }
}
