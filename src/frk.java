import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record frk(alz c) implements fri {
   public static final MapCodec<frk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alz.a.fieldOf("id").forGetter(frk::c)).apply($$0, frk::new));

   @Override
   public frj a() {
      return frj.e;
   }

   @Override
   public Either<fri.b, fri.c> b() {
      return Either.right(new fri.c(this.c));
   }
}
