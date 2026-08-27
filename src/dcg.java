import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dcg extends dcf implements cyv {
   protected dcg(dli.d $$0, ie $$1, eos $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dcg> a();

   protected dlj a(dlj $$0, dlj $$1) {
      return $$1;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dch $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, egx.c, egx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd(this.c());
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      Optional<hz> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      Optional<hz> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dlj $$5 = $$0.a_($$4.get());
         ((dch)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<hz> a(cux $$0, hz $$1, cys $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dlj $$0, crk $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected cys b() {
      return this;
   }
}
