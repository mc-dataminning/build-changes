import java.util.EnumSet;
import javax.annotation.Nullable;

public class bxe extends bwz {
   private int bU = 47999;

   public bxe(bja<? extends bxe> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gn() {
      return true;
   }

   @Nullable
   @Override
   protected bwz gs() {
      return bja.ba.a(this.dL());
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(1, new bra(this, 2.0));
      this.bP.a(1, new bxe.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cca $$0) {
      biw $$1 = this.fT();
      if (!($$1 instanceof cbt)) {
         super.f($$0);
      }
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         this.gU();
      }
   }

   private void gU() {
      if (this.gV()) {
         this.bU = this.gW() ? ((cbt)this.fT()).gn() - 1 : this.bU - 1;
         if (this.bU <= 0) {
            this.a(true, false);
            this.ak();
         }
      }
   }

   private boolean gV() {
      return !this.gt() && !this.gX() && !this.cU();
   }

   private boolean gW() {
      return this.fT() instanceof cbt;
   }

   private boolean gX() {
      return this.fS() && !this.gW();
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      if ($$2 == bjq.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bir.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bsh {
      private final bwz a;
      private bjm b;
      private int c;

      public a(bwz $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bqh.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fS()) {
            return false;
         } else if (!(this.a.fT() instanceof cbt $$1)) {
            return false;
         } else {
            this.b = $$1.eg();
            int $$2 = $$1.eh();
            return $$2 != this.c && this.a(this.b, bty.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         biw $$0 = this.a.fT();
         if ($$0 instanceof cbt) {
            this.c = ((cbt)$$0).eh();
         }

         super.c();
      }
   }
}
