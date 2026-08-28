import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eyb(Optional<Boolean> b, Optional<Boolean> c) implements exr {
   public static final MapCodec<eyb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(eyb::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(eyb::e))
            .apply($$0, eyb::new)
   );

   @Override
   public exs b() {
      return ext.o;
   }

   public boolean a(eug $$0) {
      arq $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ae() ? false : !this.c.isPresent() || this.c.get() == $$1.ad();
   }

   public static eyb.a c() {
      return new eyb.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements exr.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eyb.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eyb.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eyb a() {
         return new eyb(this.a, this.b);
      }
   }
}
