import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eis(List<eis.a> c, ejj d) {
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eis.a.a.listOf().fieldOf("structures").forGetter(eis::a), ejj.b.fieldOf("placement").forGetter(eis::b)).apply($$0, eis::new)
   );
   public static final Codec<ji<eis>> b = alb.a(lq.aL, a);

   public eis(ji<eim> $$0, ejj $$1) {
      this(List.of(new eis.a($$0, 1)), $$1);
   }

   public static eis.a a(ji<eim> $$0, int $$1) {
      return new eis.a($$0, $$1);
   }

   public static eis.a a(ji<eim> $$0) {
      return new eis.a($$0, 1);
   }

   public List<eis.a> a() {
      return this.c;
   }

   public ejj b() {
      return this.d;
   }

   public static record a(ji<eim> b, int c) {
      public static final Codec<eis.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eim.b.fieldOf("structure").forGetter(eis.a::a), ayh.l.fieldOf("weight").forGetter(eis.a::b)).apply($$0, eis.a::new)
      );

      public ji<eim> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
