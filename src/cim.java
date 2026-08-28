import java.util.EnumSet;
import javax.annotation.Nullable;

public class cim extends cih {
   private int bY = 47999;

   public cim(btv<? extends cim> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gs() {
      return true;
   }

   @Nullable
   @Override
   protected cih gE() {
      return btv.be.a(this.dS(), btu.e);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new cca(this, 2.0));
      this.bT.a(1, new cim.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void a(cnu $$0) {
      bto $$1 = this.C();
      if (!($$1 instanceof cnn)) {
         super.a($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B) {
         this.hg();
      }
   }

   private void hg() {
      if (this.hh()) {
         this.bY = this.hi() ? ((cnn)this.C()).gy() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.a(true, false);
            this.as();
         }
      }
   }

   private boolean hh() {
      return !this.gG() && !this.hj() && !this.dc();
   }

   private boolean hi() {
      return this.C() instanceof cnn;
   }

   private boolean hj() {
      return this.K_() && !this.hi();
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if ($$2 == btu.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bth.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cdh {
      private final cih a;
      private buk b;
      private int c;

      public a(cih $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.K_()) {
            return false;
         } else if (!(this.a.C() instanceof cnn $$1)) {
            return false;
         } else {
            this.b = $$1.em();
            int $$2 = $$1.en();
            return $$2 != this.c && this.a(this.b, cfa.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bto $$0 = this.a.C();
         if ($$0 instanceof cnn) {
            this.c = ((cnn)$$0).en();
         }

         super.d();
      }
   }
}
