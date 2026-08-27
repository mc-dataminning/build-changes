import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record esa(Optional<Boolean> b, Optional<Boolean> c) implements erq {
   public static final Codec<esa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a(Codec.BOOL, "raining").forGetter(esa::d), axh.a(Codec.BOOL, "thundering").forGetter(esa::e)).apply($$0, esa::new)
   );

   @Override
   public err b() {
      return ers.q;
   }

   public boolean a(eol $$0) {
      aqh $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ac() ? false : !this.c.isPresent() || this.c.get() == $$1.ab();
   }

   public static esa.a c() {
      return new esa.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements erq.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public esa.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public esa.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public esa a() {
         return new esa(this.a, this.b);
      }
   }
}
