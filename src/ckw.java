import java.util.UUID;
import javax.annotation.Nullable;

public class ckw extends cku implements btt {
   private static final bsv c = bsy.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final but cb = new but(d, "Attacking speed boost", 0.05, but.a.a);
   private static final bqd cc = azx.a(0, 1);
   private int cd;
   private static final bqd ce = azx.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final bqd ci = azx.a(4, 6);
   private int cj;

   public ckw(bsy<? extends ckw> $$0, dbw $$1) {
      super($$0, $$1);
      this.a(eok.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void u() {
      this.bS.a(2, new cca(this, 1.0, false));
      this.bS.a(7, new cby(this, 1.0));
      this.bT.a(1, new ccd(this).a());
      this.bT.a(2, new cce<>(this, cmv.class, 10, true, false, this::a_));
      this.bT.a(3, new cck<>(this, true));
   }

   public static buu.a gA() {
      return cku.gu().a(buv.u, 0.0).a(buv.r, 0.23F).a(buv.c, 5.0);
   }

   @Override
   public bsv e(btz $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   protected void Z() {
      bur $$0 = this.f(buv.r);
      if (this.Z_()) {
         if (!this.p_() && !$$0.a(cb)) {
            $$0.c(cb);
         }

         this.gB();
      } else if ($$0.a(cb)) {
         $$0.b(cb.b());
      }

      this.a((are)this.dP(), true);
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
      double $$0 = this.g(buv.k);
      evk $$1 = evk.a(this.dn()).c($$0, 10.0, $$0);
      this.dP()
         .a(ckw.class, $$1, bsx.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gE() {
      this.a(avz.DC, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void h(@Nullable btn $$0) {
      if (this.p() == null && $$0 != null) {
         this.cd = cc.a(this.ah);
         this.cj = ci.a(this.ah);
      }

      if ($$0 instanceof cmv) {
         this.c((cmv)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   public static boolean b(bsy<ckw> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return $$1.al() != bqp.a && !$$1.a_($$3.d()).a(dez.kK);
   }

   @Override
   public boolean a(dbz $$0) {
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
   protected avy v() {
      return this.Z_() ? avz.DC : avz.DB;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.DE;
   }

   @Override
   protected avy o_() {
      return avz.DD;
   }

   @Override
   protected void a(azf $$0, bqq $$1) {
      this.a(bsz.a, new cun(cuq.oV));
   }

   @Override
   protected cun gr() {
      return cun.l;
   }

   @Override
   protected void gz() {
      this.f(buv.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean f(cmv $$0) {
      return this.a_((btn)$$0);
   }

   @Override
   public boolean k(cun $$0) {
      return this.j($$0);
   }
}
