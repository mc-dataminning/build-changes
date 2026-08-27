import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evl(aeu c) implements evj {
   public static final MapCodec<evl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aeu.a.fieldOf("id").forGetter(evl::c)).apply($$0, evl::new));

   @Override
   public evk a() {
      return evk.e;
   }

   @Override
   public Either<evj.a, evj.b> b() {
      return Either.right(new evj.b(this.c));
   }
}
