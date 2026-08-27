import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dct extends dcs implements czi {
   protected dct(dmd.d $$0, ih $$1, epo $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dct> a();

   protected dme a(dme $$0, dme $$1) {
      return $$1;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dcu $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, ehs.c, ehs.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq(this.c());
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      Optional<ib> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      Optional<ib> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dme $$5 = $$0.a_($$4.get());
         ((dcu)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ib> a(cvk $$0, ib $$1, czf $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dme $$0, crx $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().l()) ? false : $$2;
   }

   @Override
   protected czf b() {
      return this;
   }
}
