import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fsv(aku c) implements fst {
   public static final MapCodec<fsv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a.fieldOf("id").forGetter(fsv::c)).apply($$0, fsv::new));

   @Override
   public fsu a() {
      return fsu.e;
   }

   @Override
   public Either<fst.b, fst.c> b() {
      return Either.right(new fst.c(this.c));
   }
}
