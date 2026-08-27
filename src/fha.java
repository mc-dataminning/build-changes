import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fha {
   MapCodec<fha> b = fhb.f.dispatchMap(fha::a, $$0 -> $$0.a().codec());

   fhb a();

   Either<fha.b, fha.c> b();

   public static record a(fha b, fgo.a c) {
      public static final Codec<fha.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fha.b.forGetter(fha.a::a), awu.a(fgo.a.a, "filter", fgo.a.b).forGetter(fha.a::b)).apply($$0, fha.a::new)
      );

      public fha a() {
         return this.b;
      }

      public fgo.a b() {
         return this.c;
      }
   }

   public interface b {
      euu load(ate var1) throws IOException;
   }

   public static record c(ajv a) {
   }
}
