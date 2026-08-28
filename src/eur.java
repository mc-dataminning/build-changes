import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eur(euv b, euv c) implements euv {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euw.a.fieldOf("n").forGetter(eur::c), euw.a.fieldOf("p").forGetter(eur::d)).apply($$0, eur::new)
   );

   @Override
   public euu b() {
      return euw.d;
   }

   @Override
   public int a(eqo $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      aym $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eqo $$0) {
      return (float)this.a($$0);
   }

   public static eur a(int $$0, float $$1) {
      return new eur(eus.a((float)$$0), eus.a($$1));
   }

   @Override
   public Set<eth<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public euv c() {
      return this.b;
   }

   public euv d() {
      return this.c;
   }
}
