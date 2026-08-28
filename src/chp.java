import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class chp extends buq {
   protected static final int bI = 6000;
   private int bF;
   @Nullable
   private UUID bG;

   protected chp(bvi<? extends chp> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.n, 16.0F);
      this.a(eun.o, -1.0F);
   }

   public static bxf.a gx() {
      return bwa.E().a(bxg.E, 10.0);
   }

   @Override
   protected void a(ard $$0) {
      if (this.g() != 0) {
         this.bF = 0;
      }

      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.g() != 0) {
         this.bF = 0;
      }

      if (this.bF > 0) {
         this.bF--;
         if (this.bF % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dU().a(lt.S, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(ard $$0, btp $$1, float $$2) {
      this.gD();
      super.b($$0, $$1, $$2);
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      return $$1.a_($$0.e()).a(dkg.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("InLove", this.bF);
      if (this.bG != null) {
         $$0.a("LoveCause", this.bG);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.bF = $$0.h("InLove");
      this.bG = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bvi<? extends chp> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      boolean $$5 = bvh.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(awp.bZ) && $$5;
   }

   protected static boolean a(dgc $$0, ji $$1) {
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
   protected int e(ard $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean j(cxh var1);

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if (this.j($$2)) {
         int $$3 = this.g();
         if (!this.dU().C && $$3 == 0 && this.gz()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
            this.gy();
            return bsy.b;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gy();
            return bsy.a;
         }

         if (this.dU().C) {
            return bsy.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gy() {
   }

   protected void a(cpr $$0, bsx $$1, cxh $$2) {
      int $$3 = $$2.M();
      dal $$4 = $$2.a(kv.y);
      $$2.a(1, $$0);
      if ($$4 != null) {
         cxh $$5 = $$4.a($$2, $$3, $$0.fX(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gz() {
      return this.bF <= 0;
   }

   public void e(@Nullable cpr $$0) {
      this.bF = 600;
      if ($$0 != null) {
         this.bG = $$0.cF();
      }

      this.dU().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bF = $$0;
   }

   public int gA() {
      return this.bF;
   }

   @Nullable
   public are gB() {
      if (this.bG == null) {
         return null;
      } else {
         cpr $$0 = this.dU().a(this.bG);
         return $$0 instanceof are ? (are)$$0 : null;
      }
   }

   public boolean gC() {
      return this.bF > 0;
   }

   public void gD() {
      this.bF = 0;
   }

   public boolean a(chp $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gC() && $$0.gC();
      }
   }

   public void a(ard $$0, chp $$1) {
      buq $$2 = this.a($$0, (buq)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dz(), this.dB(), this.dF(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(ard $$0, chp $$1, @Nullable buq $$2) {
      Optional.ofNullable(this.gB()).or(() -> Optional.ofNullable($$1.gB())).ifPresent($$2x -> {
         $$2x.a(awk.P);
         ap.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gD();
      $$1.gD();
      $$0.a(this, (byte)18);
      if ($$0.O().b(dgv.f)) {
         $$0.b(new bvn($$0, this.dz(), this.dB(), this.dF(), this.dX().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = this.ae.k() * 0.02;
            this.dU().a(lt.S, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
