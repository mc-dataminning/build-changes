import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cd(Optional<js<eqs>> b, Optional<ec> c) {
   public static final Codec<cd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.a(lw.D).optionalFieldOf("fluids").forGetter(cd::a), ec.a.optionalFieldOf("state").forGetter(cd::b)).apply($$0, cd::new)
   );

   public boolean a(arj $$0, jf $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         eqt $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<js<eqs>> a() {
      return this.b;
   }

   public Optional<ec> b() {
      return this.c;
   }

   public static class a {
      private Optional<js<eqs>> a = Optional.empty();
      private Optional<ec> b = Optional.empty();

      private a() {
      }

      public static cd.a a() {
         return new cd.a();
      }

      public cd.a a(eqs $$0) {
         this.a = Optional.of(js.a($$0.k()));
         return this;
      }

      public cd.a a(js<eqs> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public cd.a a(ec $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cd b() {
         return new cd(this.a, this.b);
      }
   }
}
