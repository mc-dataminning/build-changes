import java.util.EnumSet;
import javax.annotation.Nullable;

public class bts extends btn {
   private int bU = 47999;

   public bts(bfn<? extends bts> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gh() {
      return true;
   }

   @Nullable
   @Override
   protected btn gm() {
      return bfn.ba.a(this.dI());
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void x() {
      super.x();
      this.bO.a(1, new bno(this, 2.0));
      this.bP.a(1, new bts.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(byo $$0) {
      bfj $$1 = this.fP();
      if (!($$1 instanceof byh)) {
         super.f($$0);
      }
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dI().B) {
         this.gO();
      }
   }

   private void gO() {
      if (this.gP()) {
         this.bU = this.gQ() ? ((byh)this.fP()).gh() - 1 : this.bU - 1;
         if (this.bU <= 0) {
            this.a(true, false);
            this.ai();
         }
      }
   }

   private boolean gP() {
      return !this.gn() && !this.gR() && !this.cS();
   }

   private boolean gQ() {
      return this.fP() instanceof byh;
   }

   private boolean gR() {
      return this.fO() && !this.gQ();
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      if ($$2 == bgd.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bfe.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bov {
      private final btn a;
      private bfz b;
      private int c;

      public a(btn $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bmv.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fO()) {
            return false;
         } else if (!(this.a.fP() instanceof byh $$1)) {
            return false;
         } else {
            this.b = $$1.ed();
            int $$2 = $$1.ee();
            return $$2 != this.c && this.a(this.b, bqm.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bfj $$0 = this.a.fP();
         if ($$0 instanceof byh) {
            this.c = ((byh)$$0).ee();
         }

         super.c();
      }
   }
}
