import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dok extends doj implements dkx {
   protected dok(dyl.d $$0, jo $$1, fdo $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dok> a();

   protected dym a(dym $$0, dym $$1) {
      return $$1;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dol $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, euu.c, euu.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy(this.c());
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      Optional<jj> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      Optional<jj> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dym $$5 = $$0.a_($$4.get());
         ((dol)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<jj> a(dgv $$0, jj $$1, dku $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dym $$0, dbn $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().i()) ? false : $$2;
   }

   @Override
   protected dku b() {
      return this;
   }
}
