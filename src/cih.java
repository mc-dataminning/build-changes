import java.util.EnumSet;
import javax.annotation.Nullable;

public class cih extends cic {
   private int bZ = 47999;

   public cih(btq<? extends cih> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gr() {
      return true;
   }

   @Nullable
   @Override
   protected cic gD() {
      return btq.be.a(this.dS(), btp.e);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(1, new cbv(this, 2.0));
      this.bU.a(1, new cih.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void a(cnp $$0) {
      btj $$1 = this.C();
      if (!($$1 instanceof cni)) {
         super.a($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B) {
         this.hf();
      }
   }

   private void hf() {
      if (this.hg()) {
         this.bZ = this.hh() ? ((cni)this.C()).gx() - 1 : this.bZ - 1;
         if (this.bZ <= 0) {
            this.a(true, false);
            this.as();
         }
      }
   }

   private boolean hg() {
      return !this.gF() && !this.hi() && !this.dc();
   }

   private boolean hh() {
      return this.C() instanceof cni;
   }

   private boolean hi() {
      return this.K_() && !this.hh();
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if ($$2 == btp.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new btc.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cdc {
      private final cic a;
      private buf b;
      private int c;

      public a(cic $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cbc.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.K_()) {
            return false;
         } else if (!(this.a.C() instanceof cni $$1)) {
            return false;
         } else {
            this.b = $$1.em();
            int $$2 = $$1.en();
            return $$2 != this.c && this.a(this.b, cev.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         btj $$0 = this.a.C();
         if ($$0 instanceof cni) {
            this.c = ((cni)$$0).en();
         }

         super.d();
      }
   }
}
