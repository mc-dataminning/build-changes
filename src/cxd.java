import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxd(List<cxd.a> d) {
   public static final cxd a = new cxd(List.of());
   public static final Codec<cxd> b = cxd.a.a.listOf().xmap(cxd::new, cxd::a);
   public static final ys<wf, cxd> c = cxd.a.b.a(yq.a()).a(cxd::new, cxd::a);

   public cxd a(cxd.a $$0) {
      return new cxd(ac.a(this.d, $$0));
   }

   public List<cxd.a> a() {
      return this.d;
   }

   public static record a(jj<brj> c, int d) {
      public static final Codec<cxd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lq.d.s().fieldOf("id").forGetter(cxd.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxd.a::c))
               .apply($$0, cxd.a::new)
      );
      public static final ys<wf, cxd.a> b = ys.a(yq.b(lr.V), cxd.a::b, yq.g, cxd.a::c, cxd.a::new);

      public brl a() {
         return new brl(this.c, this.d);
      }

      public jj<brj> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
