import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dnc extends dnb implements djq {
   protected dnc(dwx.d $$0, jn $$1, fbv $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dnc> a();

   protected dwy a(dwy $$0, dwy $$1) {
      return $$1;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dnd $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, etb.c, etb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq(this.c());
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      Optional<ji> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      Optional<ji> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dwy $$5 = $$0.a_($$4.get());
         ((dnd)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ji> a(dfo $$0, ji $$1, djn $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dwy $$0, dah $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected djn b() {
      return this;
   }
}
