import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fph {
   MapCodec<fph> b = fpi.f.dispatchMap(fph::a, fpi::a);

   fpi a();

   Either<fph.b, fph.c> b();

   public static record a(fph b, fov.a c) {
      public static final Codec<fph.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fph.b.forGetter(fph.a::a), fov.a.a.optionalFieldOf("filter", fov.a.b).forGetter(fph.a::b)).apply($$0, fph.a::new)
      );

      public fph a() {
         return this.b;
      }

      public fov.a b() {
         return this.c;
      }
   }

   public interface b {
      fcq load(avd var1) throws IOException;
   }

   public static record c(alj a) {
   }
}
