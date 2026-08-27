import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efy(egb b, egb c) implements egb {
   public static final Codec<efy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egc.a.fieldOf("n").forGetter(efy::c), egc.a.fieldOf("p").forGetter(efy::d)).apply($$0, efy::new)
   );

   @Override
   public ega b() {
      return egc.d;
   }

   @Override
   public int a(ech $$0) {
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
   public float b(ech $$0) {
      return (float)this.a($$0);
   }

   public static efy a(int $$0, float $$1) {
      return new efy(efz.a((float)$$0), efz.a($$1));
   }

   @Override
   public Set<eep<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public egb c() {
      return this.b;
   }

   public egb d() {
      return this.c;
   }
}
