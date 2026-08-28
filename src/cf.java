import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cf(Optional<jw<eus>> b, Optional<ef> c) {
   public static final Codec<cf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kh.a(me.D).optionalFieldOf("fluids").forGetter(cf::a), ef.a.optionalFieldOf("state").forGetter(cf::b)).apply($$0, cf::new)
   );

   public boolean a(arn $$0, jj $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         eut $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jw<eus>> a() {
      return this.b;
   }

   public Optional<ef> b() {
      return this.c;
   }

   public static class a {
      private Optional<jw<eus>> a = Optional.empty();
      private Optional<ef> b = Optional.empty();

      private a() {
      }

      public static cf.a a() {
         return new cf.a();
      }

      public cf.a a(eus $$0) {
         this.a = Optional.of(jw.a($$0.k()));
         return this;
      }

      public cf.a a(jw<eus> $$0) {
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
