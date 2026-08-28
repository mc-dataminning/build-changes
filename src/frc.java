import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface frc {
   MapCodec<frc> b = frd.f.dispatchMap(frc::a, frd::a);

   frd a();

   Either<frc.b, frc.c> b();

   public static record a(frc b, fqq.a c) {
      public static final Codec<frc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frc.b.forGetter(frc.a::a), fqq.a.a.optionalFieldOf("filter", fqq.a.b).forGetter(frc.a::b)).apply($$0, frc.a::new)
      );

      public frc a() {
         return this.b;
      }

      public fqq.a b() {
         return this.c;
      }
   }

   public interface b {
      fek load(avv var1) throws IOException;
   }

   public static record c(alz a) {
   }
}
