import com.google.common.annotations.VisibleForTesting;
import java.util.UUID;
import javax.annotation.Nullable;

public class cpf extends cpe implements cqx {
   private static final akj<Boolean> a = akn.a(cpf.class, akl.k);
   private static final akj<cqw> b = akn.a(cpf.class, akl.u);
   private static final int c = 3600;
   private static final int bJ = 6000;
   private static final int bK = 14;
   private static final int bL = 4;
   private int bM;
   @Nullable
   private UUID bN;
   @Nullable
   private cgh bO;
   @Nullable
   private dig bP;
   private int bQ;

   public cpf(bwr<? extends cpf> $$0, djh $$1) {
      super($$0, $$1);
      mg.x.a(this.ae).ifPresent($$0x -> this.a(this.gB().b($$0x)));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(b, cqv.gH());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("VillagerData", cqw.c, this.gB());
      $$0.b("Offers", dig.a, this.dW().a(un.a), this.bP);
      $$0.b("Gossips", cgh.a, this.bO);
      $$0.a("ConversionTime", this.gA() ? this.bM : -1);
      $$0.b("ConversionPlayer", jz.a, this.bN);
      $$0.a("Xp", this.bQ);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(b, $$0.<cqw>a("VillagerData", cqw.c).orElseGet(cqv::gH));
      this.bP = $$0.<dig>a("Offers", dig.a, this.dW().a(un.a)).orElse(null);
      this.bO = $$0.<cgh>a("Gossips", cgh.a).orElse(null);
      if ($$0.b("ConversionTime", 99) && $$0.f("ConversionTime") > -1) {
         UUID $$1 = $$0.<UUID>a("ConversionPlayer", jz.a).orElse(null);
         this.b($$1, $$0.f("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.bQ = $$0.f("Xp");
      }
   }

   @Override
   public void h() {
      if (!this.dU().C && this.bI() && this.gA()) {
         int $$0 = this.gD();
         this.bM -= $$0;
         if (this.bM <= 0) {
            this.g((arq)this.dU());
         }
      }

      super.h();
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if ($$2.a(czo.qO)) {
         if (this.b(bvo.r)) {
            $$2.a(1, $$0);
            if (!this.dU().C) {
               this.b($$0.cF(), this.ae.a(2401) + 3600);
            }

            return bug.b;
         } else {
            return bug.c;
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
      return !this.gA() && this.bQ == 0;
   }

   public boolean gA() {
      return this.ar().a(a);
   }

   private void b(@Nullable UUID $$0, int $$1) {
      this.bN = $$0;
      this.bM = $$1;
      this.ar().a(a, true);
      this.e(bvo.r);
      this.a(new bvm(bvo.e, $$1, Math.min(this.dU().an().a() - 1, 0)));
      this.dU().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aZ()) {
            this.dU().a(this.dz(), this.dD(), this.dF(), awn.EQ, this.dl(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(arq $$0) {
      this.a(bwr.bD, bwc.a(this, false, false), $$1 -> {
         for (bws $$2 : this.a($$0, $$0xx -> !dfz.a($$0xx, dfy.E))) {
            bya $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gB());
         if (this.bO != null) {
            $$1.a(this.bO);
         }

         if (this.bP != null) {
            $$1.b(this.bP.a());
         }

         $$1.t(this.bQ);
         $$1.a($$0, $$0.d_($$1.du()), bwq.i, null);
         $$1.g($$0);
         if (this.bN != null) {
            crj $$4 = $$0.a(this.bN);
            if ($$4 instanceof arr) {
               aq.s.a((arr)$$4, this, $$1);
               $$0.a(cii.a, $$4, $$1);
            }
         }

         $$1.a(new bvm(bvo.i, 200, 0));
         if (!this.aZ()) {
            $$0.a(null, 1027, this.du(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.bM = $$0;
   }

   private int gD() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         iv.a $$2 = new iv.a();

         for (int $$3 = (int)this.dz() - 4; $$3 < (int)this.dz() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dB() - 4; $$4 < (int)this.dB() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dF() - 4; $$5 < (int)this.dF() + 4 && $$1 < 14; $$5++) {
                  eao $$6 = this.dU().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dmo.fo) || $$6.b() instanceof dmf) {
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
      return awn.EO;
   }

   @Override
   public awm e(bux $$0) {
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
   protected czk t() {
      return czk.k;
   }

   public void a(dig $$0) {
      this.bP = $$0;
   }

   public void a(cgh $$0) {
      this.bO = $$0;
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.a(this.gB().a($$0.F_(), cra.a($$0.u(this.du()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cqw $$0) {
      cqw $$1 = this.gB();
      if (!$$1.b().equals($$0.b())) {
         this.bP = null;
      }

      this.al.a(b, $$0);
   }

   @Override
   public cqw gB() {
      return this.al.a(b);
   }

   public int gC() {
      return this.bQ;
   }

   public void s(int $$0) {
      this.bQ = $$0;
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.av ? c((kj<T>)$$0, this.gB().a()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.av) {
         jf<cra> $$2 = c(kk.av, $$1);
         this.a(this.gB().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
