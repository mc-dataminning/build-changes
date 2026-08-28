import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record etx(Optional<Boolean> b, Optional<Boolean> c) implements etn {
   public static final MapCodec<etx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(etx::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(etx::e))
            .apply($$0, etx::new)
   );

   @Override
   public eto b() {
      return etp.q;
   }

   public boolean a(eqd $$0) {
      arb $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static etx.a c() {
      return new etx.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements etn.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public etx.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public etx.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public etx a() {
         return new etx(this.a, this.b);
      }
   }
}
