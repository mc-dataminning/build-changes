import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fdh(Optional<Boolean> b, Optional<Boolean> c) implements fcx {
   public static final MapCodec<fdh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fdh::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fdh::e))
            .apply($$0, fdh::new)
   );

   @Override
   public fcy b() {
      return fcz.o;
   }

   public boolean a(ezo $$0) {
      arq $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fdh.a c() {
      return new fdh.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements fcx.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fdh.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fdh.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fdh a() {
         return new fdh(this.a, this.b);
      }
   }
}
