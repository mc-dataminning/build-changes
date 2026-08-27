import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cka extends ciz implements cjh {
   public cka(bpc<? extends cka> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public cka(bpc<? extends cka> $$0, cwz $$1, bow $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   cka(bpc<? extends cka> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cwz $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected epm aq() {
      float $$0 = this.ai().n().a() / 2.0F;
      float $$1 = this.ai().n().b();
      float $$2 = 0.15F;
      return new epm(
         this.dk().c - (double)$$0,
         this.dk().d - 0.15F,
         this.dk().e - (double)$$0,
         this.dk().c + (double)$$0,
         this.dk().d - 0.15F + (double)$$1,
         this.dk().e + (double)$$0
      );
   }

   @Override
   public boolean i(bow $$0) {
      return $$0 instanceof cka ? false : super.i($$0);
   }

   @Override
   protected boolean b(bow $$0) {
      return $$0 instanceof cka ? false : super.b($$0);
   }

   @Override
   protected void a(epo $$0) {
      super.a($$0);
      if (!this.dM().B) {
         $$0.a().a(this.dN().c(this, this.af_() instanceof bpo $$1 ? $$1 : null), 1.0F);
         this.y();
      }
   }

   protected abstract void y();

   @Override
   protected void a(epn $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.y();
         this.am();
      }
   }

   @Override
   protected void a(epp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.am();
      }
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   public cqk p() {
      return cqk.h;
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
   protected ka s() {
      return null;
   }

   @Override
   protected cwi.a ag_() {
      return cwi.a.b;
   }

   public static class a extends cws {
      @Override
      public boolean a(cwr $$0, bow $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(cwr $$0, cwf $$1, ib $$2, dmz $$3, ein $$4) {
         return $$3.a(aun.cs) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
