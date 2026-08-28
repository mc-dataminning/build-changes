import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface flm {
   MapCodec<flm> b = fln.f.dispatchMap(flm::a, fln::a);

   fln a();

   Either<flm.b, flm.c> b();

   public static record a(flm b, fla.a c) {
      public static final Codec<flm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(flm.b.forGetter(flm.a::a), fla.a.a.optionalFieldOf("filter", fla.a.b).forGetter(flm.a::b)).apply($$0, flm.a::new)
      );

      public flm a() {
         return this.b;
      }

      public fla.a b() {
         return this.c;
      }
   }

   public interface b {
      ezk load(aue var1) throws IOException;
   }

   public static record c(akr a) {
   }
}
