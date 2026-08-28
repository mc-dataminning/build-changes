import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fkf {
   MapCodec<fkf> b = fkg.f.dispatchMap(fkf::a, fkg::a);

   fkg a();

   Either<fkf.b, fkf.c> b();

   public static record a(fkf b, fjt.a c) {
      public static final Codec<fkf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fkf.b.forGetter(fkf.a::a), fjt.a.a.optionalFieldOf("filter", fjt.a.b).forGetter(fkf.a::b)).apply($$0, fkf.a::new)
      );

      public fkf a() {
         return this.b;
      }

      public fjt.a b() {
         return this.c;
      }
   }

   public interface b {
      eya load(auo var1) throws IOException;
   }

   public static record c(ale a) {
   }
}
