import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fig {
   MapCodec<fig> b = fih.f.dispatchMap(fig::a, $$0 -> $$0.a().codec());

   fih a();

   Either<fig.b, fig.c> b();

   public static record a(fig b, fhu.a c) {
      public static final Codec<fig.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fig.b.forGetter(fig.a::a), axh.a(fhu.a.a, "filter", fhu.a.b).forGetter(fig.a::b)).apply($$0, fig.a::new)
      );

      public fig a() {
         return this.b;
      }

      public fhu.a b() {
         return this.c;
      }
   }

   public interface b {
      ewa load(atr var1) throws IOException;
   }

   public static record c(akh a) {
   }
}
