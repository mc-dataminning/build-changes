import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class diu extends dit implements dff {
   protected diu(dtb.d $$0, iw $$1, exn $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends diu> a();

   protected dtc a(dtc $$0, dtc $$1) {
      return $$1;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      div $$6 = this.c();
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
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh(this.c());
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      Optional<ir> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      Optional<ir> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dtc $$5 = $$0.a_($$4.get());
         ((div)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ir> a(dbg $$0, ir $$1, dfc $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().q()) ? false : $$2;
   }

   @Override
   protected dfc b() {
      return this;
   }
}
