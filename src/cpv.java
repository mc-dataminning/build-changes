import com.google.common.annotations.VisibleForTesting;
import java.util.UUID;
import javax.annotation.Nullable;

public class cpv extends cpu implements crn {
   private static final akn<Boolean> a = akr.a(cpv.class, akp.k);
   private static final akn<crm> b = akr.a(cpv.class, akp.u);
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
   private cgu bQ;
   @Nullable
   private diw bR;
   private int bS = 0;

   public cpv(bxe<? extends cpv> $$0, djz $$1) {
      super($$0, $$1);
      mh.x.a(this.ae).ifPresent($$0x -> this.a(this.gC().b($$0x)));
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(b, crl.gI());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("VillagerData", crm.c, this.gC());
      $$0.b("Offers", diw.a, this.dX().a(uo.a), this.bR);
      $$0.b("Gossips", cgu.a, this.bQ);
      $$0.a("ConversionTime", this.gB() ? this.bO : -1);
      $$0.b("ConversionPlayer", ka.a, this.bP);
      $$0.a("Xp", this.bS);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.al.a(b, $$0.<crm>a("VillagerData", crm.c).orElseGet(crl::gI));
      this.bR = $$0.<diw>a("Offers", diw.a, this.dX().a(uo.a)).orElse(null);
      this.bQ = $$0.<cgu>a("Gossips", cgu.a).orElse(null);
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
   public void h() {
      if (!this.dV().C && this.bJ() && this.gB()) {
         int $$0 = this.gE();
         this.bO -= $$0;
         if (this.bO <= 0) {
            this.g((aru)this.dV());
         }
      }

      super.h();
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(dae.qO)) {
         if (this.b(bwb.r)) {
            $$2.a(1, $$0);
            if (!this.dV().C) {
               this.b($$0.cG(), this.ae.a(2401) + 3600);
            }

            return but.b;
         } else {
            return but.c;
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
      this.e(bwb.r);
      this.a(new bvz(bwb.e, $$1, Math.min(this.dV().an().a() - 1, 0)));
      this.dV().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.ba()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awr.EK, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(aru $$0) {
      this.a(bxe.bE, bwp.a(this, false, false), $$1 -> {
         for (bxf $$2 : this.a($$0, $$0xx -> !dgp.a($$0xx, dgo.E))) {
            byn $$3 = $$1.a_($$2.b() + 300);
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
         $$1.a($$0, $$0.d_($$1.dv()), bxd.i, null);
         $$1.g($$0);
         if (this.bP != null) {
            crz $$4 = $$0.a(this.bP);
            if ($$4 instanceof arv) {
               aq.s.a((arv)$$4, this, $$1);
               $$0.a(civ.a, $$4, $$1);
            }
         }

         $$1.a(new bvz(bwb.i, 200, 0));
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
         iw.a $$2 = new iw.a();

         for (int $$3 = (int)this.dA() - 4; $$3 < (int)this.dA() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dC() - 4; $$4 < (int)this.dC() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dG() - 4; $$5 < (int)this.dG() + 4 && $$1 < 14; $$5++) {
                  ebg $$6 = this.dV().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dng.fo) || $$6.b() instanceof dmx) {
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
   public awq u() {
      return awr.EI;
   }

   @Override
   public awq e(bvk $$0) {
      return awr.EM;
   }

   @Override
   public awq l_() {
      return awr.EL;
   }

   @Override
   public awq n() {
      return awr.EN;
   }

   @Override
   protected daa t() {
      return daa.k;
   }

   public void a(diw $$0) {
      this.bR = $$0;
   }

   public void a(cgu $$0) {
      this.bQ = $$0;
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      this.a(this.gC().a($$0.J_(), crq.a($$0.u(this.dv()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(crm $$0) {
      crm $$1 = this.gC();
      if (!$$1.b().equals($$0.b())) {
         this.bR = null;
      }

      this.al.a(b, $$0);
   }

   @Override
   public crm gC() {
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
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.av ? c((kk<T>)$$0, this.gC().a()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.av) {
         jg<crq> $$2 = c(kl.av, $$1);
         this.a(this.gC().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
