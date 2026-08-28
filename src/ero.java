import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ero(List<ero.a> c, esf d) {
   public static final Codec<ero> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ero.a.a.listOf().fieldOf("structures").forGetter(ero::a), esf.b.fieldOf("placement").forGetter(ero::b)).apply($$0, ero::new)
   );
   public static final Codec<jf<ero>> b = alc.a(mh.bd, a);

   public ero(jf<eri> $$0, esf $$1) {
      this(List.of(new ero.a($$0, 1)), $$1);
   }

   public static ero.a a(jf<eri> $$0, int $$1) {
      return new ero.a($$0, $$1);
   }

   public static ero.a a(jf<eri> $$0) {
      return new ero.a($$0, 1);
   }

   public List<ero.a> a() {
      return this.c;
   }

   public esf b() {
      return this.d;
   }

   public static record a(jf<eri> b, int c) {
      public static final Codec<ero.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eri.b.fieldOf("structure").forGetter(ero.a::a), ayu.m.fieldOf("weight").forGetter(ero.a::b)).apply($$0, ero.a::new)
      );

      public jf<eri> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
