import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjh extends cjc {
   private int bY = 47999;

   public cjh(bup<? extends cjh> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gy() {
      return true;
   }

   @Nullable
   @Override
   protected cjc gJ() {
      return bup.be.a(this.dY(), buo.e);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new ccv(this, 2.0));
      this.bT.a(1, new cjh.a(this));
      this.bT.a(2, new cdv<>(this, cmo.class, true, $$0 -> $$0.ar() != bup.bx));
      this.bT.a(2, new cdv<>(this, clc.class, true));
   }

   @Override
   public void x(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void a(cor $$0) {
      bui $$1 = this.C();
      if (!($$1 instanceof coi)) {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dY().C) {
         this.hl();
      }
   }

   private void hl() {
      if (this.hm()) {
         this.bY = this.hn() ? ((coi)this.C()).gE() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.a(true, false);
            this.av();
         }
      }
   }

   private boolean hm() {
      return !this.gM() && !this.ho() && !this.dh();
   }

   private boolean hn() {
      return this.C() instanceof coi;
   }

   private boolean ho() {
      return this.M_() && !this.hn();
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      if ($$2 == buo.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new btz.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cec {
      private final cjc a;
      private bve b;
      private int c;

      public a(cjc $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.M_()) {
            return false;
         } else if (!(this.a.C() instanceof coi $$1)) {
            return false;
         } else {
            this.b = $$1.et();
            int $$2 = $$1.eu();
            return $$2 != this.c && this.a(this.b, cfv.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bui $$0 = this.a.C();
         if ($$0 instanceof coi) {
            this.c = ((coi)$$0).eu();
         }

         super.d();
      }
   }
}
