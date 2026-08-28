import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record feu(fey b, fey c) implements fey {
   public static final MapCodec<feu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fez.a.fieldOf("n").forGetter(feu::c), fez.a.fieldOf("p").forGetter(feu::d)).apply($$0, feu::new)
   );

   @Override
   public fex b() {
      return fez.d;
   }

   @Override
   public int a(fat $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      bai $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(fat $$0) {
      return (float)this.a($$0);
   }

   public static feu a(int $$0, float $$1) {
      return new feu(fev.a((float)$$0), fev.a($$1));
   }

   @Override
   public Set<bbk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fey c() {
      return this.b;
   }

   public fey d() {
      return this.c;
   }
}
