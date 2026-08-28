import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fom(ali c) implements fok {
   public static final MapCodec<fom> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("id").forGetter(fom::c)).apply($$0, fom::new));

   @Override
   public fol a() {
      return fol.e;
   }

   @Override
   public Either<fok.b, fok.c> b() {
      return Either.right(new fok.c(this.c));
   }
}
