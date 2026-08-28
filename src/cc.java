import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cc(Optional<jm<enw>> b, Optional<dx> c) {
   public static final Codec<cc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jx.a(lq.z).optionalFieldOf("fluids").forGetter(cc::a), dx.a.optionalFieldOf("state").forGetter(cc::b)).apply($$0, cc::new)
   );

   public boolean a(arf $$0, iz $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         enx $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jm<enw>> a() {
      return this.b;
   }

   public Optional<dx> b() {
      return this.c;
   }

   public static class a {
      private Optional<jm<enw>> a = Optional.empty();
      private Optional<dx> b = Optional.empty();

      private a() {
      }

      public static cc.a a() {
         return new cc.a();
      }

      public cc.a a(enw $$0) {
         this.a = Optional.of(jm.a($$0.k()));
         return this;
      }

      public cc.a a(jm<enw> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public cc.a a(dx $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cc b() {
         return new cc(this.a, this.b);
      }
   }
}
