import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evh(evd b, evd c) implements evd {
   public static final MapCodec<evh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eve.a.fieldOf("min").forGetter(evh::c), eve.a.fieldOf("max").forGetter(evh::d)).apply($$0, evh::new)
   );

   @Override
   public evc b() {
      return eve.c;
   }

   public static evh a(float $$0, float $$1) {
      return new evh(eva.a($$0), eva.a($$1));
   }

   @Override
   public int a(eqw $$0) {
      return ayg.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eqw $$0) {
      return ayg.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<etp<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public evd c() {
      return this.b;
   }

   public evd d() {
      return this.c;
   }
}
