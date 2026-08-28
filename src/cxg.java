import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxg(List<cxg.a> d) {
   public static final cxg a = new cxg(List.of());
   public static final Codec<cxg> b = cxg.a.a.listOf().xmap(cxg::new, cxg::a);
   public static final ys<wf, cxg> c = cxg.a.b.a(yq.a()).a(cxg::new, cxg::a);

   public cxg a(cxg.a $$0) {
      return new cxg(ac.a(this.d, $$0));
   }

   public List<cxg.a> a() {
      return this.d;
   }

   public static record a(jj<brn> c, int d) {
      public static final Codec<cxg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brn.a.fieldOf("id").forGetter(cxg.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxg.a::c))
               .apply($$0, cxg.a::new)
      );
      public static final ys<wf, cxg.a> b = ys.a(brn.b, cxg.a::b, yq.g, cxg.a::c, cxg.a::new);

      public brp a() {
         return new brp(this.c, this.d);
      }

      public jj<brn> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
