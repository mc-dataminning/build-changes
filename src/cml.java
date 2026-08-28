import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cml extends cmk implements coa {
   private static final Logger b = LogUtils.getLogger();
   private static final akl<Boolean> c = akp.a(cml.class, akn.k);
   private static final akl<cnz> d = akp.a(cml.class, akn.u);
   private static final int cb = 3600;
   private static final int cc = 6000;
   private static final int cd = 14;
   private static final int ce = 4;
   private int cf;
   @Nullable
   private UUID cg;
   @Nullable
   private vh ch;
   @Nullable
   private ddz ci;
   private int cj;

   public cml(bul<? extends cml> $$0, dfb $$1) {
      super($$0, $$1);
      ly.x.a(this.af).ifPresent($$0x -> this.a(this.gE().a((cob)$$0x.a())));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cnz(cod.c, cob.b, 1));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      cnz.c.encodeStart(uy.a, this.gE()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", (vh)ddz.a.encodeStart(this.dZ().a(uy.a), this.ci).getOrThrow());
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gD() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cnz> $$1 = cnz.c.parse(new Dynamic(uy.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         ddz.a.parse(this.dZ().a(uy.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ci = $$0x);
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
      if (!this.dX().C && this.bM() && this.gD()) {
         int $$0 = this.gG();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.a((arn)this.dX());
         }
      }

      super.l();
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(cwf.qb)) {
         if (this.b(btl.r)) {
            $$2.a(1, $$0);
            if (!this.dX().C) {
               this.a($$0.cH(), this.af.a(2401) + 3600);
            }

            return bsd.b;
         } else {
            return bsd.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gD() && this.cj == 0;
   }

   public boolean gD() {
      return this.aw().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.aw().a(c, true);
      this.e(btl.r);
      this.a(new btj(btl.e, $$1, Math.min(this.dX().ak().a() - 1, 0)));
      this.dX().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bc()) {
            this.dX().a(this.dC(), this.dG(), this.dI(), awl.DQ, this.dn(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void a(arn $$0) {
      this.a(bul.bj, btz.a(this, false, true), $$1 -> {
         for (bum $$2 : this.c($$0xx -> !dbu.a($$0xx, dbt.E))) {
            bvs $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gE());
         if (this.ch != null) {
            $$1.a(this.ch);
         }

         if (this.ci != null) {
            $$1.b(this.ci.a());
         }

         $$1.u(this.cj);
         $$1.a($$0, $$0.d_($$1.dx()), buk.i, null);
         $$1.a($$0);
         if (this.cg != null) {
            com $$4 = $$0.b(this.cg);
            if ($$4 instanceof aro) {
               ao.s.a((aro)$$4, this, $$1);
               $$0.a(cgb.a, $$4, $$1);
            }
         }

         $$1.a(new btj(btl.i, 200, 0));
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

   private int gG() {
      int $$0 = 1;
      if (this.af.i() < 0.01F) {
         int $$1 = 0;
         jh.a $$2 = new jh.a();

         for (int $$3 = (int)this.dC() - 4; $$3 < (int)this.dC() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dE() - 4; $$4 < (int)this.dE() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dI() - 4; $$5 < (int)this.dI() + 4 && $$1 < 14; $$5++) {
                  dvj $$6 = this.dX().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dig.eW) || $$6.b() instanceof dhx) {
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
   public awk w() {
      return awl.DO;
   }

   @Override
   public awk d(bsu $$0) {
      return awl.DS;
   }

   @Override
   public awk o_() {
      return awl.DR;
   }

   @Override
   public awk y() {
      return awl.DT;
   }

   @Override
   protected cwb gu() {
      return cwb.k;
   }

   public void a(ddz $$0) {
      this.ci = $$0;
   }

   public void a(vh $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      this.a(this.gE().a(cod.a($$0.t(this.dx()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cnz $$0) {
      cnz $$1 = this.gE();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.am.a(d, $$0);
   }

   @Override
   public cnz gE() {
      return this.am.a(d);
   }

   public int gF() {
      return this.cj;
   }

   public void t(int $$0) {
      this.cj = $$0;
   }
}
