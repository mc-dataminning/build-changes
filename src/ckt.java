import java.util.UUID;
import javax.annotation.Nullable;

public class ckt extends ckr implements btq {
   private static final bss c = bsv.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final buq cb = new buq(d, "Attacking speed boost", 0.05, buq.a.a);
   private static final bqa cc = azu.a(0, 1);
   private int cd;
   private static final bqa ce = azu.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final bqa ci = azu.a(4, 6);
   private int cj;

   public ckt(bsv<? extends ckt> $$0, dbt $$1) {
      super($$0, $$1);
      this.a(eoh.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void u() {
      this.bS.a(2, new cbx(this, 1.0, false));
      this.bS.a(7, new cbv(this, 1.0));
      this.bT.a(1, new cca(this).a());
      this.bT.a(2, new ccb<>(this, cms.class, 10, true, false, this::a_));
      this.bT.a(3, new cch<>(this, true));
   }

   public static bur.a gA() {
      return ckr.gu().a(bus.u, 0.0).a(bus.r, 0.23F).a(bus.c, 5.0);
   }

   @Override
   public bss e(btw $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   protected void Z() {
      buo $$0 = this.f(bus.r);
      if (this.Z_()) {
         if (!this.p_() && !$$0.a(cb)) {
            $$0.c(cb);
         }

         this.gB();
      } else if ($$0.a(cb)) {
         $$0.b(cb.b());
      }

      this.a((arb)this.dP(), true);
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
      double $$0 = this.g(bus.k);
      evh $$1 = evh.a(this.dn()).c($$0, 10.0, $$0);
      this.dP()
         .a(ckt.class, $$1, bsu.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gE() {
      this.a(avw.DC, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void h(@Nullable btk $$0) {
      if (this.p() == null && $$0 != null) {
         this.cd = cc.a(this.ah);
         this.cj = ci.a(this.ah);
      }

      if ($$0 instanceof cms) {
         this.c((cms)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   public static boolean b(bsv<ckt> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.al() != bqm.a && !$$1.a_($$3.d()).a(dew.kK);
   }

   @Override
   public boolean a(dbw $$0) {
      return $$0.f(this) && !$$0.d(this.cK());
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(ur $$0) {
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
   protected avv v() {
      return this.Z_() ? avw.DC : avw.DB;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.DE;
   }

   @Override
   protected avv o_() {
      return avw.DD;
   }

   @Override
   protected void a(azc $$0, bqn $$1) {
      this.a(bsw.a, new cuk(cun.oV));
   }

   @Override
   protected cuk gr() {
      return cuk.l;
   }

   @Override
   protected void gz() {
      this.f(bus.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean f(cms $$0) {
      return this.a_((btk)$$0);
   }

   @Override
   public boolean k(cuk $$0) {
      return this.j($$0);
   }
}
