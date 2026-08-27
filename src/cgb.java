import java.util.UUID;
import javax.annotation.Nullable;

public class cgb extends cfz implements bpd {
   private static final boi c = bol.bv.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bqc bY = new bqc(d, "Attacking speed boost", 0.05, bqc.a.a);
   private static final blw bZ = axl.a(0, 1);
   private int ca;
   private static final blw cb = axl.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;
   private static final int ce = 10;
   private static final blw cf = axl.a(4, 6);
   private int cg;

   public cgb(bol<? extends cgb> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cd = $$0;
   }

   @Override
   protected void w() {
      this.bP.a(2, new bxj(this, 1.0, false));
      this.bP.a(7, new bxh(this, 1.0));
      this.bQ.a(1, new bxm(this).a());
      this.bQ.a(2, new bxn<>(this, cia.class, 10, true, false, this::a_));
      this.bQ.a(3, new bxt<>(this, true));
   }

   public static bqd.a gv() {
      return cfz.gp().a(bqe.q, 0.0).a(bqe.o, 0.23F).a(bqe.c, 5.0);
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   protected void aa() {
      bqa $$0 = this.f(bqe.o);
      if (this.aa_()) {
         if (!this.o_() && !$$0.a(bY)) {
            $$0.c(bY);
         }

         this.gw();
      } else if ($$0.a(bY)) {
         $$0.b(bY.a());
      }

      this.a((apa)this.dJ(), true);
      if (this.q() != null) {
         this.gx();
      }

      if (this.aa_()) {
         this.ba = this.ag;
      }

      super.aa();
   }

   private void gw() {
      if (this.ca > 0) {
         this.ca--;
         if (this.ca == 0) {
            this.gz();
         }
      }
   }

   private void gx() {
      if (this.cg > 0) {
         this.cg--;
      } else {
         if (this.O().a(this.q())) {
            this.gy();
         }

         this.cg = cf.a(this.af);
      }
   }

   private void gy() {
      double $$0 = this.g(bqe.i);
      eoq $$1 = eoq.a(this.dh()).c($$0, 10.0, $$0);
      this.dJ()
         .a(cgb.class, $$1, bok.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.r(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gz() {
      this.a(atp.CS, this.eY() * 2.0F, this.eZ() * 1.8F);
   }

   @Override
   public void h(@Nullable box $$0) {
      if (this.q() == null && $$0 != null) {
         this.ca = bZ.a(this.af);
         this.cg = cf.a(this.af);
      }

      if ($$0 instanceof cia) {
         this.c((cia)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cb.a(this.af));
   }

   public static boolean b(bol<cgb> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.aj() != bmi.a && !$$1.a_($$3.d()).a(czh.kK);
   }

   @Override
   public boolean a(cwh $$0) {
      return $$0.f(this) && !$$0.d(this.cE());
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a(this.dJ(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cc = $$0;
   }

   @Override
   public int a() {
      return this.cc;
   }

   @Override
   protected ato y() {
      return this.aa_() ? atp.CS : atp.CR;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.CU;
   }

   @Override
   protected ato n_() {
      return atp.CT;
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      this.a(bom.a, new cpq(cpt.oU));
   }

   @Override
   protected cpq gm() {
      return cpq.h;
   }

   @Override
   protected void gu() {
      this.f(bqe.q).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cd;
   }

   @Override
   public boolean f(cia $$0) {
      return this.a_((box)$$0);
   }

   @Override
   public boolean k(cpq $$0) {
      return this.j($$0);
   }
}
