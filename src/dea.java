import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dea {
   List<dea.a> b();

   static List<dea> c() {
      return kb.h.s().map(dea::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dea a(csx $$0) {
      if ($$0.k() instanceof cka $$1) {
         cvz var6 = $$1.e();
         if (var6 instanceof dea) {
            return (dea)var6;
         }
      }

      cmc $$2 = $$0.k();
      return $$2 instanceof dea ? (dea)$$2 : null;
   }

   public static record a(bkq c, int d) {
      public static final Codec<dea.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kb.d.q().fieldOf("id").forGetter(dea.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dea.a::c)).apply($$0, dea.a::new)
      );
      public static final Codec<List<dea.a>> b = a.listOf();

      public bks a() {
         return new bks(this.c, this.d);
      }

      public bkq b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
