import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fpa {
   MapCodec<fpa> b = fpb.f.dispatchMap(fpa::a, fpb::a);

   fpb a();

   Either<fpa.b, fpa.c> b();

   public static record a(fpa b, fon.a c) {
      public static final Codec<fpa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fpa.b.forGetter(fpa.a::a), fon.a.a.optionalFieldOf("filter", fon.a.b).forGetter(fpa.a::b)).apply($$0, fpa.a::new)
      );

      public fpa a() {
         return this.b;
      }

      public fon.a b() {
         return this.c;
      }
   }

   public interface b {
      fcj load(ave var1) throws IOException;
   }

   public static record c(all a) {
   }
}
