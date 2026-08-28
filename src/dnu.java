import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dnu extends dnt implements dkh {
   protected dnu(dxp.d $$0, jn $$1, fcr $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dnu> a();

   protected dxq a(dxq $$0, dxq $$1) {
      return $$1;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dnv $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh(this.c());
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      Optional<ji> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      Optional<ji> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dxq $$5 = $$0.a_($$4.get());
         ((dnv)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ji> a(dgf $$0, ji $$1, dke $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dxq $$0, dax $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().i()) ? false : $$2;
   }

   @Override
   protected dke b() {
      return this;
   }
}
