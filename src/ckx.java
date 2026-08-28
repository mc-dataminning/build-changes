import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckx extends ckw implements cmm {
   private static final Logger b = LogUtils.getLogger();
   private static final akk<Boolean> c = ako.a(ckx.class, akm.k);
   private static final akk<cml> d = ako.a(ckx.class, akm.u);
   private static final int cb = 3600;
   private static final int cc = 6000;
   private static final int cd = 14;
   private static final int ce = 4;
   private int cf;
   @Nullable
   private UUID cg;
   @Nullable
   private vp ch;
   @Nullable
   private dax ci;
   private int cj;

   public ckx(bta<? extends ckx> $$0, dby $$1) {
      super($$0, $$1);
      lp.z.a(this.ah).ifPresent($$0x -> this.a(this.gB().a((cmn)$$0x.a())));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cml(cmp.c, cmn.b, 1));
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      cml.c.encodeStart(vg.a, this.gB()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", (vp)dax.a.encodeStart(this.dR().a(vg.a), this.ci).getOrThrow());
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gA() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cml> $$1 = cml.c.parse(new Dynamic(vg.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dax.a.parse(this.dR().a(vg.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ci = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.ch = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cj = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && this.gA()) {
         int $$0 = this.gD();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.c((arf)this.dP());
         }
      }

      super.l();
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if ($$2.a(cus.qa)) {
         if (this.b(bse.r)) {
            $$2.a(1, $$0);
            if (!this.dP().B) {
               this.a($$0.cz(), this.ah.a(2401) + 3600);
            }

            return bqu.a;
         } else {
            return bqu.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gA() && this.cj == 0;
   }

   public boolean gA() {
      return this.ap().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.ap().a(c, true);
      this.e(bse.r);
      this.b(new bsc(bse.e, $$1, Math.min(this.dP().al().a() - 1, 0)));
      this.dP().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aW()) {
            this.dP().a(this.du(), this.dy(), this.dA(), awa.DI, this.de(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(arf $$0) {
      cmk $$1 = this.a(bta.bj, false);

      for (btb $$2 : btb.values()) {
         cup $$3 = this.a($$2);
         if (!$$3.e()) {
            if (dab.f($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.g($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gB());
      if (this.ch != null) {
         $$1.a(this.ch);
      }

      if (this.ci != null) {
         $$1.b(this.ci.a());
      }

      $$1.v(this.cj);
      $$1.a($$0, $$0.d_($$1.dp()), btt.i, null);
      $$1.c($$0);
      if (this.cg != null) {
         cmx $$5 = $$0.b(this.cg);
         if ($$5 instanceof arg) {
            am.s.a((arg)$$5, this, $$1);
            $$0.a(ceq.a, $$5, $$1);
         }
      }

      $$1.b(new bsc(bse.i, 200, 0));
      if (!this.aW()) {
         $$0.a(null, 1027, this.dp(), 0);
      }
   }

   private int gD() {
      int $$0 = 1;
      if (this.ah.i() < 0.01F) {
         int $$1 = 0;
         iz.a $$2 = new iz.a();

         for (int $$3 = (int)this.du() - 4; $$3 < (int)this.du() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dw() - 4; $$4 < (int)this.dw() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dA() - 4; $$5 < (int)this.dA() + 4 && $$1 < 14; $$5++) {
                  dsc $$6 = this.dP().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dfb.eW) || $$6.b() instanceof des) {
                     if (this.ah.i() < 0.3F) {
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
      return this.p_() ? (this.ah.i() - this.ah.i()) * 0.2F + 2.0F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   @Override
   public avz v() {
      return awa.DG;
   }

   @Override
   public avz d(brn $$0) {
      return awa.DK;
   }

   @Override
   public avz o_() {
      return awa.DJ;
   }

   @Override
   public avz gq() {
      return awa.DL;
   }

   @Override
   protected cup gr() {
      return cup.l;
   }

   public void a(dax $$0) {
      this.ci = $$0;
   }

   public void a(vp $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      this.a(this.gB().a(cmp.a($$0.t(this.dp()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cml $$0) {
      cml $$1 = this.gB();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.ao.a(d, $$0);
   }

   @Override
   public cml gB() {
      return this.ao.a(d);
   }

   public int gC() {
      return this.cj;
   }

   @Override
   public void b(int $$0) {
      this.cj = $$0;
   }
}
