import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface frv {
   MapCodec<frv> b = frw.f.dispatchMap(frv::a, frw::a);

   frw a();

   Either<frv.b, frv.c> b();

   public static record a(frv b, frj.a c) {
      public static final Codec<frv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frv.b.forGetter(frv.a::a), frj.a.a.optionalFieldOf("filter", frj.a.b).forGetter(frv.a::b)).apply($$0, frv.a::new)
      );

      public frv a() {
         return this.b;
      }

      public frj.a b() {
         return this.c;
      }
   }

   public interface b {
      fdt load(aup var1) throws IOException;
   }

   public static record c(aku a) {
   }
}
