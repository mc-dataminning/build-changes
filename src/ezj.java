import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ezj(Optional<Boolean> b, Optional<Boolean> c) implements eyz {
   public static final MapCodec<ezj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(ezj::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(ezj::e))
            .apply($$0, ezj::new)
   );

   @Override
   public eza b() {
      return ezb.o;
   }

   public boolean a(evq $$0) {
      ard $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ag() ? false : !this.c.isPresent() || this.c.get() == $$1.af();
   }

   public static ezj.a c() {
      return new ezj.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eyz.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public ezj.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezj.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ezj a() {
         return new ezj(this.a, this.b);
      }
   }
}
