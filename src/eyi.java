import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eyi(Optional<Boolean> b, Optional<Boolean> c) implements exy {
   public static final MapCodec<eyi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(eyi::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(eyi::e))
            .apply($$0, eyi::new)
   );

   @Override
   public exz b() {
      return eya.o;
   }

   public boolean a(eun $$0) {
      arp $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ae() ? false : !this.c.isPresent() || this.c.get() == $$1.ad();
   }

   public static eyi.a c() {
      return new eyi.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements exy.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eyi.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eyi.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eyi a() {
         return new eyi(this.a, this.b);
      }
   }
}
