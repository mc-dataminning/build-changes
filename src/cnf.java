import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cnf extends btk implements cni, cnj, ddf {
   private static final akh<Integer> ca = akl.a(cnf.class, akj.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private cnx cd;
   @Nullable
   protected ddh bZ;
   private final brz ce = new brz(8);

   public cnf(bty<? extends cnf> $$0, dej $$1) {
      super($$0, $$1);
      this.a(erk.n, 16.0F);
      this.a(erk.o, -1.0F);
   }

   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if ($$3 == null) {
         $$3 = new btk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int q() {
      return this.am.a(ca);
   }

   public void s(int $$0) {
      this.am.a(ca, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void a(@Nullable cnx $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public cnx go() {
      return this.cd;
   }

   public boolean gp() {
      return this.cd != null;
   }

   @Override
   public ddh gq() {
      if (this.dS().B) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.bZ == null) {
            this.bZ = new ddh();
            this.gv();
         }

         return this.bZ;
      }
   }

   @Override
   public void a(@Nullable ddh $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(ddg $$0) {
      $$0.l();
      this.bM = -this.T();
      this.b($$0);
      if (this.cd instanceof ark) {
         an.t.a((ark)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(ddg var1);

   @Override
   public boolean gr() {
      return true;
   }

   @Override
   public void m(cvs $$0) {
      if (!this.dS().B && this.bM > -this.T() + 20) {
         this.bM = -this.T();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public awf gs() {
      return awg.Be;
   }

   protected awf x(boolean $$0) {
      return $$0 ? awg.Be : awg.Bc;
   }

   public void gt() {
      this.b(awg.AZ);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      if (!this.dS().B) {
         ddh $$1 = this.gq();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (vd)ddh.a.encodeStart(this.dU().a(uu.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dU());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         ddh.a.parse(this.dU().a(uu.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dU());
   }

   @Nullable
   @Override
   public btr b(err $$0) {
      this.gu();
      return super.b($$0);
   }

   protected void gu() {
      this.a(null);
   }

   @Override
   public void a(bsj $$0) {
      super.a($$0);
      this.gu();
   }

   protected void a(lm $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         this.dS().a($$0, this.d(1.0), this.dA() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public brz y() {
      return this.ce;
   }

   @Override
   public bve a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? bve.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gv();

   protected void a(ddh $$0, cno.g[] $$1, int $$2) {
      ArrayList<cno.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         ddg $$5 = $$3.remove(this.af.a($$3.size())).a(this, this.af);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public eyw u(float $$0) {
      float $$1 = azf.h($$0, this.aU, this.aT) * (float) (Math.PI / 180.0);
      eyw $$2 = new eyw(0.0, this.cO().c() - 1.0, 0.2);
      return this.o($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gw() {
      return this.dS().B;
   }
}
