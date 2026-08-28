import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cg(Optional<jj<ewz>> b, Optional<dr> c) {
   public static final Codec<cg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ju.a(mh.F).optionalFieldOf("fluids").forGetter(cg::a), dr.a.optionalFieldOf("state").forGetter(cg::b)).apply($$0, cg::new)
   );

   public boolean a(arq $$0, iv $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         exa $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jj<ewz>> a() {
      return this.b;
   }

   public Optional<dr> b() {
      return this.c;
   }

   public static class a {
      private Optional<jj<ewz>> a = Optional.empty();
      private Optional<dr> b = Optional.empty();

      private a() {
      }

      public static cg.a a() {
         return new cg.a();
      }

      public cg.a a(ewz $$0) {
         this.a = Optional.of(jj.a($$0.k()));
         return this;
      }

      public cg.a a(jj<ewz> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public cg.a a(dr $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cg b() {
         return new cg(this.a, this.b);
      }
   }
}
