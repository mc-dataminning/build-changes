import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class cwp extends cwo implements ctf {
   protected cwp(dfc.d $$0, ha $$1, eia $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends cwp> a();

   protected dfd a(dfd $$0, dfd $$1) {
      return $$1;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      cwq $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eah.c, eah.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(this.c());
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      Optional<gw> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      Optional<gw> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dfd $$5 = $$0.a_($$4.get());
         ((cwq)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<gw> a(cph $$0, gw $$1, ctc $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().k()) ? false : $$2;
   }

   @Override
   protected ctc b() {
      return this;
   }
}
