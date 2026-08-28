import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dim extends dil implements dfb {
   protected dim(dsa.d $$0, je $$1, ewj $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dim> a();

   protected dsb a(dsb $$0, dsb $$1) {
      return $$1;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      din $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, env.c, env.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo(this.c());
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      Optional<iz> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      Optional<iz> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dsb $$5 = $$0.a_($$4.get());
         ((din)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<iz> a(dbd $$0, iz $$1, dey $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dsb $$0, cxz $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected dey b() {
      return this;
   }
}
