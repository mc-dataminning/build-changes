import java.util.UUID;
import javax.annotation.Nullable;

public class cky extends ckw implements btt {
   private static final bsu c = bsx.bx.n().a(0.5F).b(0.97F);
   private static final akr d = akr.b("attacking");
   private static final buu cf = new buu(d, 0.05, buu.a.a);
   private static final bqc cg = azp.a(0, 1);
   private int ch;
   private static final bqc ci = azp.a(20, 39);
   private int cj;
   @Nullable
   private UUID ck;
   private static final int cl = 10;
   private static final bqc cm = azp.a(4, 6);
   private int cn;

   public cky(bsx<? extends cky> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(epv.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ck = $$0;
   }

   @Override
   protected void t() {
      this.bW.a(2, new ccb(this, 1.0, false));
      this.bW.a(7, new cbz(this, 1.0));
      this.bX.a(1, new cce(this).a());
      this.bX.a(2, new ccf<>(this, cmx.class, 10, true, false, this::a_));
      this.bX.a(3, new ccl<>(this, true));
   }

   public static buv.a gu() {
      return ckw.go().a(buw.A, 0.0).a(buw.v, 0.23F).a(buw.c, 5.0);
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gm() {
      return false;
   }

   @Override
   protected void ab() {
      bus $$0 = this.f(buw.v);
      if (this.ad_()) {
         if (!this.o_() && !$$0.b(d)) {
            $$0.b(cf);
         }

         this.gv();
      } else if ($$0.b(d)) {
         $$0.c(d);
      }

      this.a((aqu)this.dO(), true);
      if (this.p() != null) {
         this.gw();
      }

      if (this.ad_()) {
         this.bd = this.ai;
      }

      super.ab();
   }

   private void gv() {
      if (this.ch > 0) {
         this.ch--;
         if (this.ch == 0) {
            this.gy();
         }
      }
   }

   private void gw() {
      if (this.cn > 0) {
         this.cn--;
      } else {
         if (this.O().a(this.p())) {
            this.gx();
         }

         this.cn = cm.a(this.ah);
      }
   }

   private void gx() {
      double $$0 = this.g(buw.m);
      ewx $$1 = ewx.a(this.dm()).c($$0, 10.0, $$0);
      this.dO()
         .a(cky.class, $$1, bsw.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gy() {
      this.a(avp.DG, this.fa() * 2.0F, this.fb() * 1.8F);
   }

   @Override
   public void h(@Nullable btn $$0) {
      if (this.p() == null && $$0 != null) {
         this.ch = cg.a(this.ah);
         this.cn = cm.a(this.ah);
      }

      if ($$0 instanceof cmx) {
         this.c((cmx)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ci.a(this.ah));
   }

   public static boolean b(bsx<cky> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.al() != bqo.a && !$$1.a_($$3.e()).a(dga.kK);
   }

   @Override
   public boolean a(dcz $$0) {
      return $$0.f(this) && !$$0.d(this.cK());
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(this.dO(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cj = $$0;
   }

   @Override
   public int a() {
      return this.cj;
   }

   @Override
   protected avo v() {
      return this.ad_() ? avp.DG : avp.DF;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.DI;
   }

   @Override
   protected avo n_() {
      return avp.DH;
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      this.a(bsy.a, new cuq(cut.oW));
   }

   @Override
   protected cuq gl() {
      return cuq.l;
   }

   @Override
   protected void gt() {
      this.f(buw.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ck;
   }

   @Override
   public boolean a(cmx $$0) {
      return this.a_((btn)$$0);
   }

   @Override
   public boolean k(cuq $$0) {
      return this.j($$0);
   }
}
