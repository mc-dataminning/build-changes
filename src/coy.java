import com.google.common.annotations.VisibleForTesting;
import java.util.UUID;
import javax.annotation.Nullable;

public class coy extends cox implements cqq {
   private static final akj<Boolean> a = akn.a(coy.class, akl.k);
   private static final akj<cqp> b = akn.a(coy.class, akl.u);
   private static final int c = 3600;
   private static final int bJ = 6000;
   private static final int bK = 14;
   private static final int bL = 4;
   private int bM;
   @Nullable
   private UUID bN;
   @Nullable
   private uw bO;
   @Nullable
   private dhz bP;
   private int bQ;

   public coy(bwo<? extends coy> $$0, dja $$1) {
      super($$0, $$1);
      mf.x.a(this.ae).ifPresent($$0x -> this.a(this.gz().b($$0x)));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(b, cqo.gF());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("VillagerData", cqp.c, this.gz());
      if (this.bP != null) {
         $$0.a("Offers", dhz.a, this.dX().a(un.a), this.bP);
      }

      if (this.bO != null) {
         $$0.a("Gossips", this.bO);
      }

      $$0.a("ConversionTime", this.gy() ? this.bM : -1);
      if (this.bN != null) {
         $$0.a("ConversionPlayer", this.bN);
      }

      $$0.a("Xp", this.bQ);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(b, $$0.<cqp>a("VillagerData", cqp.c).orElseGet(cqo::gF));
      this.bP = $$0.<dhz>a("Offers", dhz.a, this.dX().a(un.a)).orElse(null);
      if ($$0.b("Gossips", 9)) {
         this.bO = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.b($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.bQ = $$0.h("Xp");
      }
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && this.gy()) {
         int $$0 = this.gB();
         this.bM -= $$0;
         if (this.bM <= 0) {
            this.g((arq)this.dV());
         }
      }

      super.h();
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(czh.qO)) {
         if (this.b(bvl.r)) {
            $$2.a(1, $$0);
            if (!this.dV().C) {
               this.b($$0.cG(), this.ae.a(2401) + 3600);
            }

            return bud.b;
         } else {
            return bud.c;
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
      return !this.gy() && this.bQ == 0;
   }

   public boolean gy() {
      return this.au().a(a);
   }

   private void b(@Nullable UUID $$0, int $$1) {
      this.bN = $$0;
      this.bM = $$1;
      this.au().a(a, true);
      this.e(bvl.r);
      this.a(new bvj(bvl.e, $$1, Math.min(this.dV().an().a() - 1, 0)));
      this.dV().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awn.EQ, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(arq $$0) {
      this.a(bwo.bD, bvz.a(this, false, false), $$1 -> {
         for (bwp $$2 : this.a($$0, $$0xx -> !dfs.a($$0xx, dfr.E))) {
            bxv $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gz());
         if (this.bO != null) {
            $$1.a(this.bO);
         }

         if (this.bP != null) {
            $$1.b(this.bP.a());
         }

         $$1.t(this.bQ);
         $$1.a($$0, $$0.d_($$1.dv()), bwn.i, null);
         $$1.g($$0);
         if (this.bN != null) {
            crc $$4 = $$0.a(this.bN);
            if ($$4 instanceof arr) {
               ap.s.a((arr)$$4, this, $$1);
               $$0.a(cid.a, $$4, $$1);
            }
         }

         $$1.a(new bvj(bvl.i, 200, 0));
         if (!this.bb()) {
            $$0.a(null, 1027, this.dv(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.bM = $$0;
   }

   private int gB() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         iu.a $$2 = new iu.a();

         for (int $$3 = (int)this.dA() - 4; $$3 < (int)this.dA() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dC() - 4; $$4 < (int)this.dC() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dG() - 4; $$5 < (int)this.dG() + 4 && $$1 < 14; $$5++) {
                  eah $$6 = this.dV().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dmh.fo) || $$6.b() instanceof dly) {
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
   public awm u() {
      return awn.EO;
   }

   @Override
   public awm e(buu $$0) {
      return awn.ES;
   }

   @Override
   public awm l_() {
      return awn.ER;
   }

   @Override
   public awm n() {
      return awn.ET;
   }

   @Override
   protected czd t() {
      return czd.k;
   }

   public void a(dhz $$0) {
      this.bP = $$0;
   }

   public void a(uw $$0) {
      this.bO = $$0;
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      this.a(this.gz().a($$0.F_(), cqt.a($$0.u(this.dv()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cqp $$0) {
      cqp $$1 = this.gz();
      if (!$$1.b().equals($$0.b())) {
         this.bP = null;
      }

      this.al.a(b, $$0);
   }

   @Override
   public cqp gz() {
      return this.al.a(b);
   }

   public int gA() {
      return this.bQ;
   }

   public void s(int $$0) {
      this.bQ = $$0;
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.av ? c((ki<T>)$$0, this.gz().a()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.av) {
         je<cqt> $$2 = c(kj.av, $$1);
         this.a(this.gz().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
