import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ewk(afw c) implements ewi {
   public static final MapCodec<ewk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(afw.a.fieldOf("id").forGetter(ewk::c)).apply($$0, ewk::new));

   @Override
   public ewj a() {
      return ewj.e;
   }

   @Override
   public Either<ewi.a, ewi.b> b() {
      return Either.right(new ewi.b(this.c));
   }
}
