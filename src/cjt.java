import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cjt extends bqf implements cjw, cjx, cyr {
   private static final ajk<Integer> ca = ajo.a(cjt.class, ajm.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private ckl cd;
   @Nullable
   protected cyt bZ;
   private final boz ce = new boz(8);

   public cjt(bqr<? extends cjt> $$0, czu $$1) {
      super($$0, $$1);
      this.a(emi.n, 16.0F);
      this.a(emi.o, -1.0F);
   }

   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      if ($$3 == null) {
         $$3 = new bqf.a(false);
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
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void f(@Nullable ckl $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public ckl gp() {
      return this.cd;
   }

   public boolean gq() {
      return this.cd != null;
   }

   @Override
   public cyt gr() {
      if (this.bZ == null) {
         this.bZ = new cyt();
         this.gw();
      }

      return this.bZ;
   }

   @Override
   public void a(@Nullable cyt $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(cys $$0) {
      $$0.l();
      this.bM = -this.O();
      this.b($$0);
      if (this.cd instanceof aqf) {
         am.t.a((aqf)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(cys var1);

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public void n(csd $$0) {
      if (!this.dN().B && this.bM > -this.O() + 20) {
         this.bM = -this.O();
         this.b(this.w(!$$0.d()));
      }
   }

   @Override
   public auy gt() {
      return auz.AI;
   }

   protected auy w(boolean $$0) {
      return $$0 ? auz.AI : auz.AG;
   }

   public void gu() {
      this.b(auz.AD);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      cyt $$1 = this.gr();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", ac.a(cyt.a.encodeStart(this.dP().a(um.a), $$1), IllegalStateException::new));
      }

      this.b($$0, this.dP());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         cyt.a.parse(this.dP().a(um.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dP());
   }

   @Nullable
   @Override
   public bql b(aqe $$0) {
      this.gv();
      return super.b($$0);
   }

   protected void gv() {
      this.f(null);
   }

   @Override
   public void a(bpj $$0) {
      super.a($$0);
      this.gv();
   }

   protected void a(ku $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dN().a($$0, this.d(1.0), this.dv() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return false;
   }

   @Override
   public boz y() {
      return this.ce;
   }

   @Override
   public brv a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? brv.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gw();

   protected void a(cyt $$0, ckc.g[] $$1, int $$2) {
      ArrayList<ckc.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cys $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public etf q(float $$0) {
      float $$1 = axw.i($$0, this.ba, this.aZ) * (float) (Math.PI / 180.0);
      etf $$2 = new etf(0.0, this.cI().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gx() {
      return this.dN().B;
   }
}
