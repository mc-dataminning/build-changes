import java.util.UUID;
import javax.annotation.Nullable;

public class cmh extends cmf implements bva {
   private static final buc c = bug.bx.n().a(0.5F).b(0.97F);
   private static final alh d = alh.b("attacking");
   private static final bwb cb = new bwb(d, 0.05, bwb.a.a);
   private static final brj cc = bak.a(0, 1);
   private int cd;
   private static final brj ce = bak.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final brj ci = bak.a(4, 6);
   private int cj;

   public cmh(bug<? extends cmh> $$0, dev $$1) {
      super($$0, $$1);
      this.a(erv.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void t() {
      this.bS.a(2, new cdi(this, 1.0, false));
      this.bS.a(7, new cdg(this, 1.0));
      this.bT.a(1, new cdl(this).a());
      this.bT.a(2, new cdm<>(this, coh.class, 10, true, false, this::a_));
      this.bT.a(3, new cds<>(this, true));
   }

   public static bwc.a gE() {
      return cmf.gy().a(bwd.A, 0.0).a(bwd.v, 0.23F).a(bwd.c, 5.0);
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   protected void ac() {
      bvz $$0 = this.g(bwd.v);
      if (this.ae_()) {
         if (!this.p_() && !$$0.b(d)) {
            $$0.b(cb);
         }

         this.gF();
      } else if ($$0.b(d)) {
         $$0.c(d);
      }

      this.a((arm)this.dX(), true);
      if (this.m() != null) {
         this.gG();
      }

      if (this.ae_()) {
         this.ba = this.ag;
      }

      super.ac();
   }

   private void gF() {
      if (this.cd > 0) {
         this.cd--;
         if (this.cd == 0) {
            this.gI();
         }
      }
   }

   private void gG() {
      if (this.cj > 0) {
         this.cj--;
      } else {
         if (this.Q().a(this.m())) {
            this.gH();
         }

         this.cj = ci.a(this.af);
      }
   }

   private void gH() {
      double $$0 = this.h(bwd.m);
      ezc $$1 = ezc.a(this.dv()).c($$0, 10.0, $$0);
      this.dX()
         .a(cmh.class, $$1, bue.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.m() == null)
         .filter($$0x -> !$$0x.s(this.m()))
         .forEach($$0x -> $$0x.h(this.m()));
   }

   private void gI() {
      this.a(awk.DK, this.fi() * 2.0F, this.fj() * 1.8F);
   }

   @Override
   public void h(@Nullable buv $$0) {
      if (this.m() == null && $$0 != null) {
         this.cd = cc.a(this.af);
         this.cj = ci.a(this.af);
      }

      if ($$0 instanceof coh) {
         this.c((coh)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.af));
   }

   public static boolean b(bug<cmh> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.am() != brv.a && !$$1.a_($$3.e()).a(dia.kK);
   }

   @Override
   public boolean a(dey $$0) {
      return $$0.f(this) && !$$0.d(this.cS());
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a(this.dX(), $$0);
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
   protected awj w() {
      return this.ae_() ? awk.DK : awk.DJ;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.DM;
   }

   @Override
   protected awj o_() {
      return awk.DL;
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      this.a(buh.a, new cvx(cwb.oX));
   }

   @Override
   protected cvx gv() {
      return cvx.k;
   }

   @Override
   protected void gD() {
      this.g(bwd.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean a(coh $$0) {
      return this.a_((buv)$$0);
   }

   @Override
   public boolean i(cvx $$0) {
      return this.h($$0);
   }
}
