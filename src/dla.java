import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dla extends dkz implements dhp {
   protected dla(dur.d $$0, jk $$1, ezq $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dla> a();

   protected dus a(dus $$0, dus $$1) {
      return $$1;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dlb $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, equ.c, equ.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs(this.c());
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      Optional<jf> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      Optional<jf> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dus $$5 = $$0.a_($$4.get());
         ((dlb)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<jf> a(ddo $$0, jf $$1, dhm $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().q()) ? false : $$2;
   }

   @Override
   protected dhm b() {
      return this;
   }
}
