import com.google.common.annotations.VisibleForTesting;
import java.util.UUID;
import javax.annotation.Nullable;

public class cpt extends cps implements crl {
   private static final akl<Boolean> a = akp.a(cpt.class, akn.k);
   private static final akl<crk> b = akp.a(cpt.class, akn.u);
   private static final int c = 3600;
   private static final int bJ = 6000;
   private static final int bK = 14;
   private static final int bL = 4;
   private static final int bM = -1;
   private static final int bN = 0;
   private int bO;
   @Nullable
   private UUID bP;
   @Nullable
   private cgs bQ;
   @Nullable
   private diu bR;
   private int bS = 0;

   public cpt(bxc<? extends cpt> $$0, djx $$1) {
      super($$0, $$1);
      mg.x.a(this.ae).ifPresent($$0x -> this.a(this.gC().b($$0x)));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(b, crj.gI());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("VillagerData", crk.c, this.gC());
      $$0.b("Offers", diu.a, this.dX().a(un.a), this.bR);
      $$0.b("Gossips", cgs.a, this.bQ);
      $$0.a("ConversionTime", this.gB() ? this.bO : -1);
      $$0.b("ConversionPlayer", jz.a, this.bP);
      $$0.a("Xp", this.bS);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(b, $$0.<crk>a("VillagerData", crk.c).orElseGet(crj::gI));
      this.bR = $$0.<diu>a("Offers", diu.a, this.dX().a(un.a)).orElse(null);
      this.bQ = $$0.<cgs>a("Gossips", cgs.a).orElse(null);
      int $$1 = $$0.b("ConversionTime", -1);
      if ($$1 != -1) {
         UUID $$2 = $$0.<UUID>a("ConversionPlayer", jz.a).orElse(null);
         this.b($$2, $$1);
      } else {
         this.ar().a(a, false);
         this.bO = -1;
      }

      this.bS = $$0.b("Xp", 0);
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bJ() && this.gB()) {
         int $$0 = this.gE();
         this.bO -= $$0;
         if (this.bO <= 0) {
            this.g((ars)this.dV());
         }
      }

      super.h();
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(dac.qO)) {
         if (this.b(bvz.r)) {
            $$2.a(1, $$0);
            if (!this.dV().C) {
               this.b($$0.cG(), this.ae.a(2401) + 3600);
            }

            return bur.b;
         } else {
            return bur.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gB() && this.bS == 0;
   }

   public boolean gB() {
      return this.ar().a(a);
   }

   private void b(@Nullable UUID $$0, int $$1) {
      this.bP = $$0;
      this.bO = $$1;
      this.ar().a(a, true);
      this.e(bvz.r);
      this.a(new bvx(bvz.e, $$1, Math.min(this.dV().an().a() - 1, 0)));
      this.dV().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.ba()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awp.EK, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(ars $$0) {
      this.a(bxc.bE, bwn.a(this, false, false), $$1 -> {
         for (bxd $$2 : this.a($$0, $$0xx -> !dgn.a($$0xx, dgm.E))) {
            byl $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gC());
         if (this.bQ != null) {
            $$1.a(this.bQ);
         }

         if (this.bR != null) {
            $$1.b(this.bR.a());
         }

         $$1.t(this.bS);
         $$1.a($$0, $$0.d_($$1.dv()), bxb.i, null);
         $$1.g($$0);
         if (this.bP != null) {
            crx $$4 = $$0.a(this.bP);
            if ($$4 instanceof art) {
               aq.s.a((art)$$4, this, $$1);
               $$0.a(cit.a, $$4, $$1);
            }
         }

         $$1.a(new bvx(bvz.i, 200, 0));
         if (!this.ba()) {
            $$0.a(null, 1027, this.dv(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.bO = $$0;
   }

   private int gE() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         iv.a $$2 = new iv.a();

         for (int $$3 = (int)this.dA() - 4; $$3 < (int)this.dA() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dC() - 4; $$4 < (int)this.dC() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dG() - 4; $$5 < (int)this.dG() + 4 && $$1 < 14; $$5++) {
                  ebe $$6 = this.dV().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dne.fo) || $$6.b() instanceof dmv) {
                     if (this.ae.i() < 0.3F) {
                        $$0++;
                     }

                     $$1++;
                  }
               }
            }
         }
      }

      return $$0;
   }

   @Override
   public float ff() {
      return this.n_() ? (this.ae.i() - this.ae.i()) * 0.2F + 2.0F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   @Override
   public awo u() {
      return awp.EI;
   }

   @Override
   public awo e(bvi $$0) {
      return awp.EM;
   }

   @Override
   public awo l_() {
      return awp.EL;
   }

   @Override
   public awo n() {
      return awp.EN;
   }

   @Override
   protected czy t() {
      return czy.k;
   }

   public void a(diu $$0) {
      this.bR = $$0;
   }

   public void a(cgs $$0) {
      this.bQ = $$0;
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      this.a(this.gC().a($$0.J_(), cro.a($$0.u(this.dv()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(crk $$0) {
      crk $$1 = this.gC();
      if (!$$1.b().equals($$0.b())) {
         this.bR = null;
      }

      this.al.a(b, $$0);
   }

   @Override
   public crk gC() {
      return this.al.a(b);
   }

   public int gD() {
      return this.bS;
   }

   public void s(int $$0) {
      this.bS = $$0;
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.av ? c((kj<T>)$$0, this.gC().a()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.av) {
         jf<cro> $$2 = c(kk.av, $$1);
         this.a(this.gC().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
