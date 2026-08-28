import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record frl(alz c) implements frj {
   public static final MapCodec<frl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alz.a.fieldOf("id").forGetter(frl::c)).apply($$0, frl::new));

   @Override
   public frk a() {
      return frk.e;
   }

   @Override
   public Either<frj.b, frj.c> b() {
      return Either.right(new frj.c(this.c));
   }
}
