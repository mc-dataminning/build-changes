import java.util.UUID;
import javax.annotation.Nullable;

public class ckz extends ckx implements btw {
   private static final bsy c = btb.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final buw cb = new buw(d, "Attacking speed boost", 0.05, buw.a.a);
   private static final bqg cc = azz.a(0, 1);
   private int cd;
   private static final bqg ce = azz.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final bqg ci = azz.a(4, 6);
   private int cj;

   public ckz(btb<? extends ckz> $$0, dbz $$1) {
      super($$0, $$1);
      this.a(eon.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void u() {
      this.bS.a(2, new ccd(this, 1.0, false));
      this.bS.a(7, new ccb(this, 1.0));
      this.bT.a(1, new ccg(this).a());
      this.bT.a(2, new cch<>(this, cmy.class, 10, true, false, this::a_));
      this.bT.a(3, new ccn<>(this, true));
   }

   public static bux.a gA() {
      return ckx.gu().a(buy.u, 0.0).a(buy.r, 0.23F).a(buy.c, 5.0);
   }

   @Override
   public bsy e(buc $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   protected void Z() {
      buu $$0 = this.f(buy.r);
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
      double $$0 = this.g(buy.k);
      evn $$1 = evn.a(this.dn()).c($$0, 10.0, $$0);
      this.dP()
         .a(ckz.class, $$1, bta.f)
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
   public void h(@Nullable btq $$0) {
      if (this.p() == null && $$0 != null) {
         this.cd = cc.a(this.ah);
         this.cj = ci.a(this.ah);
      }

      if ($$0 instanceof cmy) {
         this.c((cmy)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   public static boolean b(btb<ckz> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.al() != bqs.a && !$$1.a_($$3.d()).a(dfc.kK);
   }

   @Override
   public boolean a(dcc $$0) {
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
   protected avz d(bro $$0) {
      return awa.DE;
   }

   @Override
   protected avz o_() {
      return awa.DD;
   }

   @Override
   protected void a(azh $$0, bqt $$1) {
      this.a(btc.a, new cuq(cut.oV));
   }

   @Override
   protected cuq gr() {
      return cuq.l;
   }

   @Override
   protected void gz() {
      this.f(buy.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean f(cmy $$0) {
      return this.a_((btq)$$0);
   }

   @Override
   public boolean k(cuq $$0) {
      return this.j($$0);
   }
}
