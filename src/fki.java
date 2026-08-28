import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fki {
   MapCodec<fki> b = fkj.f.dispatchMap(fki::a, fkj::a);

   fkj a();

   Either<fki.b, fki.c> b();

   public static record a(fki b, fjw.a c) {
      public static final Codec<fki.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fki.b.forGetter(fki.a::a), fjw.a.a.optionalFieldOf("filter", fjw.a.b).forGetter(fki.a::b)).apply($$0, fki.a::new)
      );

      public fki a() {
         return this.b;
      }

      public fjw.a b() {
         return this.c;
      }
   }

   public interface b {
      eyd load(aup var1) throws IOException;
   }

   public static record c(alf a) {
   }
}
