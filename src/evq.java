import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evq(aew c) implements evo {
   public static final MapCodec<evq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aew.a.fieldOf("id").forGetter(evq::c)).apply($$0, evq::new));

   @Override
   public evp a() {
      return evp.e;
   }

   @Override
   public Either<evo.a, evo.b> b() {
      return Either.right(new evo.b(this.c));
   }
}
