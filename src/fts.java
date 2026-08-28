import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fts(ald c) implements ftq {
   public static final MapCodec<fts> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.a.fieldOf("id").forGetter(fts::c)).apply($$0, fts::new));

   @Override
   public ftr a() {
      return ftr.e;
   }

   @Override
   public Either<ftq.b, ftq.c> b() {
      return Either.right(new ftq.c(this.c));
   }
}
