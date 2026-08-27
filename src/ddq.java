import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class ddq extends ddp implements daf {
   protected ddq(dna.d $$0, ih $$1, eqm $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends ddq> a();

   protected dnb a(dnb $$0, dnb $$1) {
      return $$1;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      ddr $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eiq.c, eiq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm(this.c());
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      Optional<ib> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      Optional<ib> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dnb $$5 = $$0.a_($$4.get());
         ((ddr)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ib> a(cwh $$0, ib $$1, dac $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dnb $$0, csu $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().l()) ? false : $$2;
   }

   @Override
   protected dac b() {
      return this;
   }
}
