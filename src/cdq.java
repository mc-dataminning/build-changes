import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdq extends cdp implements cff {
   private static final Logger b = LogUtils.getLogger();
   private static final agn<Boolean> c = agq.a(cdq.class, agp.k);
   private static final agn<cfe> d = agq.a(cdq.class, agp.t);
   private static final int bX = 3600;
   private static final int bY = 6000;
   private static final int bZ = 14;
   private static final int ca = 4;
   private int cb;
   @Nullable
   private UUID cc;
   @Nullable
   private tl cd;
   @Nullable
   private so ce;
   private int cf;

   public cdq(bmc<? extends cdq> $$0, ctx $$1) {
      super($$0, $$1);
      kd.z.a(this.ag).ifPresent($$0x -> this.a(this.gq().a((cfg)$$0x.a())));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, false);
      this.an.a(d, new cfe(cfi.c, cfg.b, 1));
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      cfe.c.encodeStart(tc.a, this.gq()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ce != null) {
         $$0.a("Offers", this.ce);
      }

      if (this.cd != null) {
         $$0.a("Gossips", this.cd);
      }

      $$0.a("ConversionTime", this.gp() ? this.cb : -1);
      if (this.cc != null) {
         $$0.a("ConversionPlayer", this.cc);
      }

      $$0.a("Xp", this.cf);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cfe> $$1 = cfe.c.parse(new Dynamic(tc.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.ce = $$0.p("Offers");
      }

      if ($$0.b("Gossips", 9)) {
         this.cd = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cf = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dL().B && this.bx() && this.gp()) {
         int $$0 = this.gs();
         this.cb -= $$0;
         if (this.cb <= 0) {
            this.c((ane)this.dL());
         }
      }

      super.l();
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$2.a(cnj.pZ)) {
         if (this.a(bll.r)) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            if (!this.dL().B) {
               this.a($$0.cw(), this.ag.a(2401) + 3600);
            }

            return bkc.a;
         } else {
            return bkc.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gh() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gp() && this.cf == 0;
   }

   public boolean gp() {
      return this.an().b(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cc = $$0;
      this.cb = $$1;
      this.an().b(c, true);
      this.e(bll.r);
      this.b(new blj(bll.e, $$1, Math.min(this.dL().ak().a() - 1, 0)));
      this.dL().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dL().a(this.dq(), this.du(), this.dw(), art.CK, this.db(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(ane $$0) {
      cfd $$1 = this.a(bmc.bh, false);

      for (bmd $$2 : bmd.values()) {
         cng $$3 = this.c($$2);
         if (!$$3.b()) {
            if (crt.d($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gq());
      if (this.cd != null) {
         $$1.a(this.cd);
      }

      if (this.ce != null) {
         $$1.b(new csw(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.dl()), bms.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         cfq $$5 = $$0.b(this.cc);
         if ($$5 instanceof anf) {
            am.s.a((anf)$$5, this, $$1);
            $$0.a(bxn.a, $$5, $$1);
         }
      }

      $$1.b(new blj(bll.i, 200, 0));
      if (!this.aU()) {
         $$0.a(null, 1027, this.dl(), 0);
      }
   }

   private int gs() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         hx.a $$2 = new hx.a();

         for (int $$3 = (int)this.dq() - 4; $$3 < (int)this.dq() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.ds() - 4; $$4 < (int)this.ds() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dw() - 4; $$5 < (int)this.dw() + 4 && $$1 < 14; $$5++) {
                  djp $$6 = this.dL().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(cxa.eW) || $$6.b() instanceof cwr) {
                     if (this.ag.i() < 0.3F) {
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
   public float eX() {
      return this.o_() ? (this.ag.i() - this.ag.i()) * 0.2F + 2.0F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   @Override
   public ars y() {
      return art.CI;
   }

   @Override
   public ars d(bkv $$0) {
      return art.CM;
   }

   @Override
   public ars n_() {
      return art.CL;
   }

   @Override
   public ars gf() {
      return art.CN;
   }

   @Override
   protected cng gg() {
      return cng.f;
   }

   public void c(so $$0) {
      this.ce = $$0;
   }

   public void a(tl $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      this.a(this.gq().a(cfi.a($$0.t(this.dl()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cfe $$0) {
      cfe $$1 = this.gq();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.an.b(d, $$0);
   }

   @Override
   public cfe gq() {
      return this.an.b(d);
   }

   public int gr() {
      return this.cf;
   }

   @Override
   public void b(int $$0) {
      this.cf = $$0;
   }
}
