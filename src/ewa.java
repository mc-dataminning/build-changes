import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewa(evw b, evw c) implements evw {
   public static final MapCodec<ewa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evx.a.fieldOf("min").forGetter(ewa::c), evx.a.fieldOf("max").forGetter(ewa::d)).apply($$0, ewa::new)
   );

   @Override
   public evv b() {
      return evx.c;
   }

   public static ewa a(float $$0, float $$1) {
      return new ewa(evt.a($$0), evt.a($$1));
   }

   @Override
   public int a(erp $$0) {
      return ayo.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(erp $$0) {
      return ayo.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eui<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public evw c() {
      return this.b;
   }

   public evw d() {
      return this.c;
   }
}
