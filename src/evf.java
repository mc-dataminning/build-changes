import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evf(evb b, evb c) implements evb {
   public static final MapCodec<evf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evc.a.fieldOf("min").forGetter(evf::c), evc.a.fieldOf("max").forGetter(evf::d)).apply($$0, evf::new)
   );

   @Override
   public eva b() {
      return evc.c;
   }

   public static evf a(float $$0, float $$1) {
      return new evf(euy.a($$0), euy.a($$1));
   }

   @Override
   public int a(equ $$0) {
      return ayg.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(equ $$0) {
      return ayg.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<etn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public evb c() {
      return this.b;
   }

   public evb d() {
      return this.c;
   }
}
