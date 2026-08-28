import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dip extends dio implements dfe {
   protected dip(dsd.d $$0, je $$1, ewm $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dip> a();

   protected dse a(dse $$0, dse $$1) {
      return $$1;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      diq $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eny.c, eny.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur(this.c());
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      Optional<iz> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      Optional<iz> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dse $$5 = $$0.a_($$4.get());
         ((diq)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iz> a(dbg $$0, iz $$1, dfb $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dse $$0, cyc $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected dfb b() {
      return this;
   }
}
