import java.util.EnumSet;
import javax.annotation.Nullable;

public class caf extends caa {
   private int bU = 47999;

   public caf(blz<? extends caf> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gn() {
      return true;
   }

   @Nullable
   @Override
   protected caa gs() {
      return blz.bb.a(this.dM());
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new bua(this, 2.0));
      this.bP.a(1, new caf.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cfi $$0) {
      blv $$1 = this.fT();
      if (!($$1 instanceof cfb)) {
         super.f($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.gV();
      }
   }

   private void gV() {
      if (this.gW()) {
         this.bU = this.gX() ? ((cfb)this.fT()).gn() - 1 : this.bU - 1;
         if (this.bU <= 0) {
            this.a(true, false);
            this.am();
         }
      }
   }

   private boolean gW() {
      return !this.gt() && !this.gY() && !this.cV();
   }

   private boolean gX() {
      return this.fT() instanceof cfb;
   }

   private boolean gY() {
      return this.fS() && !this.gX();
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      if ($$2 == bmp.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new blq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bvh {
      private final caa a;
      private bml b;
      private int c;

      public a(caa $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bth.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fS()) {
            return false;
         } else if (!(this.a.fT() instanceof cfb $$1)) {
            return false;
         } else {
            this.b = $$1.eh();
            int $$2 = $$1.ei();
            return $$2 != this.c && this.a(this.b, bwz.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         blv $$0 = this.a.fT();
         if ($$0 instanceof cfb) {
            this.c = ((cfb)$$0).ei();
         }

         super.c();
      }
   }
}
