import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvi(List<dvi.a> c, dvz d) {
   public static final Codec<dvi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvi.a.a.listOf().fieldOf("structures").forGetter(dvi::a), dvz.b.fieldOf("placement").forGetter(dvi::b)).apply($$0, dvi::new)
   );
   public static final Codec<he<dvi>> b = aev.a(jc.aC, a);

   public dvi(he<dvc> $$0, dvz $$1) {
      this(List.of(new dvi.a($$0, 1)), $$1);
   }

   public static dvi.a a(he<dvc> $$0, int $$1) {
      return new dvi.a($$0, $$1);
   }

   public static dvi.a a(he<dvc> $$0) {
      return new dvi.a($$0, 1);
   }

   public List<dvi.a> a() {
      return this.c;
   }

   public dvz b() {
      return this.d;
   }

   public static record a(he<dvc> b, int c) {
      public static final Codec<dvi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dvc.b.fieldOf("structure").forGetter(dvi.a::a), arj.j.fieldOf("weight").forGetter(dvi.a::b)).apply($$0, dvi.a::new)
      );

      public he<dvc> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
