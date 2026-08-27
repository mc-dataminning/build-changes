import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvf(List<dvf.a> c, dvw d) {
   public static final Codec<dvf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvf.a.a.listOf().fieldOf("structures").forGetter(dvf::a), dvw.b.fieldOf("placement").forGetter(dvf::b)).apply($$0, dvf::new)
   );
   public static final Codec<he<dvf>> b = aen.a(jc.aB, a);

   public dvf(he<duz> $$0, dvw $$1) {
      this(List.of(new dvf.a($$0, 1)), $$1);
   }

   public static dvf.a a(he<duz> $$0, int $$1) {
      return new dvf.a($$0, $$1);
   }

   public static dvf.a a(he<duz> $$0) {
      return new dvf.a($$0, 1);
   }

   public List<dvf.a> a() {
      return this.c;
   }

   public dvw b() {
      return this.d;
   }

   public static record a(he<duz> b, int c) {
      public static final Codec<dvf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(duz.b.fieldOf("structure").forGetter(dvf.a::a), aqy.j.fieldOf("weight").forGetter(dvf.a::b)).apply($$0, dvf.a::new)
      );

      public he<duz> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
