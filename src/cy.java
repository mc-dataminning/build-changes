import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cy extends dh<cy.a> {
   @Override
   public Codec<cy.a> a() {
      return cy.a.a;
   }

   public void a(aqu $$0, brv $$1, bqt $$2, float $$3, float $$4, boolean $$5) {
      erp $$6 = bs.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bd> b, Optional<bg> c, Optional<bd> d) implements dh.a {
      public static final Codec<cy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(cy.a::a), axu.a(bg.a, "damage").forGetter(cy.a::c), axu.a(bs.b, "entity").forGetter(cy.a::d))
               .apply($$0, cy.a::new)
      );

      public static ao<cy.a> b() {
         return an.h.a(new cy.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<cy.a> a(Optional<bg> $$0) {
         return an.h.a(new cy.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static ao<cy.a> a(bg.a $$0) {
         return an.h.a(new cy.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static ao<cy.a> b(Optional<bs> $$0) {
         return an.h.a(new cy.a(Optional.empty(), Optional.empty(), bs.a($$0)));
      }

      public static ao<cy.a> a(Optional<bg> $$0, Optional<bs> $$1) {
         return an.h.a(new cy.a(Optional.empty(), $$0, bs.a($$1)));
      }

      public static ao<cy.a> a(bg.a $$0, Optional<bs> $$1) {
         return an.h.a(new cy.a(Optional.empty(), Optional.of($$0.b()), bs.a($$1)));
      }

      public boolean a(aqu $$0, erp $$1, bqt $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
