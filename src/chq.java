import java.util.EnumSet;
import javax.annotation.Nullable;

public class chq extends chl {
   private int bZ = 47999;

   public chq(bsz<? extends chq> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gz() {
      return true;
   }

   @Nullable
   @Override
   protected chl gE() {
      return bsz.be.a(this.dP());
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cbf(this, 2.0));
      this.bT.a(1, new chq.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void f(cmw $$0) {
      bst $$1 = this.gf();
      if (!($$1 instanceof cmp)) {
         super.f($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.hf();
      }
   }

   private void hf() {
      if (this.hg()) {
         this.bZ = this.hh() ? ((cmp)this.gf()).gz() - 1 : this.bZ - 1;
         if (this.bZ <= 0) {
            this.a(true, false);
            this.ao();
         }
      }
   }

   private boolean hg() {
      return !this.gF() && !this.hi() && !this.cY();
   }

   private boolean hh() {
      return this.gf() instanceof cmp;
   }

   private boolean hi() {
      return this.gd() && !this.hh();
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      if ($$2 == bts.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bsn.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends ccm {
      private final chl a;
      private bto b;
      private int c;

      public a(chl $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cam.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gd()) {
            return false;
         } else if (!(this.a.gf() instanceof cmp $$1)) {
            return false;
         } else {
            this.b = $$1.em();
            int $$2 = $$1.en();
            return $$2 != this.c && this.a(this.b, cef.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bst $$0 = this.a.gf();
         if ($$0 instanceof cmp) {
            this.c = ((cmp)$$0).en();
         }

         super.c();
      }
   }
}
