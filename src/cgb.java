import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgb extends cfw {
   private int bZ = 47999;

   public cgb(brn<? extends cgb> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gy() {
      return true;
   }

   @Nullable
   @Override
   protected cfw gD() {
      return brn.bd.a(this.dN());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new bzq(this, 2.0));
      this.bT.a(1, new cgb.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void f(clh $$0) {
      brh $$1 = this.ge();
      if (!($$1 instanceof cla)) {
         super.f($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dN().B) {
         this.he();
      }
   }

   private void he() {
      if (this.hf()) {
         this.bZ = this.hg() ? ((cla)this.ge()).gy() - 1 : this.bZ - 1;
         if (this.bZ <= 0) {
            this.a(true, false);
            this.am();
         }
      }
   }

   private boolean hf() {
      return !this.gE() && !this.hh() && !this.cW();
   }

   private boolean hg() {
      return this.ge() instanceof cla;
   }

   private boolean hh() {
      return this.gc() && !this.hg();
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      if ($$2 == bse.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new brb.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cax {
      private final cfw a;
      private bsa b;
      private int c;

      public a(cfw $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(byx.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gc()) {
            return false;
         } else if (!(this.a.ge() instanceof cla $$1)) {
            return false;
         } else {
            this.b = $$1.ek();
            int $$2 = $$1.el();
            return $$2 != this.c && this.a(this.b, ccq.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         brh $$0 = this.a.ge();
         if ($$0 instanceof cla) {
            this.c = ((cla)$$0).el();
         }

         super.c();
      }
   }
}
