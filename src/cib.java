import java.util.UUID;
import javax.annotation.Nullable;

public class cib extends chz implements bqz {
   private static final bqd c = bqg.bw.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bry ca = new bry(d, "Attacking speed boost", 0.05, bry.a.a);
   private static final bnq cb = ayl.a(0, 1);
   private int cc;
   private static final bnq cd = ayl.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;
   private static final int cg = 10;
   private static final bnq ch = ayl.a(4, 6);
   private int ci;

   public cib(bqg<? extends cib> $$0, czg $$1) {
      super($$0, $$1);
      this.a(els.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cf = $$0;
   }

   @Override
   protected void u() {
      this.bR.a(2, new bzf(this, 1.0, false));
      this.bR.a(7, new bzd(this, 1.0));
      this.bS.a(1, new bzi(this).a());
      this.bS.a(2, new bzj<>(this, cka.class, 10, true, false, this::a_));
      this.bS.a(3, new bzp<>(this, true));
   }

   public static brz.a gx() {
      return chz.gr().a(bsa.u, 0.0).a(bsa.r, 0.23F).a(bsa.c, 5.0);
   }

   @Override
   public bqd e(bre $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected void Y() {
      brw $$0 = this.f(bsa.r);
      if (this.Z_()) {
         if (!this.p_() && !$$0.a(ca)) {
            $$0.c(ca);
         }

         this.gy();
      } else if ($$0.a(ca)) {
         $$0.b(ca.b());
      }

      this.a((apu)this.dM(), true);
      if (this.p() != null) {
         this.gz();
      }

      if (this.Z_()) {
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
      double $$0 = this.g(bsa.k);
      ese $$1 = ese.a(this.dk()).c($$0, 10.0, $$0);
      this.dM()
         .a(cib.class, $$1, bqf.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gB() {
      this.a(auo.Dj, this.fb() * 2.0F, this.fc() * 1.8F);
   }

   @Override
   public void h(@Nullable bqt $$0) {
      if (this.p() == null && $$0 != null) {
         this.cc = cb.a(this.ag);
         this.ci = ch.a(this.ag);
      }

      if ($$0 instanceof cka) {
         this.c((cka)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cd.a(this.ag));
   }

   public static boolean b(bqg<cib> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.ak() != boc.a && !$$1.a_($$3.d()).a(dcj.kK);
   }

   @Override
   public boolean a(czj $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(to $$0) {
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
   protected aun v() {
      return this.Z_() ? auo.Dj : auo.Di;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.Dl;
   }

   @Override
   protected aun o_() {
      return auo.Dk;
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      this.a(bqh.a, new crs(crv.oU));
   }

   @Override
   protected crs go() {
      return crs.i;
   }

   @Override
   protected void gw() {
      this.f(bsa.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cf;
   }

   @Override
   public boolean f(cka $$0) {
      return this.a_((bqt)$$0);
   }

   @Override
   public boolean k(crs $$0) {
      return this.j($$0);
   }
}
