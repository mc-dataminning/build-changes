import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjl extends cjg {
   private int bY = 47999;

   public cjl(but<? extends cjl> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gv() {
      return true;
   }

   @Nullable
   @Override
   protected cjg gG() {
      return but.bx.a(this.dV(), bus.e);
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
   protected void E() {
      super.E();
      this.bS.a(1, new ccz(this, 2.0));
      this.bT.a(1, new cjl.a(this));
      this.bT.a(2, new cdz<>(this, cms.class, true, ($$0, $$1) -> $$0.aq() != but.bQ));
      this.bT.a(2, new cdz<>(this, clg.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void a(coy $$0) {
      bum $$1 = this.D();
      if (!($$1 instanceof coq)) {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         this.hh();
      }
   }

   private void hh() {
      if (this.hi()) {
         this.bY = this.hj() ? ((coq)this.D()).gB() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.A();
            this.at();
         }
      }
   }

   private boolean hi() {
      return !this.gJ() && !this.hk() && !this.de();
   }

   private boolean hj() {
      return this.D() instanceof coq;
   }

   private boolean hk() {
      return this.P_() && !this.hj();
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      if ($$2 == bus.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bud.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends ceg {
      private final cjg a;
      private bvi b;
      private int c;

      public a(cjg $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(ccg.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.P_()) {
            return false;
         } else if (!(this.a.D() instanceof coq $$1)) {
            return false;
         } else {
            this.b = $$1.ep();
            int $$2 = $$1.eq();
            return $$2 != this.c && this.a(this.b, cfz.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bum $$0 = this.a.D();
         if ($$0 instanceof coq) {
            this.c = ((coq)$$0).eq();
         }

         super.d();
      }
   }
}
