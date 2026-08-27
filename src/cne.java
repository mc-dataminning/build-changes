import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cne extends cmd implements cml {
   public static final cne.a e = new cne.a();

   public cne(bsa<? extends cne> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cne(bsa<? extends cne> $$0, dax $$1, bru $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
   }

   cne(bsa<? extends cne> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dax $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected euf as() {
      float $$0 = this.ak().n().a() / 2.0F;
      float $$1 = this.ak().n().b();
      float $$2 = 0.15F;
      return new euf(
         this.dn().c - (double)$$0,
         this.dn().d - 0.15F,
         this.dn().e - (double)$$0,
         this.dn().c + (double)$$0,
         this.dn().d - 0.15F + (double)$$1,
         this.dn().e + (double)$$0
      );
   }

   @Override
   public boolean i(bru $$0) {
      return $$0 instanceof cne ? false : super.i($$0);
   }

   @Override
   protected boolean b(bru $$0) {
      if ($$0 instanceof cne) {
         return false;
      } else {
         return $$0.ak() == bsa.E ? false : super.b($$0);
      }
   }

   @Override
   protected void a(euh $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bso $$2 = this.s() instanceof bso $$1 ? $$1 : null;
         if ($$2 != null) {
            $$2.A($$0.a());
         }

         $$0.a().a(this.dQ().c(this, $$2), 1.0F);
         this.y();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
   }

   protected abstract void y();

   @Override
   protected void a(eug $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.y();
         this.ao();
      }
   }

   @Override
   protected void a(eui $$0) {
      super.a($$0);
      if (!this.dP().B && !this.f) {
         this.ao();
      }

      this.f = false;
   }

   @Override
   protected boolean u() {
      return false;
   }

   @Override
   public cto p() {
      return cto.i;
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
   protected kw v() {
      return null;
   }

   @Override
   public void l() {
      if (!this.dP().B && this.dv() > this.dP().al() + 30) {
         this.y();
         this.ao();
      } else {
         super.l();
      }
   }

   public static class a extends daq {
      @Override
      public boolean a(dap $$0, bru $$1) {
         return false;
      }

      @Override
      public Optional<Float> a(dap $$0, dad $$1, io $$2, drb $$3, emu $$4) {
         return $$3.a(avw.cy) ? Optional.of(3600000.0F) : Optional.empty();
      }
   }
}
