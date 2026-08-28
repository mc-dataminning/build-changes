import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record esj(List<esj.a> c, eta d) {
   public static final Codec<esj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esj.a.a.listOf().fieldOf("structures").forGetter(esj::a), eta.b.fieldOf("placement").forGetter(esj::b)).apply($$0, esj::new)
   );
   public static final Codec<jg<esj>> b = alg.a(mi.bd, a);

   public esj(jg<esd> $$0, eta $$1) {
      this(List.of(new esj.a($$0, 1)), $$1);
   }

   public static esj.a a(jg<esd> $$0, int $$1) {
      return new esj.a($$0, $$1);
   }

   public static esj.a a(jg<esd> $$0) {
      return new esj.a($$0, 1);
   }

   public List<esj.a> a() {
      return this.c;
   }

   public eta b() {
      return this.d;
   }

   public static record a(jg<esd> b, int c) {
      public static final Codec<esj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(esd.b.fieldOf("structure").forGetter(esj.a::a), ayy.m.fieldOf("weight").forGetter(esj.a::b)).apply($$0, esj.a::new)
      );

      public jg<esd> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
