import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmn extends clv implements cnb {
   private static final ako<Boolean> e = aks.a(cmn.class, akq.k);
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
   protected static final ImmutableList<? extends cfp<? extends cfo<? super cmn>>> b = ImmutableList.of(cfp.c, cfp.d);
   protected static final ImmutableList<? extends cei<?>> c = ImmutableList.of(cei.g, cei.h, cei.k, cei.l, cei.n, cei.m, cei.E, cei.t, cei.o, cei.p);

   public cmn(bup<? extends cmn> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bwg.b<cmn> ef() {
      return bwg.a(c, b);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      bwg<cmn> $$1 = this.ef().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cqi.a));
      $$1.b(cqi.b);
      $$1.f();
      return $$1;
   }

   private static void a(bwg<cmn> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new byd(45, 90), new byh()));
   }

   private static void b(bwg<cmn> $$0) {
      $$0.a(
         cqi.b,
         10,
         ImmutableList.of(
            bzj.a(cmn::gx),
            byx.a(8.0F, brs.a(30, 60)),
            new byu(ImmutableList.of(Pair.of(byp.a(0.4F), 2), Pair.of(bze.a(0.4F, 3), 2), Pair.of(new bxh(30, 60), 1)))
         )
      );
   }

   private static void c(bwg<cmn> $$0) {
      $$0.a(cqi.k, 10, ImmutableList.of(bzc.a(1.0F), cak.a(cmn::t, bye.a(40)), cak.a(cmn::p_, bye.a(15)), bzm.a()), cei.o);
   }

   private Optional<? extends bve> gx() {
      return this.ee().c(cei.h).orElse(cek.a()).a(this::j);
   }

   private boolean j(bve $$0) {
      bup<?> $$1 = $$0.ar();
      return $$1 != bup.bt && $$1 != bup.x && cfo.c(this, $$0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void a(ako<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.j_();
      }
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.s, 40.0).a(bwm.v, 0.3F).a(bwm.p, 0.6F).a(bwm.d, 1.0).a(bwm.c, 6.0);
   }

   public boolean t() {
      return !this.p_();
   }

   @Override
   public boolean E(bui $$0) {
      if (!($$0 instanceof bve)) {
         return false;
      } else {
         this.ci = 10;
         this.dY().a(this, (byte)4);
         this.b(awo.Dt);
         return cnb.a(this, (bve)$$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void e(bve $$0) {
      if (!this.p_()) {
         cnb.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dY().C) {
         return false;
      } else if ($$2 && $$0.d() instanceof bve) {
         bve $$3 = (bve)$$0.d();
         if (this.c($$3) && !bwz.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bve $$0) {
      this.bF.b(cei.E);
      this.bF.a(cei.o, $$0, 200L);
   }

   @Override
   public bwg<cmn> ee() {
      return (bwg<cmn>)super.ee();
   }

   protected void y() {
      cqi $$0 = this.bF.g().orElse(null);
      this.bF.a(ImmutableList.of(cqi.k, cqi.b));
      cqi $$1 = this.bF.g().orElse(null);
      if ($$1 == cqi.k && $$0 != cqi.k) {
         this.gw();
      }

      this.w(this.bF.a(cei.o));
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("zoglinBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.aw().a(e, $$0);
      if (!this.dY().C && $$0) {
         this.g(bwm.c).a(0.5);
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
         this.b(awo.Dt);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gv() {
      return this.ci;
   }

   @Override
   protected awn w() {
      if (this.dY().C) {
         return null;
      } else {
         return this.bF.a(cei.o) ? awo.Ds : awo.Dr;
      }
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.Dv;
   }

   @Override
   protected awn o_() {
      return awo.Du;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.Dw, 0.15F, 1.0F);
   }

   protected void gw() {
      this.b(awo.Ds);
   }

   @Nullable
   @Override
   public bve m() {
      return this.R();
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
