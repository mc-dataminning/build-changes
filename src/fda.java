import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fda(Optional<Boolean> b, Optional<Boolean> c) implements fcq {
   public static final MapCodec<fda> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fda::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fda::e))
            .apply($$0, fda::new)
   );

   @Override
   public fcr b() {
      return fcs.o;
   }

   public boolean a(ezh $$0) {
      arq $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fda.a c() {
      return new fda.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements fcq.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fda.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fda.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fda a() {
         return new fda(this.a, this.b);
      }
   }
}
