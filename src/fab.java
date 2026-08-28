import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fab(Optional<Boolean> b, Optional<Boolean> c) implements ezr {
   public static final MapCodec<fab> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fab::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fab::e))
            .apply($$0, fab::new)
   );

   @Override
   public ezs b() {
      return ezt.o;
   }

   public boolean a(ewi $$0) {
      arx $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ag() ? false : !this.c.isPresent() || this.c.get() == $$1.af();
   }

   public static fab.a c() {
      return new fab.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ezr.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fab.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fab.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fab a() {
         return new fab(this.a, this.b);
      }
   }
}
