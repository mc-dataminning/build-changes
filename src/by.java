import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record by(Optional<iz<elq>> b, Optional<dj> c) {
   public static final Codec<by> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.a(jk.a(ld.z), "fluids").forGetter(by::a), axe.a(dj.a, "state").forGetter(by::b)).apply($$0, by::new)
   );

   public boolean a(aqe $$0, im $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         elr $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<iz<elq>> a() {
      return this.b;
   }

   public Optional<dj> b() {
      return this.c;
   }

   public static class a {
      private Optional<iz<elq>> a = Optional.empty();
      private Optional<dj> b = Optional.empty();

      private a() {
      }

      public static by.a a() {
         return new by.a();
      }

      public by.a a(elq $$0) {
         this.a = Optional.of(iz.a($$0.k()));
         return this;
      }

      public by.a a(iz<elq> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public by.a a(dj $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public by b() {
         return new by(this.a, this.b);
      }
   }
}
