import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface did {
   List<did.a> b();

   static List<did> c() {
      return ki.h.s().map(did::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static did a(cxa $$0) {
      if ($$0.l() instanceof coh $$1) {
         dac var6 = $$1.d();
         if (var6 instanceof did) {
            return (did)var6;
         }
      }

      cqh $$2 = $$0.l();
      return $$2 instanceof did ? (did)$$2 : null;
   }

   public static record a(il<boi> c, int d) {
      public static final Codec<did.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ki.d.r().fieldOf("id").forGetter(did.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(did.a::c)).apply($$0, did.a::new)
      );
      public static final Codec<List<did.a>> b = a.listOf();

      public bok a() {
         return new bok(this.c, this.d);
      }

      public il<boi> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
