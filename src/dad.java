import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dad extends dac implements cws {
   protected dad(djf.d $$0, ic $$1, eml $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dad> a();

   protected djg a(djg $$0, djg $$1) {
      return $$1;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      dae $$6 = this.c();
      if ($$1 == this.a && !$$2.a(this) && !$$2.a($$6)) {
         return this.a($$0, $$6.a($$3));
      } else {
         if (this.b) {
            $$3.a($$4, eer.c, eer.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx(this.c());
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      Optional<hx> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().g($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      Optional<hx> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         djg $$5 = $$0.a_($$4.get());
         ((dae)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<hx> a(csu $$0, hx $$1, cwp $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   public boolean a(djg $$0, cpg $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().k()) ? false : $$2;
   }

   @Override
   protected cwp b() {
      return this;
   }
}
