import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fek(ajh c) implements fei {
   public static final MapCodec<fek> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ajh.a.fieldOf("id").forGetter(fek::c)).apply($$0, fek::new));

   @Override
   public fej a() {
      return fej.e;
   }

   @Override
   public Either<fei.b, fei.c> b() {
      return Either.right(new fei.c(this.c));
   }
}
