import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record frv(aku c) implements frt {
   public static final MapCodec<frv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a.fieldOf("id").forGetter(frv::c)).apply($$0, frv::new));

   @Override
   public fru a() {
      return fru.e;
   }

   @Override
   public Either<frt.b, frt.c> b() {
      return Either.right(new frt.c(this.c));
   }
}
