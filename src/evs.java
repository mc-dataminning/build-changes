import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evs(evw b, evw c) implements evw {
   public static final MapCodec<evs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evx.a.fieldOf("n").forGetter(evs::c), evx.a.fieldOf("p").forGetter(evs::d)).apply($$0, evs::new)
   );

   @Override
   public evv b() {
      return evx.d;
   }

   @Override
   public int a(erp $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ayw $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(erp $$0) {
      return (float)this.a($$0);
   }

   public static evs a(int $$0, float $$1) {
      return new evs(evt.a((float)$$0), evt.a($$1));
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
