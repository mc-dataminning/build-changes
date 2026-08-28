import java.util.EnumSet;
import javax.annotation.Nullable;

public class cip extends cik {
   private int bY = 47999;

   public cip(bty<? extends cip> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gr() {
      return true;
   }

   @Nullable
   @Override
   protected cik gD() {
      return bty.be.a(this.dS(), btx.e);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new ccd(this, 2.0));
      this.bT.a(1, new cip.a(this));
      this.bT.a(2, new cdd<>(this, clw.class, true, $$0 -> $$0.ao() != bty.bx));
      this.bT.a(2, new cdd<>(this, ckk.class, true));
   }

   @Override
   public void x(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void a(cnx $$0) {
      btr $$1 = this.C();
      if (!($$1 instanceof cnq)) {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dS().B) {
         this.hf();
      }
   }

   private void hf() {
      if (this.hg()) {
         this.bY = this.hh() ? ((cnq)this.C()).gx() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.a(true, false);
            this.as();
         }
      }
   }

   private boolean hg() {
      return !this.gF() && !this.hi() && !this.dc();
   }

   private boolean hh() {
      return this.C() instanceof cnq;
   }

   private boolean hi() {
      return this.L_() && !this.hh();
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if ($$2 == btx.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new btk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cdk {
      private final cik a;
      private bun b;
      private int c;

      public a(cik $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cbk.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.L_()) {
            return false;
         } else if (!(this.a.C() instanceof cnq $$1)) {
            return false;
         } else {
            this.b = $$1.en();
            int $$2 = $$1.eo();
            return $$2 != this.c && this.a(this.b, cfd.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         btr $$0 = this.a.C();
         if ($$0 instanceof cnq) {
            this.c = ((cnq)$$0).eo();
         }

         super.d();
      }
   }
}
