import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckv extends cku implements cmk {
   private static final Logger b = LogUtils.getLogger();
   private static final ajv<Boolean> c = ajz.a(ckv.class, ajx.k);
   private static final ajv<cmj> d = ajz.a(ckv.class, ajx.u);
   private static final int cd = 3600;
   private static final int ce = 6000;
   private static final int cf = 14;
   private static final int cg = 4;
   private int ch;
   @Nullable
   private UUID ci;
   @Nullable
   private ux cj;
   @Nullable
   private dbt ck;
   private int cl;

   public ckv(bsw<? extends ckv> $$0, dcu $$1) {
      super($$0, $$1);
      lt.x.a(this.ah).ifPresent($$0x -> this.a(this.gx().a((cml)$$0x.a())));
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cmj(cmn.c, cml.b, 1));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cmj.c.encodeStart(uo.a, this.gx()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ck != null) {
         $$0.a("Offers", (ux)dbt.a.encodeStart(this.dS().a(uo.a), this.ck).getOrThrow());
      }

      if (this.cj != null) {
         $$0.a("Gossips", this.cj);
      }

      $$0.a("ConversionTime", this.gw() ? this.ch : -1);
      if (this.ci != null) {
         $$0.a("ConversionPlayer", this.ci);
      }

      $$0.a("Xp", this.cl);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cmj> $$1 = cmj.c.parse(new Dynamic(uo.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dbt.a.parse(this.dS().a(uo.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ck = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.cj = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cl = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dQ().B && this.bE() && this.gw()) {
         int $$0 = this.gz();
         this.ch -= $$0;
         if (this.ch <= 0) {
            this.a((aqt)this.dQ());
         }
      }

      super.l();
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.qa)) {
         if (this.b(bsa.r)) {
            $$2.a(1, $$0);
            if (!this.dQ().B) {
               this.a($$0.cA(), this.ah.a(2401) + 3600);
            }

            return bqq.a;
         } else {
            return bqq.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean go() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gw() && this.cl == 0;
   }

   public boolean gw() {
      return this.ar().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.ci = $$0;
      this.ch = $$1;
      this.ar().a(c, true);
      this.e(bsa.r);
      this.b(new bry(bsa.e, $$1, Math.min(this.dQ().al().a() - 1, 0)));
      this.dQ().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aX()) {
            this.dQ().a(this.dv(), this.dz(), this.dB(), avo.DM, this.df(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void a(aqt $$0) {
      cmi $$1 = this.a(bsw.bj, false);

      for (bsx $$2 : bsx.values()) {
         cuo $$3 = this.a($$2);
         if (!$$3.e()) {
            if (dac.a($$3, dab.E)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gx());
      if (this.cj != null) {
         $$1.a(this.cj);
      }

      if (this.ck != null) {
         $$1.b(this.ck.a());
      }

      $$1.u(this.cl);
      $$1.a($$0, $$0.d_($$1.dq()), btp.i, null);
      $$1.a($$0);
      if (this.ci != null) {
         cmv $$5 = $$0.b(this.ci);
         if ($$5 instanceof aqu) {
            an.s.a((aqu)$$5, this, $$1);
            $$0.a(cen.a, $$5, $$1);
         }
      }

      $$1.b(new bry(bsa.i, 200, 0));
      if (!this.aX()) {
         $$0.a(null, 1027, this.dq(), 0);
      }
   }

   private int gz() {
      int $$0 = 1;
      if (this.ah.i() < 0.01F) {
         int $$1 = 0;
         jd.a $$2 = new jd.a();

         for (int $$3 = (int)this.dv() - 4; $$3 < (int)this.dv() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dx() - 4; $$4 < (int)this.dx() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dB() - 4; $$5 < (int)this.dB() + 4 && $$1 < 14; $$5++) {
                  dta $$6 = this.dQ().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dfy.eW) || $$6.b() instanceof dfp) {
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
   public float fc() {
      return this.o_() ? (this.ah.i() - this.ah.i()) * 0.2F + 2.0F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   @Override
   public avn v() {
      return avo.DK;
   }

   @Override
   public avn d(brj $$0) {
      return avo.DO;
   }

   @Override
   public avn n_() {
      return avo.DN;
   }

   @Override
   public avn gm() {
      return avo.DP;
   }

   @Override
   protected cuo gn() {
      return cuo.l;
   }

   public void a(dbt $$0) {
      this.ck = $$0;
   }

   public void a(ux $$0) {
      this.cj = $$0;
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      this.a(this.gx().a(cmn.a($$0.t(this.dq()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cmj $$0) {
      cmj $$1 = this.gx();
      if ($$1.b() != $$0.b()) {
         this.ck = null;
      }

      this.ao.a(d, $$0);
   }

   @Override
   public cmj gx() {
      return this.ao.a(d);
   }

   public int gy() {
      return this.cl;
   }

   @Override
   public void b(int $$0) {
      this.cl = $$0;
   }
}
