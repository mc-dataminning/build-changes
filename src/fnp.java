import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fnp(alc c) implements fnn {
   public static final MapCodec<fnp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alc.a.fieldOf("id").forGetter(fnp::c)).apply($$0, fnp::new));

   @Override
   public fno a() {
      return fno.e;
   }

   @Override
   public Either<fnn.b, fnn.c> b() {
      return Either.right(new fnn.c(this.c));
   }
}
