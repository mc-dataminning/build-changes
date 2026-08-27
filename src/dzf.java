import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dzf(List<dzf.a> c, dzw d) {
   public static final Codec<dzf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzf.a.a.listOf().fieldOf("structures").forGetter(dzf::a), dzw.b.fieldOf("placement").forGetter(dzf::b)).apply($$0, dzf::new)
   );
   public static final Codec<ih<dzf>> b = agz.a(ke.aF, a);

   public dzf(ih<dyz> $$0, dzw $$1) {
      this(List.of(new dzf.a($$0, 1)), $$1);
   }

   public static dzf.a a(ih<dyz> $$0, int $$1) {
      return new dzf.a($$0, $$1);
   }

   public static dzf.a a(ih<dyz> $$0) {
      return new dzf.a($$0, 1);
   }

   public List<dzf.a> a() {
      return this.c;
   }

   public dzw b() {
      return this.d;
   }

   public static record a(ih<dyz> b, int c) {
      public static final Codec<dzf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyz.b.fieldOf("structure").forGetter(dzf.a::a), atq.j.fieldOf("weight").forGetter(dzf.a::b)).apply($$0, dzf.a::new)
      );

      public ih<dyz> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
