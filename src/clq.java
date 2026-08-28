import java.util.EnumSet;
import javax.annotation.Nullable;

public class clq extends cll {
   private int bG = 47999;

   public clq(bwr<? extends clq> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gw() {
      return true;
   }

   @Nullable
   @Override
   protected cll gH() {
      return bwr.by.a(this.dU(), bwq.e);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bG);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bG = $$0.f("DespawnDelay");
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(1, new cey(this, 2.0));
      this.bE.a(1, new clq.a(this));
      this.bE.a(2, new cfy<>(this, cph.class, true, ($$0, $$1) -> $$0.an() != bwr.bR));
      this.bE.a(2, new cfy<>(this, cnu.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bG = $$0;
   }

   @Override
   protected void a(crm $$0) {
      bwi $$1 = this.C();
      if (!($$1 instanceof cre)) {
         super.a($$0);
      }
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C) {
         this.hg();
      }
   }

   private void hg() {
      if (this.hh()) {
         this.bG = this.hi() ? ((cre)this.C()).gB() - 1 : this.bG - 1;
         if (this.bG <= 0) {
            this.z();
            this.aq();
         }
      }
   }

   private boolean hh() {
      return !this.gK() && !this.hj() && !this.dd();
   }

   private boolean hi() {
      return this.C() instanceof cre;
   }

   private boolean hj() {
      return this.O_() && !this.hi();
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$2 == bwq.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bvy.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cgf {
      private final cll a;
      private bxj b;
      private int c;

      public a(cll $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cef.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.O_()) {
            return false;
         } else if (!(this.a.C() instanceof cre $$1)) {
            return false;
         } else {
            this.b = $$1.eq();
            int $$2 = $$1.es();
            return $$2 != this.c && this.a(this.b, chy.a);
         }
      }

      @Override
      public void d() {
         this.e.g(this.b);
         bwi $$0 = this.a.C();
         if ($$0 instanceof cre) {
            this.c = ((cre)$$0).es();
         }

         super.d();
      }
   }
}
