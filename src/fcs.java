import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fcs(Optional<Boolean> b, Optional<Boolean> c) implements fci {
   public static final MapCodec<fcs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fcs::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fcs::e))
            .apply($$0, fcs::new)
   );

   @Override
   public fcj b() {
      return fck.o;
   }

   public boolean a(eyz $$0) {
      arq $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fcs.a c() {
      return new fcs.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements fci.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fcs.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fcs.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fcs a() {
         return new fcs(this.a, this.b);
      }
   }
}
