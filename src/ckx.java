import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckx extends ckw implements cmm {
   private static final Logger b = LogUtils.getLogger();
   private static final ajw<Boolean> c = aka.a(ckx.class, ajy.k);
   private static final ajw<cml> d = aka.a(ckx.class, ajy.u);
   private static final int cf = 3600;
   private static final int cg = 6000;
   private static final int ch = 14;
   private static final int ci = 4;
   private int cj;
   @Nullable
   private UUID ck;
   @Nullable
   private uy cl;
   @Nullable
   private dbv cm;
   private int cn;

   public ckx(bsx<? extends ckx> $$0, dcw $$1) {
      super($$0, $$1);
      lt.x.a(this.ah).ifPresent($$0x -> this.a(this.gv().a((cmn)$$0x.a())));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cml(cmp.c, cmn.b, 1));
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      cml.c.encodeStart(up.a, this.gv()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.cm != null) {
         $$0.a("Offers", (uy)dbv.a.encodeStart(this.dQ().a(up.a), this.cm).getOrThrow());
      }

      if (this.cl != null) {
         $$0.a("Gossips", this.cl);
      }

      $$0.a("ConversionTime", this.gu() ? this.cj : -1);
      if (this.ck != null) {
         $$0.a("ConversionPlayer", this.ck);
      }

      $$0.a("Xp", this.cn);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cml> $$1 = cml.c.parse(new Dynamic(up.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dbv.a.parse(this.dQ().a(up.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.cm = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.cl = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cn = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dO().B && this.bE() && this.gu()) {
         int $$0 = this.gx();
         this.cj -= $$0;
         if (this.cj <= 0) {
            this.a((aqu)this.dO());
         }
      }

      super.l();
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.qa)) {
         if (this.b(bsb.r)) {
            $$2.a(1, $$0);
            if (!this.dO().B) {
               this.a($$0.cz(), this.ah.a(2401) + 3600);
            }

            return bqr.a;
         } else {
            return bqr.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gm() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gu() && this.cn == 0;
   }

   public boolean gu() {
      return this.ar().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.ck = $$0;
      this.cj = $$1;
      this.ar().a(c, true);
      this.e(bsb.r);
      this.b(new brz(bsb.e, $$1, Math.min(this.dO().al().a() - 1, 0)));
      this.dO().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aX()) {
            this.dO().a(this.dt(), this.dx(), this.dz(), avp.DM, this.de(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void a(aqu $$0) {
      cmk $$1 = this.a(bsx.bj, false);
      if ($$1 != null) {
         for (bsy $$2 : this.c($$0x -> !dae.a($$0x, dad.E))) {
            bug $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gv());
         if (this.cl != null) {
            $$1.a(this.cl);
         }

         if (this.cm != null) {
            $$1.b(this.cm.a());
         }

         $$1.u(this.cn);
         $$1.a($$0, $$0.d_($$1.do()), btr.i, null);
         $$1.a($$0);
         if (this.ck != null) {
            cmx $$4 = $$0.b(this.ck);
            if ($$4 instanceof aqv) {
               an.s.a((aqv)$$4, this, $$1);
               $$0.a(cep.a, $$4, $$1);
            }
         }

         $$1.b(new brz(bsb.i, 200, 0));
         if (!this.aX()) {
            $$0.a(null, 1027, this.do(), 0);
         }
      }
   }

   private int gx() {
      int $$0 = 1;
      if (this.ah.i() < 0.01F) {
         int $$1 = 0;
         jd.a $$2 = new jd.a();

         for (int $$3 = (int)this.dt() - 4; $$3 < (int)this.dt() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dv() - 4; $$4 < (int)this.dv() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dz() - 4; $$5 < (int)this.dz() + 4 && $$1 < 14; $$5++) {
                  dtc $$6 = this.dO().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dga.eW) || $$6.b() instanceof dfr) {
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
   public float fb() {
      return this.o_() ? (this.ah.i() - this.ah.i()) * 0.2F + 2.0F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   @Override
   public avo v() {
      return avp.DK;
   }

   @Override
   public avo d(brk $$0) {
      return avp.DO;
   }

   @Override
   public avo n_() {
      return avp.DN;
   }

   @Override
   public avo gk() {
      return avp.DP;
   }

   @Override
   protected cuq gl() {
      return cuq.l;
   }

   public void a(dbv $$0) {
      this.cm = $$0;
   }

   public void a(uy $$0) {
      this.cl = $$0;
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      this.a(this.gv().a(cmp.a($$0.t(this.do()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cml $$0) {
      cml $$1 = this.gv();
      if ($$1.b() != $$0.b()) {
         this.cm = null;
      }

      this.ao.a(d, $$0);
   }

   @Override
   public cml gv() {
      return this.ao.a(d);
   }

   public int gw() {
      return this.cn;
   }

   @Override
   public void b(int $$0) {
      this.cn = $$0;
   }
}
