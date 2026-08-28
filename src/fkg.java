import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fkg(ale c) implements fke {
   public static final MapCodec<fkg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("id").forGetter(fkg::c)).apply($$0, fkg::new));

   @Override
   public fkf a() {
      return fkf.e;
   }

   @Override
   public Either<fke.b, fke.c> b() {
      return Either.right(new fke.c(this.c));
   }
}
