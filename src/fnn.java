import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fnn {
   MapCodec<fnn> b = fno.f.dispatchMap(fnn::a, fno::a);

   fno a();

   Either<fnn.b, fnn.c> b();

   public static record a(fnn b, fnb.a c) {
      public static final Codec<fnn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fnn.b.forGetter(fnn.a::a), fnb.a.a.optionalFieldOf("filter", fnb.a.b).forGetter(fnn.a::b)).apply($$0, fnn.a::new)
      );

      public fnn a() {
         return this.b;
      }

      public fnb.a b() {
         return this.c;
      }
   }

   public interface b {
      fbd load(aut var1) throws IOException;
   }

   public static record c(alc a) {
   }
}
