import java.util.EnumSet;
import javax.annotation.Nullable;

public class cji extends cjd {
   private int bY = 47999;

   public cji(buq<? extends cji> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gs() {
      return true;
   }

   @Nullable
   @Override
   protected cjd gD() {
      return buq.bx.a(this.dW(), bup.e);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(1, new ccw(this, 2.0));
      this.bT.a(1, new cji.a(this));
      this.bT.a(2, new cdw<>(this, cmp.class, true, ($$0, $$1) -> $$0.aq() != buq.bQ));
      this.bT.a(2, new cdw<>(this, cld.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void a(cov $$0) {
      buj $$1 = this.A();
      if (!($$1 instanceof com)) {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         this.he();
      }
   }

   private void he() {
      if (this.hf()) {
         this.bY = this.hg() ? ((com)this.A()).gy() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.a(true, false);
            this.at();
         }
      }
   }

   private boolean hf() {
      return !this.gG() && !this.hh() && !this.df();
   }

   private boolean hg() {
      return this.A() instanceof com;
   }

   private boolean hh() {
      return this.P_() && !this.hg();
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      if ($$2 == bup.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bua.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends ced {
      private final cjd a;
      private bvf b;
      private int c;

      public a(cjd $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(ccd.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.P_()) {
            return false;
         } else if (!(this.a.A() instanceof com $$1)) {
            return false;
         } else {
            this.b = $$1.eq();
            int $$2 = $$1.er();
            return $$2 != this.c && this.a(this.b, cfw.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         buj $$0 = this.a.A();
         if ($$0 instanceof com) {
            this.c = ((com)$$0).er();
         }

         super.d();
      }
   }
}
