import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dii extends dih implements dex {
   protected dii(drw.d $$0, je $$1, ewf $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dii> a();

   protected drx a(drx $$0, drx $$1) {
      return $$1;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dij $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, enr.c, enr.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk(this.c());
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      Optional<iz> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      Optional<iz> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         drx $$5 = $$0.a_($$4.get());
         ((dij)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iz> a(daz $$0, iz $$1, deu $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(drx $$0, cxv $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected deu b() {
      return this;
   }
}
