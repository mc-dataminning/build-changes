import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzz extends bzu {
   private int bU = 47999;

   public bzz(blt<? extends bzz> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gn() {
      return true;
   }

   @Nullable
   @Override
   protected bzu gs() {
      return blt.bb.a(this.dM());
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bU);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bU = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new btu(this, 2.0));
      this.bP.a(1, new bzz.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cfb $$0) {
      blp $$1 = this.fT();
      if (!($$1 instanceof ceu)) {
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
         this.bU = this.gX() ? ((ceu)this.fT()).gn() - 1 : this.bU - 1;
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
      return this.fT() instanceof ceu;
   }

   private boolean gY() {
      return this.fS() && !this.gX();
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      if ($$2 == bmj.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new blk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bvb {
      private final bzu a;
      private bmf b;
      private int c;

      public a(bzu $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(btb.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fS()) {
            return false;
         } else if (!(this.a.fT() instanceof ceu $$1)) {
            return false;
         } else {
            this.b = $$1.eh();
            int $$2 = $$1.ei();
            return $$2 != this.c && this.a(this.b, bwt.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         blp $$0 = this.a.fT();
         if ($$0 instanceof ceu) {
            this.c = ((ceu)$$0).ei();
         }

         super.c();
      }
   }
}
