import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cee extends bro {
   protected static final int ca = 6000;
   private int bY;
   @Nullable
   private UUID bZ;

   protected cee(bsa<? extends cee> $$0, dax $$1) {
      super($$0, $$1);
      this.a(enl.n, 16.0F);
      this.a(enl.o, -1.0F);
   }

   @Override
   protected void Y() {
      if (this.g() != 0) {
         this.bY = 0;
      }

      super.Y();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.g() != 0) {
         this.bY = 0;
      }

      if (this.bY > 0) {
         this.bY--;
         if (this.bY % 10 == 0) {
            double $$0 = this.ah.k() * 0.02;
            double $$1 = this.ah.k() * 0.02;
            double $$2 = this.ah.k() * 0.02;
            this.dP().a(ky.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bY = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(io $$0, dba $$1) {
      return $$1.a_($$0.d()).a(dea.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("InLove", this.bY);
      if (this.bZ != null) {
         $$0.a("LoveCause", this.bZ);
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.bY = $$0.h("InLove");
      this.bZ = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bsa<? extends cee> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      boolean $$5 = bss.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(avw.bW) && $$5;
   }

   protected static boolean a(daa $$0, io $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int O() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public int ej() {
      return 1 + this.dP().z.a(3);
   }

   public abstract boolean o(cto var1);

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if (this.o($$2)) {
         int $$3 = this.g();
         if (!this.dP().B && $$3 == 0 && this.gq()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bpu.a;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bpu.a(this.dP().B);
         }

         if (this.dP().B) {
            return bpu.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(clw $$0, bpt $$1, cto $$2) {
      $$2.a(1, $$0);
   }

   public boolean gq() {
      return this.bY <= 0;
   }

   public void g(@Nullable clw $$0) {
      this.bY = 600;
      if ($$0 != null) {
         this.bZ = $$0.cz();
      }

      this.dP().a(this, (byte)18);
   }

   public void t(int $$0) {
      this.bY = $$0;
   }

   public int gr() {
      return this.bY;
   }

   @Nullable
   public aqn gs() {
      if (this.bZ == null) {
         return null;
      } else {
         clw $$0 = this.dP().b(this.bZ);
         return $$0 instanceof aqn ? (aqn)$$0 : null;
      }
   }

   public boolean gt() {
      return this.bY > 0;
   }

   public void gu() {
      this.bY = 0;
   }

   public boolean a(cee $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gt() && $$0.gt();
      }
   }

   public void a(aqm $$0, cee $$1) {
      bro $$2 = this.a($$0, (bro)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.du(), this.dw(), this.dA(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aqm $$0, cee $$1, @Nullable bro $$2) {
      Optional.ofNullable(this.gs()).or(() -> Optional.ofNullable($$1.gs())).ifPresent($$2x -> {
         $$2x.a(avr.P);
         am.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gu();
      $$1.gu();
      $$0.a(this, (byte)18);
      if ($$0.aa().b(dat.f)) {
         $$0.b(new bse($$0, this.du(), this.dw(), this.dA(), this.el().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = this.ah.k() * 0.02;
            this.dP().a(ky.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
