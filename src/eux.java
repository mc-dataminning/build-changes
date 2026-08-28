import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eux(evb b, evb c) implements evb {
   public static final MapCodec<eux> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evc.a.fieldOf("n").forGetter(eux::c), evc.a.fieldOf("p").forGetter(eux::d)).apply($$0, eux::new)
   );

   @Override
   public eva b() {
      return evc.d;
   }

   @Override
   public int a(equ $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ayo $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(equ $$0) {
      return (float)this.a($$0);
   }

   public static eux a(int $$0, float $$1) {
      return new eux(euy.a((float)$$0), euy.a($$1));
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
