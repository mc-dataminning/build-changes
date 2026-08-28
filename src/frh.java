import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface frh {
   MapCodec<frh> b = fri.f.dispatchMap(frh::a, fri::a);

   fri a();

   Either<frh.b, frh.c> b();

   public static record a(frh b, fqv.a c) {
      public static final Codec<frh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frh.b.forGetter(frh.a::a), fqv.a.a.optionalFieldOf("filter", fqv.a.b).forGetter(frh.a::b)).apply($$0, frh.a::new)
      );

      public frh a() {
         return this.b;
      }

      public fqv.a b() {
         return this.c;
      }
   }

   public interface b {
      fep load(avv var1) throws IOException;
   }

   public static record c(alz a) {
   }
}
