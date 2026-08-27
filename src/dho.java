import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dho extends dhn implements ded {
   protected dho(drc.d $$0, it $$1, evf $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dho> a();

   protected drd a(drd $$0, drd $$1) {
      return $$1;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dhp $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, emx.c, emx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq(this.c());
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      Optional<io> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      Optional<io> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         drd $$5 = $$0.a_($$4.get());
         ((dhp)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<io> a(daf $$0, io $$1, dea $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(drd $$0, cxb $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected dea b() {
      return this;
   }
}
