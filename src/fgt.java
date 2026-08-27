import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fgt(ajt c) implements fgr {
   public static final MapCodec<fgt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ajt.a.fieldOf("id").forGetter(fgt::c)).apply($$0, fgt::new));

   @Override
   public fgs a() {
      return fgs.e;
   }

   @Override
   public Either<fgr.b, fgr.c> b() {
      return Either.right(new fgr.c(this.c));
   }
}
