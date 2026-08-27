import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ejn(Optional<Boolean> b, Optional<Boolean> c) implements ejd {
   public static final Codec<ejn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atg.a(Codec.BOOL, "raining").forGetter(ejn::d), atg.a(Codec.BOOL, "thundering").forGetter(ejn::e)).apply($$0, ejn::new)
   );

   @Override
   public eje b() {
      return ejf.p;
   }

   public boolean a(ege $$0) {
      amp $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.aa() ? false : !this.c.isPresent() || this.c.get() == $$1.Z();
   }

   public static ejn.a c() {
      return new ejn.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ejd.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public ejn.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ejn.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ejn a() {
         return new ejn(this.a, this.b);
      }
   }
}
