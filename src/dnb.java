import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dnb extends dna implements djp {
   protected dnb(dww.d $$0, jn $$1, fbu $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dnb> a();

   protected dwx a(dwx $$0, dwx $$1) {
      return $$1;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dnc $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, eta.c, eta.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(this.c());
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      Optional<ji> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      Optional<ji> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dwx $$5 = $$0.a_($$4.get());
         ((dnc)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<ji> a(dfn $$0, ji $$1, djm $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dwx $$0, dag $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected djm b() {
      return this;
   }
}
