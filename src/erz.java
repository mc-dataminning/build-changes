import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record erz(acq c) implements erx {
   public static final MapCodec<erz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(acq.a.fieldOf("id").forGetter(erz::c)).apply($$0, erz::new));

   @Override
   public ery a() {
      return ery.e;
   }

   @Override
   public Either<erx.a, erx.b> b() {
      return Either.right(new erx.b(this.c));
   }
}
