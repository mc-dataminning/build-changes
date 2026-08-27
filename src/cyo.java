import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class cyo extends cyn implements cvd {
   protected cyo(dhh.d $$0, hx $$1, ekn $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends cyo> a();

   protected dhi a(dhi $$0, dhi $$1) {
      return $$1;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cyp $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, ect.c, ect.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj(this.c());
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      Optional<ht> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      Optional<ht> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dhi $$5 = $$0.a_($$4.get());
         ((cyp)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ht> a(crg $$0, ht $$1, cva $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().k()) ? false : $$2;
   }

   @Override
   protected cva b() {
      return this;
   }
}
