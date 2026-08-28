import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cos extends cnz implements cpj {
   private static final akj<Boolean> bF = akn.a(cos.class, akl.k);
   private static final int bG = 40;
   private static final int bH = 1;
   private static final float bI = 0.6F;
   private static final int bJ = 6;
   private static final float bK = 0.5F;
   private static final int bL = 40;
   private static final int bM = 15;
   private static final int bN = 200;
   private static final float bO = 0.3F;
   private static final float bP = 0.4F;
   private int bQ;
   protected static final ImmutableList<? extends chl<? extends chk<? super cos>>> a = ImmutableList.of(chl.c, chl.d);
   protected static final ImmutableList<? extends cge<?>> b = ImmutableList.of(cge.g, cge.h, cge.k, cge.l, cge.o, cge.n, cge.F, cge.u, cge.p, cge.q);

   public cos(bwm<? extends cos> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 5;
   }

   @Override
   protected byc.b<cos> ec() {
      return byc.a(b, a);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      byc<cos> $$1 = this.ec().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(csr.a));
      $$1.b(csr.b);
      $$1.f();
      return $$1;
   }

   private static void a(byc<cos> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new bzz(45, 90), new cad()));
   }

   private static void b(byc<cos> $$0) {
      $$0.a(
         csr.b,
         10,
         ImmutableList.of(
            cbf.a(($$0x, $$1) -> $$1.g($$0x)),
            cat.a(8.0F, btm.a(30, 60)),
            new caq(ImmutableList.of(Pair.of(cal.a(0.4F), 2), Pair.of(cba.a(0.4F, 3), 2), Pair.of(new bzd(30, 60), 1)))
         )
      );
   }

   private static void c(byc<cos> $$0) {
      $$0.a(csr.k, 10, ImmutableList.of(cay.a(1.0F), ccg.a(cos::m, caa.a(40)), ccg.a(cos::n_, caa.a(15)), cbi.a()), cge.p);
   }

   private Optional<? extends bxc> g(arq $$0) {
      return this.eb().c(cge.h).orElse(cgg.a()).a($$1 -> this.c($$0, $$1));
   }

   private boolean c(arq $$0, bxc $$1) {
      bwm<?> $$2 = $$1.aq();
      return $$2 != bwm.bN && $$2 != bwm.E && chk.c($$0, this, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (bF.equals($$0)) {
         this.i_();
      }
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static byh.a j() {
      return cnz.gt().a(byi.s, 40.0).a(byi.v, 0.3F).a(byi.p, 0.6F).a(byi.d, 1.0).a(byi.c, 6.0);
   }

   public boolean m() {
      return !this.n_();
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      if ($$1 instanceof bxc $$2) {
         this.bQ = 10;
         $$0.a(this, (byte)4);
         this.b(awn.Eq);
         return cpj.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void d(bxc $$0) {
      if (!this.n_()) {
         cpj.a(this, $$0);
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxc $$4) {
         if (this.c($$4) && !byv.a(this, $$4, 4.0)) {
            this.i($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void i(bxc $$0) {
      this.bs.b(cge.F);
      this.bs.a(cge.p, $$0, 200L);
   }

   @Override
   public byc<cos> eb() {
      return (byc<cos>)super.eb();
   }

   protected void n() {
      csr $$0 = this.bs.g().orElse(null);
      this.bs.a(ImmutableList.of(csr.k, csr.b));
      csr $$1 = this.bs.g().orElse(null);
      if ($$1 == csr.k && $$0 != csr.k) {
         this.t();
      }

      this.v(this.bs.a(cge.p));
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("zoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      this.n();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bF, $$0);
      if (!this.dV().C && $$0) {
         this.g(byi.c).a(0.5);
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bF);
   }

   @Override
   public void k_() {
      if (this.bQ > 0) {
         this.bQ--;
      }

      super.k_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bQ = 10;
         this.b(awn.Eq);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bQ;
   }

   @Override
   protected awm u() {
      if (this.dV().C) {
         return null;
      } else {
         return this.bs.a(cge.p) ? awn.Ep : awn.Eo;
      }
   }

   @Override
   protected awm e(bus $$0) {
      return awn.Es;
   }

   @Override
   protected awm l_() {
      return awn.Er;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.Et, 0.15F, 1.0F);
   }

   protected void t() {
      this.b(awn.Ep);
   }

   @Nullable
   @Override
   public bxc f() {
      return this.Q();
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
