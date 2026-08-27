import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class ceq extends cdv implements cea, cgs {
   private static final aie<Boolean> b = aih.a(ceq.class, aig.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bmd bV = new bmd(5);

   public ceq(bnu<? extends ceq> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buv(this));
      this.bO.a(2, new cir.a(this, 10.0F));
      this.bO.a(3, new bwc<>(this, 1.0, 8.0F));
      this.bO.a(8, new bvy(this, 0.6));
      this.bO.a(9, new bvj(this, chh.class, 15.0F, 1.0F));
      this.bO.a(10, new bvj(this, boi.class, 15.0F));
      this.bP.a(1, new bwt(this, cir.class).a());
      this.bP.a(2, new bwu<>(this, chh.class, true));
      this.bP.a(3, new bwu<>(this, cgp.class, false));
      this.bP.a(3, new bwu<>(this, caf.class, true));
   }

   public static bpk.a w() {
      return cen.gm().a(bpl.o, 0.35F).a(bpl.n, 24.0).a(bpl.c, 5.0).a(bpl.i, 32.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, false);
   }

   @Override
   public boolean a(cpp $$0) {
      return $$0 == cpc.vP;
   }

   public boolean gg() {
      return this.am.b(b);
   }

   @Override
   public void b(boolean $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cdv.a u() {
      if (this.gg()) {
         return cdv.a.f;
      } else if (this.b(cpc.vP)) {
         return cdv.a.e;
      } else {
         return this.fY() ? cdv.a.b : cdv.a.h;
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      return 0.0F;
   }

   @Override
   public int fK() {
      return 1;
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      awo $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(awo $$0, bls $$1) {
      this.a(bnv.a, new coz(cpc.vP));
   }

   @Override
   protected void a(awo $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         coz $$2 = this.eT();
         if ($$2.a(cpc.vP)) {
            Map<cti, Integer> $$3 = ctj.a($$2);
            $$3.putIfAbsent(ctl.K, 1);
            ctj.a($$3, $$2);
            this.a(bnv.a, $$2);
         }
      }
   }

   @Override
   protected atj y() {
      return atk.tn;
   }

   @Override
   protected atj n_() {
      return atk.tp;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.tq;
   }

   @Override
   public void a(bog $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bog $$0, coz $$1, chz $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bmd A() {
      return this.bV;
   }

   @Override
   protected void b(cds $$0) {
      coz $$1 = $$0.q();
      if ($$1.d() instanceof cmp) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         coz $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.M());
         }
      }
   }

   private boolean l(coz $$0) {
      return this.gv() && $$0.a(cpc.uL);
   }

   @Override
   public box a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? box.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ciq $$2 = this.gu();
      boolean $$3 = this.af.i() <= $$2.w();
      if ($$3) {
         coz $$4 = new coz(cpc.vP);
         Map<cti, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(blr.c)) {
            $$5.put(ctl.J, 2);
         } else if ($$0 > $$2.a(blr.b)) {
            $$5.put(ctl.J, 1);
         }

         $$5.put(ctl.I, 1);
         ctj.a($$5, $$4);
         this.a(bnv.a, $$4);
      }
   }

   @Override
   public atj ag_() {
      return atk.to;
   }
}
