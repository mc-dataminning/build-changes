import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cd(Optional<jq<epb>> b, Optional<eb> c) {
   public static final Codec<cd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kb.a(lu.D).optionalFieldOf("fluids").forGetter(cd::a), eb.a.optionalFieldOf("state").forGetter(cd::b)).apply($$0, cd::new)
   );

   public boolean a(aqu $$0, jd $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         epc $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jq<epb>> a() {
      return this.b;
   }

   public Optional<eb> b() {
      return this.c;
   }

   public static class a {
      private Optional<jq<epb>> a = Optional.empty();
      private Optional<eb> b = Optional.empty();

      private a() {
      }

      public static cd.a a() {
         return new cd.a();
      }

      public cd.a a(epb $$0) {
         this.a = Optional.of(jq.a($$0.k()));
         return this;
      }

      public cd.a a(jq<epb> $$0) {
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
