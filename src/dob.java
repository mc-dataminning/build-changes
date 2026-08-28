import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dob extends doa implements dkp {
   protected dob(dxu.d $$0, jm $$1, fcs $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dob> a();

   protected dxv a(dxv $$0, dxv $$1) {
      return $$1;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      doc $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, ety.c, ety.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp(this.c());
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      Optional<jh> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      Optional<jh> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         dxv $$5 = $$0.a_($$4.get());
         ((doc)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<jh> a(dgn $$0, jh $$1, dkm $$2) {
      return l.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(dxv $$0, dbg $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().j()) ? false : $$2;
   }

   @Override
   protected dkm b() {
      return this;
   }
}
