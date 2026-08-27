import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class clg extends brq implements clj, clk, czw {
   private static final ajs<Integer> ca = ajw.a(clg.class, aju.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private cly cd;
   @Nullable
   protected czy bZ;
   private final bqf ce = new bqf(8);

   public clg(bsc<? extends clg> $$0, daz $$1) {
      super($$0, $$1);
      this.a(enn.n, 16.0F);
      this.a(enn.o, -1.0F);
   }

   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      if ($$3 == null) {
         $$3 = new brq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int s() {
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
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void f(@Nullable cly $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public cly gp() {
      return this.cd;
   }

   public boolean gq() {
      return this.cd != null;
   }

   @Override
   public czy gr() {
      if (this.bZ == null) {
         this.bZ = new czy();
         this.gw();
      }

      return this.bZ;
   }

   @Override
   public void a(@Nullable czy $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(czx $$0) {
      $$0.l();
      this.bM = -this.O();
      this.b($$0);
      if (this.cd instanceof aqo) {
         am.t.a((aqo)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(czx var1);

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public void n(ctq $$0) {
      if (!this.dP().B && this.bM > -this.O() + 20) {
         this.bM = -this.O();
         this.b(this.w(!$$0.e()));
      }
   }

   @Override
   public avh gt() {
      return avi.AU;
   }

   protected avh w(boolean $$0) {
      return $$0 ? avi.AU : avi.AS;
   }

   public void gu() {
      this.b(avi.AP);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      czy $$1 = this.gr();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", (va)czy.a.encodeStart(this.dR().a(ur.a), $$1).getOrThrow());
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         czy.a.parse(this.dR().a(ur.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dR());
   }

   @Nullable
   @Override
   public brw b(aqn $$0) {
      this.gv();
      return super.b($$0);
   }

   protected void gv() {
      this.f(null);
   }

   @Override
   public void a(bqp $$0) {
      super.a($$0);
      this.gv();
   }

   protected void a(kw $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dP().a($$0, this.d(1.0), this.dx() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cly $$0) {
      return false;
   }

   @Override
   public bqf y() {
      return this.ce;
   }

   @Override
   public bti a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? bti.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gw();

   protected void a(czy $$0, clp.g[] $$1, int $$2) {
      ArrayList<clp.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         czx $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public eum q(float $$0) {
      float $$1 = ayf.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      eum $$2 = new eum(0.0, this.cK().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gx() {
      return this.dP().B;
   }
}
