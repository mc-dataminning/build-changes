import java.util.UUID;
import javax.annotation.Nullable;

public class cim extends cik implements brk {
   private static final bqo c = bqr.bw.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bsj cb = new bsj(d, "Attacking speed boost", 0.05, bsj.a.a);
   private static final bob cc = ayv.a(0, 1);
   private int cd;
   private static final bob ce = ayv.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final bob ci = ayv.a(4, 6);
   private int cj;

   public cim(bqr<? extends cim> $$0, czu $$1) {
      super($$0, $$1);
      this.a(emi.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void u() {
      this.bS.a(2, new bzq(this, 1.0, false));
      this.bS.a(7, new bzo(this, 1.0));
      this.bT.a(1, new bzt(this).a());
      this.bT.a(2, new bzu<>(this, ckl.class, 10, true, false, this::a_));
      this.bT.a(3, new caa<>(this, true));
   }

   public static bsk.a gz() {
      return cik.gt().a(bsl.u, 0.0).a(bsl.r, 0.23F).a(bsl.c, 5.0);
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   protected void Y() {
      bsh $$0 = this.f(bsl.r);
      if (this.Z_()) {
         if (!this.p_() && !$$0.a(cb)) {
            $$0.c(cb);
         }

         this.gA();
      } else if ($$0.a(cb)) {
         $$0.b(cb.b());
      }

      this.a((aqe)this.dN(), true);
      if (this.p() != null) {
         this.gB();
      }

      if (this.Z_()) {
         this.be = this.ai;
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
      double $$0 = this.g(bsl.k);
      eta $$1 = eta.a(this.dl()).c($$0, 10.0, $$0);
      this.dN()
         .a(cim.class, $$1, bqq.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gD() {
      this.a(auz.Dq, this.fc() * 2.0F, this.fd() * 1.8F);
   }

   @Override
   public void h(@Nullable bre $$0) {
      if (this.p() == null && $$0 != null) {
         this.cd = cc.a(this.ah);
         this.cj = ci.a(this.ah);
      }

      if ($$0 instanceof ckl) {
         this.c((ckl)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   public static boolean b(bqr<cim> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.ak() != bon.a && !$$1.a_($$3.d()).a(dcx.kK);
   }

   @Override
   public boolean a(czx $$0) {
      return $$0.f(this) && !$$0.d(this.cI());
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a(this.dN(), $$0);
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
   protected auy v() {
      return this.Z_() ? auz.Dq : auz.Dp;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.Ds;
   }

   @Override
   protected auy o_() {
      return auz.Dr;
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      this.a(bqs.a, new csd(csg.oV));
   }

   @Override
   protected csd gq() {
      return csd.i;
   }

   @Override
   protected void gy() {
      this.f(bsl.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean f(ckl $$0) {
      return this.a_((bre)$$0);
   }

   @Override
   public boolean k(csd $$0) {
      return this.j($$0);
   }
}
