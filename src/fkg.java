import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fkg {
   MapCodec<fkg> b = fkh.f.dispatchMap(fkg::a, fkh::a);

   fkh a();

   Either<fkg.b, fkg.c> b();

   public static record a(fkg b, fju.a c) {
      public static final Codec<fkg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fkg.b.forGetter(fkg.a::a), fju.a.a.optionalFieldOf("filter", fju.a.b).forGetter(fkg.a::b)).apply($$0, fkg.a::new)
      );

      public fkg a() {
         return this.b;
      }

      public fju.a b() {
         return this.c;
      }
   }

   public interface b {
      eyb load(aup var1) throws IOException;
   }

   public static record c(alf a) {
   }
}
