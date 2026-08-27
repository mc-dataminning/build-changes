import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccw extends ccr {
   private int bW = 47999;

   public ccw(bol<? extends ccw> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gu() {
      return true;
   }

   @Nullable
   @Override
   protected ccr gz() {
      return bol.bc.a(this.dJ());
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bW);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bW = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(1, new bwn(this, 2.0));
      this.bQ.a(1, new ccw.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bW = $$0;
   }

   @Override
   protected void f(cia $$0) {
      bof $$1 = this.ga();
      if (!($$1 instanceof cht)) {
         super.f($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dJ().B) {
         this.hb();
      }
   }

   private void hb() {
      if (this.hc()) {
         this.bW = this.hd() ? ((cht)this.ga()).gu() - 1 : this.bW - 1;
         if (this.bW <= 0) {
            this.a(true, false);
            this.am();
         }
      }
   }

   private boolean hc() {
      return !this.gA() && !this.he() && !this.cS();
   }

   private boolean hd() {
      return this.ga() instanceof cht;
   }

   private boolean he() {
      return this.fZ() && !this.hd();
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      if ($$2 == bpb.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new boa.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends bxu {
      private final ccr a;
      private box b;
      private int c;

      public a(ccr $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fZ()) {
            return false;
         } else if (!(this.a.ga() instanceof cht $$1)) {
            return false;
         } else {
            this.b = $$1.eg();
            int $$2 = $$1.eh();
            return $$2 != this.c && this.a(this.b, bzn.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bof $$0 = this.a.ga();
         if ($$0 instanceof cht) {
            this.c = ((cht)$$0).eh();
         }

         super.c();
      }
   }
}
