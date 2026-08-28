import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxw(List<cxw.a> d) {
   public static final cxw a = new cxw(List.of());
   public static final Codec<cxw> b = cxw.a.a.listOf().xmap(cxw::new, cxw::a);
   public static final yx<wk, cxw> c = cxw.a.b.a(yv.a()).a(cxw::new, cxw::a);

   public cxw a(cxw.a $$0) {
      return new cxw(ad.a(this.d, $$0));
   }

   public List<cxw.a> a() {
      return this.d;
   }

   public static record a(jm<brx> c, int d) {
      public static final Codec<cxw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brx.a.fieldOf("id").forGetter(cxw.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxw.a::c))
               .apply($$0, cxw.a::new)
      );
      public static final yx<wk, cxw.a> b = yx.a(brx.b, cxw.a::b, yv.g, cxw.a::c, cxw.a::new);

      public brz a() {
         return new brz(this.c, this.d);
      }

      public jm<brx> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
