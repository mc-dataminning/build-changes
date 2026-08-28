import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxo(List<cxo.a> d) {
   public static final cxo a = new cxo(List.of());
   public static final Codec<cxo> b = cxo.a.a.listOf().xmap(cxo::new, cxo::a);
   public static final zj<ww, cxo> c = cxo.a.b.a(zh.a()).a(cxo::new, cxo::a);

   public cxo a(cxo.a $$0) {
      return new cxo(ac.a(this.d, $$0));
   }

   public List<cxo.a> a() {
      return this.d;
   }

   public static record a(ji<brv> c, int d) {
      public static final Codec<cxo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("id").forGetter(cxo.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxo.a::c))
               .apply($$0, cxo.a::new)
      );
      public static final zj<ww, cxo.a> b = zj.a(zh.b(lq.R), cxo.a::b, zh.g, cxo.a::c, cxo.a::new);

      public brx a() {
         return new brx(this.c, this.d);
      }

      public ji<brv> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
