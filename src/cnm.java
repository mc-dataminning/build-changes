import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnm extends cnl implements cpf {
   private static final Logger a = LogUtils.getLogger();
   private static final ajx<Boolean> b = akb.a(cnm.class, ajz.k);
   private static final ajx<cpe> c = akb.a(cnm.class, ajz.u);
   private static final int bI = 3600;
   private static final int bJ = 6000;
   private static final int bK = 14;
   private static final int bL = 4;
   private int bM;
   @Nullable
   private UUID bN;
   @Nullable
   private un bO;
   @Nullable
   private dfy bP;
   private int bQ;

   public cnm(bvi<? extends cnm> $$0, dgz $$1) {
      super($$0, $$1);
      mb.x.a(this.ae).ifPresent($$0x -> this.a(this.gA().a((cpg)$$0x.a())));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(c, new cpe(cpi.c, cpg.b, 1));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      cpe.c.encodeStart(ue.a, this.gA()).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.bP != null) {
         $$0.a("Offers", (un)dfy.a.encodeStart(this.dW().a(ue.a), this.bP).getOrThrow());
      }

      if (this.bO != null) {
         $$0.a("Gossips", this.bO);
      }

      $$0.a("ConversionTime", this.gz() ? this.bM : -1);
      if (this.bN != null) {
         $$0.a("ConversionPlayer", this.bN);
      }

      $$0.a("Xp", this.bQ);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cpe> $$1 = cpe.c.parse(new Dynamic(ue.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(a::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dfy.a.parse(this.dW().a(ue.a), $$0.c("Offers")).resultOrPartial(af.a("Failed to load offers: ", a::warn)).ifPresent($$0x -> this.bP = $$0x);
      }

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
      if (!this.dU().C && this.bJ() && this.gz()) {
         int $$0 = this.gC();
         this.bM -= $$0;
         if (this.bM <= 0) {
            this.g((ard)this.dU());
         }
      }

      super.h();
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(cxl.qH)) {
         if (this.b(bug.r)) {
            $$2.a(1, $$0);
            if (!this.dU().C) {
               this.b($$0.cF(), this.ae.a(2401) + 3600);
            }

            return bsy.b;
         } else {
            return bsy.c;
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
      return !this.gz() && this.bQ == 0;
   }

   public boolean gz() {
      return this.au().a(b);
   }

   private void b(@Nullable UUID $$0, int $$1) {
      this.bN = $$0;
      this.bM = $$1;
      this.au().a(b, true);
      this.e(bug.r);
      this.a(new bue(bug.e, $$1, Math.min(this.dU().an().a() - 1, 0)));
      this.dU().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bb()) {
            this.dU().a(this.dz(), this.dD(), this.dF(), awa.EK, this.dl(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(ard $$0) {
      this.a(bvi.bC, buu.a(this, false, false), $$1 -> {
         for (bvj $$2 : this.a($$0, $$0xx -> !ddt.a($$0xx, dds.E))) {
            bwq $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gA());
         if (this.bO != null) {
            $$1.a(this.bO);
         }

         if (this.bP != null) {
            $$1.b(this.bP.a());
         }

         $$1.t(this.bQ);
         $$1.a($$0, $$0.d_($$1.du()), bvh.i, null);
         $$1.g($$0);
         if (this.bN != null) {
            cpr $$4 = $$0.a(this.bN);
            if ($$4 instanceof are) {
               ap.s.a((are)$$4, this, $$1);
               $$0.a(cgz.a, $$4, $$1);
            }
         }

         $$1.a(new bue(bug.i, 200, 0));
         if (!this.bb()) {
            $$0.a(null, 1027, this.du(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.bM = $$0;
   }

   private int gC() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         ji.a $$2 = new ji.a();

         for (int $$3 = (int)this.dz() - 4; $$3 < (int)this.dz() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dB() - 4; $$4 < (int)this.dB() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dF() - 4; $$5 < (int)this.dF() + 4 && $$1 < 14; $$5++) {
                  dxq $$6 = this.dU().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dkg.fk) || $$6.b() instanceof djx) {
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
   public float fh() {
      return this.n_() ? (this.ae.i() - this.ae.i()) * 0.2F + 2.0F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   @Override
   public avz u() {
      return awa.EI;
   }

   @Override
   public avz e(btp $$0) {
      return awa.EM;
   }

   @Override
   public avz l_() {
      return awa.EL;
   }

   @Override
   public avz n() {
      return awa.EN;
   }

   @Override
   protected cxh t() {
      return cxh.k;
   }

   public void a(dfy $$0) {
      this.bP = $$0;
   }

   public void a(un $$0) {
      this.bO = $$0;
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      this.a(this.gA().a(cpi.a($$0.t(this.du()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpe $$0) {
      cpe $$1 = this.gA();
      if ($$1.b() != $$0.b()) {
         this.bP = null;
      }

      this.al.a(c, $$0);
   }

   @Override
   public cpe gA() {
      return this.al.a(c);
   }

   public int gB() {
      return this.bQ;
   }

   public void s(int $$0) {
      this.bQ = $$0;
   }
}
