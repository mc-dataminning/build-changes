import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fnr {
   MapCodec<fnr> b = fns.f.dispatchMap(fnr::a, fns::a);

   fns a();

   Either<fnr.b, fnr.c> b();

   public static record a(fnr b, fnf.a c) {
      public static final Codec<fnr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fnr.b.forGetter(fnr.a::a), fnf.a.a.optionalFieldOf("filter", fnf.a.b).forGetter(fnr.a::b)).apply($$0, fnr.a::new)
      );

      public fnr a() {
         return this.b;
      }

      public fnf.a b() {
         return this.c;
      }
   }

   public interface b {
      fbh load(auv var1) throws IOException;
   }

   public static record c(ale a) {
   }
}
