import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface flo {
   MapCodec<flo> b = flp.f.dispatchMap(flo::a, flp::a);

   flp a();

   Either<flo.b, flo.c> b();

   public static record a(flo b, flc.a c) {
      public static final Codec<flo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(flo.b.forGetter(flo.a::a), flc.a.a.optionalFieldOf("filter", flc.a.b).forGetter(flo.a::b)).apply($$0, flo.a::new)
      );

      public flo a() {
         return this.b;
      }

      public flc.a b() {
         return this.c;
      }
   }

   public interface b {
      ezm load(aue var1) throws IOException;
   }

   public static record c(akr a) {
   }
}
