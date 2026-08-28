import java.util.EnumSet;
import javax.annotation.Nullable;

public class ciy extends cit {
   private int bY = 47999;

   public ciy(bug<? extends ciy> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gy() {
      return true;
   }

   @Nullable
   @Override
   protected cit gJ() {
      return bug.be.a(this.dX(), buf.e);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new ccm(this, 2.0));
      this.bT.a(1, new ciy.a(this));
      this.bT.a(2, new cdm<>(this, cmf.class, true, $$0 -> $$0.aq() != bug.bx));
      this.bT.a(2, new cdm<>(this, ckt.class, true));
   }

   @Override
   public void x(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void a(coh $$0) {
      btz $$1 = this.C();
      if (!($$1 instanceof cnz)) {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C) {
         this.hl();
      }
   }

   private void hl() {
      if (this.hm()) {
         this.bY = this.hn() ? ((cnz)this.C()).gE() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.a(true, false);
            this.au();
         }
      }
   }

   private boolean hm() {
      return !this.gM() && !this.ho() && !this.dg();
   }

   private boolean hn() {
      return this.C() instanceof cnz;
   }

   private boolean ho() {
      return this.M_() && !this.hn();
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if ($$2 == buf.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new btq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cdt {
      private final cit a;
      private buv b;
      private int c;

      public a(cit $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cbt.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.M_()) {
            return false;
         } else if (!(this.a.C() instanceof cnz $$1)) {
            return false;
         } else {
            this.b = $$1.es();
            int $$2 = $$1.et();
            return $$2 != this.c && this.a(this.b, cfm.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         btz $$0 = this.a.C();
         if ($$0 instanceof cnz) {
            this.c = ((cnz)$$0).et();
         }

         super.d();
      }
   }
}
