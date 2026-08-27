import java.util.UUID;
import javax.annotation.Nullable;

public class cfm extends cfk implements boo {
   private static final bnt c = bnw.bv.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bpn bW = new bpn(d, "Attacking speed boost", 0.05, bpn.a.a);
   private static final blh bX = axh.a(0, 1);
   private int bY;
   private static final blh bZ = axh.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final blh cd = axh.a(4, 6);
   private int ce;

   public cfm(bnw<? extends cfm> $$0, cvr $$1) {
      super($$0, $$1);
      this.a(ehh.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void w() {
      this.bO.a(2, new bwu(this, 1.0, false));
      this.bO.a(7, new bws(this, 1.0));
      this.bP.a(1, new bwx(this).a());
      this.bP.a(2, new bwy<>(this, chl.class, 10, true, false, this::a_));
      this.bP.a(3, new bxe<>(this, true));
   }

   public static bpo.a gq() {
      return cfk.gk().a(bpp.q, 0.0).a(bpp.o, 0.23F).a(bpp.c, 5.0);
   }

   @Override
   public bnt e(bot $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gi() {
      return false;
   }

   @Override
   protected void aa() {
      bpl $$0 = this.f(bpp.o);
      if (this.aa_()) {
         if (!this.o_() && !$$0.a(bW)) {
            $$0.c(bW);
         }

         this.gr();
      } else if ($$0.a(bW)) {
         $$0.b(bW.a());
      }

      this.a((aow)this.dM(), true);
      if (this.q() != null) {
         this.gs();
      }

      if (this.aa_()) {
         this.aZ = this.ag;
      }

      super.aa();
   }

   private void gr() {
      if (this.bY > 0) {
         this.bY--;
         if (this.bY == 0) {
            this.gu();
         }
      }
   }

   private void gs() {
      if (this.ce > 0) {
         this.ce--;
      } else {
         if (this.O().a(this.q())) {
            this.gt();
         }

         this.ce = cd.a(this.af);
      }
   }

   private void gt() {
      double $$0 = this.g(bpp.i);
      enu $$1 = enu.a(this.dk()).c($$0, 10.0, $$0);
      this.dM()
         .a(cfm.class, $$1, bnv.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.r(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gu() {
      this.a(atl.CF, this.eW() * 2.0F, this.eX() * 1.8F);
   }

   @Override
   public void h(@Nullable boi $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.af);
         this.ce = cd.a(this.af);
      }

      if ($$0 instanceof chl) {
         this.c((chl)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.af));
   }

   public static boolean b(bnw<cfm> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.aj() != blt.a && !$$1.a_($$3.d()).a(cyu.kK);
   }

   @Override
   public boolean a(cvu $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   protected atk y() {
      return this.aa_() ? atl.CF : atl.CE;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.CH;
   }

   @Override
   protected atk n_() {
      return atl.CG;
   }

   @Override
   protected void a(awp $$0, blu $$1) {
      this.a(bnx.a, new cpd(cpg.oU));
   }

   @Override
   protected cpd gh() {
      return cpd.h;
   }

   @Override
   protected void gp() {
      this.f(bpp.q).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(chl $$0) {
      return this.a_((boi)$$0);
   }

   @Override
   public boolean k(cpd $$0) {
      return this.j($$0);
   }
}
