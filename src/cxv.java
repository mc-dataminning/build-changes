import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxv(List<cxv.a> d) {
   public static final cxv a = new cxv(List.of());
   public static final Codec<cxv> b = cxv.a.a.listOf().xmap(cxv::new, cxv::a);
   public static final zn<xa, cxv> c = cxv.a.b.a(zl.a()).a(cxv::new, cxv::a);

   public cxv a(cxv.a $$0) {
      return new cxv(ac.a(this.d, $$0));
   }

   public List<cxv.a> a() {
      return this.d;
   }

   public static record a(ji<bsc> c, int d) {
      public static final Codec<cxv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("id").forGetter(cxv.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxv.a::c))
               .apply($$0, cxv.a::new)
      );
      public static final zn<xa, cxv.a> b = zn.a(zl.b(lq.R), cxv.a::b, zl.g, cxv.a::c, cxv.a::new);

      public bse a() {
         return new bse(this.c, this.d);
      }

      public ji<bsc> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
