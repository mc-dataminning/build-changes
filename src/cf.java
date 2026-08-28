import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cf(Optional<ji<ewf>> b, Optional<dq> c) {
   public static final Codec<cf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jt.a(mg.F).optionalFieldOf("fluids").forGetter(cf::a), dq.a.optionalFieldOf("state").forGetter(cf::b)).apply($$0, cf::new)
   );

   public boolean a(arq $$0, iu $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         ewg $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<ji<ewf>> a() {
      return this.b;
   }

   public Optional<dq> b() {
      return this.c;
   }

   public static class a {
      private Optional<ji<ewf>> a = Optional.empty();
      private Optional<dq> b = Optional.empty();

      private a() {
      }

      public static cf.a a() {
         return new cf.a();
      }

      public cf.a a(ewf $$0) {
         this.a = Optional.of(ji.a($$0.k()));
         return this;
      }

      public cf.a a(ji<ewf> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public cf.a a(dq $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public cf b() {
         return new cf(this.a, this.b);
      }
   }
}
