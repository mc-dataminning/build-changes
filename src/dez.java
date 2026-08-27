import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dez {
   List<dez.a> b();

   static List<dez> c() {
      return kd.h.s().map(dez::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dez a(ctw $$0) {
      if ($$0.j() instanceof cla $$1) {
         cwy var6 = $$1.e();
         if (var6 instanceof dez) {
            return (dez)var6;
         }
      }

      cnb $$2 = $$0.j();
      return $$2 instanceof dez ? (dez)$$2 : null;
   }

   public static record a(ih<blh> c, int d) {
      public static final Codec<dez.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.d.r().fieldOf("id").forGetter(dez.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dez.a::c)).apply($$0, dez.a::new)
      );
      public static final Codec<List<dez.a>> b = a.listOf();

      public blj a() {
         return new blj(this.c, this.d);
      }

      public ih<blh> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
