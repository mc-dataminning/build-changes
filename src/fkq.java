import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fkq(akk c) implements fko {
   public static final MapCodec<fkq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.a.fieldOf("id").forGetter(fkq::c)).apply($$0, fkq::new));

   @Override
   public fkp a() {
      return fkp.e;
   }

   @Override
   public Either<fko.b, fko.c> b() {
      return Either.right(new fko.c(this.c));
   }
}
