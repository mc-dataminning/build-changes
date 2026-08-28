import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record exx(Optional<Boolean> b, Optional<Boolean> c) implements exn {
   public static final MapCodec<exx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(exx::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(exx::e))
            .apply($$0, exx::new)
   );

   @Override
   public exo b() {
      return exp.o;
   }

   public boolean a(euc $$0) {
      arn $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ae() ? false : !this.c.isPresent() || this.c.get() == $$1.ad();
   }

   public static exx.a c() {
      return new exx.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements exn.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public exx.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exx.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public exx a() {
         return new exx(this.a, this.b);
      }
   }
}
