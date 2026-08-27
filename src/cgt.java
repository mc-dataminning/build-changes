import java.util.UUID;
import javax.annotation.Nullable;

public class cgt extends cgr implements bpu {
   private static final boz c = bpc.bw.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bqt ca = new bqt(d, "Attacking speed boost", 0.05, bqt.a.a);
   private static final bmn cb = axv.a(0, 1);
   private int cc;
   private static final bmn cd = axv.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;
   private static final int cg = 10;
   private static final bmn ch = axv.a(4, 6);
   private int ci;

   public cgt(bpc<? extends cgt> $$0, cwz $$1) {
      super($$0, $$1);
      this.a(eiy.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cf = $$0;
   }

   @Override
   protected void s() {
      this.bR.a(2, new bya(this, 1.0, false));
      this.bR.a(7, new bxy(this, 1.0));
      this.bS.a(1, new byd(this).a());
      this.bS.a(2, new bye<>(this, cis.class, 10, true, false, this::a_));
      this.bS.a(3, new byk<>(this, true));
   }

   public static bqu.a gx() {
      return cgr.gr().a(bqv.u, 0.0).a(bqv.r, 0.23F).a(bqv.c, 5.0);
   }

   @Override
   public boz e(bpz $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected void Y() {
      bqr $$0 = this.f(bqv.r);
      if (this.Y_()) {
         if (!this.o_() && !$$0.a(ca)) {
            $$0.c(ca);
         }

         this.gy();
      } else if ($$0.a(ca)) {
         $$0.b(ca.a());
      }

      this.a((apf)this.dM(), true);
      if (this.p() != null) {
         this.gz();
      }

      if (this.Y_()) {
         this.bc = this.ah;
      }

      super.Y();
   }

   private void gy() {
      if (this.cc > 0) {
         this.cc--;
         if (this.cc == 0) {
            this.gB();
         }
      }
   }

   private void gz() {
      if (this.ci > 0) {
         this.ci--;
      } else {
         if (this.M().a(this.p())) {
            this.gA();
         }

         this.ci = ch.a(this.ag);
      }
   }

   private void gA() {
      double $$0 = this.g(bqv.k);
      epm $$1 = epm.a(this.dk()).c($$0, 10.0, $$0);
      this.dM()
         .a(cgt.class, $$1, bpb.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gB() {
      this.a(aty.CW, this.fb() * 2.0F, this.fc() * 1.8F);
   }

   @Override
   public void h(@Nullable bpo $$0) {
      if (this.p() == null && $$0 != null) {
         this.cc = cb.a(this.ag);
         this.ci = ch.a(this.ag);
      }

      if ($$0 instanceof cis) {
         this.c((cis)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cd.a(this.ag));
   }

   public static boolean b(bpc<cgt> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.aj() != bmz.a && !$$1.a_($$3.d()).a(dac.kK);
   }

   @Override
   public boolean a(cxc $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.ce = $$0;
   }

   @Override
   public int a() {
      return this.ce;
   }

   @Override
   protected atx v() {
      return this.Y_() ? aty.CW : aty.CV;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.CY;
   }

   @Override
   protected atx n_() {
      return aty.CX;
   }

   @Override
   protected void a(axd $$0, bna $$1) {
      this.a(bpd.a, new cqk(cqn.oU));
   }

   @Override
   protected cqk go() {
      return cqk.h;
   }

   @Override
   protected void gw() {
      this.f(bqv.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cf;
   }

   @Override
   public boolean f(cis $$0) {
      return this.a_((bpo)$$0);
   }

   @Override
   public boolean k(cqk $$0) {
      return this.j($$0);
   }
}
