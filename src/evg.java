import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evg(aer c) implements eve {
   public static final MapCodec<evg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aer.a.fieldOf("id").forGetter(evg::c)).apply($$0, evg::new));

   @Override
   public evf a() {
      return evf.e;
   }

   @Override
   public Either<eve.a, eve.b> b() {
      return Either.right(new eve.b(this.c));
   }
}
