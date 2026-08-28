import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clx extends clw implements cnm {
   private static final Logger b = LogUtils.getLogger();
   private static final akh<Boolean> c = akl.a(clx.class, akj.k);
   private static final akh<cnl> d = akl.a(clx.class, akj.u);
   private static final int cb = 3600;
   private static final int cc = 6000;
   private static final int cd = 14;
   private static final int ce = 4;
   private int cf;
   @Nullable
   private UUID cg;
   @Nullable
   private vd ch;
   @Nullable
   private ddh ci;
   private int cj;

   public clx(bty<? extends clx> $$0, dej $$1) {
      super($$0, $$1);
      lv.x.a(this.af).ifPresent($$0x -> this.a(this.gy().a((cnn)$$0x.a())));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cnl(cnp.c, cnn.b, 1));
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      cnl.c.encodeStart(uu.a, this.gy()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", (vd)ddh.a.encodeStart(this.dU().a(uu.a), this.ci).getOrThrow());
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gx() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cnl> $$1 = cnl.c.parse(new Dynamic(uu.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         ddh.a.parse(this.dU().a(uu.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ci = $$0x);
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
      if (!this.dS().B && this.bI() && this.gx()) {
         int $$0 = this.gA();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.a((arj)this.dS());
         }
      }

      super.l();
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(cvw.qb)) {
         if (this.b(bta.r)) {
            $$2.a(1, $$0);
            if (!this.dS().B) {
               this.a($$0.cD(), this.af.a(2401) + 3600);
            }

            return brs.b;
         } else {
            return brs.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gx() && this.cj == 0;
   }

   public boolean gx() {
      return this.at().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.at().a(c, true);
      this.e(bta.r);
      this.a(new bsy(bta.e, $$1, Math.min(this.dS().am().a() - 1, 0)));
      this.dS().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.ba()) {
            this.dS().a(this.dx(), this.dB(), this.dD(), awg.DS, this.di(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void a(arj $$0) {
      cnk $$1 = this.a(bty.bj, false);
      if ($$1 != null) {
         for (btz $$2 : this.c($$0x -> !dbp.a($$0x, dbo.E))) {
            bve $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gy());
         if (this.ch != null) {
            $$1.a(this.ch);
         }

         if (this.ci != null) {
            $$1.b(this.ci.a());
         }

         $$1.u(this.cj);
         $$1.a($$0, $$0.d_($$1.ds()), btx.i, null);
         $$1.a($$0);
         if (this.cg != null) {
            cnx $$4 = $$0.b(this.cg);
            if ($$4 instanceof ark) {
               an.s.a((ark)$$4, this, $$1);
               $$0.a(cfn.a, $$4, $$1);
            }
         }

         $$1.a(new bsy(bta.i, 200, 0));
         if (!this.ba()) {
            $$0.a(null, 1027, this.ds(), 0);
         }
      }
   }

   private int gA() {
      int $$0 = 1;
      if (this.af.i() < 0.01F) {
         int $$1 = 0;
         jf.a $$2 = new jf.a();

         for (int $$3 = (int)this.dx() - 4; $$3 < (int)this.dx() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dz() - 4; $$4 < (int)this.dz() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dD() - 4; $$5 < (int)this.dD() + 4 && $$1 < 14; $$5++) {
                  dus $$6 = this.dS().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dho.eW) || $$6.b() instanceof dhf) {
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
   public float fe() {
      return this.p_() ? (this.af.i() - this.af.i()) * 0.2F + 2.0F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   @Override
   public awf w() {
      return awg.DQ;
   }

   @Override
   public awf d(bsj $$0) {
      return awg.DU;
   }

   @Override
   public awf o_() {
      return awg.DT;
   }

   @Override
   public awf y() {
      return awg.DV;
   }

   @Override
   protected cvs go() {
      return cvs.k;
   }

   public void a(ddh $$0) {
      this.ci = $$0;
   }

   public void a(vd $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      this.a(this.gy().a(cnp.a($$0.t(this.ds()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cnl $$0) {
      cnl $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.am.a(d, $$0);
   }

   @Override
   public cnl gy() {
      return this.am.a(d);
   }

   public int gz() {
      return this.cj;
   }

   @Override
   public void b(int $$0) {
      this.cj = $$0;
   }
}
