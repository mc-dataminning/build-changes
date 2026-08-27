import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ehp(List<ehp.a> c, eig d) {
   public static final Codec<ehp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehp.a.a.listOf().fieldOf("structures").forGetter(ehp::a), eig.b.fieldOf("placement").forGetter(ehp::b)).apply($$0, ehp::new)
   );
   public static final Codec<ix<ehp>> b = aki.a(lf.aL, a);

   public ehp(ix<ehj> $$0, eig $$1) {
      this(List.of(new ehp.a($$0, 1)), $$1);
   }

   public static ehp.a a(ix<ehj> $$0, int $$1) {
      return new ehp.a($$0, $$1);
   }

   public static ehp.a a(ix<ehj> $$0) {
      return new ehp.a($$0, 1);
   }

   public List<ehp.a> a() {
      return this.c;
   }

   public eig b() {
      return this.d;
   }

   public static record a(ix<ehj> b, int c) {
      public static final Codec<ehp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ehj.b.fieldOf("structure").forGetter(ehp.a::a), axm.j.fieldOf("weight").forGetter(ehp.a::b)).apply($$0, ehp.a::new)
      );

      public ix<ehj> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
