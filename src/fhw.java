import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fhw {
   MapCodec<fhw> b = fhx.f.dispatchMap(fhw::a, $$0 -> $$0.a().codec());

   fhx a();

   Either<fhw.b, fhw.c> b();

   public static record a(fhw b, fhk.a c) {
      public static final Codec<fhw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fhw.b.forGetter(fhw.a::a), axe.a(fhk.a.a, "filter", fhk.a.b).forGetter(fhw.a::b)).apply($$0, fhw.a::new)
      );

      public fhw a() {
         return this.b;
      }

      public fhk.a b() {
         return this.c;
      }
   }

   public interface b {
      evq load(ato var1) throws IOException;
   }

   public static record c(akf a) {
   }
}
