import java.util.UUID;
import javax.annotation.Nullable;

public class cmq extends cmo implements bvj {
   private static final bul c = bup.bx.n().a(0.5F).b(0.97F);
   private static final all d = all.b("attacking");
   private static final bwk cb = new bwk(d, 0.05, bwk.a.a);
   private static final brs cc = bap.a(0, 1);
   private int cd;
   private static final brs ce = bap.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final brs ci = bap.a(4, 6);
   private int cj;

   public cmq(bup<? extends cmq> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void t() {
      this.bS.a(2, new cdr(this, 1.0, false));
      this.bS.a(7, new cdp(this, 1.0));
      this.bT.a(1, new cdu(this).a());
      this.bT.a(2, new cdv<>(this, cor.class, 10, true, false, this::a_));
      this.bT.a(3, new ceb<>(this, true));
   }

   public static bwl.a gE() {
      return cmo.gy().a(bwm.A, 0.0).a(bwm.v, 0.23F).a(bwm.c, 5.0);
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   protected void ac() {
      bwi $$0 = this.g(bwm.v);
      if (this.ae_()) {
         if (!this.p_() && !$$0.b(d)) {
            $$0.b(cb);
         }

         this.gF();
      } else if ($$0.b(d)) {
         $$0.c(d);
      }

      this.a((arq)this.dY(), true);
      if (this.m() != null) {
         this.gG();
      }

      if (this.ae_()) {
         this.bd = this.ag;
      }

      super.ac();
   }

   private void gF() {
      if (this.cd > 0) {
         this.cd--;
         if (this.cd == 0) {
            this.gI();
         }
      }
   }

   private void gG() {
      if (this.cj > 0) {
         this.cj--;
      } else {
         if (this.Q().a(this.m())) {
            this.gH();
         }

         this.cj = ci.a(this.af);
      }
   }

   private void gH() {
      double $$0 = this.h(bwm.m);
      ezm $$1 = ezm.a(this.dw()).c($$0, 10.0, $$0);
      this.dY()
         .a(cmq.class, $$1, bun.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.m() == null)
         .filter($$0x -> !$$0x.s(this.m()))
         .forEach($$0x -> $$0x.h(this.m()));
   }

   private void gI() {
      this.a(awo.DK, this.fj() * 2.0F, this.fk() * 1.8F);
   }

   @Override
   public void h(@Nullable bve $$0) {
      if (this.m() == null && $$0 != null) {
         this.cd = cc.a(this.af);
         this.cj = ci.a(this.af);
      }

      if ($$0 instanceof cor) {
         this.c((cor)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.af));
   }

   public static boolean b(bup<cmq> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.ak() != bse.a && !$$1.a_($$3.e()).a(dil.kK);
   }

   @Override
   public boolean a(dfi $$0) {
      return $$0.f(this) && !$$0.d(this.cT());
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a(this.dY(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   protected awn w() {
      return this.ae_() ? awo.DK : awo.DJ;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.DM;
   }

   @Override
   protected awn o_() {
      return awo.DL;
   }

   @Override
   protected void a(azv $$0, bsf $$1) {
      this.a(buq.a, new cwf(cwj.oX));
   }

   @Override
   protected cwf gv() {
      return cwf.k;
   }

   @Override
   protected void gD() {
      this.g(bwm.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean a(cor $$0) {
      return this.a_((bve)$$0);
   }

   @Override
   public boolean i(cwf $$0) {
      return this.h($$0);
   }
}
