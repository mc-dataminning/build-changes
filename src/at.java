import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record at(Optional<aqa<csm>> b, Optional<hi<csm>> c, Optional<cy> d, Optional<cl> e) {
   private static final Codec<hi<csm>> f = jb.f.r().listOf().xmap(hi::a, $$0 -> $$0.a().toList());
   public static final Codec<at> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.a(aqa.a(jc.e), "tag").forGetter(at::a),
               aqy.a(f, "blocks").forGetter(at::b),
               aqy.a(cy.a, "state").forGetter(at::c),
               aqy.a(cl.a, "nbt").forGetter(at::d)
            )
            .apply($$0, at::new)
   );

   static Optional<at> a(Optional<aqa<csm>> $$0, Optional<hi<csm>> $$1, Optional<cy> $$2, Optional<cl> $$3) {
      return $$0.isEmpty() && $$1.isEmpty() && $$2.isEmpty() && $$3.isEmpty() ? Optional.empty() : Optional.of(new at($$0, $$1, $$2, $$3));
   }

   public boolean a(akk $$0, gu $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         dfa $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dcm $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.m())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<aqa<csm>> a() {
      return this.b;
   }

   public Optional<hi<csm>> b() {
      return this.c;
   }

   public Optional<cy> c() {
      return this.d;
   }

   public Optional<cl> d() {
      return this.e;
   }

   public static class a {
      private Optional<hi<csm>> a = Optional.empty();
      private Optional<aqa<csm>> b = Optional.empty();
      private Optional<cy> c = Optional.empty();
      private Optional<cl> d = Optional.empty();

      private a() {
      }

      public static at.a a() {
         return new at.a();
      }

      public at.a a(csm... $$0) {
         this.a = Optional.of(hi.a(csm::q, $$0));
         return this;
      }

      public at.a a(Collection<csm> $$0) {
         this.a = Optional.of(hi.a(csm::q, $$0));
         return this;
      }

      public at.a a(aqa<csm> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public at.a a(qr $$0) {
         this.d = Optional.of(new cl($$0));
         return this;
      }

      public at.a a(cy.a $$0) {
         this.c = $$0.b();
         return this;
      }

      public Optional<at> b() {
         return at.a(this.b, this.a, this.c, this.d);
      }
   }
}
