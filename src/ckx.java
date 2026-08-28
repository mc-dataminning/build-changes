import java.util.UUID;
import javax.annotation.Nullable;

public class ckx extends ckv implements btu {
   private static final bsw c = bsz.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final buu cb = new buu(d, "Attacking speed boost", 0.05, buu.a.a);
   private static final bqe cc = azy.a(0, 1);
   private int cd;
   private static final bqe ce = azy.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final bqe ci = azy.a(4, 6);
   private int cj;

   public ckx(bsz<? extends ckx> $$0, dbx $$1) {
      super($$0, $$1);
      this.a(eol.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void u() {
      this.bS.a(2, new ccb(this, 1.0, false));
      this.bS.a(7, new cbz(this, 1.0));
      this.bT.a(1, new cce(this).a());
      this.bT.a(2, new ccf<>(this, cmw.class, 10, true, false, this::a_));
      this.bT.a(3, new ccl<>(this, true));
   }

   public static buv.a gA() {
      return ckv.gu().a(buw.u, 0.0).a(buw.r, 0.23F).a(buw.c, 5.0);
   }

   @Override
   public bsw e(bua $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   protected void Z() {
      bus $$0 = this.f(buw.r);
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
      double $$0 = this.g(buw.k);
      evl $$1 = evl.a(this.dn()).c($$0, 10.0, $$0);
      this.dP()
         .a(ckx.class, $$1, bsy.f)
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
   public void h(@Nullable bto $$0) {
      if (this.p() == null && $$0 != null) {
         this.cd = cc.a(this.ah);
         this.cj = ci.a(this.ah);
      }

      if ($$0 instanceof cmw) {
         this.c((cmw)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   public static boolean b(bsz<ckx> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.al() != bqq.a && !$$1.a_($$3.d()).a(dfa.kK);
   }

   @Override
   public boolean a(dca $$0) {
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
   protected avy d(brm $$0) {
      return avz.DE;
   }

   @Override
   protected avy o_() {
      return avz.DD;
   }

   @Override
   protected void a(azg $$0, bqr $$1) {
      this.a(bta.a, new cuo(cur.oV));
   }

   @Override
   protected cuo gr() {
      return cuo.l;
   }

   @Override
   protected void gz() {
      this.f(buw.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean f(cmw $$0) {
      return this.a_((bto)$$0);
   }

   @Override
   public boolean k(cuo $$0) {
      return this.j($$0);
   }
}
