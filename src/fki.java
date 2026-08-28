import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fki(alf c) implements fkg {
   public static final MapCodec<fki> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.a.fieldOf("id").forGetter(fki::c)).apply($$0, fki::new));

   @Override
   public fkh a() {
      return fkh.e;
   }

   @Override
   public Either<fkg.b, fkg.c> b() {
      return Either.right(new fkg.c(this.c));
   }
}
