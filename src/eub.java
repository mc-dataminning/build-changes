import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eub(Optional<Boolean> b, Optional<Boolean> c) implements etr {
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(eub::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(eub::e))
            .apply($$0, eub::new)
   );

   @Override
   public ets b() {
      return ett.q;
   }

   public boolean a(eqh $$0) {
      are $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static eub.a c() {
      return new eub.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements etr.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eub.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eub.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eub a() {
         return new eub(this.a, this.b);
      }
   }
}
