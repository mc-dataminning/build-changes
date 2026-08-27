import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eyf(agm c) implements eyd {
   public static final MapCodec<eyf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(agm.a.fieldOf("id").forGetter(eyf::c)).apply($$0, eyf::new));

   @Override
   public eye a() {
      return eye.e;
   }

   @Override
   public Either<eyd.a, eyd.b> b() {
      return Either.right(new eyd.b(this.c));
   }
}
