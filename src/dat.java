import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dat {
   List<dat.a> a();

   static List<dat> b() {
      return jd.i.s().map(dat::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dat a(cpp $$0) {
      if ($$0.k() instanceof cgt $$1) {
         csq var6 = $$1.e();
         if (var6 instanceof dat) {
            return (dat)var6;
         }
      }

      civ $$2 = $$0.k();
      return $$2 instanceof dat ? (dat)$$2 : null;
   }

   public static record a(bhw c, int d) {
      public static final Codec<dat.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jd.e.q().fieldOf("id").forGetter(dat.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dat.a::c)).apply($$0, dat.a::new)
      );
      public static final Codec<List<dat.a>> b = a.listOf();

      public bhy a() {
         return new bhy(this.c, this.d);
      }

      public bhw b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
