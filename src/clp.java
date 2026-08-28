import java.util.EnumSet;
import javax.annotation.Nullable;

public class clp extends clk {
   private int bG = 47999;

   public clp(bwo<? extends clp> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gu() {
      return true;
   }

   @Nullable
   @Override
   protected clk gF() {
      return bwo.by.a(this.dV(), bwn.e);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bG);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bG = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(1, new cet(this, 2.0));
      this.bE.a(1, new clp.a(this));
      this.bE.a(2, new cft<>(this, cox.class, true, ($$0, $$1) -> $$0.aq() != bwo.bR));
      this.bE.a(2, new cft<>(this, cnk.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bG = $$0;
   }

   @Override
   protected void a(crc $$0) {
      bwf $$1 = this.C();
      if (!($$1 instanceof cqu)) {
         super.a($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.he();
      }
   }

   private void he() {
      if (this.hf()) {
         this.bG = this.hg() ? ((cqu)this.C()).gz() - 1 : this.bG - 1;
         if (this.bG <= 0) {
            this.z();
            this.at();
         }
      }
   }

   private boolean hf() {
      return !this.gI() && !this.hh() && !this.de();
   }

   private boolean hg() {
      return this.C() instanceof cqu;
   }

   private boolean hh() {
      return this.O_() && !this.hg();
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      if ($$2 == bwn.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bvv.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cga {
      private final clk a;
      private bxe b;
      private int c;

      public a(clk $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cea.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.O_()) {
            return false;
         } else if (!(this.a.C() instanceof cqu $$1)) {
            return false;
         } else {
            this.b = $$1.er();
            int $$2 = $$1.et();
            return $$2 != this.c && this.a(this.b, cht.a);
         }
      }

      @Override
      public void d() {
         this.e.g(this.b);
         bwf $$0 = this.a.C();
         if ($$0 instanceof cqu) {
            this.c = ((cqu)$$0).et();
         }

         super.d();
      }
   }
}
