import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fky(akk c) implements fkw {
   public static final MapCodec<fky> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.a.fieldOf("id").forGetter(fky::c)).apply($$0, fky::new));

   @Override
   public fkx a() {
      return fkx.e;
   }

   @Override
   public Either<fkw.b, fkw.c> b() {
      return Either.right(new fkw.c(this.c));
   }
}
