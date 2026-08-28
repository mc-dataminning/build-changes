import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record flq(akr c) implements flo {
   public static final MapCodec<flq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akr.a.fieldOf("id").forGetter(flq::c)).apply($$0, flq::new));

   @Override
   public flp a() {
      return flp.e;
   }

   @Override
   public Either<flo.b, flo.c> b() {
      return Either.right(new flo.c(this.c));
   }
}
