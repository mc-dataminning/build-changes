import java.util.EnumSet;
import javax.annotation.Nullable;

public class cki extends ckd {
   private int bZ = 47999;

   public cki(bvq<? extends cki> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gp() {
      return true;
   }

   @Nullable
   @Override
   protected ckd gA() {
      return bvq.by.a(this.dV(), bvp.e);
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
      this.bT.a(1, new cdw(this, 2.0));
      this.bU.a(1, new cki.a(this));
      this.bU.a(2, new cew<>(this, cnp.class, true, ($$0, $$1) -> $$0.aq() != bvq.bR));
      this.bU.a(2, new cew<>(this, cmd.class, true));
   }

   @Override
   public void w(int $$0) {
      this.bZ = $$0;
   }

   @Override
   protected void a(cpw $$0) {
      bvj $$1 = this.A();
      if (!($$1 instanceof cpo)) {
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
         this.bZ = this.hd() ? ((cpo)this.A()).gv() - 1 : this.bZ - 1;
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
      return this.A() instanceof cpo;
   }

   private boolean he() {
      return this.P_() && !this.hd();
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      if ($$2 == bvp.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bva.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cfd {
      private final ckd a;
      private bwf b;
      private int c;

      public a(ckd $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(cdd.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.P_()) {
            return false;
         } else if (!(this.a.A() instanceof cpo $$1)) {
            return false;
         } else {
            this.b = $$1.ep();
            int $$2 = $$1.eq();
            return $$2 != this.c && this.a(this.b, cgw.a);
         }
      }

      @Override
      public void d() {
         this.e.h(this.b);
         bvj $$0 = this.a.A();
         if ($$0 instanceof cpo) {
            this.c = ((cpo)$$0).eq();
         }

         super.d();
      }
   }
}
