import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjj extends cje {
   private int bY = 47999;

   public cjj(bur<? extends cjj> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gv() {
      return true;
   }

   @Nullable
   @Override
   protected cje gG() {
      return bur.bx.a(this.dV(), buq.e);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bY);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bY = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(1, new ccx(this, 2.0));
      this.bT.a(1, new cjj.a(this));
      this.bT.a(2, new cdx<>(this, cmq.class, true, ($$0, $$1) -> $$0.aq() != bur.bQ));
      this.bT.a(2, new cdx<>(this, cle.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void a(cow $$0) {
      buk $$1 = this.D();
      if (!($$1 instanceof coo)) {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         this.hh();
      }
   }

   private void hh() {
      if (this.hi()) {
         this.bY = this.hj() ? ((coo)this.D()).gB() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.A();
            this.at();
         }
      }
   }

   private boolean hi() {
      return !this.gJ() && !this.hk() && !this.de();
   }

   private boolean hj() {
      return this.D() instanceof coo;
   }

   private boolean hk() {
      return this.P_() && !this.hj();
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      if ($$2 == buq.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bub.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cee {
      private final cje a;
      private bvg b;
      private int c;

      public a(cje $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cce.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.P_()) {
            return false;
         } else if (!(this.a.D() instanceof coo $$1)) {
            return false;
         } else {
            this.b = $$1.ep();
            int $$2 = $$1.eq();
            return $$2 != this.c && this.a(this.b, cfx.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         buk $$0 = this.a.D();
         if ($$0 instanceof coo) {
            this.c = ((coo)$$0).eq();
         }

         super.d();
      }
   }
}
