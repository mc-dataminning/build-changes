import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eil(Optional<Boolean> b, Optional<Boolean> c) implements eib {
   public static final Codec<eil> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asy.a(Codec.BOOL, "raining").forGetter(eil::d), asy.a(Codec.BOOL, "thundering").forGetter(eil::e)).apply($$0, eil::new)
   );

   @Override
   public eic b() {
      return eid.p;
   }

   public boolean a(efc $$0) {
      ami $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.aa() ? false : !this.c.isPresent() || this.c.get() == $$1.Z();
   }

   public static eil.a c() {
      return new eil.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eib.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eil.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eil.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eil a() {
         return new eil(this.a, this.b);
      }
   }
}
