import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eir(List<eir.a> c, eji d) {
   public static final Codec<eir> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eir.a.a.listOf().fieldOf("structures").forGetter(eir::a), eji.b.fieldOf("placement").forGetter(eir::b)).apply($$0, eir::new)
   );
   public static final Codec<ji<eir>> b = alb.a(lq.aL, a);

   public eir(ji<eil> $$0, eji $$1) {
      this(List.of(new eir.a($$0, 1)), $$1);
   }

   public static eir.a a(ji<eil> $$0, int $$1) {
      return new eir.a($$0, $$1);
   }

   public static eir.a a(ji<eil> $$0) {
      return new eir.a($$0, 1);
   }

   public List<eir.a> a() {
      return this.c;
   }

   public eji b() {
      return this.d;
   }

   public static record a(ji<eil> b, int c) {
      public static final Codec<eir.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eil.b.fieldOf("structure").forGetter(eir.a::a), ayh.l.fieldOf("weight").forGetter(eir.a::b)).apply($$0, eir.a::new)
      );

      public ji<eil> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
