import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evc(aep c) implements eva {
   public static final MapCodec<evc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aep.a.fieldOf("id").forGetter(evc::c)).apply($$0, evc::new));

   @Override
   public evb a() {
      return evb.e;
   }

   @Override
   public Either<eva.a, eva.b> b() {
      return Either.right(new eva.b(this.c));
   }
}
