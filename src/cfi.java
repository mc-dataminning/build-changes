import java.util.UUID;
import javax.annotation.Nullable;

public class cfi extends cfg implements bom {
   private static final bnr c = bnu.bv.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bpj bW = new bpj(d, "Attacking speed boost", 0.05, bpj.a.a);
   private static final blf bX = axh.a(0, 1);
   private int bY;
   private static final blf bZ = axh.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final blf cd = axh.a(4, 6);
   private int ce;

   public cfi(bnu<? extends cfi> $$0, cvn $$1) {
      super($$0, $$1);
      this.a(eha.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void w() {
      this.bO.a(2, new bwq(this, 1.0, false));
      this.bO.a(7, new bwo(this, 1.0));
      this.bP.a(1, new bwt(this).a());
      this.bP.a(2, new bwu<>(this, chh.class, 10, true, false, this::a_));
      this.bP.a(3, new bxa<>(this, true));
   }

   public static bpk.a gq() {
      return cfg.gk().a(bpl.q, 0.0).a(bpl.o, 0.23F).a(bpl.c, 5.0);
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gi() {
      return false;
   }

   @Override
   protected void aa() {
      bph $$0 = this.f(bpl.o);
      if (this.aa_()) {
         if (!this.o_() && !$$0.a(bW)) {
            $$0.c(bW);
         }

         this.gr();
      } else if ($$0.a(bW)) {
         $$0.b(bW.a());
      }

      this.a((aov)this.dM(), true);
      if (this.q() != null) {
         this.gs();
      }

      if (this.aa_()) {
         this.aZ = this.ag;
      }

      super.aa();
   }

   private void gr() {
      if (this.bY > 0) {
         this.bY--;
         if (this.bY == 0) {
            this.gu();
         }
      }
   }

   private void gs() {
      if (this.ce > 0) {
         this.ce--;
      } else {
         if (this.O().a(this.q())) {
            this.gt();
         }

         this.ce = cd.a(this.af);
      }
   }

   private void gt() {
      double $$0 = this.g(bpl.i);
      enn $$1 = enn.a(this.dk()).c($$0, 10.0, $$0);
      this.dM()
         .a(cfi.class, $$1, bnt.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.r(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gu() {
      this.a(atk.CE, this.eW() * 2.0F, this.eX() * 1.8F);
   }

   @Override
   public void h(@Nullable bog $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.af);
         this.ce = cd.a(this.af);
      }

      if ($$0 instanceof chh) {
         this.c((chh)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.af));
   }

   public static boolean b(bnu<cfi> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.ak() != blr.a && !$$1.a_($$3.d()).a(cyq.kK);
   }

   @Override
   public boolean a(cvq $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   protected atj y() {
      return this.aa_() ? atk.CE : atk.CD;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.CG;
   }

   @Override
   protected atj n_() {
      return atk.CF;
   }

   @Override
   protected void a(awo $$0, bls $$1) {
      this.a(bnv.a, new coz(cpc.oU));
   }

   @Override
   protected coz gh() {
      return coz.h;
   }

   @Override
   protected void gp() {
      this.f(bpl.q).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(chh $$0) {
      return this.a_((bog)$$0);
   }

   @Override
   public boolean k(coz $$0) {
      return this.j($$0);
   }
}
