import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class cyt extends cys implements cvi {
   protected cyt(dhm.d $$0, ib $$1, eks $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends cyt> a();

   protected dhn a(dhn $$0, dhn $$1) {
      return $$1;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cyu $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, ecy.c, ecy.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(this.c());
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      Optional<hx> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      Optional<hx> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dhn $$5 = $$0.a_($$4.get());
         ((cyu)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<hx> a(crl $$0, hx $$1, cvf $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().k()) ? false : $$2;
   }

   @Override
   protected cvf b() {
      return this;
   }
}
