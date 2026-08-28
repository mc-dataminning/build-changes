import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjj extends cje {
   private int bY = 47999;

   public cjj(bur<? extends cjj> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gs() {
      return true;
   }

   @Nullable
   @Override
   protected cje gD() {
      return bur.by.a(this.dW(), buq.e);
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
   protected void B() {
      super.B();
      this.bS.a(1, new ccx(this, 2.0));
      this.bT.a(1, new cjj.a(this));
      this.bT.a(2, new cdx<>(this, cmq.class, true, ($$0, $$1) -> $$0.aq() != bur.bR));
      this.bT.a(2, new cdx<>(this, cle.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bY = $$0;
   }

   @Override
   protected void a(cox $$0) {
      buk $$1 = this.A();
      if (!($$1 instanceof cop)) {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         this.he();
      }
   }

   private void he() {
      if (this.hf()) {
         this.bY = this.hg() ? ((cop)this.A()).gy() - 1 : this.bY - 1;
         if (this.bY <= 0) {
            this.a(true, false);
            this.at();
         }
      }
   }

   private boolean hf() {
      return !this.gG() && !this.hh() && !this.df();
   }

   private boolean hg() {
      return this.A() instanceof cop;
   }

   private boolean hh() {
      return this.P_() && !this.hg();
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
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
         } else if (!(this.a.A() instanceof cop $$1)) {
            return false;
         } else {
            this.b = $$1.eq();
            int $$2 = $$1.er();
            return $$2 != this.c && this.a(this.b, cfx.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         buk $$0 = this.a.A();
         if ($$0 instanceof cop) {
            this.c = ((cop)$$0).er();
         }

         super.d();
      }
   }
}
