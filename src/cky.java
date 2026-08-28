import java.util.UUID;
import javax.annotation.Nullable;

public class cky extends ckw implements btv {
   private static final bsx c = bta.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final buv cb = new buv(d, "Attacking speed boost", 0.05, buv.a.a);
   private static final bqf cc = azz.a(0, 1);
   private int cd;
   private static final bqf ce = azz.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final bqf ci = azz.a(4, 6);
   private int cj;

   public cky(bta<? extends cky> $$0, dby $$1) {
      super($$0, $$1);
      this.a(eom.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void u() {
      this.bS.a(2, new ccc(this, 1.0, false));
      this.bS.a(7, new cca(this, 1.0));
      this.bT.a(1, new ccf(this).a());
      this.bT.a(2, new ccg<>(this, cmx.class, 10, true, false, this::a_));
      this.bT.a(3, new ccm<>(this, true));
   }

   public static buw.a gA() {
      return ckw.gu().a(bux.u, 0.0).a(bux.r, 0.23F).a(bux.c, 5.0);
   }

   @Override
   public bsx e(bub $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   protected void Z() {
      but $$0 = this.f(bux.r);
      if (this.Z_()) {
         if (!this.p_() && !$$0.a(cb)) {
            $$0.c(cb);
         }

         this.gB();
      } else if ($$0.a(cb)) {
         $$0.b(cb.b());
      }

      this.a((arf)this.dP(), true);
      if (this.p() != null) {
         this.gC();
      }

      if (this.Z_()) {
         this.bd = this.ai;
      }

      super.Z();
   }

   private void gB() {
      if (this.cd > 0) {
         this.cd--;
         if (this.cd == 0) {
            this.gE();
         }
      }
   }

   private void gC() {
      if (this.cj > 0) {
         this.cj--;
      } else {
         if (this.M().a(this.p())) {
            this.gD();
         }

         this.cj = ci.a(this.ah);
      }
   }

   private void gD() {
      double $$0 = this.g(bux.k);
      evm $$1 = evm.a(this.dn()).c($$0, 10.0, $$0);
      this.dP()
         .a(cky.class, $$1, bsz.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gE() {
      this.a(awa.DC, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void h(@Nullable btp $$0) {
      if (this.p() == null && $$0 != null) {
         this.cd = cc.a(this.ah);
         this.cj = ci.a(this.ah);
      }

      if ($$0 instanceof cmx) {
         this.c((cmx)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   public static boolean b(bta<cky> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return $$1.al() != bqr.a && !$$1.a_($$3.d()).a(dfb.kK);
   }

   @Override
   public boolean a(dcb $$0) {
      return $$0.f(this) && !$$0.d(this.cK());
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(this.dP(), $$0);
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
   protected avz v() {
      return this.Z_() ? awa.DC : awa.DB;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.DE;
   }

   @Override
   protected avz o_() {
      return awa.DD;
   }

   @Override
   protected void a(azh $$0, bqs $$1) {
      this.a(btb.a, new cup(cus.oV));
   }

   @Override
   protected cup gr() {
      return cup.l;
   }

   @Override
   protected void gz() {
      this.f(bux.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean f(cmx $$0) {
      return this.a_((btp)$$0);
   }

   @Override
   public boolean k(cup $$0) {
      return this.j($$0);
   }
}
