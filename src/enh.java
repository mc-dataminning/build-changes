import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record enh(Optional<Boolean> b, Optional<Boolean> c) implements emx {
   public static final Codec<enh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avu.a(Codec.BOOL, "raining").forGetter(enh::d), avu.a(Codec.BOOL, "thundering").forGetter(enh::e)).apply($$0, enh::new)
   );

   @Override
   public emy b() {
      return emz.p;
   }

   public boolean a(ejy $$0) {
      apa $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ab() ? false : !this.c.isPresent() || this.c.get() == $$1.aa();
   }

   public static enh.a c() {
      return new enh.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements emx.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public enh.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public enh.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public enh a() {
         return new enh(this.a, this.b);
      }
   }
}
