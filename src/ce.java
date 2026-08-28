import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ce(Optional<ju<erj>> b, Optional<ee> c) {
   public static final Codec<ce> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.a(lz.D).optionalFieldOf("fluids").forGetter(ce::a), ee.a.optionalFieldOf("state").forGetter(ce::b)).apply($$0, ce::new)
   );

   public boolean a(arn $$0, jh $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         erk $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<ju<erj>> a() {
      return this.b;
   }

   public Optional<ee> b() {
      return this.c;
   }

   public static class a {
      private Optional<ju<erj>> a = Optional.empty();
      private Optional<ee> b = Optional.empty();

      private a() {
      }

      public static ce.a a() {
         return new ce.a();
      }

      public ce.a a(erj $$0) {
         this.a = Optional.of(ju.a($$0.k()));
         return this;
      }

      public ce.a a(ju<erj> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ce.a a(ee $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ce b() {
         return new ce(this.a, this.b);
      }
   }
}
