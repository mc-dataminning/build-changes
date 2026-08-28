import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fec(Optional<Boolean> b, Optional<Boolean> c) implements fds {
   public static final MapCodec<fec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fec::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fec::e))
            .apply($$0, fec::new)
   );

   @Override
   public fdt b() {
      return fdu.o;
   }

   public boolean a(faj $$0) {
      aru $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fec.a c() {
      return new fec.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements fds.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fec.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fec.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fec a() {
         return new fec(this.a, this.b);
      }
   }
}
