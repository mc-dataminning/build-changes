import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eft(Optional<Boolean> b, Optional<Boolean> c) implements efj {
   public static final Codec<eft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arj.a(Codec.BOOL, "raining").forGetter(eft::d), arj.a(Codec.BOOL, "thundering").forGetter(eft::e)).apply($$0, eft::new)
   );

   @Override
   public efk b() {
      return efl.p;
   }

   public boolean a(eck $$0) {
      akt $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.Z() ? false : !this.c.isPresent() || this.c.get() == $$1.Y();
   }

   public static eft.a c() {
      return new eft.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements efj.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eft.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eft.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eft a() {
         return new eft(this.a, this.b);
      }
   }
}
