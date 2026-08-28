import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fnf(alb c) implements fnd {
   public static final MapCodec<fnf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alb.a.fieldOf("id").forGetter(fnf::c)).apply($$0, fnf::new));

   @Override
   public fne a() {
      return fne.e;
   }

   @Override
   public Either<fnd.b, fnd.c> b() {
      return Either.right(new fnd.c(this.c));
   }
}
