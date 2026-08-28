import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fcg(Optional<Boolean> b, Optional<Boolean> c) implements fbw {
   public static final MapCodec<fcg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fcg::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fcg::e))
            .apply($$0, fcg::new)
   );

   @Override
   public fbx b() {
      return fby.o;
   }

   public boolean a(eyn $$0) {
      aro $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fcg.a c() {
      return new fcg.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements fbw.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fcg.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fcg.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fcg a() {
         return new fcg(this.a, this.b);
      }
   }
}
