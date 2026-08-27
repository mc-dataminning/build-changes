import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efx(ega b, ega c) implements ega {
   public static final Codec<efx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egb.a.fieldOf("n").forGetter(efx::c), egb.a.fieldOf("p").forGetter(efx::d)).apply($$0, efx::new)
   );

   @Override
   public efz b() {
      return egb.d;
   }

   @Override
   public int a(ecg $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      aru $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ecg $$0) {
      return (float)this.a($$0);
   }

   public static efx a(int $$0, float $$1) {
      return new efx(efy.a((float)$$0), efy.a($$1));
   }

   @Override
   public Set<eeo<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ega c() {
      return this.b;
   }

   public ega d() {
      return this.c;
   }
}
