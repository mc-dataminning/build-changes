import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fkw {
   MapCodec<fkw> b = fkx.f.dispatchMap(fkw::a, fkx::a);

   fkx a();

   Either<fkw.b, fkw.c> b();

   public static record a(fkw b, fkk.a c) {
      public static final Codec<fkw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fkw.b.forGetter(fkw.a::a), fkk.a.a.optionalFieldOf("filter", fkk.a.b).forGetter(fkw.a::b)).apply($$0, fkw.a::new)
      );

      public fkw a() {
         return this.b;
      }

      public fkk.a b() {
         return this.c;
      }
   }

   public interface b {
      eyr load(atw var1) throws IOException;
   }

   public static record c(akk a) {
   }
}
