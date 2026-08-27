import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record evf(Optional<Boolean> b, Optional<Boolean> c) implements euu {
   public static final Codec<evf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.a(Codec.BOOL, "raining").forGetter(evf::d), axu.a(Codec.BOOL, "thundering").forGetter(evf::e)).apply($$0, evf::new)
   );

   @Override
   public euv b() {
      return euw.q;
   }

   public boolean a(erp $$0) {
      aqt $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static evf.a c() {
      return new evf.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements euu.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public evf.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evf.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public evf a() {
         return new evf(this.a, this.b);
      }
   }
}
