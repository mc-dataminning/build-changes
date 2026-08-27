import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dgp {
   List<dgp.a> b();

   static List<dgp> c() {
      return kf.h.s().map(dgp::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dgp a(cvm $$0) {
      if ($$0.j() instanceof cms $$1) {
         cyo var6 = $$1.e();
         if (var6 instanceof dgp) {
            return (dgp)var6;
         }
      }

      cou $$2 = $$0.j();
      return $$2 instanceof dgp ? (dgp)$$2 : null;
   }

   public static record a(ij<bmz> c, int d) {
      public static final Codec<dgp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kf.d.r().fieldOf("id").forGetter(dgp.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dgp.a::c)).apply($$0, dgp.a::new)
      );
      public static final Codec<List<dgp.a>> b = a.listOf();

      public bnb a() {
         return new bnb(this.c, this.d);
      }

      public ij<bmz> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
