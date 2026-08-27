import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egb(ege b, ege c) implements ege {
   public static final Codec<egb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egf.a.fieldOf("n").forGetter(egb::c), egf.a.fieldOf("p").forGetter(egb::d)).apply($$0, egb::new)
   );

   @Override
   public egd b() {
      return egf.d;
   }

   @Override
   public int a(eck $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ash $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eck $$0) {
      return (float)this.a($$0);
   }

   public static egb a(int $$0, float $$1) {
      return new egb(egc.a((float)$$0), egc.a($$1));
   }

   @Override
   public Set<ees<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ege c() {
      return this.b;
   }

   public ege d() {
      return this.c;
   }
}
