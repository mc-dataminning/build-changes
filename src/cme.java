import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cme extends clm implements cms {
   private static final akk<Boolean> e = ako.a(cme.class, akm.k);
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
   protected static final ImmutableList<? extends cfg<? extends cff<? super cme>>> b = ImmutableList.of(cfg.c, cfg.d);
   protected static final ImmutableList<? extends cdz<?>> c = ImmutableList.of(cdz.g, cdz.h, cdz.k, cdz.l, cdz.n, cdz.m, cdz.E, cdz.t, cdz.o, cdz.p);

   public cme(bug<? extends cme> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bvx.b<cme> ee() {
      return bvx.a(c, b);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      bvx<cme> $$1 = this.ee().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cpz.a));
      $$1.b(cpz.b);
      $$1.f();
      return $$1;
   }

   private static void a(bvx<cme> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bxu(45, 90), new bxy()));
   }

   private static void b(bvx<cme> $$0) {
      $$0.a(
         cpz.b,
         10,
         ImmutableList.of(
            bza.a(cme::gx),
            byo.a(8.0F, brj.a(30, 60)),
            new byl(ImmutableList.of(Pair.of(byg.a(0.4F), 2), Pair.of(byv.a(0.4F, 3), 2), Pair.of(new bwy(30, 60), 1)))
         )
      );
   }

   private static void c(bvx<cme> $$0) {
      $$0.a(cpz.k, 10, ImmutableList.of(byt.a(1.0F), cab.a(cme::t, bxv.a(40)), cab.a(cme::p_, bxv.a(15)), bzd.a()), cdz.o);
   }

   private Optional<? extends buv> gx() {
      return this.ed().c(cdz.h).orElse(ceb.a()).a(this::j);
   }

   private boolean j(buv $$0) {
      bug<?> $$1 = $$0.aq();
      return $$1 != bug.bt && $$1 != bug.x && cff.c(this, $$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.j_();
      }
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwc.a q() {
      return clm.gB().a(bwd.s, 40.0).a(bwd.v, 0.3F).a(bwd.p, 0.6F).a(bwd.d, 1.0).a(bwd.c, 6.0);
   }

   public boolean t() {
      return !this.p_();
   }

   @Override
   public boolean E(btz $$0) {
      if (!($$0 instanceof buv)) {
         return false;
      } else {
         this.ci = 10;
         this.dX().a(this, (byte)4);
         this.b(awk.Dt);
         return cms.a(this, (buv)$$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void e(buv $$0) {
      if (!this.p_()) {
         cms.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dX().C) {
         return false;
      } else if ($$2 && $$0.d() instanceof buv) {
         buv $$3 = (buv)$$0.d();
         if (this.c($$3) && !bwq.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(buv $$0) {
      this.bC.b(cdz.E);
      this.bC.a(cdz.o, $$0, 200L);
   }

   @Override
   public bvx<cme> ed() {
      return (bvx<cme>)super.ed();
   }

   protected void y() {
      cpz $$0 = this.bC.g().orElse(null);
      this.bC.a(ImmutableList.of(cpz.k, cpz.b));
      cpz $$1 = this.bC.g().orElse(null);
      if ($$1 == cpz.k && $$0 != cpz.k) {
         this.gw();
      }

      this.w(this.bC.a(cdz.o));
   }

   @Override
   protected void ac() {
      this.dX().ah().a("zoglinBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.av().a(e, $$0);
      if (!this.dX().C && $$0) {
         this.g(bwd.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.av().a(e);
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
         this.b(awk.Dt);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gv() {
      return this.ci;
   }

   @Override
   protected awj w() {
      if (this.dX().C) {
         return null;
      } else {
         return this.bC.a(cdz.o) ? awk.Ds : awk.Dr;
      }
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.Dv;
   }

   @Override
   protected awj o_() {
      return awk.Du;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.Dw, 0.15F, 1.0F);
   }

   protected void gw() {
      this.b(awk.Ds);
   }

   @Nullable
   @Override
   public buv m() {
      return this.R();
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
