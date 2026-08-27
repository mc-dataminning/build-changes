import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface deq {
   List<deq.a> b();

   static List<deq> c() {
      return kd.h.s().map(deq::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static deq a(ctn $$0) {
      if ($$0.k() instanceof ckq $$1) {
         cwp var6 = $$1.e();
         if (var6 instanceof deq) {
            return (deq)var6;
         }
      }

      cms $$2 = $$0.k();
      return $$2 instanceof deq ? (deq)$$2 : null;
   }

   public static record a(blf c, int d) {
      public static final Codec<deq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.d.q().fieldOf("id").forGetter(deq.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(deq.a::c)).apply($$0, deq.a::new)
      );
      public static final Codec<List<deq.a>> b = a.listOf();

      public blh a() {
         return new blh(this.c, this.d);
      }

      public blf b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
