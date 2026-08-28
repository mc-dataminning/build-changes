import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record frj(alz c) implements frh {
   public static final MapCodec<frj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alz.a.fieldOf("id").forGetter(frj::c)).apply($$0, frj::new));

   @Override
   public fri a() {
      return fri.e;
   }

   @Override
   public Either<frh.b, frh.c> b() {
      return Either.right(new frh.c(this.c));
   }
}
