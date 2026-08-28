import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eoq(List<eoq.a> c, eph d) {
   public static final Codec<eoq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eoq.a.a.listOf().fieldOf("structures").forGetter(eoq::a), eph.b.fieldOf("placement").forGetter(eoq::b)).apply($$0, eoq::new)
   );
   public static final Codec<jq<eoq>> b = alv.a(mb.aW, a);

   public eoq(jq<eok> $$0, eph $$1) {
      this(List.of(new eoq.a($$0, 1)), $$1);
   }

   public static eoq.a a(jq<eok> $$0, int $$1) {
      return new eoq.a($$0, $$1);
   }

   public static eoq.a a(jq<eok> $$0) {
      return new eoq.a($$0, 1);
   }

   public List<eoq.a> a() {
      return this.c;
   }

   public eph b() {
      return this.d;
   }

   public static record a(jq<eok> b, int c) {
      public static final Codec<eoq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eok.b.fieldOf("structure").forGetter(eoq.a::a), azn.m.fieldOf("weight").forGetter(eoq.a::b)).apply($$0, eoq.a::new)
      );

      public jq<eok> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
