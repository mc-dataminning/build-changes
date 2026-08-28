import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpg extends coo implements cpx {
   private static final akj<Boolean> bG = akn.a(cpg.class, akl.k);
   private static final int bH = 40;
   private static final int bI = 1;
   private static final float bJ = 0.6F;
   private static final int bK = 6;
   private static final float bL = 0.5F;
   private static final int bM = 40;
   private static final int bN = 15;
   private static final int bO = 200;
   private static final float bP = 0.3F;
   private static final float bQ = 0.4F;
   private int bR;
   protected static final ImmutableList<? extends chs<? extends chr<? super cpg>>> a = ImmutableList.of(chs.c, chs.d);
   protected static final ImmutableList<? extends cgl<?>> b = ImmutableList.of(cgl.g, cgl.h, cgl.k, cgl.l, cgl.o, cgl.n, cgl.F, cgl.u, cgl.p, cgl.q);

   public cpg(bwr<? extends cpg> $$0, djm $$1) {
      super($$0, $$1);
      this.by = 5;
   }

   @Override
   protected byj.b<cpg> ec() {
      return byj.a(b, a);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      byj<cpg> $$1 = this.ec().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(ctg.a));
      $$1.b(ctg.b);
      $$1.f();
      return $$1;
   }

   private static void a(byj<cpg> $$0) {
      $$0.a(ctg.a, 0, ImmutableList.of(new cag(45, 90), new cak()));
   }

   private static void b(byj<cpg> $$0) {
      $$0.a(
         ctg.b,
         10,
         ImmutableList.of(
            cbm.a(($$0x, $$1) -> $$1.g($$0x)),
            cba.a(8.0F, btr.a(30, 60)),
            new cax(ImmutableList.of(Pair.of(cas.a(0.4F), 2), Pair.of(cbh.a(0.4F, 3), 2), Pair.of(new bzk(30, 60), 1)))
         )
      );
   }

   private static void c(byj<cpg> $$0) {
      $$0.a(ctg.k, 10, ImmutableList.of(cbf.a(1.0F), ccn.a(cpg::m, cah.a(40)), ccn.a(cpg::n_, cah.a(15)), cbp.a()), cgl.p);
   }

   private Optional<? extends bxj> g(arq $$0) {
      return this.eb().c(cgl.h).orElse(cgn.a()).a($$1 -> this.c($$0, $$1));
   }

   private boolean c(arq $$0, bxj $$1) {
      bwr<?> $$2 = $$1.an();
      return $$2 != bwr.bN && $$2 != bwr.E && chr.c($$0, this, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (bG.equals($$0)) {
         this.i_();
      }
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static byo.a j() {
      return coo.gw().a(byp.s, 40.0).a(byp.v, 0.3F).a(byp.p, 0.6F).a(byp.d, 1.0).a(byp.c, 6.0);
   }

   public boolean m() {
      return !this.n_();
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      if ($$1 instanceof bxj $$2) {
         this.bR = 10;
         $$0.a(this, (byte)4);
         this.b(awn.En);
         return cpx.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void d(bxj $$0) {
      if (!this.n_()) {
         cpx.a(this, $$0);
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxj $$4) {
         if (this.c($$4) && !bzc.a(this, $$4, 4.0)) {
            this.i($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void i(bxj $$0) {
      this.bs.b(cgl.F);
      this.bs.a(cgl.p, $$0, 200L);
   }

   @Override
   public byj<cpg> eb() {
      return (byj<cpg>)super.eb();
   }

   protected void n() {
      ctg $$0 = this.bs.g().orElse(null);
      this.bs.a(ImmutableList.of(ctg.k, ctg.b));
      ctg $$1 = this.bs.g().orElse(null);
      if ($$1 == ctg.k && $$0 != ctg.k) {
         this.t();
      }

      this.v(this.bs.a(cgl.p));
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("zoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      this.n();
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(bG, $$0);
      if (!this.dU().C && $$0) {
         this.g(byp.c).a(0.5);
      }
   }

   @Override
   public boolean n_() {
      return this.ar().a(bG);
   }

   @Override
   public void k_() {
      if (this.bR > 0) {
         this.bR--;
      }

      super.k_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bR = 10;
         this.b(awn.En);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bR;
   }

   @Override
   protected awm u() {
      if (this.dU().C) {
         return null;
      } else {
         return this.bs.a(cgl.p) ? awn.Em : awn.El;
      }
   }

   @Override
   protected awm e(bux $$0) {
      return awn.Ep;
   }

   @Override
   protected awm l_() {
      return awn.Eo;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.Eq, 0.15F, 1.0F);
   }

   protected void t() {
      this.b(awn.Em);
   }

   @Nullable
   @Override
   public bxj f() {
      return this.Q();
   }

   @Override
   protected void ac() {
      super.ac();
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
      if ($$0.o("IsBaby")) {
         this.a(true);
      }
   }
}
