import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record evm(Optional<Boolean> b, Optional<Boolean> c) implements evc {
   public static final MapCodec<evm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(evm::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(evm::e))
            .apply($$0, evm::new)
   );

   @Override
   public evd b() {
      return eve.o;
   }

   public boolean a(err $$0) {
      aqu $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static evm.a c() {
      return new evm.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements evc.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public evm.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evm.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public evm a() {
         return new evm(this.a, this.b);
      }
   }
}
