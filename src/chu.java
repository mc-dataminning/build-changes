import java.util.UUID;
import javax.annotation.Nullable;

public class chu extends chs implements bqu {
   private static final bpy c = bqb.bw.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final brt ca = new brt(d, "Attacking speed boost", 0.05, brt.a.a);
   private static final bnl cb = ayj.a(0, 1);
   private int cc;
   private static final bnl cd = ayj.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;
   private static final int cg = 10;
   private static final bnl ch = ayj.a(4, 6);
   private int ci;

   public chu(bqb<? extends chu> $$0, cyx $$1) {
      super($$0, $$1);
      this.a(elj.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cf = $$0;
   }

   @Override
   protected void u() {
      this.bR.a(2, new bza(this, 1.0, false));
      this.bR.a(7, new byy(this, 1.0));
      this.bS.a(1, new bzd(this).a());
      this.bS.a(2, new bze<>(this, cjt.class, 10, true, false, this::a_));
      this.bS.a(3, new bzk<>(this, true));
   }

   public static bru.a gx() {
      return chs.gr().a(brv.u, 0.0).a(brv.r, 0.23F).a(brv.c, 5.0);
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected void Y() {
      brr $$0 = this.f(brv.r);
      if (this.Y_()) {
         if (!this.p_() && !$$0.a(ca)) {
            $$0.c(ca);
         }

         this.gy();
      } else if ($$0.a(ca)) {
         $$0.b(ca.a());
      }

      this.a((aps)this.dM(), true);
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
      double $$0 = this.g(brv.k);
      erv $$1 = erv.a(this.dk()).c($$0, 10.0, $$0);
      this.dM()
         .a(chu.class, $$1, bqa.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gB() {
      this.a(aum.Dj, this.fb() * 2.0F, this.fc() * 1.8F);
   }

   @Override
   public void h(@Nullable bqo $$0) {
      if (this.p() == null && $$0 != null) {
         this.cc = cb.a(this.ag);
         this.ci = ch.a(this.ag);
      }

      if ($$0 instanceof cjt) {
         this.c((cjt)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cd.a(this.ag));
   }

   public static boolean b(bqb<chu> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.ak() != bnx.a && !$$1.a_($$3.d()).a(dca.kK);
   }

   @Override
   public boolean a(cza $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(tm $$0) {
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
   protected aul v() {
      return this.Y_() ? aum.Dj : aum.Di;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.Dl;
   }

   @Override
   protected aul o_() {
      return aum.Dk;
   }

   @Override
   protected void a(axr $$0, bny $$1) {
      this.a(bqc.a, new crj(crm.oU));
   }

   @Override
   protected crj go() {
      return crj.i;
   }

   @Override
   protected void gw() {
      this.f(brv.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cf;
   }

   @Override
   public boolean f(cjt $$0) {
      return this.a_((bqo)$$0);
   }

   @Override
   public boolean k(crj $$0) {
      return this.j($$0);
   }
}
