import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmj extends clr implements cmx {
   private static final akl<Boolean> e = akp.a(cmj.class, akn.k);
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
   protected static final ImmutableList<? extends cfl<? extends cfk<? super cmj>>> b = ImmutableList.of(cfl.c, cfl.d);
   protected static final ImmutableList<? extends cee<?>> c = ImmutableList.of(cee.g, cee.h, cee.k, cee.l, cee.n, cee.m, cee.E, cee.t, cee.o, cee.p);

   public cmj(bul<? extends cmj> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bwc.b<cmj> ee() {
      return bwc.a(c, b);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      bwc<cmj> $$1 = this.ee().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cqe.a));
      $$1.b(cqe.b);
      $$1.f();
      return $$1;
   }

   private static void a(bwc<cmj> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bxz(45, 90), new byd()));
   }

   private static void b(bwc<cmj> $$0) {
      $$0.a(
         cqe.b,
         10,
         ImmutableList.of(
            bzf.a(cmj::gw),
            byt.a(8.0F, bro.a(30, 60)),
            new byq(ImmutableList.of(Pair.of(byl.a(0.4F), 2), Pair.of(bza.a(0.4F, 3), 2), Pair.of(new bxd(30, 60), 1)))
         )
      );
   }

   private static void c(bwc<cmj> $$0) {
      $$0.a(cqe.k, 10, ImmutableList.of(byy.a(1.0F), cag.a(cmj::t, bya.a(40)), cag.a(cmj::p_, bya.a(15)), bzi.a()), cee.o);
   }

   private Optional<? extends bva> gw() {
      return this.ed().c(cee.h).orElse(ceg.a()).a(this::j);
   }

   private boolean j(bva $$0) {
      bul<?> $$1 = $$0.ar();
      return $$1 != bul.bt && $$1 != bul.x && cfk.c(this, $$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.j_();
      }
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.s, 40.0).a(bwi.v, 0.3F).a(bwi.p, 0.6F).a(bwi.d, 1.0).a(bwi.c, 6.0);
   }

   public boolean t() {
      return !this.p_();
   }

   @Override
   public boolean E(bue $$0) {
      if (!($$0 instanceof bva)) {
         return false;
      } else {
         this.ci = 10;
         this.dX().a(this, (byte)4);
         this.b(awl.Dt);
         return cmx.a(this, (bva)$$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void e(bva $$0) {
      if (!this.p_()) {
         cmx.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dX().C) {
         return false;
      } else if ($$2 && $$0.d() instanceof bva) {
         bva $$3 = (bva)$$0.d();
         if (this.c($$3) && !bwv.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bva $$0) {
      this.bF.b(cee.E);
      this.bF.a(cee.o, $$0, 200L);
   }

   @Override
   public bwc<cmj> ed() {
      return (bwc<cmj>)super.ed();
   }

   protected void y() {
      cqe $$0 = this.bF.g().orElse(null);
      this.bF.a(ImmutableList.of(cqe.k, cqe.b));
      cqe $$1 = this.bF.g().orElse(null);
      if ($$1 == cqe.k && $$0 != cqe.k) {
         this.gv();
      }

      this.w(this.bF.a(cee.o));
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("zoglinBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.aw().a(e, $$0);
      if (!this.dX().C && $$0) {
         this.g(bwi.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.aw().a(e);
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
         this.b(awl.Dt);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gu() {
      return this.ci;
   }

   @Override
   protected awk w() {
      if (this.dX().C) {
         return null;
      } else {
         return this.bF.a(cee.o) ? awl.Ds : awl.Dr;
      }
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.Dv;
   }

   @Override
   protected awk o_() {
      return awl.Du;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.Dw, 0.15F, 1.0F);
   }

   protected void gv() {
      this.b(awl.Ds);
   }

   @Nullable
   @Override
   public bva m() {
      return this.R();
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
