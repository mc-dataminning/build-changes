import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cyp(List<cyp.a> d) {
   public static final cyp a = new cyp(List.of());
   public static final Codec<cyp> b = cyp.a.a.listOf().xmap(cyp::new, cyp::a);
   public static final zb<wo, cyp> c = cyp.a.b.a(yz.a()).a(cyp::new, cyp::a);

   public cyp a(cyp.a $$0) {
      return new cyp(ad.a(this.d, $$0));
   }

   public List<cyp.a> a() {
      return this.d;
   }

   public static record a(jn<bso> c, int d) {
      public static final Codec<cyp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bso.a.fieldOf("id").forGetter(cyp.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cyp.a::c))
               .apply($$0, cyp.a::new)
      );
      public static final zb<wo, cyp.a> b = zb.a(bso.b, cyp.a::b, yz.g, cyp.a::c, cyp.a::new);

      public bsq a() {
         return new bsq(this.c, this.d);
      }

      public jn<bso> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
