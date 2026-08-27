import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dve(List<dve.a> c, dvv d) {
   public static final Codec<dve> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dve.a.a.listOf().fieldOf("structures").forGetter(dve::a), dvv.b.fieldOf("placement").forGetter(dve::b)).apply($$0, dve::new)
   );
   public static final Codec<he<dve>> b = aen.a(jc.aB, a);

   public dve(he<duy> $$0, dvv $$1) {
      this(List.of(new dve.a($$0, 1)), $$1);
   }

   public static dve.a a(he<duy> $$0, int $$1) {
      return new dve.a($$0, $$1);
   }

   public static dve.a a(he<duy> $$0) {
      return new dve.a($$0, 1);
   }

   public List<dve.a> a() {
      return this.c;
   }

   public dvv b() {
      return this.d;
   }

   public static record a(he<duy> b, int c) {
      public static final Codec<dve.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(duy.b.fieldOf("structure").forGetter(dve.a::a), aqy.j.fieldOf("weight").forGetter(dve.a::b)).apply($$0, dve.a::new)
      );

      public he<duy> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
