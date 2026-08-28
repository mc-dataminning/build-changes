import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class djm extends djl implements dgb {
   protected djm(dtb.d $$0, ji $$1, exv $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends djm> a();

   protected dtc a(dtc $$0, dtc $$1) {
      return $$1;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      djn $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq(this.c());
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      Optional<jd> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      Optional<jd> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dtc $$5 = $$0.a_($$4.get());
         ((djn)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<jd> a(dcc $$0, jd $$1, dfy $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().r()) ? false : $$2;
   }

   @Override
   protected dfy b() {
      return this;
   }
}
