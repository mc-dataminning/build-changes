import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dca {
   List<dca.a> b();

   static List<dca> c() {
      return jy.i.s().map(dca::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dca a(cqy $$0) {
      if ($$0.k() instanceof cic $$1) {
         cua var6 = $$1.e();
         if (var6 instanceof dca) {
            return (dca)var6;
         }
      }

      cke $$2 = $$0.k();
      return $$2 instanceof dca ? (dca)$$2 : null;
   }

   public static record a(bje c, int d) {
      public static final Codec<dca.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jy.e.q().fieldOf("id").forGetter(dca.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dca.a::c)).apply($$0, dca.a::new)
      );
      public static final Codec<List<dca.a>> b = a.listOf();

      public bjg a() {
         return new bjg(this.c, this.d);
      }

      public bje b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
