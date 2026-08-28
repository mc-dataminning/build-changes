import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record emh(List<emh.a> c, emy d) {
   public static final Codec<emh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emh.a.a.listOf().fieldOf("structures").forGetter(emh::a), emy.b.fieldOf("placement").forGetter(emh::b)).apply($$0, emh::new)
   );
   public static final Codec<jq<emh>> b = alh.a(ma.aU, a);

   public emh(jq<emb> $$0, emy $$1) {
      this(List.of(new emh.a($$0, 1)), $$1);
   }

   public static emh.a a(jq<emb> $$0, int $$1) {
      return new emh.a($$0, $$1);
   }

   public static emh.a a(jq<emb> $$0) {
      return new emh.a($$0, 1);
   }

   public List<emh.a> a() {
      return this.c;
   }

   public emy b() {
      return this.d;
   }

   public static record a(jq<emb> b, int c) {
      public static final Codec<emh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(emb.b.fieldOf("structure").forGetter(emh.a::a), ayw.m.fieldOf("weight").forGetter(emh.a::b)).apply($$0, emh.a::new)
      );

      public jq<emb> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
