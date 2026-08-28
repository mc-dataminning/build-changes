import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cgx extends bub {
   protected static final int cb = 6000;
   private int bY;
   @Nullable
   private UUID bZ;

   protected cgx(bur<? extends cgx> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.n, 16.0F);
      this.a(etq.o, -1.0F);
   }

   public static bwn.a gu() {
      return bvi.C().a(bwo.E, 10.0);
   }

   @Override
   protected void a(arc $$0) {
      if (this.Y_() != 0) {
         this.bY = 0;
      }

      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.Y_() != 0) {
         this.bY = 0;
      }

      if (this.bY > 0) {
         this.bY--;
         if (this.bY % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dW().a(lt.R, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(arc $$0, bta $$1, float $$2) {
      this.gA();
      super.b($$0, $$1, $$2);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return $$1.a_($$0.e()).a(djo.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("InLove", this.bY);
      if (this.bZ != null) {
         $$0.a("LoveCause", this.bZ);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.bY = $$0.h("InLove");
      this.bZ = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bur<? extends cgx> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      boolean $$5 = buq.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(awp.bY) && $$5;
   }

   protected static boolean a(dfk $$0, ji $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int e(arc $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean j(cwp var1);

   @Override
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if (this.j($$2)) {
         int $$3 = this.Y_();
         if (!this.dW().C && $$3 == 0 && this.gw()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gv();
            return bsj.b;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gv();
            return bsj.a;
         }

         if (this.dW().C) {
            return bsj.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gv() {
   }

   protected void a(cox $$0, bsi $$1, cwp $$2) {
      int $$3 = $$2.M();
      czv $$4 = $$2.a(kv.y);
      $$2.a(1, $$0);
      if ($$4 != null) {
         cwp $$5 = $$4.a($$2, $$3, $$0.fV(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gw() {
      return this.bY <= 0;
   }

   public void f(@Nullable cox $$0) {
      this.bY = 600;
      if ($$0 != null) {
         this.bZ = $$0.cG();
      }

      this.dW().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bY = $$0;
   }

   public int gx() {
      return this.bY;
   }

   @Nullable
   public ard gy() {
      if (this.bZ == null) {
         return null;
      } else {
         cox $$0 = this.dW().b(this.bZ);
         return $$0 instanceof ard ? (ard)$$0 : null;
      }
   }

   public boolean gz() {
      return this.bY > 0;
   }

   public void gA() {
      this.bY = 0;
   }

   public boolean a(cgx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gz() && $$0.gz();
      }
   }

   public void a(arc $$0, cgx $$1) {
      bub $$2 = this.a($$0, (bub)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dB(), this.dD(), this.dH(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arc $$0, cgx $$1, @Nullable bub $$2) {
      Optional.ofNullable(this.gy()).or(() -> Optional.ofNullable($$1.gy())).ifPresent($$2x -> {
         $$2x.a(awk.P);
         ap.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gA();
      $$1.gA();
      $$0.a(this, (byte)18);
      if ($$0.O().b(dge.f)) {
         $$0.b(new buw($$0, this.dB(), this.dD(), this.dH(), this.dZ().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = this.ae.k() * 0.02;
            this.dW().a(lt.R, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
