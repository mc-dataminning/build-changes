import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ewo(Optional<Boolean> b, Optional<Boolean> c) implements ewe {
   public static final MapCodec<ewo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(ewo::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(ewo::e))
            .apply($$0, ewo::new)
   );

   @Override
   public ewf b() {
      return ewg.o;
   }

   public boolean a(est $$0) {
      arg $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ae() ? false : !this.c.isPresent() || this.c.get() == $$1.ad();
   }

   public static ewo.a c() {
      return new ewo.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ewe.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public ewo.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ewo.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ewo a() {
         return new ewo(this.a, this.b);
      }
   }
}
