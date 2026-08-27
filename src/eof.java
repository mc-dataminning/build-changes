import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eof(Optional<Boolean> b, Optional<Boolean> c) implements env {
   public static final Codec<eof> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.a(Codec.BOOL, "raining").forGetter(eof::d), awe.a(Codec.BOOL, "thundering").forGetter(eof::e)).apply($$0, eof::new)
   );

   @Override
   public enw b() {
      return enx.p;
   }

   public boolean a(ekw $$0) {
      apf $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ab() ? false : !this.c.isPresent() || this.c.get() == $$1.aa();
   }

   public static eof.a c() {
      return new eof.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements env.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eof.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eof.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eof a() {
         return new eof(this.a, this.b);
      }
   }
}
