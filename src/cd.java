import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cd(Optional<jr<eqa>> b, Optional<eb> c) {
   public static final Codec<cd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kc.a(lv.D).optionalFieldOf("fluids").forGetter(cd::a), eb.a.optionalFieldOf("state").forGetter(cd::b)).apply($$0, cd::new)
   );

   public boolean a(arg $$0, je $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         eqb $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jr<eqa>> a() {
      return this.b;
   }

   public Optional<eb> b() {
      return this.c;
   }

   public static class a {
      private Optional<jr<eqa>> a = Optional.empty();
      private Optional<eb> b = Optional.empty();

      private a() {
      }

      public static cd.a a() {
         return new cd.a();
      }

      public cd.a a(eqa $$0) {
         this.a = Optional.of(jr.a($$0.k()));
         return this;
      }

      public cd.a a(jr<eqa> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public cd.a a(eb $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cd b() {
         return new cd(this.a, this.b);
      }
   }
}
