import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdn(ajc c) implements fdl {
   public static final MapCodec<fdn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ajc.a.fieldOf("id").forGetter(fdn::c)).apply($$0, fdn::new));

   @Override
   public fdm a() {
      return fdm.e;
   }

   @Override
   public Either<fdl.a, fdl.b> b() {
      return Either.right(new fdl.b(this.c));
   }
}
