import java.util.UUID;
import javax.annotation.Nullable;

public class cji extends cjg implements bsg {
   private static final brk c = brn.bw.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final btf cb = new btf(d, "Attacking speed boost", 0.05, btf.a.a);
   private static final box cc = ayy.a(0, 1);
   private int cd;
   private static final box ce = ayy.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final box ci = ayy.a(4, 6);
   private int cj;

   public cji(brn<? extends cji> $$0, dad $$1) {
      super($$0, $$1);
      this.a(emr.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void u() {
      this.bS.a(2, new cam(this, 1.0, false));
      this.bS.a(7, new cak(this, 1.0));
      this.bT.a(1, new cap(this).a());
      this.bT.a(2, new caq<>(this, clh.class, 10, true, false, this::a_));
      this.bT.a(3, new caw<>(this, true));
   }

   public static btg.a gz() {
      return cjg.gt().a(bth.u, 0.0).a(bth.r, 0.23F).a(bth.c, 5.0);
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   protected void Y() {
      btd $$0 = this.f(bth.r);
      if (this.Z_()) {
         if (!this.p_() && !$$0.a(cb)) {
            $$0.c(cb);
         }

         this.gA();
      } else if ($$0.a(cb)) {
         $$0.b(cb.b());
      }

      this.a((aqh)this.dN(), true);
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
      double $$0 = this.g(bth.k);
      etk $$1 = etk.a(this.dl()).c($$0, 10.0, $$0);
      this.dN()
         .a(cji.class, $$1, brm.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gD() {
      this.a(avc.Dr, this.fc() * 2.0F, this.fd() * 1.8F);
   }

   @Override
   public void h(@Nullable bsa $$0) {
      if (this.p() == null && $$0 != null) {
         this.cd = cc.a(this.ah);
         this.cj = ci.a(this.ah);
      }

      if ($$0 instanceof clh) {
         this.c((clh)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   public static boolean b(brn<cji> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.ak() != bpj.a && !$$1.a_($$3.d()).a(ddg.kK);
   }

   @Override
   public boolean a(dag $$0) {
      return $$0.f(this) && !$$0.d(this.cI());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(ua $$0) {
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
   protected avb v() {
      return this.Z_() ? avc.Dr : avc.Dq;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.Dt;
   }

   @Override
   protected avb o_() {
      return avc.Ds;
   }

   @Override
   protected void a(ayg $$0, bpk $$1) {
      this.a(bro.a, new csz(ctc.oV));
   }

   @Override
   protected csz gq() {
      return csz.i;
   }

   @Override
   protected void gy() {
      this.f(bth.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean f(clh $$0) {
      return this.a_((bsa)$$0);
   }

   @Override
   public boolean k(csz $$0) {
      return this.j($$0);
   }
}
