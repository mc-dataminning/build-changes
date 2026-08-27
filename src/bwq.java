import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwq extends bwl {
   private int bU = 47999;

   public bwq(bim<? extends bwq> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gj() {
      return true;
   }

   @Nullable
   @Override
   protected bwl go() {
      return bim.ba.a(this.dK());
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(1, new bqm(this, 2.0));
      this.bP.a(1, new bwq.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cbm $$0) {
      bii $$1 = this.fP();
      if (!($$1 instanceof cbf)) {
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
         this.bU = this.gS() ? ((cbf)this.fP()).gj() - 1 : this.bU - 1;
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
      return this.fP() instanceof cbf;
   }

   private boolean gT() {
      return this.fO() && !this.gS();
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      if ($$2 == bjc.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bid.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends brt {
      private final bwl a;
      private biy b;
      private int c;

      public a(bwl $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bpt.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fO()) {
            return false;
         } else if (!(this.a.fP() instanceof cbf $$1)) {
            return false;
         } else {
            this.b = $$1.ef();
            int $$2 = $$1.eg();
            return $$2 != this.c && this.a(this.b, btk.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bii $$0 = this.a.fP();
         if ($$0 instanceof cbf) {
            this.c = ((cbf)$$0).eg();
         }

         super.c();
      }
   }
}
