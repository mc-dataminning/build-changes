import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgq extends cgl {
   private int bZ = 47999;

   public cgq(bsa<? extends cgq> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gy() {
      return true;
   }

   @Nullable
   @Override
   protected cgl gD() {
      return bsa.be.a(this.dP());
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new caf(this, 2.0));
      this.bT.a(1, new cgq.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void f(clw $$0) {
      bru $$1 = this.ge();
      if (!($$1 instanceof clp)) {
         super.f($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.he();
      }
   }

   private void he() {
      if (this.hf()) {
         this.bZ = this.hg() ? ((clp)this.ge()).gy() - 1 : this.bZ - 1;
         if (this.bZ <= 0) {
            this.a(true, false);
            this.ao();
         }
      }
   }

   private boolean hf() {
      return !this.gE() && !this.hh() && !this.cY();
   }

   private boolean hg() {
      return this.ge() instanceof clp;
   }

   private boolean hh() {
      return this.gc() && !this.hg();
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      if ($$2 == bss.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bro.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cbm {
      private final cgl a;
      private bso b;
      private int c;

      public a(cgl $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bzm.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gc()) {
            return false;
         } else if (!(this.a.ge() instanceof clp $$1)) {
            return false;
         } else {
            this.b = $$1.em();
            int $$2 = $$1.en();
            return $$2 != this.c && this.a(this.b, cdf.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bru $$0 = this.a.ge();
         if ($$0 instanceof clp) {
            this.c = ((clp)$$0).en();
         }

         super.c();
      }
   }
}
