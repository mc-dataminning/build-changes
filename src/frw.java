import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface frw {
   MapCodec<frw> b = frx.f.dispatchMap(frw::a, frx::a);

   frx a();

   Either<frw.b, frw.c> b();

   public static record a(frw b, frk.a c) {
      public static final Codec<frw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frw.b.forGetter(frw.a::a), frk.a.a.optionalFieldOf("filter", frk.a.b).forGetter(frw.a::b)).apply($$0, frw.a::new)
      );

      public frw a() {
         return this.b;
      }

      public frk.a b() {
         return this.c;
      }
   }

   public interface b {
      fdt load(aup var1) throws IOException;
   }

   public static record c(akv a) {
   }
}
