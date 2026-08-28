import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjk extends cjf {
   private int bY = 47999;

   public cjk(bus<? extends cjk> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gp() {
      return true;
   }

   @Nullable
   @Override
   protected cjf gA() {
      return bus.bu.a(this.dV(), bur.e);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(1, new ccy(this, 2.0));
      this.bT.a(1, new cjk.a(this));
      this.bT.a(2, new cdy<>(this, cmr.class, true, ($$0, $$1) -> $$0.aq() != bus.bN));
      this.bT.a(2, new cdy<>(this, clf.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void a(cou $$0) {
      bul $$1 = this.A();
      if (!($$1 instanceof col)) {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         this.hb();
      }
   }

   private void hb() {
      if (this.hc()) {
         this.bY = this.hd() ? ((col)this.A()).gv() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.a(true, false);
            this.at();
         }
      }
   }

   private boolean hc() {
      return !this.gD() && !this.he() && !this.df();
   }

   private boolean hd() {
      return this.A() instanceof col;
   }

   private boolean he() {
      return this.N_() && !this.hd();
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$2 == bur.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new buc.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cef {
      private final cjf a;
      private bvh b;
      private int c;

      public a(cjf $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.N_()) {
            return false;
         } else if (!(this.a.A() instanceof col $$1)) {
            return false;
         } else {
            this.b = $$1.ep();
            int $$2 = $$1.eq();
            return $$2 != this.c && this.a(this.b, cfy.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bul $$0 = this.a.A();
         if ($$0 instanceof col) {
            this.c = ((col)$$0).eq();
         }

         super.d();
      }
   }
}
