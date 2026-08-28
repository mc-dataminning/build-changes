import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fst {
   MapCodec<fst> b = fsu.f.dispatchMap(fst::a, fsu::a);

   fsu a();

   Either<fst.b, fst.c> b();

   public static record a(fst b, fsh.a c) {
      public static final Codec<fst.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fst.b.forGetter(fst.a::a), fsh.a.a.optionalFieldOf("filter", fsh.a.b).forGetter(fst.a::b)).apply($$0, fst.a::new)
      );

      public fst a() {
         return this.b;
      }

      public fsh.a b() {
         return this.c;
      }
   }

   public interface b {
      feq load(aup var1) throws IOException;
   }

   public static record c(aku a) {
   }
}
