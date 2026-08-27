import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cht extends chs implements cji {
   private static final Logger b = LogUtils.getLogger();
   private static final aiy<Boolean> c = ajc.a(cht.class, aja.k);
   private static final aiy<cjh> d = ajc.a(cht.class, aja.t);
   private static final int ca = 3600;
   private static final int cb = 6000;
   private static final int cc = 14;
   private static final int cd = 4;
   private int ce;
   @Nullable
   private UUID cf;
   @Nullable
   private uj cg;
   @Nullable
   private cxw ch;
   private int ci;

   public cht(bqb<? extends cht> $$0, cyx $$1) {
      super($$0, $$1);
      kr.z.a(this.ag).ifPresent($$0x -> this.a(this.gy().a((cjj)$$0x.a())));
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cjh(cjl.c, cjj.b, 1));
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      cjh.c.encodeStart(ua.a, this.gy()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ch != null) {
         $$0.a("Offers", ac.a(cxw.a.encodeStart(this.dO().a(ua.a), this.ch), IllegalStateException::new));
      }

      if (this.cg != null) {
         $$0.a("Gossips", this.cg);
      }

      $$0.a("ConversionTime", this.gx() ? this.ce : -1);
      if (this.cf != null) {
         $$0.a("ConversionPlayer", this.cf);
      }

      $$0.a("Xp", this.ci);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cjh> $$1 = cjh.c.parse(new Dynamic(ua.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         cxw.a.parse(this.dO().a(ua.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ch = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.cg = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.ci = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bA() && this.gx()) {
         int $$0 = this.gA();
         this.ce -= $$0;
         if (this.ce <= 0) {
            this.c((aps)this.dM());
         }
      }

      super.l();
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(crm.pZ)) {
         if (this.b(bpj.r)) {
            $$2.a(1, $$0);
            if (!this.dM().B) {
               this.a($$0.cw(), this.ag.a(2401) + 3600);
            }

            return boa.a;
         } else {
            return boa.b;
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
      return !this.gx() && this.ci == 0;
   }

   public boolean gx() {
      return this.an().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cf = $$0;
      this.ce = $$1;
      this.an().a(c, true);
      this.e(bpj.r);
      this.b(new bph(bpj.e, $$1, Math.min(this.dM().ak().a() - 1, 0)));
      this.dM().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), aum.Dp, this.db(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(aps $$0) {
      cjg $$1 = this.a(bqb.bi, false);

      for (bqc $$2 : bqc.values()) {
         crj $$3 = this.d($$2);
         if (!$$3.d()) {
            if (cwr.e($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.g($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gy());
      if (this.cg != null) {
         $$1.a(this.cg);
      }

      if (this.ch != null) {
         $$1.b(this.ch.a());
      }

      $$1.v(this.ci);
      $$1.a($$0, $$0.d_($$1.dm()), bqs.i, null);
      $$1.c($$0);
      if (this.cf != null) {
         cjt $$5 = $$0.b(this.cf);
         if ($$5 instanceof apt) {
            am.s.a((apt)$$5, this, $$1);
            $$0.a(cbo.a, $$5, $$1);
         }
      }

      $$1.b(new bph(bpj.i, 200, 0));
      if (!this.aU()) {
         $$0.a(null, 1027, this.dm(), 0);
      }
   }

   private int gA() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         ib.a $$2 = new ib.a();

         for (int $$3 = (int)this.dr() - 4; $$3 < (int)this.dr() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dt() - 4; $$4 < (int)this.dt() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dx() - 4; $$5 < (int)this.dx() + 4 && $$1 < 14; $$5++) {
                  doz $$6 = this.dM().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dca.eW) || $$6.b() instanceof dbr) {
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
   public float fc() {
      return this.p_() ? (this.ag.i() - this.ag.i()) * 0.2F + 2.0F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   @Override
   public aul v() {
      return aum.Dn;
   }

   @Override
   public aul d(bot $$0) {
      return aum.Dr;
   }

   @Override
   public aul o_() {
      return aum.Dq;
   }

   @Override
   public aul gn() {
      return aum.Ds;
   }

   @Override
   protected crj go() {
      return crj.i;
   }

   public void a(cxw $$0) {
      this.ch = $$0;
   }

   public void a(uj $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      this.a(this.gy().a(cjl.a($$0.t(this.dm()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cjh $$0) {
      cjh $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.ch = null;
      }

      this.an.a(d, $$0);
   }

   @Override
   public cjh gy() {
      return this.an.a(d);
   }

   public int gz() {
      return this.ci;
   }

   @Override
   public void b(int $$0) {
      this.ci = $$0;
   }
}
