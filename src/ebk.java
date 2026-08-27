import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ebk(List<ebk.a> c, ecb d) {
   public static final Codec<ebk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebk.a.a.listOf().fieldOf("structures").forGetter(ebk::a), ecb.b.fieldOf("placement").forGetter(ebk::b)).apply($$0, ebk::new)
   );
   public static final Codec<ij<ebk>> b = aiu.a(kg.aF, a);

   public ebk(ij<ebe> $$0, ecb $$1) {
      this(List.of(new ebk.a($$0, 1)), $$1);
   }

   public static ebk.a a(ij<ebe> $$0, int $$1) {
      return new ebk.a($$0, $$1);
   }

   public static ebk.a a(ij<ebe> $$0) {
      return new ebk.a($$0, 1);
   }

   public List<ebk.a> a() {
      return this.c;
   }

   public ecb b() {
      return this.d;
   }

   public static record a(ij<ebe> b, int c) {
      public static final Codec<ebk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ebe.b.fieldOf("structure").forGetter(ebk.a::a), avp.j.fieldOf("weight").forGetter(ebk.a::b)).apply($$0, ebk.a::new)
      );

      public ij<ebe> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
