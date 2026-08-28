import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ch(Optional<jk<exz>> b, Optional<ds> c) {
   public static final Codec<ch> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jv.a(mi.F).optionalFieldOf("fluids").forGetter(ch::a), ds.a.optionalFieldOf("state").forGetter(ch::b)).apply($$0, ch::new)
   );

   public boolean a(asb $$0, iw $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         eya $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jk<exz>> a() {
      return this.b;
   }

   public Optional<ds> b() {
      return this.c;
   }

   public static class a {
      private Optional<jk<exz>> a = Optional.empty();
      private Optional<ds> b = Optional.empty();

      private a() {
      }

      public static ch.a a() {
         return new ch.a();
      }

      public ch.a a(exz $$0) {
         this.a = Optional.of(jk.a($$0.k()));
         return this;
      }

      public ch.a a(jk<exz> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ch.a a(ds $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ch b() {
         return new ch(this.a, this.b);
      }
   }
}
