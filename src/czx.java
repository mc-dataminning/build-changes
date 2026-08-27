import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class czx extends czw implements cwm {
   protected czx(diz.d $$0, ic $$1, emf $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends czx> a();

   protected dja a(dja $$0, dja $$1) {
      return $$1;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      czy $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eel.c, eel.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr(this.c());
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      Optional<hx> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      Optional<hx> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dja $$5 = $$0.a_($$4.get());
         ((czy)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<hx> a(cso $$0, hx $$1, cwj $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(dja $$0, cpa $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().k()) ? false : $$2;
   }

   @Override
   protected cwj b() {
      return this;
   }
}
