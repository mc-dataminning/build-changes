import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezi(agt c) implements ezg {
   public static final MapCodec<ezi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(agt.a.fieldOf("id").forGetter(ezi::c)).apply($$0, ezi::new));

   @Override
   public ezh a() {
      return ezh.e;
   }

   @Override
   public Either<ezg.a, ezg.b> b() {
      return Either.right(new ezg.b(this.c));
   }
}
