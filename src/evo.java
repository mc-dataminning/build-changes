import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evo(evs b, evs c) implements evs {
   public static final MapCodec<evo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evt.a.fieldOf("n").forGetter(evo::c), evt.a.fieldOf("p").forGetter(evo::d)).apply($$0, evo::new)
   );

   @Override
   public evr b() {
      return evt.d;
   }

   @Override
   public int a(erl $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ayv $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(erl $$0) {
      return (float)this.a($$0);
   }

   public static evo a(int $$0, float $$1) {
      return new evo(evp.a((float)$$0), evp.a($$1));
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
