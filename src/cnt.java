import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cnt extends cms implements cna {
   public static final dbz e = new dcx(true, false, Optional.empty(), lq.e.b(avw.cy).map(Function.identity()));

   public cnt(bsn<? extends cnt> $$0, dcg $$1) {
      super($$0, $$1);
      this.d = 0.0;
   }

   public cnt(bsn<? extends cnt> $$0, dcg $$1, bsh $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.d = 0.0;
   }

   cnt(bsn<? extends cnt> $$0, double $$1, double $$2, double $$3, ewh $$4, dcg $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.d = 0.0;
   }

   @Override
   protected ewc au() {
      float $$0 = this.am().n().a() / 2.0F;
      float $$1 = this.am().n().b();
      float $$2 = 0.15F;
      return new ewc(
         this.dp().c - (double)$$0,
         this.dp().d - 0.15F,
         this.dp().e - (double)$$0,
         this.dp().c + (double)$$0,
         this.dp().d - 0.15F + (double)$$1,
         this.dp().e + (double)$$0
      );
   }

   @Override
   public boolean i(bsh $$0) {
      return $$0 instanceof cnt ? false : super.i($$0);
   }

   @Override
   protected boolean b(bsh $$0) {
      if ($$0 instanceof cnt) {
         return false;
      } else {
         return $$0.am() == bsn.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      if (!this.dR().B) {
         btc $$2 = this.s() instanceof btc $$1 ? $$1 : null;
         bsh $$3 = $$0.a().i($$0.e()).orElse($$0.a());
         if ($$2 != null) {
            $$2.A($$3);
         }

         $$3.a(this.dS().c(this, $$2), 1.0F);
         this.y();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void y();

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (!this.dR().B) {
         this.y();
         this.aq();
      }
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);
      if (!this.dR().B) {
         this.aq();
      }
   }

   @Override
   protected boolean t() {
      return false;
   }

   @Override
   public cud p() {
      return cud.l;
   }

   @Override
   protected float w() {
      return 1.0F;
   }

   @Override
   protected float x() {
      return this.w();
   }

   @Nullable
   @Override
   protected lh v() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dR().B && this.dx() > this.dR().am() + 30) {
         this.y();
         this.aq();
      } else {
         super.l();
      }
   }
}
