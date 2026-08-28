import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record exg(Optional<Boolean> b, Optional<Boolean> c) implements eww {
   public static final MapCodec<exg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(exg::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(exg::e))
            .apply($$0, exg::new)
   );

   @Override
   public ewx b() {
      return ewy.o;
   }

   public boolean a(etl $$0) {
      arj $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ae() ? false : !this.c.isPresent() || this.c.get() == $$1.ad();
   }

   public static exg.a c() {
      return new exg.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eww.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public exg.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exg.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public exg a() {
         return new exg(this.a, this.b);
      }
   }
}
