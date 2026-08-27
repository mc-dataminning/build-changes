import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dcc extends dcb implements cyr {
   protected dcc(dle.d $$0, ie $$1, eol $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dcc> a();

   protected dlf a(dlf $$0, dlf $$1) {
      return $$1;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dcd $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, egq.c, egq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz(this.c());
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      Optional<hz> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      Optional<hz> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dlf $$5 = $$0.a_($$4.get());
         ((dcd)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<hz> a(cut $$0, hz $$1, cyo $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected cyo b() {
      return this;
   }
}
