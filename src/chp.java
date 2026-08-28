import java.util.EnumSet;
import javax.annotation.Nullable;

public class chp extends chk {
   private int bZ = 47999;

   public chp(bsy<? extends chp> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gz() {
      return true;
   }

   @Nullable
   @Override
   protected chk gE() {
      return bsy.be.a(this.dP());
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
      this.bS.a(1, new cbe(this, 2.0));
      this.bT.a(1, new chp.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void f(cmv $$0) {
      bss $$1 = this.gf();
      if (!($$1 instanceof cmo)) {
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
         this.bZ = this.hh() ? ((cmo)this.gf()).gz() - 1 : this.bZ - 1;
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
      return this.gf() instanceof cmo;
   }

   private boolean hi() {
      return this.gd() && !this.hh();
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      if ($$2 == btr.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bsm.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends ccl {
      private final chk a;
      private btn b;
      private int c;

      public a(chk $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cal.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gd()) {
            return false;
         } else if (!(this.a.gf() instanceof cmo $$1)) {
            return false;
         } else {
            this.b = $$1.em();
            int $$2 = $$1.en();
            return $$2 != this.c && this.a(this.b, cee.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bss $$0 = this.a.gf();
         if ($$0 instanceof cmo) {
            this.c = ((cmo)$$0).en();
         }

         super.c();
      }
   }
}
