import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cc(Optional<jm<ens>> b, Optional<dx> c) {
   public static final Codec<cc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jx.a(lq.z).optionalFieldOf("fluids").forGetter(cc::a), dx.a.optionalFieldOf("state").forGetter(cc::b)).apply($$0, cc::new)
   );

   public boolean a(are $$0, iz $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         ent $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jm<ens>> a() {
      return this.b;
   }

   public Optional<dx> b() {
      return this.c;
   }

   public static class a {
      private Optional<jm<ens>> a = Optional.empty();
      private Optional<dx> b = Optional.empty();

      private a() {
      }

      public static cc.a a() {
         return new cc.a();
      }

      public cc.a a(ens $$0) {
         this.a = Optional.of(jm.a($$0.k()));
         return this;
      }

      public cc.a a(jm<ens> $$0) {
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
