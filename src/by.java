import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record by(Optional<ip<ekr>> b, Optional<db> c) {
   public static final Codec<by> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.a(ja.a(ks.y), "fluids").forGetter(by::a), aws.a(db.a, "state").forGetter(by::b)).apply($$0, by::new)
   );

   public boolean a(aps $$0, ib $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         eks $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<ip<ekr>> a() {
      return this.b;
   }

   public Optional<db> b() {
      return this.c;
   }

   public static class a {
      private Optional<ip<ekr>> a = Optional.empty();
      private Optional<db> b = Optional.empty();

      private a() {
      }

      public static by.a a() {
         return new by.a();
      }

      public by.a a(ekr $$0) {
         this.a = Optional.of(ip.a($$0.k()));
         return this;
      }

      public by.a a(ip<ekr> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public by.a a(db $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public by b() {
         return new by(this.a, this.b);
      }
   }
}
