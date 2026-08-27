import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class chi extends boa implements chl, chm, cvb {
   private static final aii<Integer> bX = ail.a(chi.class, aik.b);
   private static final Logger bY = LogUtils.getLogger();
   public static final int bV = 300;
   private static final int bZ = 8;
   @Nullable
   private cia ca;
   @Nullable
   protected cvd bW;
   private final bmu cb = new bmu(8);

   public chi(bol<? extends chi> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.n, 16.0F);
      this.a(eic.o, -1.0F);
   }

   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      if ($$3 == null) {
         $$3 = new boa.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int u() {
      return this.am.b(bX);
   }

   public void t(int $$0) {
      this.am.b(bX, $$0);
   }

   @Override
   public int w() {
      return 0;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bX, 0);
   }

   @Override
   public void f(@Nullable cia $$0) {
      this.ca = $$0;
   }

   @Nullable
   @Override
   public cia gl() {
      return this.ca;
   }

   public boolean gm() {
      return this.ca != null;
   }

   @Override
   public cvd gn() {
      if (this.bW == null) {
         this.bW = new cvd();
         this.gs();
      }

      return this.bW;
   }

   @Override
   public void a(@Nullable cvd $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(cvc $$0) {
      $$0.j();
      this.bJ = -this.Q();
      this.b($$0);
      if (this.ca instanceof apb) {
         am.t.a((apb)this.ca, this, $$0.d());
      }
   }

   protected abstract void b(cvc var1);

   @Override
   public boolean go() {
      return true;
   }

   @Override
   public void n(cpq $$0) {
      if (!this.dJ().B && this.bJ > -this.Q() + 20) {
         this.bJ = -this.Q();
         this.b(this.w(!$$0.b()));
      }
   }

   @Override
   public ato gp() {
      return atp.Aq;
   }

   protected ato w(boolean $$0) {
      return $$0 ? atp.Aq : atp.Ao;
   }

   public void gq() {
      this.b(atp.Al);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      cvd $$1 = this.gn();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", ac.a(cvd.a.encodeStart(tm.a, $$1), IllegalStateException::new));
      }

      this.a_($$0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         cvd.a.parse(tm.a, $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", bY::warn)).ifPresent($$0x -> this.bW = $$0x);
      }

      this.c($$0);
   }

   @Nullable
   @Override
   public bof b(apa $$0) {
      this.gr();
      return super.b($$0);
   }

   protected void gr() {
      this.f(null);
   }

   @Override
   public void a(bne $$0) {
      super.a($$0);
      this.gr();
   }

   protected void a(jz $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         this.dJ().a($$0, this.d(1.0), this.dr() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cia $$0) {
      return false;
   }

   @Override
   public bmu A() {
      return this.cb;
   }

   @Override
   public bpo a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cb.b() ? bpo.a(this.cb, $$1) : super.a_($$0);
   }

   protected abstract void gs();

   protected void a(cvd $$0, chr.g[] $$1, int $$2) {
      ArrayList<chr.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         cvc $$5 = $$3.remove(this.af.a($$3.size())).a(this, this.af);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public eov q(float $$0) {
      float $$1 = awm.i($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      eov $$2 = new eov(0.0, this.cE().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gt() {
      return this.dJ().B;
   }
}
