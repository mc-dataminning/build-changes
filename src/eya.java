import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eya(agi c) implements exy {
   public static final MapCodec<eya> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(agi.a.fieldOf("id").forGetter(eya::c)).apply($$0, eya::new));

   @Override
   public exz a() {
      return exz.e;
   }

   @Override
   public Either<exy.a, exy.b> b() {
      return Either.right(new exy.b(this.c));
   }
}
