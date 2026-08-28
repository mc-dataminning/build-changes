import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cxt(List<cxt.a> d) {
   public static final cxt a = new cxt(List.of());
   public static final Codec<cxt> b = cxt.a.a.listOf().xmap(cxt::new, cxt::a);
   public static final zn<xa, cxt> c = cxt.a.b.a(zl.a()).a(cxt::new, cxt::a);

   public cxt a(cxt.a $$0) {
      return new cxt(ac.a(this.d, $$0));
   }

   public List<cxt.a> a() {
      return this.d;
   }

   public static record a(ji<bsa> c, int d) {
      public static final Codec<cxt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("id").forGetter(cxt.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cxt.a::c))
               .apply($$0, cxt.a::new)
      );
      public static final zn<xa, cxt.a> b = zn.a(zl.b(lq.R), cxt.a::b, zl.g, cxt.a::c, cxt.a::new);

      public bsc a() {
         return new bsc(this.c, this.d);
      }

      public ji<bsa> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
