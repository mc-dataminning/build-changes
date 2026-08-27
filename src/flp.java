import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface flp {
   MapCodec<flp> b = flq.f.dispatchMap(flp::a, $$0 -> $$0.a().codec());

   flq a();

   Either<flp.b, flp.c> b();

   public static record a(flp b, fld.a c) {
      public static final Codec<flp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(flp.b.forGetter(flp.a::a), axu.a(fld.a.a, "filter", fld.a.b).forGetter(flp.a::b)).apply($$0, flp.a::new)
      );

      public flp a() {
         return this.b;
      }

      public fld.a b() {
         return this.c;
      }
   }

   public interface b {
      ezf load(aud var1) throws IOException;
   }

   public static record c(akt a) {
   }
}
