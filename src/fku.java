import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fku {
   MapCodec<fku> b = fkv.f.dispatchMap(fku::a, fkv::a);

   fkv a();

   Either<fku.b, fku.c> b();

   public static record a(fku b, fki.a c) {
      public static final Codec<fku.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fku.b.forGetter(fku.a::a), fki.a.a.optionalFieldOf("filter", fki.a.b).forGetter(fku.a::b)).apply($$0, fku.a::new)
      );

      public fku a() {
         return this.b;
      }

      public fki.a b() {
         return this.c;
      }
   }

   public interface b {
      eyp load(atw var1) throws IOException;
   }

   public static record c(akk a) {
   }
}
