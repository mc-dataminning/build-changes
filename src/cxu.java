import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxu(List<cxu.a> d) {
   public static final cxu a = new cxu(List.of());
   public static final Codec<cxu> b = cxu.a.a.listOf().xmap(cxu::new, cxu::a);
   public static final yw<wj, cxu> c = cxu.a.b.a(yu.a()).a(cxu::new, cxu::a);

   public cxu a(cxu.a $$0) {
      return new cxu(ad.a(this.d, $$0));
   }

   public List<cxu.a> a() {
      return this.d;
   }

   public static record a(jm<brw> c, int d) {
      public static final Codec<cxu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brw.a.fieldOf("id").forGetter(cxu.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxu.a::c))
               .apply($$0, cxu.a::new)
      );
      public static final yw<wj, cxu.a> b = yw.a(brw.b, cxu.a::b, yu.g, cxu.a::c, cxu.a::new);

      public bry a() {
         return new bry(this.c, this.d);
      }

      public jm<brw> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
