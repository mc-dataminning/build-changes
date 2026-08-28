import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fnt(ale c) implements fnr {
   public static final MapCodec<fnt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("id").forGetter(fnt::c)).apply($$0, fnt::new));

   @Override
   public fns a() {
      return fns.e;
   }

   @Override
   public Either<fnr.b, fnr.c> b() {
      return Either.right(new fnr.c(this.c));
   }
}
