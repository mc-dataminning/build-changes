import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cc(Optional<jn<eoi>> b, Optional<dy> c) {
   public static final Codec<cc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.a(lr.D).optionalFieldOf("fluids").forGetter(cc::a), dy.a.optionalFieldOf("state").forGetter(cc::b)).apply($$0, cc::new)
   );

   public boolean a(aqm $$0, ja $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         eoj $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jn<eoi>> a() {
      return this.b;
   }

   public Optional<dy> b() {
      return this.c;
   }

   public static class a {
      private Optional<jn<eoi>> a = Optional.empty();
      private Optional<dy> b = Optional.empty();

      private a() {
      }

      public static cc.a a() {
         return new cc.a();
      }

      public cc.a a(eoi $$0) {
         this.a = Optional.of(jn.a($$0.k()));
         return this;
      }

      public cc.a a(jn<eoi> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public cc.a a(dy $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cc b() {
         return new cc(this.a, this.b);
      }
   }
}
