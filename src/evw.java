import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evw(evs b, evs c) implements evs {
   public static final MapCodec<evw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evt.a.fieldOf("min").forGetter(evw::c), evt.a.fieldOf("max").forGetter(evw::d)).apply($$0, evw::new)
   );

   @Override
   public evr b() {
      return evt.c;
   }

   public static evw a(float $$0, float $$1) {
      return new evw(evp.a($$0), evp.a($$1));
   }

   @Override
   public int a(erl $$0) {
      return ayn.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(erl $$0) {
      return ayn.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eue<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public evs c() {
      return this.b;
   }

   public evs d() {
      return this.c;
   }
}
