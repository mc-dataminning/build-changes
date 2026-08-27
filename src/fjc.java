import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fjc {
   MapCodec<fjc> b = fjd.f.dispatchMap(fjc::a, fjd::a);

   fjd a();

   Either<fjc.b, fjc.c> b();

   public static record a(fjc b, fiq.a c) {
      public static final Codec<fjc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fjc.b.forGetter(fjc.a::a), fiq.a.a.optionalFieldOf("filter", fiq.a.b).forGetter(fjc.a::b)).apply($$0, fjc.a::new)
      );

      public fjc a() {
         return this.b;
      }

      public fiq.a b() {
         return this.c;
      }
   }

   public interface b {
      ewx load(atx var1) throws IOException;
   }

   public static record c(akn a) {
   }
}
