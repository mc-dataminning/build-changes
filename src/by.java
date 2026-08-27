import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record by(Optional<ir<ela>> b, Optional<dc> c) {
   public static final Codec<by> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.a(jc.a(ku.z), "fluids").forGetter(by::a), awu.a(dc.a, "state").forGetter(by::b)).apply($$0, by::new)
   );

   public boolean a(apu $$0, id $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         elb $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<ir<ela>> a() {
      return this.b;
   }

   public Optional<dc> b() {
      return this.c;
   }

   public static class a {
      private Optional<ir<ela>> a = Optional.empty();
      private Optional<dc> b = Optional.empty();

      private a() {
      }

      public static by.a a() {
         return new by.a();
      }

      public by.a a(ela $$0) {
         this.a = Optional.of(ir.a($$0.k()));
         return this;
      }

      public by.a a(ir<ela> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public by.a a(dc $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public by b() {
         return new by(this.a, this.b);
      }
   }
}
