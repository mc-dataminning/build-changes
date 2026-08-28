import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxs(List<cxs.a> d) {
   public static final cxs a = new cxs(List.of());
   public static final Codec<cxs> b = cxs.a.a.listOf().xmap(cxs::new, cxs::a);
   public static final zm<wz, cxs> c = cxs.a.b.a(zk.a()).a(cxs::new, cxs::a);

   public cxs a(cxs.a $$0) {
      return new cxs(ac.a(this.d, $$0));
   }

   public List<cxs.a> a() {
      return this.d;
   }

   public static record a(ji<brz> c, int d) {
      public static final Codec<cxs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("id").forGetter(cxs.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxs.a::c))
               .apply($$0, cxs.a::new)
      );
      public static final zm<wz, cxs.a> b = zm.a(zk.b(lq.R), cxs.a::b, zk.g, cxs.a::c, cxs.a::new);

      public bsb a() {
         return new bsb(this.c, this.d);
      }

      public ji<brz> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
