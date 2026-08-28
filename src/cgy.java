import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cgy extends buc {
   protected static final int cb = 6000;
   private int bY;
   @Nullable
   private UUID bZ;

   protected cgy(bus<? extends cgy> $$0, dfm $$1) {
      super($$0, $$1);
      this.a(esm.n, 16.0F);
      this.a(esm.o, -1.0F);
   }

   public static bwo.a gr() {
      return bvj.C().a(bwp.E, 10.0);
   }

   @Override
   protected void a(arp $$0) {
      if (this.X_() != 0) {
         this.bY = 0;
      }

      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.X_() != 0) {
         this.bY = 0;
      }

      if (this.bY > 0) {
         this.bY--;
         if (this.bY % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dV().a(ls.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(arp $$0, btb $$1, float $$2) {
      this.gx();
      super.b($$0, $$1, $$2);
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      return $$1.a_($$0.e()).a(dis.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("InLove", this.bY);
      if (this.bZ != null) {
         $$0.a("LoveCause", this.bZ);
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.bY = $$0.h("InLove");
      this.bZ = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bus<? extends cgy> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      boolean $$5 = bur.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(axc.bX) && $$5;
   }

   protected static boolean a(deo $$0, jh $$1) {
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
   protected int e(arp $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean j(cwm var1);

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if (this.j($$2)) {
         int $$3 = this.X_();
         if (!this.dV().C && $$3 == 0 && this.gt()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gs();
            return bsk.b;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gs();
            return bsk.a;
         }

         if (this.dV().C) {
            return bsk.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gs() {
   }

   protected void a(cou $$0, bsj $$1, cwm $$2) {
      int $$3 = $$2.L();
      czs $$4 = $$2.a(ku.y);
      $$2.a(1, $$0);
      if ($$4 != null) {
         cwm $$5 = $$4.a($$2, $$3, $$0.fT(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gt() {
      return this.bY <= 0;
   }

   public void f(@Nullable cou $$0) {
      this.bY = 600;
      if ($$0 != null) {
         this.bZ = $$0.cG();
      }

      this.dV().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bY = $$0;
   }

   public int gu() {
      return this.bY;
   }

   @Nullable
   public arq gv() {
      if (this.bZ == null) {
         return null;
      } else {
         cou $$0 = this.dV().b(this.bZ);
         return $$0 instanceof arq ? (arq)$$0 : null;
      }
   }

   public boolean gw() {
      return this.bY > 0;
   }

   public void gx() {
      this.bY = 0;
   }

   public boolean a(cgy $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gw() && $$0.gw();
      }
   }

   public void a(arp $$0, cgy $$1) {
      buc $$2 = this.a($$0, (buc)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dA(), this.dC(), this.dG(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arp $$0, cgy $$1, @Nullable buc $$2) {
      Optional.ofNullable(this.gv()).or(() -> Optional.ofNullable($$1.gv())).ifPresent($$2x -> {
         $$2x.a(awx.P);
         ao.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gx();
      $$1.gx();
      $$0.a(this, (byte)18);
      if ($$0.N().b(dfi.f)) {
         $$0.b(new bux($$0, this.dA(), this.dC(), this.dG(), this.dY().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = this.ae.k() * 0.02;
            this.dV().a(ls.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
