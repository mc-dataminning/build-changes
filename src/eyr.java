import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyr(eyn b, eyn c) implements eyn {
   public static final MapCodec<eyr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eyo.a.fieldOf("min").forGetter(eyr::c), eyo.a.fieldOf("max").forGetter(eyr::d)).apply($$0, eyr::new)
   );

   @Override
   public eym b() {
      return eyo.c;
   }

   public static eyr a(float $$0, float $$1) {
      return new eyr(eyk.a($$0), eyk.a($$1));
   }

   @Override
   public int a(eug $$0) {
      return azn.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eug $$0) {
      return azn.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<ewz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eyn c() {
      return this.b;
   }

   public eyn d() {
      return this.c;
   }
}
