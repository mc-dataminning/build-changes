import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ebr(List<ebr.a> c, eci d) {
   public static final Codec<ebr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebr.a.a.listOf().fieldOf("structures").forGetter(ebr::a), eci.b.fieldOf("placement").forGetter(ebr::b)).apply($$0, ebr::new)
   );
   public static final Codec<ij<ebr>> b = aiu.a(kg.aF, a);

   public ebr(ij<ebl> $$0, eci $$1) {
      this(List.of(new ebr.a($$0, 1)), $$1);
   }

   public static ebr.a a(ij<ebl> $$0, int $$1) {
      return new ebr.a($$0, $$1);
   }

   public static ebr.a a(ij<ebl> $$0) {
      return new ebr.a($$0, 1);
   }

   public List<ebr.a> a() {
      return this.c;
   }

   public eci b() {
      return this.d;
   }

   public static record a(ij<ebl> b, int c) {
      public static final Codec<ebr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ebl.b.fieldOf("structure").forGetter(ebr.a::a), avq.j.fieldOf("weight").forGetter(ebr.a::b)).apply($$0, ebr.a::new)
      );

      public ij<ebl> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
