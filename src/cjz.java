import java.util.UUID;
import javax.annotation.Nullable;

public class cjz extends cjx implements bsw {
   private static final brz c = bsc.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final btw cb = new btw(d, "Attacking speed boost", 0.05, btw.a.a);
   private static final bph cc = aze.a(0, 1);
   private int cd;
   private static final bph ce = aze.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final bph ci = aze.a(4, 6);
   private int cj;

   public cjz(bsc<? extends cjz> $$0, daz $$1) {
      super($$0, $$1);
      this.a(enn.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void u() {
      this.bS.a(2, new cbd(this, 1.0, false));
      this.bS.a(7, new cbb(this, 1.0));
      this.bT.a(1, new cbg(this).a());
      this.bT.a(2, new cbh<>(this, cly.class, 10, true, false, this::a_));
      this.bT.a(3, new cbn<>(this, true));
   }

   public static btx.a gz() {
      return cjx.gt().a(bty.u, 0.0).a(bty.r, 0.23F).a(bty.c, 5.0);
   }

   @Override
   public brz e(btc $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   protected void Y() {
      btu $$0 = this.f(bty.r);
      if (this.Z_()) {
         if (!this.p_() && !$$0.a(cb)) {
            $$0.c(cb);
         }

         this.gA();
      } else if ($$0.a(cb)) {
         $$0.b(cb.b());
      }

      this.a((aqn)this.dP(), true);
      if (this.p() != null) {
         this.gB();
      }

      if (this.Z_()) {
         this.bd = this.ai;
      }

      super.Y();
   }

   private void gA() {
      if (this.cd > 0) {
         this.cd--;
         if (this.cd == 0) {
            this.gD();
         }
      }
   }

   private void gB() {
      if (this.cj > 0) {
         this.cj--;
      } else {
         if (this.M().a(this.p())) {
            this.gC();
         }

         this.cj = ci.a(this.ah);
      }
   }

   private void gC() {
      double $$0 = this.g(bty.k);
      euh $$1 = euh.a(this.dn()).c($$0, 10.0, $$0);
      this.dP()
         .a(cjz.class, $$1, bsb.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gD() {
      this.a(avi.DC, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void h(@Nullable bsq $$0) {
      if (this.p() == null && $$0 != null) {
         this.cd = cc.a(this.ah);
         this.cj = ci.a(this.ah);
      }

      if ($$0 instanceof cly) {
         this.c((cly)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   public static boolean b(bsc<cjz> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.ak() != bpt.a && !$$1.a_($$3.d()).a(dec.kK);
   }

   @Override
   public boolean a(dbc $$0) {
      return $$0.f(this) && !$$0.d(this.cK());
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(ud $$0) {
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
   protected avh v() {
      return this.Z_() ? avi.DC : avi.DB;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.DE;
   }

   @Override
   protected avh o_() {
      return avi.DD;
   }

   @Override
   protected void a(aym $$0, bpu $$1) {
      this.a(bsd.a, new ctq(ctt.oV));
   }

   @Override
   protected ctq gq() {
      return ctq.i;
   }

   @Override
   protected void gy() {
      this.f(bty.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean f(cly $$0) {
      return this.a_((bsq)$$0);
   }

   @Override
   public boolean k(ctq $$0) {
      return this.j($$0);
   }
}
