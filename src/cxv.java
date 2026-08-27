import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxv(List<cxv.a> d) {
   public static final cxv a = new cxv(List.of());
   public static final Codec<cxv> b = cxv.a.a.listOf().xmap(cxv::new, cxv::a);
   public static final zc<wp, cxv> c = cxv.a.b.a(za.a()).a(cxv::new, cxv::a);

   public cxv a(cxv.a $$0) {
      return new cxv(ad.a(this.d, $$0));
   }

   public List<cxv.a> a() {
      return this.d;
   }

   public static record a(ja<brf> c, int d) {
      public static final Codec<cxv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lh.d.r().fieldOf("id").forGetter(cxv.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(cxv.a::c)).apply($$0, cxv.a::new)
      );
      public static final zc<wp, cxv.a> b = zc.a(za.b(li.R), cxv.a::b, za.g, cxv.a::c, cxv.a::new);

      public brh a() {
         return new brh(this.c, this.d);
      }

      public ja<brf> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
