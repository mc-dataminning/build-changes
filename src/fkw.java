import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fkw(akk c) implements fku {
   public static final MapCodec<fkw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.a.fieldOf("id").forGetter(fkw::c)).apply($$0, fkw::new));

   @Override
   public fkv a() {
      return fkv.e;
   }

   @Override
   public Either<fku.b, fku.c> b() {
      return Either.right(new fku.c(this.c));
   }
}
