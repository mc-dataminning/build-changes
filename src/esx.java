import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record esx(Optional<Boolean> b, Optional<Boolean> c) implements esn {
   public static final MapCodec<esx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(esx::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(esx::e))
            .apply($$0, esx::new)
   );

   @Override
   public eso b() {
      return esp.q;
   }

   public boolean a(eph $$0) {
      aqn $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ac() ? false : !this.c.isPresent() || this.c.get() == $$1.ab();
   }

   public static esx.a c() {
      return new esx.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements esn.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public esx.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public esx.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public esx a() {
         return new esx(this.a, this.b);
      }
   }
}
