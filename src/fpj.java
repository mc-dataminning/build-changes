import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fpj(alj c) implements fph {
   public static final MapCodec<fpj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alj.a.fieldOf("id").forGetter(fpj::c)).apply($$0, fpj::new));

   @Override
   public fpi a() {
      return fpi.e;
   }

   @Override
   public Either<fph.b, fph.c> b() {
      return Either.right(new fph.c(this.c));
   }
}
