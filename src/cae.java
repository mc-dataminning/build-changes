import java.util.EnumSet;
import javax.annotation.Nullable;

public class cae extends bzz {
   private int bU = 47999;

   public cae(bly<? extends cae> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gn() {
      return true;
   }

   @Nullable
   @Override
   protected bzz gs() {
      return bly.bb.a(this.dM());
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
      this.bO.a(1, new btz(this, 2.0));
      this.bP.a(1, new cae.a(this));
   }

   @Override
   public void w(int $$0) {
      this.bU = $$0;
   }

   @Override
   protected void f(cfh $$0) {
      blu $$1 = this.fT();
      if (!($$1 instanceof cfa)) {
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
         this.bU = this.gX() ? ((cfa)this.fT()).gn() - 1 : this.bU - 1;
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
      return this.fT() instanceof cfa;
   }

   private boolean gY() {
      return this.fS() && !this.gX();
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      if ($$2 == bmo.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new blp.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bvg {
      private final bzz a;
      private bmk b;
      private int c;

      public a(bzz $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(btg.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fS()) {
            return false;
         } else if (!(this.a.fT() instanceof cfa $$1)) {
            return false;
         } else {
            this.b = $$1.eh();
            int $$2 = $$1.ei();
            return $$2 != this.c && this.a(this.b, bwy.a);
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         blu $$0 = this.a.fT();
         if ($$0 instanceof cfa) {
            this.c = ((cfa)$$0).ei();
         }

         super.c();
      }
   }
}
