import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fkj(alf c) implements fkh {
   public static final MapCodec<fkj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.a.fieldOf("id").forGetter(fkj::c)).apply($$0, fkj::new));

   @Override
   public fki a() {
      return fki.e;
   }

   @Override
   public Either<fkh.b, fkh.c> b() {
      return Either.right(new fkh.c(this.c));
   }
}
