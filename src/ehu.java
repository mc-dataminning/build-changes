import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ehu(Optional<Boolean> b, Optional<Boolean> c) implements ehk {
   public static final Codec<ehu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asq.a(Codec.BOOL, "raining").forGetter(ehu::d), asq.a(Codec.BOOL, "thundering").forGetter(ehu::e)).apply($$0, ehu::new)
   );

   @Override
   public ehl b() {
      return ehm.p;
   }

   public boolean a(eel $$0) {
      ama $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.Z() ? false : !this.c.isPresent() || this.c.get() == $$1.Y();
   }

   public static ehu.a c() {
      return new ehu.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ehk.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public ehu.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ehu.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ehu a() {
         return new ehu(this.a, this.b);
      }
   }
}
