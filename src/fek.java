import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fek {
   MapCodec<fek> b = fel.f.dispatchMap(fek::a, $$0 -> $$0.a().codec());

   fel a();

   Either<fek.b, fek.c> b();

   public static record a(fek b, fdy.a c) {
      public static final Codec<fek.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fek.b.forGetter(fek.a::a), awe.a(fdy.a.a, "filter", fdy.a.b).forGetter(fek.a::b)).apply($$0, fek.a::new)
      );

      public fek a() {
         return this.b;
      }

      public fdy.a b() {
         return this.c;
      }
   }

   public interface b {
      ese load(aso var1) throws IOException;
   }

   public static record c(ajh a) {
   }
}
