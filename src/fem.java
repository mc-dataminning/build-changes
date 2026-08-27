import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fem(ajh c) implements fek {
   public static final MapCodec<fem> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ajh.a.fieldOf("id").forGetter(fem::c)).apply($$0, fem::new));

   @Override
   public fel a() {
      return fel.e;
   }

   @Override
   public Either<fek.b, fek.c> b() {
      return Either.right(new fek.c(this.c));
   }
}
