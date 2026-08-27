import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eml(Optional<Boolean> b, Optional<Boolean> c) implements emb {
   public static final Codec<eml> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avq.a(Codec.BOOL, "raining").forGetter(eml::d), avq.a(Codec.BOOL, "thundering").forGetter(eml::e)).apply($$0, eml::new)
   );

   @Override
   public emc b() {
      return emd.p;
   }

   public boolean a(ejc $$0) {
      aow $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ab() ? false : !this.c.isPresent() || this.c.get() == $$1.aa();
   }

   public static eml.a c() {
      return new eml.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements emb.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eml.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eml.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eml a() {
         return new eml(this.a, this.b);
      }
   }
}
