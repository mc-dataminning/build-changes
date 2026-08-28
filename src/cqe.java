import com.google.common.annotations.VisibleForTesting;
import java.util.UUID;
import javax.annotation.Nullable;

public class cqe extends cqd implements crw {
   private static final aku<Boolean> a = aky.a(cqe.class, akw.k);
   private static final aku<crv> b = aky.a(cqe.class, akw.u);
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
   private chd bQ;
   @Nullable
   private djg bR;
   private int bS = 0;

   public cqe(bxn<? extends cqe> $$0, dkj $$1) {
      super($$0, $$1);
      mh.x.a(this.ae).ifPresent($$0x -> this.a(this.gF().b($$0x)));
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(b, cru.gJ());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("VillagerData", crv.c, this.gF());
      $$0.b("Offers", djg.a, this.dX().a(uo.a), this.bR);
      $$0.b("Gossips", chd.a, this.bQ);
      $$0.a("ConversionTime", this.gE() ? this.bO : -1);
      $$0.b("ConversionPlayer", ka.a, this.bP);
      $$0.a("Xp", this.bS);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.al.a(b, $$0.<crv>a("VillagerData", crv.c).orElseGet(cru::gJ));
      this.bR = $$0.<djg>a("Offers", djg.a, this.dX().a(uo.a)).orElse(null);
      this.bQ = $$0.<chd>a("Gossips", chd.a).orElse(null);
      int $$1 = $$0.b("ConversionTime", -1);
      if ($$1 != -1) {
         UUID $$2 = $$0.<UUID>a("ConversionPlayer", ka.a).orElse(null);
         this.b($$2, $$1);
      } else {
         this.ar().a(a, false);
         this.bO = -1;
      }

      this.bS = $$0.b("Xp", 0);
   }

   @Override
   public void g() {
      if (!this.dV().C && this.bJ() && this.gE()) {
         int $$0 = this.gH();
         this.bO -= $$0;
         if (this.bO <= 0) {
            this.g((asb)this.dV());
         }
      }

      super.g();
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(dao.qO)) {
         if (this.b(bwk.r)) {
            $$2.a(1, $$0);
            if (!this.dV().C) {
               this.b($$0.cG(), this.ae.a(2401) + 3600);
            }

            return bvc.b;
         } else {
            return bvc.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gE() && this.bS == 0;
   }

   public boolean gE() {
      return this.ar().a(a);
   }

   private void b(@Nullable UUID $$0, int $$1) {
      this.bP = $$0;
      this.bO = $$1;
      this.ar().a(a, true);
      this.e(bwk.r);
      this.a(new bwi(bwk.e, $$1, Math.min(this.dV().an().a() - 1, 0)));
      this.dV().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.ba()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awy.EK, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(asb $$0) {
      this.a(bxn.bE, bwy.a(this, false, false), $$1 -> {
         for (bxo $$2 : this.a($$0, $$0xx -> !dgz.a($$0xx, dgy.E))) {
            byw $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gF());
         if (this.bQ != null) {
            $$1.a(this.bQ);
         }

         if (this.bR != null) {
            $$1.b(this.bR.a());
         }

         $$1.t(this.bS);
         $$1.a($$0, $$0.d_($$1.dv()), bxm.i, null);
         $$1.g($$0);
         if (this.bP != null) {
            csi $$4 = $$0.a(this.bP);
            if ($$4 instanceof asc) {
               aq.s.a((asc)$$4, this, $$1);
               $$0.a(cje.a, $$4, $$1);
            }
         }

         $$1.a(new bwi(bwk.i, 200, 0));
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

   private int gH() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         iw.a $$2 = new iw.a();

         for (int $$3 = (int)this.dA() - 4; $$3 < (int)this.dA() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dC() - 4; $$4 < (int)this.dC() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dG() - 4; $$5 < (int)this.dG() + 4 && $$1 < 14; $$5++) {
                  ebq $$6 = this.dV().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dnq.fo) || $$6.b() instanceof dnh) {
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
      return this.e_() ? (this.ae.i() - this.ae.i()) * 0.2F + 2.0F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   @Override
   public awx s() {
      return awy.EI;
   }

   @Override
   public awx e(bvt $$0) {
      return awy.EM;
   }

   @Override
   public awx j_() {
      return awy.EL;
   }

   @Override
   public awx u() {
      return awy.EN;
   }

   @Override
   protected dak gv() {
      return dak.l;
   }

   public void a(djg $$0) {
      this.bR = $$0;
   }

   public void a(chd $$0) {
      this.bQ = $$0;
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      this.a(this.gF().a($$0.J_(), crz.a($$0.u(this.dv()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(crv $$0) {
      crv $$1 = this.gF();
      if (!$$1.b().equals($$0.b())) {
         this.bR = null;
      }

      this.al.a(b, $$0);
   }

   @Override
   public crv gF() {
      return this.al.a(b);
   }

   public int gG() {
      return this.bS;
   }

   public void s(int $$0) {
      this.bS = $$0;
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.av ? c((kk<T>)$$0, this.gF().a()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.av) {
         jg<crz> $$2 = c(kl.av, $$1);
         this.a(this.gF().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
