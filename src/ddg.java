import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface ddg {
   List<ddg.a> b();

   static List<ddg> c() {
      return kc.i.s().map(ddg::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static ddg a(cse $$0) {
      if ($$0.k() instanceof cjh $$1) {
         cvf var6 = $$1.e();
         if (var6 instanceof ddg) {
            return (ddg)var6;
         }
      }

      clj $$2 = $$0.k();
      return $$2 instanceof ddg ? (ddg)$$2 : null;
   }

   public static record a(bkg c, int d) {
      public static final Codec<ddg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kc.e.q().fieldOf("id").forGetter(ddg.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(ddg.a::c)).apply($$0, ddg.a::new)
      );
      public static final Codec<List<ddg.a>> b = a.listOf();

      public bki a() {
         return new bki(this.c, this.d);
      }

      public bkg b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
