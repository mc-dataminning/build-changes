import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cpp extends bvi implements cps, cpt, dgm {
   private static final akg<Integer> bG = akk.a(cpp.class, aki.b);
   private static final Logger bH = LogUtils.getLogger();
   public static final int bE = 300;
   private static final int bI = 8;
   @Nullable
   private cqi bJ;
   @Nullable
   protected dgo bF;
   private final btx bK = new btx(8);

   public cpp(bwb<? extends cpp> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(evk.n, 16.0F);
      this.a(evk.o, -1.0F);
   }

   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if ($$3 == null) {
         $$3 = new bvi.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int q() {
      return this.al.a(bG);
   }

   public void r(int $$0) {
      this.al.a(bG, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bG, 0);
   }

   @Override
   public void a(@Nullable cqi $$0) {
      this.bJ = $$0;
   }

   @Nullable
   @Override
   public cqi x() {
      return this.bJ;
   }

   public boolean gq() {
      return this.bJ != null;
   }

   @Override
   public dgo gr() {
      if (this.dV().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bF == null) {
            this.bF = new dgo();
            this.gw();
         }

         return this.bF;
      }
   }

   @Override
   public void a(@Nullable dgo $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dgn $$0) {
      $$0.l();
      this.bv = -this.S();
      this.b($$0);
      if (this.bJ instanceof aro) {
         ap.t.a((aro)this.bJ, this, $$0.f());
      }
   }

   protected abstract void b(dgn var1);

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public void j(cxy $$0) {
      if (!this.dV().C && this.bv > -this.S() + 20) {
         this.bv = -this.S();
         this.b(this.w(!$$0.f()));
      }
   }

   @Override
   public awj gt() {
      return awk.BW;
   }

   protected awj w(boolean $$0) {
      return $$0 ? awk.BW : awk.BU;
   }

   public void gu() {
      this.b(awk.BR);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (!this.dV().C) {
         dgo $$1 = this.gr();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (ut)dgo.a.encodeStart(this.dX().a(uk.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dgo.a.parse(this.dX().a(uk.a), $$0.c("Offers")).resultOrPartial(af.a("Failed to load offers: ", bH::warn)).ifPresent($$0x -> this.bF = $$0x);
      }

      this.a($$0, this.dX());
   }

   @Nullable
   @Override
   public bvs b(evt $$0) {
      this.gv();
      return super.b($$0);
   }

   protected void gv() {
      this.a(null);
   }

   @Override
   public void a(buh $$0) {
      super.a($$0);
      this.gv();
   }

   protected void a(lt $$0) {
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
   public btx n() {
      return this.bK;
   }

   @Override
   public bxi a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bK.b() ? bxi.a(this.bK, $$1) : super.a_($$0);
   }

   protected abstract void gw();

   protected void a(dgo $$0, cpy.g[] $$1, int $$2) {
      ArrayList<cpy.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dgn $$5 = $$3.remove(this.ae.a($$3.size())).a(this, this.ae);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public fcu v(float $$0) {
      float $$1 = azk.h($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      fcu $$2 = new fcu(0.0, this.cR().c() - 1.0, 0.2);
      return this.p($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gx() {
      return this.dV().C;
   }

   @Override
   public boolean e(cqi $$0) {
      return this.x() == $$0 && this.bK() && $$0.b(this, 4.0);
   }
}
