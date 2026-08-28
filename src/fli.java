import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fli {
   MapCodec<fli> b = flj.f.dispatchMap(fli::a, flj::a);

   flj a();

   Either<fli.b, fli.c> b();

   public static record a(fli b, fkw.a c) {
      public static final Codec<fli.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fli.b.forGetter(fli.a::a), fkw.a.a.optionalFieldOf("filter", fkw.a.b).forGetter(fli.a::b)).apply($$0, fli.a::new)
      );

      public fli a() {
         return this.b;
      }

      public fkw.a b() {
         return this.c;
      }
   }

   public interface b {
      ezg load(aud var1) throws IOException;
   }

   public static record c(akq a) {
   }
}
