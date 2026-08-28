import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fpc(all c) implements fpa {
   public static final MapCodec<fpc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(all.a.fieldOf("id").forGetter(fpc::c)).apply($$0, fpc::new));

   @Override
   public fpb a() {
      return fpb.e;
   }

   @Override
   public Either<fpa.b, fpa.c> b() {
      return Either.right(new fpa.c(this.c));
   }
}
