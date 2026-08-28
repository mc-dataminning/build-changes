import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface frx {
   MapCodec<frx> b = fry.f.dispatchMap(frx::a, fry::a);

   fry a();

   Either<frx.b, frx.c> b();

   public static record a(frx b, frl.a c) {
      public static final Codec<frx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frx.b.forGetter(frx.a::a), frl.a.a.optionalFieldOf("filter", frl.a.b).forGetter(frx.a::b)).apply($$0, frx.a::new)
      );

      public frx a() {
         return this.b;
      }

      public frl.a b() {
         return this.c;
      }
   }

   public interface b {
      fdu load(aup var1) throws IOException;
   }

   public static record c(akv a) {
   }
}
