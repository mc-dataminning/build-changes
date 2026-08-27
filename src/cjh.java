import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjh extends cjg implements ckw {
   private static final Logger b = LogUtils.getLogger();
   private static final ajm<Boolean> c = ajq.a(cjh.class, ajo.k);
   private static final ajm<ckv> d = ajq.a(cjh.class, ajo.u);
   private static final int cb = 3600;
   private static final int cc = 6000;
   private static final int cd = 14;
   private static final int ce = 4;
   private int cf;
   @Nullable
   private UUID cg;
   @Nullable
   private ux ch;
   @Nullable
   private czc ci;
   private int cj;

   public cjh(brn<? extends cjh> $$0, dad $$1) {
      super($$0, $$1);
      ld.z.a(this.ah).ifPresent($$0x -> this.a(this.gA().a((ckx)$$0x.a())));
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new ckv(ckz.c, ckx.b, 1));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      ckv.c.encodeStart(uo.a, this.gA()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", ac.a(czc.a.encodeStart(this.dP().a(uo.a), this.ci), IllegalStateException::new));
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gz() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<ckv> $$1 = ckv.c.parse(new Dynamic(uo.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         czc.a.parse(this.dP().a(uo.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ci = $$0x);
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
      if (!this.dN().B && this.bB() && this.gz()) {
         int $$0 = this.gC();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.c((aqh)this.dN());
         }
      }

      super.l();
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(ctc.qa)) {
         if (this.b(bqv.r)) {
            $$2.a(1, $$0);
            if (!this.dN().B) {
               this.a($$0.cx(), this.ah.a(2401) + 3600);
            }

            return bpm.a;
         } else {
            return bpm.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gz() && this.cj == 0;
   }

   public boolean gz() {
      return this.an().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.an().a(c, true);
      this.e(bqv.r);
      this.b(new bqt(bqv.e, $$1, Math.min(this.dN().ak().a() - 1, 0)));
      this.dN().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dN().a(this.ds(), this.dw(), this.dy(), avc.Dx, this.dc(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(aqh $$0) {
      cku $$1 = this.a(brn.bi, false);

      for (bro $$2 : bro.values()) {
         csz $$3 = this.d($$2);
         if (!$$3.d()) {
            if (cyh.f($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.g($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gA());
      if (this.ch != null) {
         $$1.a(this.ch);
      }

      if (this.ci != null) {
         $$1.b(this.ci.a());
      }

      $$1.v(this.cj);
      $$1.a($$0, $$0.d_($$1.dn()), bse.i, null);
      $$1.c($$0);
      if (this.cg != null) {
         clh $$5 = $$0.b(this.cg);
         if ($$5 instanceof aqi) {
            am.s.a((aqi)$$5, this, $$1);
            $$0.a(cda.a, $$5, $$1);
         }
      }

      $$1.b(new bqt(bqv.i, 200, 0));
      if (!this.aU()) {
         $$0.a(null, 1027, this.dn(), 0);
      }
   }

   private int gC() {
      int $$0 = 1;
      if (this.ah.i() < 0.01F) {
         int $$1 = 0;
         in.a $$2 = new in.a();

         for (int $$3 = (int)this.ds() - 4; $$3 < (int)this.ds() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.du() - 4; $$4 < (int)this.du() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dy() - 4; $$5 < (int)this.dy() + 4 && $$1 < 14; $$5++) {
                  dqh $$6 = this.dN().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(ddg.eW) || $$6.b() instanceof dcx) {
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
   public float fd() {
      return this.p_() ? (this.ah.i() - this.ah.i()) * 0.2F + 2.0F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   @Override
   public avb v() {
      return avc.Dv;
   }

   @Override
   public avb d(bqf $$0) {
      return avc.Dz;
   }

   @Override
   public avb o_() {
      return avc.Dy;
   }

   @Override
   public avb gp() {
      return avc.DA;
   }

   @Override
   protected csz gq() {
      return csz.i;
   }

   public void a(czc $$0) {
      this.ci = $$0;
   }

   public void a(ux $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      this.a(this.gA().a(ckz.a($$0.t(this.dn()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ckv $$0) {
      ckv $$1 = this.gA();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.ao.a(d, $$0);
   }

   @Override
   public ckv gA() {
      return this.ao.a(d);
   }

   public int gB() {
      return this.cj;
   }

   @Override
   public void b(int $$0) {
      this.cj = $$0;
   }
}
