import com.google.common.annotations.VisibleForTesting;
import java.util.UUID;
import javax.annotation.Nullable;

public class cou extends cot implements cqm {
   private static final akj<Boolean> a = akn.a(cou.class, akl.k);
   private static final akj<cql> b = akn.a(cou.class, akl.u);
   private static final int c = 3600;
   private static final int bI = 6000;
   private static final int bJ = 14;
   private static final int bK = 4;
   private int bL;
   @Nullable
   private UUID bM;
   @Nullable
   private uw bN;
   @Nullable
   private dhu bO;
   private int bP;

   public cou(bwm<? extends cou> $$0, div $$1) {
      super($$0, $$1);
      mf.x.a(this.ae).ifPresent($$0x -> this.a(this.gy().b($$0x)));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(b, cqk.gE());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("VillagerData", cql.c, this.gy());
      if (this.bO != null) {
         $$0.a("Offers", dhu.a, this.dX().a(un.a), this.bO);
      }

      if (this.bN != null) {
         $$0.a("Gossips", this.bN);
      }

      $$0.a("ConversionTime", this.gx() ? this.bL : -1);
      if (this.bM != null) {
         $$0.a("ConversionPlayer", this.bM);
      }

      $$0.a("Xp", this.bP);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(b, $$0.<cql>a("VillagerData", cql.c).orElseGet(cqk::gE));
      this.bO = $$0.<dhu>a("Offers", dhu.a, this.dX().a(un.a)).orElse(null);
      if ($$0.b("Gossips", 9)) {
         this.bN = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.b($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.bP = $$0.h("Xp");
      }
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && this.gx()) {
         int $$0 = this.gA();
         this.bL -= $$0;
         if (this.bL <= 0) {
            this.g((arq)this.dV());
         }
      }

      super.h();
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$2.a(czc.qL)) {
         if (this.b(bvj.r)) {
            $$2.a(1, $$0);
            if (!this.dV().C) {
               this.b($$0.cG(), this.ae.a(2401) + 3600);
            }

            return bub.b;
         } else {
            return bub.c;
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
      return !this.gx() && this.bP == 0;
   }

   public boolean gx() {
      return this.au().a(a);
   }

   private void b(@Nullable UUID $$0, int $$1) {
      this.bM = $$0;
      this.bL = $$1;
      this.au().a(a, true);
      this.e(bvj.r);
      this.a(new bvh(bvj.e, $$1, Math.min(this.dV().an().a() - 1, 0)));
      this.dV().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awn.EN, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(arq $$0) {
      this.a(bwm.bD, bvx.a(this, false, false), $$1 -> {
         for (bwn $$2 : this.a($$0, $$0xx -> !dfn.a($$0xx, dfm.E))) {
            bxt $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gy());
         if (this.bN != null) {
            $$1.a(this.bN);
         }

         if (this.bO != null) {
            $$1.b(this.bO.a());
         }

         $$1.t(this.bP);
         $$1.a($$0, $$0.d_($$1.dv()), bwl.i, null);
         $$1.g($$0);
         if (this.bM != null) {
            cqy $$4 = $$0.a(this.bM);
            if ($$4 instanceof arr) {
               ap.s.a((arr)$$4, this, $$1);
               $$0.a(cib.a, $$4, $$1);
            }
         }

         $$1.a(new bvh(bvj.i, 200, 0));
         if (!this.bb()) {
            $$0.a(null, 1027, this.dv(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.bL = $$0;
   }

   private int gA() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         iu.a $$2 = new iu.a();

         for (int $$3 = (int)this.dA() - 4; $$3 < (int)this.dA() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dC() - 4; $$4 < (int)this.dC() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dG() - 4; $$5 < (int)this.dG() + 4 && $$1 < 14; $$5++) {
                  dzz $$6 = this.dV().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dmc.fl) || $$6.b() instanceof dlt) {
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
   public float fe() {
      return this.n_() ? (this.ae.i() - this.ae.i()) * 0.2F + 2.0F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   @Override
   public awm u() {
      return awn.EL;
   }

   @Override
   public awm e(bus $$0) {
      return awn.EP;
   }

   @Override
   public awm l_() {
      return awn.EO;
   }

   @Override
   public awm n() {
      return awn.EQ;
   }

   @Override
   protected cyy t() {
      return cyy.k;
   }

   public void a(dhu $$0) {
      this.bO = $$0;
   }

   public void a(uw $$0) {
      this.bN = $$0;
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      this.a(this.gy().a($$0.F_(), cqp.a($$0.u(this.dv()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cql $$0) {
      cql $$1 = this.gy();
      if (!$$1.b().equals($$0.b())) {
         this.bO = null;
      }

      this.al.a(b, $$0);
   }

   @Override
   public cql gy() {
      return this.al.a(b);
   }

   public int gz() {
      return this.bP;
   }

   public void s(int $$0) {
      this.bP = $$0;
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.av ? c((ki<T>)$$0, this.gy().a()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.av) {
         je<cqp> $$2 = c(kj.av, $$1);
         this.a(this.gy().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
