import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fke {
   MapCodec<fke> b = fkf.f.dispatchMap(fke::a, fkf::a);

   fkf a();

   Either<fke.b, fke.c> b();

   public static record a(fke b, fjs.a c) {
      public static final Codec<fke.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fke.b.forGetter(fke.a::a), fjs.a.a.optionalFieldOf("filter", fjs.a.b).forGetter(fke.a::b)).apply($$0, fke.a::new)
      );

      public fke a() {
         return this.b;
      }

      public fjs.a b() {
         return this.c;
      }
   }

   public interface b {
      exz load(auo var1) throws IOException;
   }

   public static record c(ale a) {
   }
}
