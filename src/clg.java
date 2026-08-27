import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class clg extends brp implements clj, clk, dax {
   private static final ajy<Integer> cj = akc.a(clg.class, aka.b);
   private static final Logger ck = LogUtils.getLogger();
   public static final int ch = 300;
   private static final int cl = 8;
   @Nullable
   private cly cm;
   @Nullable
   protected daz ci;
   private final bqj cn = new bqj(8);

   public clg(bsb<? extends clg> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.n, 16.0F);
      this.a(epv.o, -1.0F);
   }

   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      if ($$3 == null) {
         $$3 = new brp.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int r() {
      return this.as.a(cj);
   }

   public void u(int $$0) {
      this.as.a(cj, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cj, 0);
   }

   @Override
   public void f(@Nullable cly $$0) {
      this.cm = $$0;
   }

   @Nullable
   @Override
   public cly gy() {
      return this.cm;
   }

   public boolean gz() {
      return this.cm != null;
   }

   @Override
   public daz gA() {
      if (this.ci == null) {
         this.ci = new daz();
         this.gF();
      }

      return this.ci;
   }

   @Override
   public void a(@Nullable daz $$0) {
   }

   @Override
   public void v(int $$0) {
   }

   @Override
   public void a(day $$0) {
      $$0.l();
      this.bV = -this.O();
      this.b($$0);
      if (this.cm instanceof aqu) {
         an.t.a((aqu)this.cm, this, $$0.f());
      }
   }

   protected abstract void b(day var1);

   @Override
   public boolean gB() {
      return true;
   }

   @Override
   public void n(cuh $$0) {
      if (!this.dU().C && this.bV > -this.O() + 20) {
         this.bV = -this.O();
         this.b(this.w(!$$0.d()));
      }
   }

   @Override
   public avn gC() {
      return avo.Bs;
   }

   protected avn w(boolean $$0) {
      return $$0 ? avo.Bs : avo.Bq;
   }

   public void gD() {
      this.b(avo.Bn);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      daz $$1 = this.gA();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", ad.a(daz.a.encodeStart(this.dY().a(uy.a), $$1), IllegalStateException::new));
      }

      this.b($$0, this.dY());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         daz.a.parse(this.dY().a(uy.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", ck::warn)).ifPresent($$0x -> this.ci = $$0x);
      }

      this.a($$0, this.dY());
   }

   @Nullable
   @Override
   public brv b(aqt $$0, boolean $$1) {
      this.gE();
      return super.b($$0, $$1);
   }

   protected void gE() {
      this.f(null);
   }

   @Override
   public void a(bqt $$0) {
      super.a($$0);
      this.gE();
   }

   protected void a(kz $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.al.k() * 0.02;
         double $$3 = this.al.k() * 0.02;
         double $$4 = this.al.k() * 0.02;
         this.dU().a($$0, this.d(1.0), this.dC() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cly $$0) {
      return false;
   }

   @Override
   public bqj x() {
      return this.cn;
   }

   @Override
   public btf a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cn.b() ? btf.a(this.cn, $$1) : super.a_($$0);
   }

   protected abstract void gF();

   protected void a(daz $$0, clp.g[] $$1, int $$2) {
      ArrayList<clp.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         day $$5 = $$3.remove(this.al.a($$3.size())).a(this, this.al);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ewu q(float $$0) {
      float $$1 = aym.i($$0, this.bk, this.bj) * (float) (Math.PI / 180.0);
      ewu $$2 = new ewu(0.0, this.cP().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gG() {
      return this.dU().C;
   }
}
