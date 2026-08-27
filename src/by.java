import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record by(Optional<aut<ehq>> b, Optional<il<ehq>> c, Optional<db> d) {
   public static final Codec<by> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avu.a(aut.a(ki.y), "tag").forGetter(by::a), avu.a(kh.c.r(), "fluid").forGetter(by::b), avu.a(db.a, "state").forGetter(by::c))
            .apply($$0, by::new)
   );

   public boolean a(apa $$0, ib $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         ehr $$2 = $$0.b_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else {
            return this.c.isPresent() && !$$2.b(this.c.get().a()) ? false : !this.d.isPresent() || this.d.get().a($$2);
         }
      }
   }

   public Optional<aut<ehq>> a() {
      return this.b;
   }

   public Optional<il<ehq>> b() {
      return this.c;
   }

   public Optional<db> c() {
      return this.d;
   }

   public static class a {
      private Optional<il<ehq>> a = Optional.empty();
      private Optional<aut<ehq>> b = Optional.empty();
      private Optional<db> c = Optional.empty();

      private a() {
      }

      public static by.a a() {
         return new by.a();
      }

      public by.a a(ehq $$0) {
         this.a = Optional.of($$0.k());
         return this;
      }

      public by.a a(aut<ehq> $$0) {
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
