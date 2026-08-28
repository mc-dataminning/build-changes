import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cd(Optional<jt<erd>> b, Optional<ed> c) {
   public static final Codec<cd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ke.a(ly.D).optionalFieldOf("fluids").forGetter(cd::a), ed.a.optionalFieldOf("state").forGetter(cd::b)).apply($$0, cd::new)
   );

   public boolean a(arm $$0, jg $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         ere $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jt<erd>> a() {
      return this.b;
   }

   public Optional<ed> b() {
      return this.c;
   }

   public static class a {
      private Optional<jt<erd>> a = Optional.empty();
      private Optional<ed> b = Optional.empty();

      private a() {
      }

      public static cd.a a() {
         return new cd.a();
      }

      public cd.a a(erd $$0) {
         this.a = Optional.of(jt.a($$0.k()));
         return this;
      }

      public cd.a a(jt<erd> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public cd.a a(ed $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cd b() {
         return new cd(this.a, this.b);
      }
   }
}
