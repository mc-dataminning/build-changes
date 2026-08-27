import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eij(Optional<Long> b, efb c) implements eib {
   public static final Codec<eij> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asy.a(Codec.LONG, "period").forGetter(eij::c), efb.a.fieldOf("value").forGetter(eij::d)).apply($$0, eij::new)
   );

   @Override
   public eic b() {
      return eid.r;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.c.a();
   }

   public boolean a(efc $$0) {
      ami $$1 = $$0.d();
      long $$2 = $$1.X();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eij.a a(efb $$0) {
      return new eij.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public efb d() {
      return this.c;
   }

   public static class a implements eib.a {
      private Optional<Long> a = Optional.empty();
      private final efb b;

      public a(efb $$0) {
         this.b = $$0;
      }

      public eij.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eij a() {
         return new eij(this.a, this.b);
      }
   }
}
