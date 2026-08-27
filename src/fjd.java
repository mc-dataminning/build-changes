import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fjd(akm c) implements fjb {
   public static final MapCodec<fjd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akm.a.fieldOf("id").forGetter(fjd::c)).apply($$0, fjd::new));

   @Override
   public fjc a() {
      return fjc.e;
   }

   @Override
   public Either<fjb.b, fjb.c> b() {
      return Either.right(new fjb.c(this.c));
   }
}
