import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cpz extends bvq implements cqc, cqd, dhm {
   private static final akh<Integer> bH = akl.a(cpz.class, akj.b);
   private static final Logger bI = LogUtils.getLogger();
   public static final int bF = 300;
   private static final int bJ = 8;
   @Nullable
   private cqs bK;
   @Nullable
   protected dho bG;
   private final buf bL = new buf(8);

   public cpz(bwj<? extends cpz> $$0, dip $$1) {
      super($$0, $$1);
      this.a(ewm.n, 16.0F);
      this.a(ewm.o, -1.0F);
   }

   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      if ($$3 == null) {
         $$3 = new bvq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int q() {
      return this.al.a(bH);
   }

   public void r(int $$0) {
      this.al.a(bH, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bH, 0);
   }

   @Override
   public void a(@Nullable cqs $$0) {
      this.bK = $$0;
   }

   @Nullable
   @Override
   public cqs x() {
      return this.bK;
   }

   public boolean gq() {
      return this.bK != null;
   }

   @Override
   public dho gr() {
      if (this.dV().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bG == null) {
            this.bG = new dho();
            this.gw();
         }

         return this.bG;
      }
   }

   @Override
   public void a(@Nullable dho $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dhn $$0) {
      $$0.l();
      this.bw = -this.S();
      this.b($$0);
      if (this.bK instanceof arp) {
         ap.t.a((arp)this.bK, this, $$0.f());
      }
   }

   protected abstract void b(dhn var1);

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public void j(cys $$0) {
      if (!this.dV().C && this.bw > -this.S() + 20) {
         this.bw = -this.S();
         this.b(this.w(!$$0.f()));
      }
   }

   @Override
   public awk gt() {
      return awl.BW;
   }

   protected awk w(boolean $$0) {
      return $$0 ? awl.BW : awl.BU;
   }

   public void gu() {
      this.b(awl.BR);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (!this.dV().C) {
         dho $$1 = this.gr();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (uu)dho.a.encodeStart(this.dX().a(ul.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dho.a.parse(this.dX().a(ul.a), $$0.c("Offers")).resultOrPartial(af.a("Failed to load offers: ", bI::warn)).ifPresent($$0x -> this.bG = $$0x);
      }

      this.a($$0, this.dX());
   }

   @Nullable
   @Override
   public bwa b(ewv $$0) {
      this.gv();
      return super.b($$0);
   }

   protected void gv() {
      this.a(null);
   }

   @Override
   public void a(bup $$0) {
      super.a($$0);
      this.gv();
   }

   protected void a(lv $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         this.dV().a($$0, this.d(1.0), this.dD() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean w() {
      return false;
   }

   @Override
   public buf n() {
      return this.bL;
   }

   @Override
   public bxq a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bL.b() ? bxq.a(this.bL, $$1) : super.a_($$0);
   }

   protected abstract void gw();

   protected void a(dho $$0, cqi.g[] $$1, int $$2) {
      ArrayList<cqi.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dhn $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public fdw v(float $$0) {
      float $$1 = azk.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      fdw $$2 = new fdw(0.0, this.cR().c() - 1.0, 0.2);
      return this.p($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gx() {
      return this.dV().C;
   }

   @Override
   public boolean e(cqs $$0) {
      return this.x() == $$0 && this.bK() && $$0.b(this, 4.0);
   }
}
