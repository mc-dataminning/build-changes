import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fje(akn c) implements fjc {
   public static final MapCodec<fje> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akn.a.fieldOf("id").forGetter(fje::c)).apply($$0, fje::new));

   @Override
   public fjd a() {
      return fjd.e;
   }

   @Override
   public Either<fjc.b, fjc.c> b() {
      return Either.right(new fjc.c(this.c));
   }
}
