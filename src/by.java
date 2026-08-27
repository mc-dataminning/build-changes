import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record by(Optional<avd<eio>> b, Optional<il<eio>> c, Optional<db> d) {
   public static final Codec<by> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.a(avd.a(kj.y), "tag").forGetter(by::a), awe.a(ki.c.r(), "fluid").forGetter(by::b), awe.a(db.a, "state").forGetter(by::c))
            .apply($$0, by::new)
   );

   public boolean a(apf $$0, ib $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         eip $$2 = $$0.b_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else {
            return this.c.isPresent() && !$$2.b(this.c.get().a()) ? false : !this.d.isPresent() || this.d.get().a($$2);
         }
      }
   }

   public Optional<avd<eio>> a() {
      return this.b;
   }

   public Optional<il<eio>> b() {
      return this.c;
   }

   public Optional<db> c() {
      return this.d;
   }

   public static class a {
      private Optional<il<eio>> a = Optional.empty();
      private Optional<avd<eio>> b = Optional.empty();
      private Optional<db> c = Optional.empty();

      private a() {
      }

      public static by.a a() {
         return new by.a();
      }

      public by.a a(eio $$0) {
         this.a = Optional.of($$0.k());
         return this;
      }

      public by.a a(avd<eio> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public by.a a(db $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public by b() {
         return new by(this.b, this.a, this.c);
      }
   }
}
