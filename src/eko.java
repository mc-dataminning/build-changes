import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eko(Optional<Boolean> b, Optional<Boolean> c) implements eke {
   public static final Codec<eko> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atx.a(Codec.BOOL, "raining").forGetter(eko::d), atx.a(Codec.BOOL, "thundering").forGetter(eko::e)).apply($$0, eko::new)
   );

   @Override
   public ekf b() {
      return ekg.p;
   }

   public boolean a(ehf $$0) {
      ane $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ab() ? false : !this.c.isPresent() || this.c.get() == $$1.aa();
   }

   public static eko.a c() {
      return new eko.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eke.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eko.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eko.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eko a() {
         return new eko(this.a, this.b);
      }
   }
}
