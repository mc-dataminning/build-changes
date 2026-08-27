import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwt extends bwo {
   private int bU = 47999;

   public bwt(bip<? extends bwt> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gj() {
      return true;
   }

   @Nullable
   @Override
   protected bwo go() {
      return bip.ba.a(this.dK());
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(1, new bqp(this, 2.0));
      this.bP.a(1, new bwt.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cbp $$0) {
      bil $$1 = this.fP();
      if (!($$1 instanceof cbi)) {
         super.f($$0);
      }
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         this.gQ();
      }
   }

   private void gQ() {
      if (this.gR()) {
         this.bU = this.gS() ? ((cbi)this.fP()).gj() - 1 : this.bU - 1;
         if (this.bU <= 0) {
            this.a(true, false);
            this.ak();
         }
      }
   }

   private boolean gR() {
      return !this.gp() && !this.gT() && !this.cU();
   }

   private boolean gS() {
      return this.fP() instanceof cbi;
   }

   private boolean gT() {
      return this.fO() && !this.gS();
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      if ($$2 == bjf.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new big.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends brw {
      private final bwo a;
      private bjb b;
      private int c;

      public a(bwo $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bpw.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fO()) {
            return false;
         } else if (!(this.a.fP() instanceof cbi $$1)) {
            return false;
         } else {
            this.b = $$1.ef();
            int $$2 = $$1.eg();
            return $$2 != this.c && this.a(this.b, btn.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bil $$0 = this.a.fP();
         if ($$0 instanceof cbi) {
            this.c = ((cbi)$$0).eg();
         }

         super.c();
      }
   }
}
