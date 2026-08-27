import java.util.UUID;
import javax.annotation.Nullable;

public class cgv extends cgt implements bpv {
   private static final bpa c = bpd.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bqu ca = new bqu(d, "Attacking speed boost", 0.05, bqu.a.a);
   private static final bmo cb = axv.a(0, 1);
   private int cc;
   private static final bmo cd = axv.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;
   private static final int cg = 10;
   private static final bmo ch = axv.a(4, 6);
   private int ci;

   public cgv(bpd<? extends cgv> $$0, cxb $$1) {
      super($$0, $$1);
      this.a(ejg.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cf = $$0;
   }

   @Override
   protected void s() {
      this.bR.a(2, new byb(this, 1.0, false));
      this.bR.a(7, new bxz(this, 1.0));
      this.bS.a(1, new bye(this).a());
      this.bS.a(2, new byf<>(this, ciu.class, 10, true, false, this::a_));
      this.bS.a(3, new byl<>(this, true));
   }

   public static bqv.a gx() {
      return cgt.gr().a(bqw.u, 0.0).a(bqw.r, 0.23F).a(bqw.c, 5.0);
   }

   @Override
   public bpa e(bqa $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected void Y() {
      bqs $$0 = this.f(bqw.r);
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
      double $$0 = this.g(bqw.k);
      epo $$1 = epo.a(this.dk()).c($$0, 10.0, $$0);
      this.dM()
         .a(cgv.class, $$1, bpc.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gB() {
      this.a(aty.Db, this.fb() * 2.0F, this.fc() * 1.8F);
   }

   @Override
   public void h(@Nullable bpp $$0) {
      if (this.p() == null && $$0 != null) {
         this.cc = cb.a(this.ag);
         this.ci = ch.a(this.ag);
      }

      if ($$0 instanceof ciu) {
         this.c((ciu)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cd.a(this.ag));
   }

   public static boolean b(bpd<cgv> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.aj() != bna.a && !$$1.a_($$3.d()).a(dae.kK);
   }

   @Override
   public boolean a(cxe $$0) {
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
      return this.Y_() ? aty.Db : aty.Da;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.Dd;
   }

   @Override
   protected atx n_() {
      return aty.Dc;
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      this.a(bpe.a, new cqm(cqp.oU));
   }

   @Override
   protected cqm go() {
      return cqm.h;
   }

   @Override
   protected void gw() {
      this.f(bqw.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cf;
   }

   @Override
   public boolean f(ciu $$0) {
      return this.a_((bpp)$$0);
   }

   @Override
   public boolean k(cqm $$0) {
      return this.j($$0);
   }
}
