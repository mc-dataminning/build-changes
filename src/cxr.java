import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxr(List<cxr.a> d) {
   public static final cxr a = new cxr(List.of());
   public static final Codec<cxr> b = cxr.a.a.listOf().xmap(cxr::new, cxr::a);
   public static final zm<wz, cxr> c = cxr.a.b.a(zk.a()).a(cxr::new, cxr::a);

   public cxr a(cxr.a $$0) {
      return new cxr(ac.a(this.d, $$0));
   }

   public List<cxr.a> a() {
      return this.d;
   }

   public static record a(ji<bry> c, int d) {
      public static final Codec<cxr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("id").forGetter(cxr.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxr.a::c))
               .apply($$0, cxr.a::new)
      );
      public static final zm<wz, cxr.a> b = zm.a(zk.b(lq.R), cxr.a::b, zk.g, cxr.a::c, cxr.a::new);

      public bsa a() {
         return new bsa(this.c, this.d);
      }

      public ji<bry> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
