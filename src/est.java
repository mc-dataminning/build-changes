import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record est(List<est.a> c, etk d) {
   public static final Codec<est> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(est.a.a.listOf().fieldOf("structures").forGetter(est::a), etk.b.fieldOf("placement").forGetter(est::b)).apply($$0, est::new)
   );
   public static final Codec<jg<est>> b = aln.a(mi.bd, a);

   public est(jg<esn> $$0, etk $$1) {
      this(List.of(new est.a($$0, 1)), $$1);
   }

   public static est.a a(jg<esn> $$0, int $$1) {
      return new est.a($$0, $$1);
   }

   public static est.a a(jg<esn> $$0) {
      return new est.a($$0, 1);
   }

   public List<est.a> a() {
      return this.c;
   }

   public etk b() {
      return this.d;
   }

   public static record a(jg<esn> b, int c) {
      public static final Codec<est.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(esn.b.fieldOf("structure").forGetter(est.a::a), azg.m.fieldOf("weight").forGetter(est.a::b)).apply($$0, est.a::new)
      );

      public jg<esn> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
