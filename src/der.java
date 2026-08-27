import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface der {
   List<der.a> b();

   static List<der> c() {
      return kd.h.s().map(der::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static der a(cto $$0) {
      if ($$0.k() instanceof ckr $$1) {
         cwq var6 = $$1.e();
         if (var6 instanceof der) {
            return (der)var6;
         }
      }

      cmt $$2 = $$0.k();
      return $$2 instanceof der ? (der)$$2 : null;
   }

   public static record a(blg c, int d) {
      public static final Codec<der.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.d.q().fieldOf("id").forGetter(der.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(der.a::c)).apply($$0, der.a::new)
      );
      public static final Codec<List<der.a>> b = a.listOf();

      public bli a() {
         return new bli(this.c, this.d);
      }

      public blg b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
