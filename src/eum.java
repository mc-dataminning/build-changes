import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eum(eup b, eup c) implements eup {
   public static final MapCodec<eum> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euq.a.fieldOf("n").forGetter(eum::c), euq.a.fieldOf("p").forGetter(eum::d)).apply($$0, eum::new)
   );

   @Override
   public euo b() {
      return euq.d;
   }

   @Override
   public int a(eqk $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azh $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eqk $$0) {
      return (float)this.a($$0);
   }

   public static eum a(int $$0, float $$1) {
      return new eum(eun.a((float)$$0), eun.a($$1));
   }

   @Override
   public Set<etd<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eup c() {
      return this.b;
   }

   public eup d() {
      return this.c;
   }
}
