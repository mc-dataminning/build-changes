import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fre(alz c) implements frc {
   public static final MapCodec<fre> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alz.a.fieldOf("id").forGetter(fre::c)).apply($$0, fre::new));

   @Override
   public frd a() {
      return frd.e;
   }

   @Override
   public Either<frc.b, frc.c> b() {
      return Either.right(new frc.c(this.c));
   }
}
