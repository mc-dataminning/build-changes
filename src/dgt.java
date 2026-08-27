import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dgt {
   List<dgt.a> b();

   static List<dgt> c() {
      return kf.h.s().map(dgt::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dgt a(cvq $$0) {
      if ($$0.j() instanceof cmw $$1) {
         cys var6 = $$1.e();
         if (var6 instanceof dgt) {
            return (dgt)var6;
         }
      }

      coy $$2 = $$0.j();
      return $$2 instanceof dgt ? (dgt)$$2 : null;
   }

   public static record a(ij<bnb> c, int d) {
      public static final Codec<dgt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kf.d.r().fieldOf("id").forGetter(dgt.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dgt.a::c)).apply($$0, dgt.a::new)
      );
      public static final Codec<List<dgt.a>> b = a.listOf();

      public bnd a() {
         return new bnd(this.c, this.d);
      }

      public ij<bnb> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
