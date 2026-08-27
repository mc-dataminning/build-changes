import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record era(eqx b, eqx c) implements eqx {
   public static final Codec<era> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqy.a.fieldOf("min").forGetter(era::c), eqy.a.fieldOf("max").forGetter(era::d)).apply($$0, era::new)
   );

   @Override
   public eqw b() {
      return eqy.c;
   }

   public static era a(float $$0, float $$1) {
      return new era(eqv.a($$0), eqv.a($$1));
   }

   @Override
   public int a(enb $$0) {
      return axk.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(enb $$0) {
      return axk.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<epl<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eqx c() {
      return this.b;
   }

   public eqx d() {
      return this.c;
   }
}
