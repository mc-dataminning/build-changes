import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fnd {
   MapCodec<fnd> b = fne.f.dispatchMap(fnd::a, fne::a);

   fne a();

   Either<fnd.b, fnd.c> b();

   public static record a(fnd b, fmr.a c) {
      public static final Codec<fnd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fnd.b.forGetter(fnd.a::a), fmr.a.a.optionalFieldOf("filter", fmr.a.b).forGetter(fnd.a::b)).apply($$0, fnd.a::new)
      );

      public fnd a() {
         return this.b;
      }

      public fmr.a b() {
         return this.c;
      }
   }

   public interface b {
      fao load(aus var1) throws IOException;
   }

   public static record c(alb a) {
   }
}
