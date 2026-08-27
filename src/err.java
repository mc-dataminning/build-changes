import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record err(Optional<Boolean> b, Optional<Boolean> c) implements erh {
   public static final Codec<err> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.a(Codec.BOOL, "raining").forGetter(err::d), axe.a(Codec.BOOL, "thundering").forGetter(err::e)).apply($$0, err::new)
   );

   @Override
   public eri b() {
      return erj.p;
   }

   public boolean a(eoa $$0) {
      aqe $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ac() ? false : !this.c.isPresent() || this.c.get() == $$1.ab();
   }

   public static err.a c() {
      return new err.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements erh.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public err.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public err.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public err a() {
         return new err(this.a, this.b);
      }
   }
}
