import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cy(Optional<bd<ary<xd>, cy.a>> c, Optional<String> d, Optional<String> e, dh.d f, Optional<Boolean> g) implements dw<czb> {
   public static final Codec<cy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bd.a(cy.a.a).optionalFieldOf("pages").forGetter(cy::b),
               Codec.STRING.optionalFieldOf("author").forGetter(cy::c),
               Codec.STRING.optionalFieldOf("title").forGetter(cy::d),
               dh.d.d.optionalFieldOf("generation", dh.d.c).forGetter(cy::e),
               Codec.BOOL.optionalFieldOf("resolved").forGetter(cy::f)
            )
            .apply($$0, cy::new)
   );

   @Override
   public kq<czb> a() {
      return kr.O;
   }

   public boolean a(cvp $$0, czb $$1) {
      if (this.d.isPresent() && !this.d.get().equals($$1.e())) {
         return false;
      } else if (this.e.isPresent() && !this.e.get().equals($$1.d().a())) {
         return false;
      } else if (!this.f.d($$1.f())) {
         return false;
      } else {
         return this.g.isPresent() && this.g.get() != $$1.g() ? false : !this.c.isPresent() || this.c.get().a($$1.a());
      }
   }

   public Optional<bd<ary<xd>, cy.a>> b() {
      return this.c;
   }

   public Optional<String> c() {
      return this.d;
   }

   public Optional<String> d() {
      return this.e;
   }

   public dh.d e() {
      return this.f;
   }

   public Optional<Boolean> f() {
      return this.g;
   }

   public static record a(xd b) implements Predicate<ary<xd>> {
      public static final Codec<cy.a> a = xf.a.xmap(cy.a::new, cy.a::a);

      public boolean a(ary<xd> $$0) {
         return $$0.a().equals(this.b);
      }

      public xd a() {
         return this.b;
      }
   }
}
