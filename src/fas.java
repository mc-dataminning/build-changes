import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fas(ahh c) implements faq {
   public static final MapCodec<fas> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ahh.a.fieldOf("id").forGetter(fas::c)).apply($$0, fas::new));

   @Override
   public far a() {
      return far.e;
   }

   @Override
   public Either<faq.a, faq.b> b() {
      return Either.right(new faq.b(this.c));
   }
}
