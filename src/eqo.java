import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eqo(List<eqo.a> c, erf d) {
   public static final Codec<eqo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqo.a.a.listOf().fieldOf("structures").forGetter(eqo::a), erf.b.fieldOf("placement").forGetter(eqo::b)).apply($$0, eqo::new)
   );
   public static final Codec<je<eqo>> b = ala.a(mg.bb, a);

   public eqo(je<eqi> $$0, erf $$1) {
      this(List.of(new eqo.a($$0, 1)), $$1);
   }

   public static eqo.a a(je<eqi> $$0, int $$1) {
      return new eqo.a($$0, $$1);
   }

   public static eqo.a a(je<eqi> $$0) {
      return new eqo.a($$0, 1);
   }

   public List<eqo.a> a() {
      return this.c;
   }

   public erf b() {
      return this.d;
   }

   public static record a(je<eqi> b, int c) {
      public static final Codec<eqo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eqi.b.fieldOf("structure").forGetter(eqo.a::a), ays.m.fieldOf("weight").forGetter(eqo.a::b)).apply($$0, eqo.a::new)
      );

      public je<eqi> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
