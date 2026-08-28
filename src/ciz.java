import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ciz extends bvy {
   protected static final int bJ = 6000;
   private int bG;
   @Nullable
   private UUID bH;

   protected ciz(bwr<? extends ciz> $$0, djh $$1) {
      super($$0, $$1);
      this.a(exm.n, 16.0F);
      this.a(exm.o, -1.0F);
   }

   public static byo.a gy() {
      return bxl.E().a(byp.E, 10.0);
   }

   @Override
   protected void a(arq $$0) {
      if (this.g() != 0) {
         this.bG = 0;
      }

      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.g() != 0) {
         this.bG = 0;
      }

      if (this.bG > 0) {
         this.bG--;
         if (this.bG % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dU().a(ly.S, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void c(arq $$0, bux $$1, float $$2) {
      this.gE();
      super.c($$0, $$1, $$2);
   }

   @Override
   public float a(iv $$0, djk $$1) {
      return $$1.a_($$0.e()).a(dmo.i) ? 10.0F : $$1.x($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("InLove", this.bG);
      $$0.b("LoveCause", jz.a, this.bH);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bG = $$0.f("InLove");
      this.bH = $$0.<UUID>a("LoveCause", jz.a).orElse(null);
   }

   public static boolean b(bwr<? extends ciz> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      boolean $$5 = bwq.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(axc.ca) && $$5;
   }

   protected static boolean a(dik $$0, iv $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int S() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int e(arq $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean i(czk var1);

   @Override
   public bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if (this.i($$2)) {
         int $$3 = this.g();
         if (!this.dU().C && $$3 == 0 && this.gA()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
            this.gz();
            return bug.b;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gz();
            return bug.a;
         }

         if (this.dU().C) {
            return bug.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gz() {
   }

   protected void a(crj $$0, buf $$1, czk $$2) {
      int $$3 = $$2.M();
      dcr $$4 = $$2.a(kk.x);
      $$2.a(1, $$0);
      if ($$4 != null) {
         czk $$5 = $$4.a($$2, $$3, $$0.fU(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gA() {
      return this.bG <= 0;
   }

   public void e(@Nullable crj $$0) {
      this.bG = 600;
      if ($$0 != null) {
         this.bH = $$0.cF();
      }

      this.dU().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bG = $$0;
   }

   public int gB() {
      return this.bG;
   }

   @Nullable
   public arr gC() {
      if (this.bH == null) {
         return null;
      } else {
         crj $$0 = this.dU().a(this.bH);
         return $$0 instanceof arr ? (arr)$$0 : null;
      }
   }

   public boolean gD() {
      return this.bG > 0;
   }

   public void gE() {
      this.bG = 0;
   }

   public boolean a(ciz $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gD() && $$0.gD();
      }
   }

   public void a(arq $$0, ciz $$1) {
      bvy $$2 = this.a($$0, (bvy)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dz(), this.dB(), this.dF(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arq $$0, ciz $$1, @Nullable bvy $$2) {
      Optional.ofNullable(this.gC()).or(() -> Optional.ofNullable($$1.gC())).ifPresent($$2x -> {
         $$2x.a(awx.P);
         aq.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gE();
      $$1.gE();
      $$0.a(this, (byte)18);
      if ($$0.O().c(djd.g)) {
         $$0.b(new bww($$0, this.dz(), this.dB(), this.dF(), this.dX().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = this.ae.k() * 0.02;
            this.dU().a(ly.S, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
