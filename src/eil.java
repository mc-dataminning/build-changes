import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eil(List<eil.a> c, ejc d) {
   public static final Codec<eil> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eil.a.a.listOf().fieldOf("structures").forGetter(eil::a), ejc.b.fieldOf("placement").forGetter(eil::b)).apply($$0, eil::new)
   );
   public static final Codec<ji<eil>> b = akx.a(lq.aL, a);

   public eil(ji<eif> $$0, ejc $$1) {
      this(List.of(new eil.a($$0, 1)), $$1);
   }

   public static eil.a a(ji<eif> $$0, int $$1) {
      return new eil.a($$0, $$1);
   }

   public static eil.a a(ji<eif> $$0) {
      return new eil.a($$0, 1);
   }

   public List<eil.a> a() {
      return this.c;
   }

   public ejc b() {
      return this.d;
   }

   public static record a(ji<eif> b, int c) {
      public static final Codec<eil.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eif.b.fieldOf("structure").forGetter(eil.a::a), ayc.l.fieldOf("weight").forGetter(eil.a::b)).apply($$0, eil.a::new)
      );

      public ji<eif> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
