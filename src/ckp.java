import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ckp extends brb implements cks, ckt, cza {
   private static final ajm<Integer> ca = ajq.a(ckp.class, ajo.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private clh cd;
   @Nullable
   protected czc bZ;
   private final bpv ce = new bpv(8);

   public ckp(brn<? extends ckp> $$0, dad $$1) {
      super($$0, $$1);
      this.a(emr.n, 16.0F);
      this.a(emr.o, -1.0F);
   }

   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      if ($$3 == null) {
         $$3 = new brb.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int r() {
      return this.ao.a(ca);
   }

   public void t(int $$0) {
      this.ao.a(ca, $$0);
   }

   @Override
   public int u() {
      return 0;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void f(@Nullable clh $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public clh gp() {
      return this.cd;
   }

   public boolean gq() {
      return this.cd != null;
   }

   @Override
   public czc gr() {
      if (this.bZ == null) {
         this.bZ = new czc();
         this.gw();
      }

      return this.bZ;
   }

   @Override
   public void a(@Nullable czc $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(czb $$0) {
      $$0.l();
      this.bM = -this.O();
      this.b($$0);
      if (this.cd instanceof aqi) {
         am.t.a((aqi)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(czb var1);

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public void n(csz $$0) {
      if (!this.dN().B && this.bM > -this.O() + 20) {
         this.bM = -this.O();
         this.b(this.w(!$$0.d()));
      }
   }

   @Override
   public avb gt() {
      return avc.AJ;
   }

   protected avb w(boolean $$0) {
      return $$0 ? avc.AJ : avc.AH;
   }

   public void gu() {
      this.b(avc.AE);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      czc $$1 = this.gr();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", ac.a(czc.a.encodeStart(this.dP().a(uo.a), $$1), IllegalStateException::new));
      }

      this.b($$0, this.dP());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         czc.a.parse(this.dP().a(uo.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dP());
   }

   @Nullable
   @Override
   public brh b(aqh $$0) {
      this.gv();
      return super.b($$0);
   }

   protected void gv() {
      this.f(null);
   }

   @Override
   public void a(bqf $$0) {
      super.a($$0);
      this.gv();
   }

   protected void a(kv $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dN().a($$0, this.d(1.0), this.dv() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(clh $$0) {
      return false;
   }

   @Override
   public bpv y() {
      return this.ce;
   }

   @Override
   public bsr a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? bsr.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gw();

   protected void a(czc $$0, cky.g[] $$1, int $$2) {
      ArrayList<cky.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         czb $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public etp q(float $$0) {
      float $$1 = axz.i($$0, this.ba, this.aZ) * (float) (Math.PI / 180.0);
      etp $$2 = new etp(0.0, this.cI().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gx() {
      return this.dN().B;
   }
}
