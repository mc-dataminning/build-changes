import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fkh {
   MapCodec<fkh> b = fki.f.dispatchMap(fkh::a, fki::a);

   fki a();

   Either<fkh.b, fkh.c> b();

   public static record a(fkh b, fjv.a c) {
      public static final Codec<fkh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fkh.b.forGetter(fkh.a::a), fjv.a.a.optionalFieldOf("filter", fjv.a.b).forGetter(fkh.a::b)).apply($$0, fkh.a::new)
      );

      public fkh a() {
         return this.b;
      }

      public fjv.a b() {
         return this.c;
      }
   }

   public interface b {
      eyc load(aup var1) throws IOException;
   }

   public static record c(alf a) {
   }
}
