import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record emt(emw b, emw c) implements emw {
   public static final Codec<emt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emx.a.fieldOf("n").forGetter(emt::c), emx.a.fieldOf("p").forGetter(emt::d)).apply($$0, emt::new)
   );

   @Override
   public emv b() {
      return emx.d;
   }

   @Override
   public int a(ejc $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      awp $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ejc $$0) {
      return (float)this.a($$0);
   }

   public static emt a(int $$0, float $$1) {
      return new emt(emu.a((float)$$0), emu.a($$1));
   }

   @Override
   public Set<elk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public emw c() {
      return this.b;
   }

   public emw d() {
      return this.c;
   }
}
