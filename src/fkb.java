import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fkb {
   MapCodec<fkb> b = fkc.f.dispatchMap(fkb::a, fkc::a);

   fkc a();

   Either<fkb.b, fkb.c> b();

   public static record a(fkb b, fjp.a c) {
      public static final Codec<fkb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fkb.b.forGetter(fkb.a::a), fjp.a.a.optionalFieldOf("filter", fjp.a.b).forGetter(fkb.a::b)).apply($$0, fkb.a::new)
      );

      public fkb a() {
         return this.b;
      }

      public fjp.a b() {
         return this.c;
      }
   }

   public interface b {
      exw load(aul var1) throws IOException;
   }

   public static record c(alb a) {
   }
}
