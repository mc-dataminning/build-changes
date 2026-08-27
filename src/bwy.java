import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwy extends bwt {
   private int bU = 47999;

   public bwy(biu<? extends bwy> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gm() {
      return true;
   }

   @Nullable
   @Override
   protected bwt gr() {
      return biu.ba.a(this.dL());
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(1, new bqu(this, 2.0));
      this.bP.a(1, new bwy.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cbu $$0) {
      biq $$1 = this.fS();
      if (!($$1 instanceof cbn)) {
         super.f($$0);
      }
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         this.gT();
      }
   }

   private void gT() {
      if (this.gU()) {
         this.bU = this.gV() ? ((cbn)this.fS()).gm() - 1 : this.bU - 1;
         if (this.bU <= 0) {
            this.a(true, false);
            this.ak();
         }
      }
   }

   private boolean gU() {
      return !this.gs() && !this.gW() && !this.cU();
   }

   private boolean gV() {
      return this.fS() instanceof cbn;
   }

   private boolean gW() {
      return this.fR() && !this.gV();
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qy $$4) {
      if ($$2 == bjk.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bil.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bsb {
      private final bwt a;
      private bjg b;
      private int c;

      public a(bwt $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bqb.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fR()) {
            return false;
         } else if (!(this.a.fS() instanceof cbn $$1)) {
            return false;
         } else {
            this.b = $$1.eg();
            int $$2 = $$1.eh();
            return $$2 != this.c && this.a(this.b, bts.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         biq $$0 = this.a.fS();
         if ($$0 instanceof cbn) {
            this.c = ((cbn)$$0).eh();
         }

         super.c();
      }
   }
}
