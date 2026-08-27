import java.util.UUID;
import javax.annotation.Nullable;

public class cdr extends cdp implements bmv {
   private static final blz c = bmc.bv.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bns bX = new bns(d, "Attacking speed boost", 0.05, bns.a.a);
   private static final bjn bY = avq.a(0, 1);
   private int bZ;
   private static final bjn ca = avq.a(20, 39);
   private int cb;
   @Nullable
   private UUID cc;
   private static final int cd = 10;
   private static final bjn ce = avq.a(4, 6);
   private int cf;

   public cdr(bmc<? extends cdr> $$0, ctx $$1) {
      super($$0, $$1);
      this.a(efk.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cc = $$0;
   }

   @Override
   protected void w() {
      this.bP.a(2, new buz(this, 1.0, false));
      this.bP.a(7, new bux(this, 1.0));
      this.bQ.a(1, new bvc(this).a());
      this.bQ.a(2, new bvd<>(this, cfq.class, 10, true, false, this::a_));
      this.bQ.a(3, new bvj<>(this, true));
   }

   public static bnt.a gp() {
      return cdp.gj().a(bnu.q, 0.0).a(bnu.o, 0.23F).a(bnu.c, 5.0);
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gh() {
      return false;
   }

   @Override
   protected void aa() {
      bnq $$0 = this.f(bnu.o);
      if (this.aa_()) {
         if (!this.o_() && !$$0.a(bX)) {
            $$0.c(bX);
         }

         this.gq();
      } else if ($$0.a(bX)) {
         $$0.b(bX.a());
      }

      this.a((ane)this.dL(), true);
      if (this.q() != null) {
         this.gr();
      }

      if (this.aa_()) {
         this.aZ = this.ah;
      }

      super.aa();
   }

   private void gq() {
      if (this.bZ > 0) {
         this.bZ--;
         if (this.bZ == 0) {
            this.gt();
         }
      }
   }

   private void gr() {
      if (this.cf > 0) {
         this.cf--;
      } else {
         if (this.O().a(this.q())) {
            this.gs();
         }

         this.cf = ce.a(this.ag);
      }
   }

   private void gs() {
      double $$0 = this.g(bnu.i);
      elx $$1 = elx.a(this.dj()).c($$0, 10.0, $$0);
      this.dL()
         .a(cdr.class, $$1, bmb.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.r(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gt() {
      this.a(art.CE, this.eW() * 2.0F, this.eX() * 1.8F);
   }

   @Override
   public void h(@Nullable bmo $$0) {
      if (this.q() == null && $$0 != null) {
         this.bZ = bY.a(this.ag);
         this.cf = ce.a(this.ag);
      }

      if ($$0 instanceof cfq) {
         this.c((cfq)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ca.a(this.ag));
   }

   public static boolean b(bmc<cdr> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.ak() != bjz.a && !$$1.a_($$3.d()).a(cxa.kK);
   }

   @Override
   public boolean a(cua $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a(this.dL(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cb = $$0;
   }

   @Override
   public int a() {
      return this.cb;
   }

   @Override
   protected ars y() {
      return this.aa_() ? art.CE : art.CD;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.CG;
   }

   @Override
   protected ars n_() {
      return art.CF;
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      this.a(bmd.a, new cng(cnj.oU));
   }

   @Override
   protected cng gg() {
      return cng.f;
   }

   @Override
   protected void go() {
      this.f(bnu.q).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cc;
   }

   @Override
   public boolean f(cfq $$0) {
      return this.a_((bmo)$$0);
   }

   @Override
   public boolean k(cng $$0) {
      return this.j($$0);
   }
}
