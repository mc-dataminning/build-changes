import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class clv extends cld implements cmj {
   private static final akh<Boolean> e = akl.a(clv.class, akj.k);
   private static final int bY = 40;
   private static final int bZ = 1;
   private static final float ca = 0.6F;
   private static final int cb = 6;
   private static final float cc = 0.5F;
   private static final int cd = 40;
   private static final int ce = 15;
   private static final int cf = 200;
   private static final float cg = 0.3F;
   private static final float ch = 0.4F;
   private int ci;
   protected static final ImmutableList<? extends cex<? extends cew<? super clv>>> b = ImmutableList.of(cex.c, cex.d);
   protected static final ImmutableList<? extends cdq<?>> c = ImmutableList.of(cdq.g, cdq.h, cdq.k, cdq.l, cdq.n, cdq.m, cdq.E, cdq.t, cdq.o, cdq.p);

   public clv(bty<? extends clv> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bvo.b<clv> dZ() {
      return bvo.a(c, b);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      bvo<clv> $$1 = this.dZ().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cpp.a));
      $$1.b(cpp.b);
      $$1.f();
      return $$1;
   }

   private static void a(bvo<clv> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new bxl(45, 90), new bxp()));
   }

   private static void b(bvo<clv> $$0) {
      $$0.a(
         cpp.b,
         10,
         ImmutableList.of(
            byr.a(clv::gq),
            byf.a(8.0F, brd.a(30, 60)),
            new byc(ImmutableList.of(Pair.of(bxx.a(0.4F), 2), Pair.of(bym.a(0.4F, 3), 2), Pair.of(new bwp(30, 60), 1)))
         )
      );
   }

   private static void c(bvo<clv> $$0) {
      $$0.a(cpp.k, 10, ImmutableList.of(byk.a(1.0F), bzs.a(clv::t, bxm.a(40)), bzs.a(clv::p_, bxm.a(15)), byu.a()), cdq.o);
   }

   private Optional<? extends bun> gq() {
      return this.dY().c(cdq.h).orElse(cds.a()).a(this::j);
   }

   private boolean j(bun $$0) {
      bty<?> $$1 = $$0.ao();
      return $$1 != bty.bt && $$1 != bty.x && cew.c(this, $$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.j_();
      }
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if ($$0.D_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.s, 40.0).a(bvu.v, 0.3F).a(bvu.p, 0.6F).a(bvu.d, 1.0).a(bvu.c, 6.0);
   }

   public boolean t() {
      return !this.p_();
   }

   @Override
   public boolean E(btr $$0) {
      if (!($$0 instanceof bun)) {
         return false;
      } else {
         this.ci = 10;
         this.dS().a(this, (byte)4);
         this.b(awg.Dv);
         return cmj.a(this, (bun)$$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void e(bun $$0) {
      if (!this.p_()) {
         cmj.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bun) {
         bun $$3 = (bun)$$0.d();
         if (this.c($$3) && !bwh.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bun $$0) {
      this.bB.b(cdq.E);
      this.bB.a(cdq.o, $$0, 200L);
   }

   @Override
   public bvo<clv> dY() {
      return (bvo<clv>)super.dY();
   }

   protected void y() {
      cpp $$0 = this.bB.g().orElse(null);
      this.bB.a(ImmutableList.of(cpp.k, cpp.b));
      cpp $$1 = this.bB.g().orElse(null);
      if ($$1 == cpp.k && $$0 != cpp.k) {
         this.gp();
      }

      this.w(this.bB.a(cdq.o));
   }

   @Override
   protected void ac() {
      this.dS().ah().a("zoglinBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.at().a(e, $$0);
      if (!this.dS().B && $$0) {
         this.g(bvu.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.at().a(e);
   }

   @Override
   public void n_() {
      if (this.ci > 0) {
         this.ci--;
      }

      super.n_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ci = 10;
         this.b(awg.Dv);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int go() {
      return this.ci;
   }

   @Override
   protected awf w() {
      if (this.dS().B) {
         return null;
      } else {
         return this.bB.a(cdq.o) ? awg.Du : awg.Dt;
      }
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.Dx;
   }

   @Override
   protected awf o_() {
      return awg.Dw;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.Dy, 0.15F, 1.0F);
   }

   protected void gp() {
      this.b(awg.Du);
   }

   @Nullable
   @Override
   public bun m() {
      return this.R();
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
