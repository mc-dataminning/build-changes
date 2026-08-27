import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezz(ahd c) implements ezx {
   public static final MapCodec<ezz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ahd.a.fieldOf("id").forGetter(ezz::c)).apply($$0, ezz::new));

   @Override
   public ezy a() {
      return ezy.e;
   }

   @Override
   public Either<ezx.a, ezx.b> b() {
      return Either.right(new ezx.b(this.c));
   }
}
