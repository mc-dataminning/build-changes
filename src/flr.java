import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record flr(akt c) implements flp {
   public static final MapCodec<flr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akt.a.fieldOf("id").forGetter(flr::c)).apply($$0, flr::new));

   @Override
   public flq a() {
      return flq.e;
   }

   @Override
   public Either<flp.b, flp.c> b() {
      return Either.right(new flp.c(this.c));
   }
}
