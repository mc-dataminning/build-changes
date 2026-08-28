import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clu extends clt implements cnj {
   private static final Logger b = LogUtils.getLogger();
   private static final akg<Boolean> c = akk.a(clu.class, aki.k);
   private static final akg<cni> d = akk.a(clu.class, aki.u);
   private static final int cb = 3600;
   private static final int cc = 6000;
   private static final int cd = 14;
   private static final int ce = 4;
   private int cf;
   @Nullable
   private UUID cg;
   @Nullable
   private vc ch;
   @Nullable
   private dde ci;
   private int cj;

   public clu(btv<? extends clu> $$0, deg $$1) {
      super($$0, $$1);
      lu.x.a(this.af).ifPresent($$0x -> this.a(this.gz().a((cnk)$$0x.a())));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cni(cnm.c, cnk.b, 1));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      cni.c.encodeStart(ut.a, this.gz()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", (vc)dde.a.encodeStart(this.dU().a(ut.a), this.ci).getOrThrow());
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gy() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cni> $$1 = cni.c.parse(new Dynamic(ut.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dde.a.parse(this.dU().a(ut.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ci = $$0x);
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
      if (!this.dS().B && this.bI() && this.gy()) {
         int $$0 = this.gB();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.a((arh)this.dS());
         }
      }

      super.l();
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(cvt.qb)) {
         if (this.b(bsx.r)) {
            $$2.a(1, $$0);
            if (!this.dS().B) {
               this.a($$0.cD(), this.af.a(2401) + 3600);
            }

            return brp.b;
         } else {
            return brp.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gy() && this.cj == 0;
   }

   public boolean gy() {
      return this.at().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.at().a(c, true);
      this.e(bsx.r);
      this.a(new bsv(bsx.e, $$1, Math.min(this.dS().am().a() - 1, 0)));
      this.dS().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.ba()) {
            this.dS().a(this.dx(), this.dB(), this.dD(), awe.DS, this.di(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void a(arh $$0) {
      cnh $$1 = this.a(btv.bj, false);
      if ($$1 != null) {
         for (btw $$2 : this.c($$0x -> !dbm.a($$0x, dbl.E))) {
            bvb $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gz());
         if (this.ch != null) {
            $$1.a(this.ch);
         }

         if (this.ci != null) {
            $$1.b(this.ci.a());
         }

         $$1.u(this.cj);
         $$1.a($$0, $$0.d_($$1.ds()), btu.i, null);
         $$1.a($$0);
         if (this.cg != null) {
            cnu $$4 = $$0.b(this.cg);
            if ($$4 instanceof ari) {
               an.s.a((ari)$$4, this, $$1);
               $$0.a(cfk.a, $$4, $$1);
            }
         }

         $$1.a(new bsv(bsx.i, 200, 0));
         if (!this.ba()) {
            $$0.a(null, 1027, this.ds(), 0);
         }
      }
   }

   private int gB() {
      int $$0 = 1;
      if (this.af.i() < 0.01F) {
         int $$1 = 0;
         je.a $$2 = new je.a();

         for (int $$3 = (int)this.dx() - 4; $$3 < (int)this.dx() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dz() - 4; $$4 < (int)this.dz() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dD() - 4; $$5 < (int)this.dD() + 4 && $$1 < 14; $$5++) {
                  duo $$6 = this.dS().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dhl.eW) || $$6.b() instanceof dhc) {
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
      return this.o_() ? (this.af.i() - this.af.i()) * 0.2F + 2.0F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   @Override
   public awd w() {
      return awe.DQ;
   }

   @Override
   public awd d(bsg $$0) {
      return awe.DU;
   }

   @Override
   public awd n_() {
      return awe.DT;
   }

   @Override
   public awd y() {
      return awe.DV;
   }

   @Override
   protected cvp gp() {
      return cvp.k;
   }

   public void a(dde $$0) {
      this.ci = $$0;
   }

   public void a(vc $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      this.a(this.gz().a(cnm.a($$0.t(this.ds()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cni $$0) {
      cni $$1 = this.gz();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.am.a(d, $$0);
   }

   @Override
   public cni gz() {
      return this.am.a(d);
   }

   public int gA() {
      return this.cj;
   }

   @Override
   public void b(int $$0) {
      this.cj = $$0;
   }
}
