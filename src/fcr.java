import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fcr(aiy c) implements fcp {
   public static final MapCodec<fcr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aiy.a.fieldOf("id").forGetter(fcr::c)).apply($$0, fcr::new));

   @Override
   public fcq a() {
      return fcq.e;
   }

   @Override
   public Either<fcp.a, fcp.b> b() {
      return Either.right(new fcp.b(this.c));
   }
}
