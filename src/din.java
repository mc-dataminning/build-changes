import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class din extends dim implements dfc {
   protected din(dsb.d $$0, je $$1, ewk $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends din> a();

   protected dsc a(dsc $$0, dsc $$1) {
      return $$1;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dio $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, enw.c, enw.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(this.c());
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      Optional<iz> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      Optional<iz> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dsc $$5 = $$0.a_($$4.get());
         ((dio)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iz> a(dbe $$0, iz $$1, dez $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dsc $$0, cya $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected dez b() {
      return this;
   }
}
