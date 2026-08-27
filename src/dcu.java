import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dcu {
   List<dcu.a> b();

   static List<dcu> c() {
      return jy.i.s().map(dcu::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dcu a(crr $$0) {
      if ($$0.k() instanceof ciu $$1) {
         cut var6 = $$1.e();
         if (var6 instanceof dcu) {
            return (dcu)var6;
         }
      }

      ckw $$2 = $$0.k();
      return $$2 instanceof dcu ? (dcu)$$2 : null;
   }

   public static record a(bjt c, int d) {
      public static final Codec<dcu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jy.e.q().fieldOf("id").forGetter(dcu.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dcu.a::c)).apply($$0, dcu.a::new)
      );
      public static final Codec<List<dcu.a>> b = a.listOf();

      public bjv a() {
         return new bjv(this.c, this.d);
      }

      public bjt b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
