import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fkk(alf c) implements fki {
   public static final MapCodec<fkk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.a.fieldOf("id").forGetter(fkk::c)).apply($$0, fkk::new));

   @Override
   public fkj a() {
      return fkj.e;
   }

   @Override
   public Either<fki.b, fki.c> b() {
      return Either.right(new fki.c(this.c));
   }
}
