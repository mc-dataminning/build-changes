import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzp extends bzk {
   private int bU = 47999;

   public bzp(blj<? extends bzp> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gn() {
      return true;
   }

   @Nullable
   @Override
   protected bzk gs() {
      return blj.bb.a(this.dM());
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new btk(this, 2.0));
      this.bP.a(1, new bzp.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cer $$0) {
      blf $$1 = this.fT();
      if (!($$1 instanceof cek)) {
         super.f($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.gU();
      }
   }

   private void gU() {
      if (this.gV()) {
         this.bU = this.gW() ? ((cek)this.fT()).gn() - 1 : this.bU - 1;
         if (this.bU <= 0) {
            this.a(true, false);
            this.am();
         }
      }
   }

   private boolean gV() {
      return !this.gt() && !this.gX() && !this.cV();
   }

   private boolean gW() {
      return this.fT() instanceof cek;
   }

   private boolean gX() {
      return this.fS() && !this.gW();
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      if ($$2 == blz.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bla.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bur {
      private final bzk a;
      private blv b;
      private int c;

      public a(bzk $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bsr.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fS()) {
            return false;
         } else if (!(this.a.fT() instanceof cek $$1)) {
            return false;
         } else {
            this.b = $$1.eh();
            int $$2 = $$1.ei();
            return $$2 != this.c && this.a(this.b, bwj.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         blf $$0 = this.a.fT();
         if ($$0 instanceof cek) {
            this.c = ((cek)$$0).ei();
         }

         super.c();
      }
   }
}
