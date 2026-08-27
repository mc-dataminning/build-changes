import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evs(aey c) implements evq {
   public static final MapCodec<evs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aey.a.fieldOf("id").forGetter(evs::c)).apply($$0, evs::new));

   @Override
   public evr a() {
      return evr.e;
   }

   @Override
   public Either<evq.a, evq.b> b() {
      return Either.right(new evq.b(this.c));
   }
}
