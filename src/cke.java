import java.util.EnumSet;
import javax.annotation.Nullable;

public class cke extends cjz {
   private int bZ = 47999;

   public cke(bvm<? extends cke> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gp() {
      return true;
   }

   @Nullable
   @Override
   protected cjz gA() {
      return bvm.by.a(this.dV(), bvl.e);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bZ);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bZ = $$0.h("DespawnDelay");
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(1, new cds(this, 2.0));
      this.bU.a(1, new cke.a(this));
      this.bU.a(2, new ces<>(this, cnl.class, true, ($$0, $$1) -> $$0.aq() != bvm.bR));
      this.bU.a(2, new ces<>(this, clz.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void a(cps $$0) {
      bvf $$1 = this.A();
      if (!($$1 instanceof cpk)) {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         this.hb();
      }
   }

   private void hb() {
      if (this.hc()) {
         this.bZ = this.hd() ? ((cpk)this.A()).gv() - 1 : this.bZ - 1;
         if (this.bZ <= 0) {
            this.a(true, false);
            this.at();
         }
      }
   }

   private boolean hc() {
      return !this.gD() && !this.he() && !this.df();
   }

   private boolean hd() {
      return this.A() instanceof cpk;
   }

   private boolean he() {
      return this.P_() && !this.hd();
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      if ($$2 == bvl.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new buw.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cez {
      private final cjz a;
      private bwb b;
      private int c;

      public a(cjz $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.P_()) {
            return false;
         } else if (!(this.a.A() instanceof cpk $$1)) {
            return false;
         } else {
            this.b = $$1.ep();
            int $$2 = $$1.eq();
            return $$2 != this.c && this.a(this.b, cgs.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bvf $$0 = this.a.A();
         if ($$0 instanceof cpk) {
            this.c = ((cpk)$$0).eq();
         }

         super.d();
      }
   }
}
