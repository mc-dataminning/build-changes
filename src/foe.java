import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record foe(alh c) implements foc {
   public static final MapCodec<foe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alh.a.fieldOf("id").forGetter(foe::c)).apply($$0, foe::new));

   @Override
   public fod a() {
      return fod.e;
   }

   @Override
   public Either<foc.b, foc.c> b() {
      return Either.right(new foc.c(this.c));
   }
}
