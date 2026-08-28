import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record frx(aku c) implements frv {
   public static final MapCodec<frx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a.fieldOf("id").forGetter(frx::c)).apply($$0, frx::new));

   @Override
   public frw a() {
      return frw.e;
   }

   @Override
   public Either<frv.b, frv.c> b() {
      return Either.right(new frv.c(this.c));
   }
}
