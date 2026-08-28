import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cfa extends bsj {
   protected static final int ca = 6000;
   private int bY;
   @Nullable
   private UUID bZ;

   protected cfa(bsv<? extends cfa> $$0, dbt $$1) {
      super($$0, $$1);
      this.a(eoh.n, 16.0F);
      this.a(eoh.o, -1.0F);
   }

   @Override
   protected void Z() {
      if (this.g() != 0) {
         this.bY = 0;
      }

      super.Z();
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
            this.dP().a(lj.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bY = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(iz $$0, dbw $$1) {
      return $$1.a_($$0.d()).a(dew.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("InLove", this.bY);
      if (this.bZ != null) {
         $$0.a("LoveCause", this.bZ);
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.bY = $$0.h("InLove");
      this.bZ = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bsv<? extends cfa> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      boolean $$5 = bto.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(awl.bW) && $$5;
   }

   protected static boolean a(daw $$0, iz $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int P() {
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

   public abstract boolean o(cuk var1);

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if (this.o($$2)) {
         int $$3 = this.g();
         if (!this.dP().B && $$3 == 0 && this.gr()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bqp.a;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bqp.a(this.dP().B);
         }

         if (this.dP().B) {
            return bqp.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cms $$0, bqo $$1, cuk $$2) {
      $$2.a(1, $$0);
   }

   public boolean gr() {
      return this.bY <= 0;
   }

   public void g(@Nullable cms $$0) {
      this.bY = 600;
      if ($$0 != null) {
         this.bZ = $$0.cz();
      }

      this.dP().a(this, (byte)18);
   }

   public void t(int $$0) {
      this.bY = $$0;
   }

   public int gs() {
      return this.bY;
   }

   @Nullable
   public arc gt() {
      if (this.bZ == null) {
         return null;
      } else {
         cms $$0 = this.dP().b(this.bZ);
         return $$0 instanceof arc ? (arc)$$0 : null;
      }
   }

   public boolean gu() {
      return this.bY > 0;
   }

   public void gv() {
      this.bY = 0;
   }

   public boolean a(cfa $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gu() && $$0.gu();
      }
   }

   public void a(arb $$0, cfa $$1) {
      bsj $$2 = this.a($$0, (bsj)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.du(), this.dw(), this.dA(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arb $$0, cfa $$1, @Nullable bsj $$2) {
      Optional.ofNullable(this.gt()).or(() -> Optional.ofNullable($$1.gt())).ifPresent($$2x -> {
         $$2x.a(awg.P);
         am.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gv();
      $$1.gv();
      $$0.a(this, (byte)18);
      if ($$0.ab().b(dbp.f)) {
         $$0.b(new bta($$0, this.du(), this.dw(), this.dA(), this.el().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = this.ah.k() * 0.02;
            this.dP().a(lj.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
