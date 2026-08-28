import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxf(List<cxf.a> d) {
   public static final cxf a = new cxf(List.of());
   public static final Codec<cxf> b = cxf.a.a.listOf().xmap(cxf::new, cxf::a);
   public static final ys<wf, cxf> c = cxf.a.b.a(yq.a()).a(cxf::new, cxf::a);

   public cxf a(cxf.a $$0) {
      return new cxf(ac.a(this.d, $$0));
   }

   public List<cxf.a> a() {
      return this.d;
   }

   public static record a(jj<brm> c, int d) {
      public static final Codec<cxf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lq.d.s().fieldOf("id").forGetter(cxf.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxf.a::c))
               .apply($$0, cxf.a::new)
      );
      public static final ys<wf, cxf.a> b = ys.a(yq.b(lr.V), cxf.a::b, yq.g, cxf.a::c, cxf.a::new);

      public bro a() {
         return new bro(this.c, this.d);
      }

      public jj<brm> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
