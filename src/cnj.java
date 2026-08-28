import java.util.UUID;
import javax.annotation.Nullable;

public class cnj extends cnh implements bwc {
   private static final bve c = bvi.bR.n().a(0.5F).b(0.97F);
   private static final alp cc = alp.b("attacking");
   private static final bxd cd = new bxd(cc, 0.05, bxd.a.a);
   private static final bsl ce = baw.a(0, 1);
   private int cf;
   private static final bsl cg = baw.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;
   private static final int cj = 10;
   private static final bsl ck = baw.a(4, 6);
   private int cl;

   public cnj(bvi<? extends cnj> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Override
   protected void p() {
      this.bT.a(2, new cek(this, 1.0, false));
      this.bT.a(7, new cei(this, 1.0));
      this.bU.a(1, new cen(this).a());
      this.bU.a(2, new ceo<>(this, cpo.class, 10, true, false, this::a));
      this.bU.a(3, new ceu<>(this, true));
   }

   public static bxe.a gx() {
      return cnh.gr().a(bxf.A, 0.0).a(bxf.v, 0.23F).a(bxf.c, 5.0);
   }

   @Override
   public bve e(bwj $$0) {
      return this.e_() ? c : super.e($$0);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected void a(arx $$0) {
      bxb $$1 = this.g(bxf.v);
      if (this.ad_()) {
         if (!this.e_() && !$$1.b(cc)) {
            $$1.b(cd);
         }

         this.gy();
      } else if ($$1.b(cc)) {
         $$1.c(cc);
      }

      this.a($$0, true);
      if (this.O_() != null) {
         this.gz();
      }

      if (this.ad_()) {
         this.bd = this.af;
      }

      super.a($$0);
   }

   private void gy() {
      if (this.cf > 0) {
         this.cf--;
         if (this.cf == 0) {
            this.gB();
         }
      }
   }

   private void gz() {
      if (this.cl > 0) {
         this.cl--;
      } else {
         if (this.N().a(this.O_())) {
            this.gA();
         }

         this.cl = ck.a(this.ae);
      }
   }

   private void gA() {
      double $$0 = this.h(bxf.m);
      fbm $$1 = fbm.a(this.du()).c($$0, 10.0, $$0);
      this.dW()
         .a(cnj.class, $$1, bvg.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.O_() == null)
         .filter($$0x -> !$$0x.s(this.O_()))
         .forEach($$0x -> $$0x.h(this.O_()));
   }

   private void gB() {
      this.a(awv.Ev, this.fg() * 2.0F, this.fh() * 1.8F);
   }

   @Override
   public void h(@Nullable bvx $$0) {
      if (this.O_() == null && $$0 != null) {
         this.cf = ce.a(this.ae);
         this.cl = ck.a(this.ae);
      }

      if ($$0 instanceof cpo) {
         this.c((cpo)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ae));
   }

   public static boolean b(bvi<cnj> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.am() != bsx.a && !$$1.a_($$3.e()).a(dkf.lm);
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this) && !$$0.d(this.cR());
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a(this.dW(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   protected awu u() {
      return this.ad_() ? awv.Ev : awv.Eu;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.Ex;
   }

   @Override
   protected awu o_() {
      return awv.Ew;
   }

   @Override
   protected void a(bac $$0, bsy $$1) {
      this.a(bvj.a, new cxg(cxk.pB));
   }

   @Override
   protected cxg go() {
      return cxg.j;
   }

   @Override
   protected void gw() {
      this.g(bxf.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   public boolean a(arx $$0, cpo $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(arx $$0, cxg $$1) {
      return this.g($$1);
   }
}
