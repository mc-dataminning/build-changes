import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bv(Optional<aqa<eac>> b, Optional<he<eac>> c, Optional<cy> d) {
   public static final Codec<bv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(aqa.a(jc.w), "tag").forGetter(bv::a), aqy.a(jb.d.r(), "fluid").forGetter(bv::b), aqy.a(cy.a, "state").forGetter(bv::c))
            .apply($$0, bv::new)
   );

   static Optional<bv> a(Optional<aqa<eac>> $$0, Optional<he<eac>> $$1, Optional<cy> $$2) {
      return $$0.isEmpty() && $$1.isEmpty() && $$2.isEmpty() ? Optional.empty() : Optional.of(new bv($$0, $$1, $$2));
   }

   public boolean a(akk $$0, gu $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         ead $$2 = $$0.b_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else {
            return this.c.isPresent() && !$$2.b(this.c.get().a()) ? false : !this.d.isPresent() || this.d.get().a($$2);
         }
      }
   }

   public Optional<aqa<eac>> a() {
      return this.b;
   }

   public Optional<he<eac>> b() {
      return this.c;
   }

   public Optional<cy> c() {
      return this.d;
   }

   public static class a {
      private Optional<he<eac>> a = Optional.empty();
      private Optional<aqa<eac>> b = Optional.empty();
      private Optional<cy> c = Optional.empty();

      private a() {
      }

      public static bv.a a() {
         return new bv.a();
      }

      public bv.a a(eac $$0) {
         this.a = Optional.of($$0.k());
         return this;
      }

      public bv.a a(aqa<eac> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bv.a a(cy $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public Optional<bv> b() {
         return bv.a(this.b, this.a, this.c);
      }
   }
}
