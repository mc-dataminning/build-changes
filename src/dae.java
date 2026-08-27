import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dae extends dad implements cwt {
   protected dae(djg.d $$0, ic $$1, emm $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dae> a();

   protected djh a(djh $$0, djh $$1) {
      return $$1;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      daf $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, ees.c, ees.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy(this.c());
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      Optional<hx> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      Optional<hx> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         djh $$5 = $$0.a_($$4.get());
         ((daf)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<hx> a(csv $$0, hx $$1, cwq $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().k()) ? false : $$2;
   }

   @Override
   protected cwq b() {
      return this;
   }
}
