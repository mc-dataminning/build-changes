import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface frj {
   MapCodec<frj> b = frk.f.dispatchMap(frj::a, frk::a);

   frk a();

   Either<frj.b, frj.c> b();

   public static record a(frj b, fqx.a c) {
      public static final Codec<frj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frj.b.forGetter(frj.a::a), fqx.a.a.optionalFieldOf("filter", fqx.a.b).forGetter(frj.a::b)).apply($$0, frj.a::new)
      );

      public frj a() {
         return this.b;
      }

      public fqx.a b() {
         return this.c;
      }
   }

   public interface b {
      fer load(avv var1) throws IOException;
   }

   public static record c(alz a) {
   }
}
