import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dek {
   List<dek.a> b();

   static List<dek> c() {
      return kd.h.s().map(dek::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dek a(cth $$0) {
      if ($$0.k() instanceof ckk $$1) {
         cwj var6 = $$1.e();
         if (var6 instanceof dek) {
            return (dek)var6;
         }
      }

      cmm $$2 = $$0.k();
      return $$2 instanceof dek ? (dek)$$2 : null;
   }

   public static record a(bla c, int d) {
      public static final Codec<dek.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.d.q().fieldOf("id").forGetter(dek.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dek.a::c)).apply($$0, dek.a::new)
      );
      public static final Codec<List<dek.a>> b = a.listOf();

      public blc a() {
         return new blc(this.c, this.d);
      }

      public bla b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
