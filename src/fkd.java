import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fkd(alb c) implements fkb {
   public static final MapCodec<fkd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alb.a.fieldOf("id").forGetter(fkd::c)).apply($$0, fkd::new));

   @Override
   public fkc a() {
      return fkc.e;
   }

   @Override
   public Either<fkb.b, fkb.c> b() {
      return Either.right(new fkb.c(this.c));
   }
}
