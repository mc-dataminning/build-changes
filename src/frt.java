import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface frt {
   MapCodec<frt> b = fru.f.dispatchMap(frt::a, fru::a);

   fru a();

   Either<frt.b, frt.c> b();

   public static record a(frt b, frh.a c) {
      public static final Codec<frt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frt.b.forGetter(frt.a::a), frh.a.a.optionalFieldOf("filter", frh.a.b).forGetter(frt.a::b)).apply($$0, frt.a::new)
      );

      public frt a() {
         return this.b;
      }

      public frh.a b() {
         return this.c;
      }
   }

   public interface b {
      fdr load(auo var1) throws IOException;
   }

   public static record c(aku a) {
   }
}
