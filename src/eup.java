import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eup(Optional<Boolean> b, Optional<Boolean> c) implements euf {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(eup::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(eup::e))
            .apply($$0, eup::new)
   );

   @Override
   public eug b() {
      return euh.o;
   }

   public boolean a(equ $$0) {
      aqm $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static eup.a c() {
      return new eup.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements euf.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eup.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eup.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eup a() {
         return new eup(this.a, this.b);
      }
   }
}
