import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efn(List<efn.a> c, ege d) {
   public static final Codec<efn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efn.a.a.listOf().fieldOf("structures").forGetter(efn::a), ege.b.fieldOf("placement").forGetter(efn::b)).apply($$0, efn::new)
   );
   public static final Codec<il<efn>> b = ajp.a(ks.aH, a);

   public efn(il<efh> $$0, ege $$1) {
      this(List.of(new efn.a($$0, 1)), $$1);
   }

   public static efn.a a(il<efh> $$0, int $$1) {
      return new efn.a($$0, $$1);
   }

   public static efn.a a(il<efh> $$0) {
      return new efn.a($$0, 1);
   }

   public List<efn.a> a() {
      return this.c;
   }

   public ege b() {
      return this.d;
   }

   public static record a(il<efh> b, int c) {
      public static final Codec<efn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(efh.b.fieldOf("structure").forGetter(efn.a::a), aws.j.fieldOf("weight").forGetter(efn.a::b)).apply($$0, efn.a::new)
      );

      public il<efh> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
