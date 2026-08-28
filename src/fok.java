import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fok {
   MapCodec<fok> b = fol.f.dispatchMap(fok::a, fol::a);

   fol a();

   Either<fok.b, fok.c> b();

   public static record a(fok b, fny.a c) {
      public static final Codec<fok.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fok.b.forGetter(fok.a::a), fny.a.a.optionalFieldOf("filter", fny.a.b).forGetter(fok.a::b)).apply($$0, fok.a::new)
      );

      public fok a() {
         return this.b;
      }

      public fny.a b() {
         return this.c;
      }
   }

   public interface b {
      fca load(avb var1) throws IOException;
   }

   public static record c(ali a) {
   }
}
