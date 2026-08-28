import java.util.EnumSet;
import javax.annotation.Nullable;

public class chr extends chm {
   private int bZ = 47999;

   public chr(bta<? extends chr> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gz() {
      return true;
   }

   @Nullable
   @Override
   protected chm gE() {
      return bta.be.a(this.dP());
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cbg(this, 2.0));
      this.bT.a(1, new chr.a(this));
   }

   @Override
   public void x(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void f(cmx $$0) {
      bsu $$1 = this.gf();
      if (!($$1 instanceof cmq)) {
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
         this.bZ = this.hh() ? ((cmq)this.gf()).gz() - 1 : this.bZ - 1;
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
      return this.gf() instanceof cmq;
   }

   private boolean hi() {
      return this.gd() && !this.hh();
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      if ($$2 == btt.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bso.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends ccn {
      private final chm a;
      private btp b;
      private int c;

      public a(chm $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(can.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.gd()) {
            return false;
         } else if (!(this.a.gf() instanceof cmq $$1)) {
            return false;
         } else {
            this.b = $$1.em();
            int $$2 = $$1.en();
            return $$2 != this.c && this.a(this.b, ceg.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bsu $$0 = this.a.gf();
         if ($$0 instanceof cmq) {
            this.c = ((cmq)$$0).en();
         }

         super.c();
      }
   }
}
