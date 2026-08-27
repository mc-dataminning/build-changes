import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fjb {
   MapCodec<fjb> b = fjc.f.dispatchMap(fjb::a, fjc::a);

   fjc a();

   Either<fjb.b, fjb.c> b();

   public static record a(fjb b, fip.a c) {
      public static final Codec<fjb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fjb.b.forGetter(fjb.a::a), fip.a.a.optionalFieldOf("filter", fip.a.b).forGetter(fjb.a::b)).apply($$0, fjb.a::new)
      );

      public fjb a() {
         return this.b;
      }

      public fip.a b() {
         return this.c;
      }
   }

   public interface b {
      ewv load(atw var1) throws IOException;
   }

   public static record c(akm a) {
   }
}
