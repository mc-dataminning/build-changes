import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmg extends cmf implements cnv {
   private static final Logger b = LogUtils.getLogger();
   private static final akk<Boolean> c = ako.a(cmg.class, akm.k);
   private static final akk<cnu> d = ako.a(cmg.class, akm.u);
   private static final int cb = 3600;
   private static final int cc = 6000;
   private static final int cd = 14;
   private static final int ce = 4;
   private int cf;
   @Nullable
   private UUID cg;
   @Nullable
   private vg ch;
   @Nullable
   private ddt ci;
   private int cj;

   public cmg(bug<? extends cmg> $$0, dev $$1) {
      super($$0, $$1);
      lx.x.a(this.af).ifPresent($$0x -> this.a(this.gF().a((cnw)$$0x.a())));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cnu(cny.c, cnw.b, 1));
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      cnu.c.encodeStart(ux.a, this.gF()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", (vg)ddt.a.encodeStart(this.dZ().a(ux.a), this.ci).getOrThrow());
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gE() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cnu> $$1 = cnu.c.parse(new Dynamic(ux.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         ddt.a.parse(this.dZ().a(ux.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ci = $$0x);
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
      if (!this.dX().C && this.bM() && this.gE()) {
         int $$0 = this.gH();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.a((arm)this.dX());
         }
      }

      super.l();
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(cwb.qb)) {
         if (this.b(btg.r)) {
            $$2.a(1, $$0);
            if (!this.dX().C) {
               this.a($$0.cH(), this.af.a(2401) + 3600);
            }

            return bry.b;
         } else {
            return bry.c;
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
      return !this.gE() && this.cj == 0;
   }

   public boolean gE() {
      return this.av().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.av().a(c, true);
      this.e(btg.r);
      this.a(new bte(btg.e, $$1, Math.min(this.dX().am().a() - 1, 0)));
      this.dX().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bc()) {
            this.dX().a(this.dC(), this.dG(), this.dI(), awk.DQ, this.dn(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void a(arm $$0) {
      this.a(bug.bj, btu.a(this, false, true), $$1 -> {
         for (buh $$2 : this.c($$0xx -> !dbo.a($$0xx, dbn.E))) {
            bvn $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gF());
         if (this.ch != null) {
            $$1.a(this.ch);
         }

         if (this.ci != null) {
            $$1.b(this.ci.a());
         }

         $$1.u(this.cj);
         $$1.a($$0, $$0.d_($$1.dx()), buf.i, null);
         $$1.a($$0);
         if (this.cg != null) {
            coh $$4 = $$0.b(this.cg);
            if ($$4 instanceof arn) {
               an.s.a((arn)$$4, this, $$1);
               $$0.a(cfw.a, $$4, $$1);
            }
         }

         $$1.a(new bte(btg.i, 200, 0));
         if (!this.bc()) {
            $$0.a(null, 1027, this.dx(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void s(int $$0) {
      this.cf = $$0;
   }

   private int gH() {
      int $$0 = 1;
      if (this.af.i() < 0.01F) {
         int $$1 = 0;
         jg.a $$2 = new jg.a();

         for (int $$3 = (int)this.dC() - 4; $$3 < (int)this.dC() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dE() - 4; $$4 < (int)this.dE() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dI() - 4; $$5 < (int)this.dI() + 4 && $$1 < 14; $$5++) {
                  dvd $$6 = this.dX().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dia.eW) || $$6.b() instanceof dhr) {
                     if (this.af.i() < 0.3F) {
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
   public float fj() {
      return this.p_() ? (this.af.i() - this.af.i()) * 0.2F + 2.0F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   @Override
   public awj w() {
      return awk.DO;
   }

   @Override
   public awj d(bsp $$0) {
      return awk.DS;
   }

   @Override
   public awj o_() {
      return awk.DR;
   }

   @Override
   public awj y() {
      return awk.DT;
   }

   @Override
   protected cvx gv() {
      return cvx.k;
   }

   public void a(ddt $$0) {
      this.ci = $$0;
   }

   public void a(vg $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      this.a(this.gF().a(cny.a($$0.t(this.dx()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cnu $$0) {
      cnu $$1 = this.gF();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.am.a(d, $$0);
   }

   @Override
   public cnu gF() {
      return this.am.a(d);
   }

   public int gG() {
      return this.cj;
   }

   public void t(int $$0) {
      this.cj = $$0;
   }
}
