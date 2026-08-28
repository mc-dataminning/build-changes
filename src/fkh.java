import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fkh(ale c) implements fkf {
   public static final MapCodec<fkh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("id").forGetter(fkh::c)).apply($$0, fkh::new));

   @Override
   public fkg a() {
      return fkg.e;
   }

   @Override
   public Either<fkf.b, fkf.c> b() {
      return Either.right(new fkf.c(this.c));
   }
}
