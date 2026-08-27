import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwp extends bwk {
   private int bU = 47999;

   public bwp(bik<? extends bwp> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gi() {
      return true;
   }

   @Nullable
   @Override
   protected bwk gn() {
      return bik.ba.a(this.dK());
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(1, new bql(this, 2.0));
      this.bP.a(1, new bwp.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cbl $$0) {
      big $$1 = this.fP();
      if (!($$1 instanceof cbe)) {
         super.f($$0);
      }
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         this.gP();
      }
   }

   private void gP() {
      if (this.gQ()) {
         this.bU = this.gR() ? ((cbe)this.fP()).gi() - 1 : this.bU - 1;
         if (this.bU <= 0) {
            this.a(true, false);
            this.ak();
         }
      }
   }

   private boolean gQ() {
      return !this.go() && !this.gS() && !this.cU();
   }

   private boolean gR() {
      return this.fP() instanceof cbe;
   }

   private boolean gS() {
      return this.fO() && !this.gR();
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      if ($$2 == bja.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bib.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends brs {
      private final bwk a;
      private biw b;
      private int c;

      public a(bwk $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bps.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fO()) {
            return false;
         } else if (!(this.a.fP() instanceof cbe $$1)) {
            return false;
         } else {
            this.b = $$1.ef();
            int $$2 = $$1.eg();
            return $$2 != this.c && this.a(this.b, btj.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         big $$0 = this.a.fP();
         if ($$0 instanceof cbe) {
            this.c = ((cbe)$$0).eg();
         }

         super.c();
      }
   }
}
