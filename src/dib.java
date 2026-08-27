import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dib {
   List<dib.a> b();

   static List<dib> c() {
      return ki.h.s().map(dib::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dib a(cwy $$0) {
      if ($$0.l() instanceof cof $$1) {
         daa var6 = $$1.d();
         if (var6 instanceof dib) {
            return (dib)var6;
         }
      }

      cqf $$2 = $$0.l();
      return $$2 instanceof dib ? (dib)$$2 : null;
   }

   public static record a(il<boh> c, int d) {
      public static final Codec<dib.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ki.d.r().fieldOf("id").forGetter(dib.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dib.a::c)).apply($$0, dib.a::new)
      );
      public static final Codec<List<dib.a>> b = a.listOf();

      public boj a() {
         return new boj(this.c, this.d);
      }

      public il<boh> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
