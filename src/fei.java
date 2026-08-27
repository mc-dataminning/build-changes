import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fei {
   MapCodec<fei> b = fej.f.dispatchMap(fei::a, $$0 -> $$0.a().codec());

   fej a();

   Either<fei.b, fei.c> b();

   public static record a(fei b, fdw.a c) {
      public static final Codec<fei.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fei.b.forGetter(fei.a::a), awe.a(fdw.a.a, "filter", fdw.a.b).forGetter(fei.a::b)).apply($$0, fei.a::new)
      );

      public fei a() {
         return this.b;
      }

      public fdw.a b() {
         return this.c;
      }
   }

   public interface b {
      esc load(aso var1) throws IOException;
   }

   public static record c(ajh a) {
   }
}
