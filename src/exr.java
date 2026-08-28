import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record exr(Optional<Boolean> b, Optional<Boolean> c) implements exh {
   public static final MapCodec<exr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(exr::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(exr::e))
            .apply($$0, exr::new)
   );

   @Override
   public exi b() {
      return exj.o;
   }

   public boolean a(etw $$0) {
      arm $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ae() ? false : !this.c.isPresent() || this.c.get() == $$1.ad();
   }

   public static exr.a c() {
      return new exr.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements exh.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public exr.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exr.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public exr a() {
         return new exr(this.a, this.b);
      }
   }
}
