import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fko {
   MapCodec<fko> b = fkp.f.dispatchMap(fko::a, fkp::a);

   fkp a();

   Either<fko.b, fko.c> b();

   public static record a(fko b, fkc.a c) {
      public static final Codec<fko.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fko.b.forGetter(fko.a::a), fkc.a.a.optionalFieldOf("filter", fkc.a.b).forGetter(fko.a::b)).apply($$0, fko.a::new)
      );

      public fko a() {
         return this.b;
      }

      public fkc.a b() {
         return this.c;
      }
   }

   public interface b {
      eyj load(atu var1) throws IOException;
   }

   public static record c(akk a) {
   }
}
