import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxu(List<cxu.a> d) {
   public static final cxu a = new cxu(List.of());
   public static final Codec<cxu> b = cxu.a.a.listOf().xmap(cxu::new, cxu::a);
   public static final zn<xa, cxu> c = cxu.a.b.a(zl.a()).a(cxu::new, cxu::a);

   public cxu a(cxu.a $$0) {
      return new cxu(ac.a(this.d, $$0));
   }

   public List<cxu.a> a() {
      return this.d;
   }

   public static record a(ji<bsb> c, int d) {
      public static final Codec<cxu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("id").forGetter(cxu.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxu.a::c))
               .apply($$0, cxu.a::new)
      );
      public static final zn<xa, cxu.a> b = zn.a(zl.b(lq.R), cxu.a::b, zl.g, cxu.a::c, cxu.a::new);

      public bsd a() {
         return new bsd(this.c, this.d);
      }

      public ji<bsb> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
