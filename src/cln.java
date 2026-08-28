import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cln extends ckv implements cmb {
   private static final akg<Boolean> e = akk.a(cln.class, aki.k);
   private static final int bZ = 40;
   private static final int ca = 1;
   private static final float cb = 0.6F;
   private static final int cc = 6;
   private static final float cd = 0.5F;
   private static final int ce = 40;
   private static final int cf = 15;
   private static final int cg = 200;
   private static final float ch = 0.3F;
   private static final float ci = 0.4F;
   private int cj;
   protected static final ImmutableList<? extends cep<? extends ceo<? super cln>>> b = ImmutableList.of(cep.c, cep.d);
   protected static final ImmutableList<? extends cdi<?>> c = ImmutableList.of(cdi.g, cdi.h, cdi.k, cdi.l, cdi.n, cdi.m, cdi.E, cdi.t, cdi.o, cdi.p);

   public cln(btq<? extends cln> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   protected bvg.b<cln> dY() {
      return bvg.a(c, b);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      bvg<cln> $$1 = this.dY().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cpg.a));
      $$1.b(cpg.b);
      $$1.f();
      return $$1;
   }

   private static void a(bvg<cln> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new bxd(45, 90), new bxh()));
   }

   private static void b(bvg<cln> $$0) {
      $$0.a(
         cpg.b,
         10,
         ImmutableList.of(
            byj.a(cln::gq),
            bxx.a(8.0F, bqv.a(30, 60)),
            new bxu(ImmutableList.of(Pair.of(bxp.a(0.4F), 2), Pair.of(bye.a(0.4F, 3), 2), Pair.of(new bwh(30, 60), 1)))
         )
      );
   }

   private static void c(bvg<cln> $$0) {
      $$0.a(cpg.k, 10, ImmutableList.of(byc.a(1.0F), bzk.a(cln::t, bxe.a(40)), bzk.a(cln::o_, bxe.a(15)), bym.a()), cdi.o);
   }

   private Optional<? extends buf> gq() {
      return this.dX().c(cdi.h).orElse(cdk.a()).a(this::j);
   }

   private boolean j(buf $$0) {
      btq<?> $$1 = $$0.ao();
      return $$1 != btq.bt && $$1 != btq.x && ceo.c(this, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.i_();
      }
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.s, 40.0).a(bvm.v, 0.3F).a(bvm.p, 0.6F).a(bvm.d, 1.0).a(bvm.c, 6.0);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   public boolean E(btj $$0) {
      if (!($$0 instanceof buf)) {
         return false;
      } else {
         this.cj = 10;
         this.dS().a(this, (byte)4);
         this.b(awd.Dv);
         return cmb.a(this, (buf)$$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void e(buf $$0) {
      if (!this.o_()) {
         cmb.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof buf) {
         buf $$3 = (buf)$$0.d();
         if (this.c($$3) && !bvz.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(buf $$0) {
      this.bC.b(cdi.E);
      this.bC.a(cdi.o, $$0, 200L);
   }

   @Override
   public bvg<cln> dX() {
      return (bvg<cln>)super.dX();
   }

   protected void y() {
      cpg $$0 = this.bC.g().orElse(null);
      this.bC.a(ImmutableList.of(cpg.k, cpg.b));
      cpg $$1 = this.bC.g().orElse(null);
      if ($$1 == cpg.k && $$0 != cpg.k) {
         this.gp();
      }

      this.w(this.bC.a(cdi.o));
   }

   @Override
   protected void ad() {
      this.dS().ah().a("zoglinBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.at().a(e, $$0);
      if (!this.dS().B && $$0) {
         this.g(bvm.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.at().a(e);
   }

   @Override
   public void m_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.m_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(awd.Dv);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int go() {
      return this.cj;
   }

   @Override
   protected awc w() {
      if (this.dS().B) {
         return null;
      } else {
         return this.bC.a(cdi.o) ? awd.Du : awd.Dt;
      }
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.Dx;
   }

   @Override
   protected awc n_() {
      return awd.Dw;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.Dy, 0.15F, 1.0F);
   }

   protected void gp() {
      this.b(awd.Du);
   }

   @Nullable
   @Override
   public buf m() {
      return this.R();
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
