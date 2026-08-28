import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cf(Optional<jv<esy>> b, Optional<ef> c) {
   public static final Codec<cf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kg.a(mc.D).optionalFieldOf("fluids").forGetter(cf::a), ef.a.optionalFieldOf("state").forGetter(cf::b)).apply($$0, cf::new)
   );

   public boolean a(arc $$0, ji $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         esz $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jv<esy>> a() {
      return this.b;
   }

   public Optional<ef> b() {
      return this.c;
   }

   public static class a {
      private Optional<jv<esy>> a = Optional.empty();
      private Optional<ef> b = Optional.empty();

      private a() {
      }

      public static cf.a a() {
         return new cf.a();
      }

      public cf.a a(esy $$0) {
         this.a = Optional.of(jv.a($$0.k()));
         return this;
      }

      public cf.a a(jv<esy> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public cf.a a(ef $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cf b() {
         return new cf(this.a, this.b);
      }
   }
}
