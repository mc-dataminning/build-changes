import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dhg {
   List<dhg.a> b();

   static List<dhg> c() {
      return kh.h.s().map(dhg::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dhg a(cwd $$0) {
      if ($$0.l() instanceof cnl $$1) {
         czf var6 = $$1.d();
         if (var6 instanceof dhg) {
            return (dhg)var6;
         }
      }

      cpl $$2 = $$0.l();
      return $$2 instanceof dhg ? (dhg)$$2 : null;
   }

   public static record a(il<bnq> c, int d) {
      public static final Codec<dhg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kh.d.r().fieldOf("id").forGetter(dhg.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dhg.a::c)).apply($$0, dhg.a::new)
      );
      public static final Codec<List<dhg.a>> b = a.listOf();

      public bns a() {
         return new bns(this.c, this.d);
      }

      public il<bnq> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
