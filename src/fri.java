import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fri {
   MapCodec<fri> b = frj.f.dispatchMap(fri::a, frj::a);

   frj a();

   Either<fri.b, fri.c> b();

   public static record a(fri b, fqw.a c) {
      public static final Codec<fri.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fri.b.forGetter(fri.a::a), fqw.a.a.optionalFieldOf("filter", fqw.a.b).forGetter(fri.a::b)).apply($$0, fri.a::new)
      );

      public fri a() {
         return this.b;
      }

      public fqw.a b() {
         return this.c;
      }
   }

   public interface b {
      feq load(avv var1) throws IOException;
   }

   public static record c(alz a) {
   }
}
