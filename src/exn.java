import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record exn(agg c) implements exl {
   public static final MapCodec<exn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(agg.a.fieldOf("id").forGetter(exn::c)).apply($$0, exn::new));

   @Override
   public exm a() {
      return exm.e;
   }

   @Override
   public Either<exl.a, exl.b> b() {
      return Either.right(new exl.b(this.c));
   }
}
