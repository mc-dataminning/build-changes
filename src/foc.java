import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface foc {
   MapCodec<foc> b = fod.f.dispatchMap(foc::a, fod::a);

   fod a();

   Either<foc.b, foc.c> b();

   public static record a(foc b, fnq.a c) {
      public static final Codec<foc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(foc.b.forGetter(foc.a::a), fnq.a.a.optionalFieldOf("filter", fnq.a.b).forGetter(foc.a::b)).apply($$0, foc.a::new)
      );

      public foc a() {
         return this.b;
      }

      public fnq.a b() {
         return this.c;
      }
   }

   public interface b {
      fbs load(ava var1) throws IOException;
   }

   public static record c(alh a) {
   }
}
