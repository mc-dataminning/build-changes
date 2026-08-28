import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface ftq {
   MapCodec<ftq> b = ftr.f.dispatchMap(ftq::a, ftr::a);

   ftr a();

   Either<ftq.b, ftq.c> b();

   public static record a(ftq b, fte.a c) {
      public static final Codec<ftq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ftq.b.forGetter(ftq.a::a), fte.a.a.optionalFieldOf("filter", fte.a.b).forGetter(ftq.a::b)).apply($$0, ftq.a::new)
      );

      public ftq a() {
         return this.b;
      }

      public fte.a b() {
         return this.c;
      }
   }

   public interface b {
      ffn load(ava var1) throws IOException;
   }

   public static record c(ald a) {
   }
}
