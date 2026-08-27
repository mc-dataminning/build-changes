import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fck(aiy c) implements fci {
   public static final MapCodec<fck> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aiy.a.fieldOf("id").forGetter(fck::c)).apply($$0, fck::new));

   @Override
   public fcj a() {
      return fcj.e;
   }

   @Override
   public Either<fci.a, fci.b> b() {
      return Either.right(new fci.b(this.c));
   }
}
