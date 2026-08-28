import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnp extends cmx implements coh {
   private static final alc<Boolean> bZ = alg.a(cnp.class, ale.k);
   private static final int ca = 40;
   private static final int cb = 1;
   private static final float cc = 0.6F;
   private static final int cd = 6;
   private static final float ce = 0.5F;
   private static final int cf = 40;
   private static final int cg = 15;
   private static final int ch = 200;
   private static final float ci = 0.3F;
   private static final float cj = 0.4F;
   private int ck;
   protected static final ImmutableList<? extends cgr<? extends cgq<? super cnp>>> a = ImmutableList.of(cgr.c, cgr.d);
   protected static final ImmutableList<? extends cfk<?>> b = ImmutableList.of(cfk.g, cfk.h, cfk.k, cfk.l, cfk.n, cfk.m, cfk.E, cfk.t, cfk.o, cfk.p);

   public cnp(bvr<? extends cnp> $$0, dhi $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   protected bxi.b<cnp> ed() {
      return bxi.a(b, a);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      bxi<cnp> $$1 = this.ed().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cro.a));
      $$1.b(cro.b);
      $$1.f();
      return $$1;
   }

   private static void a(bxi<cnp> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new bzf(45, 90), new bzj()));
   }

   private static void b(bxi<cnp> $$0) {
      $$0.a(
         cro.b,
         10,
         ImmutableList.of(
            cal.a(($$0x, $$1) -> $$1.g($$0x)),
            bzz.a(8.0F, bsu.a(30, 60)),
            new bzw(ImmutableList.of(Pair.of(bzr.a(0.4F), 2), Pair.of(cag.a(0.4F, 3), 2), Pair.of(new byj(30, 60), 1)))
         )
      );
   }

   private static void c(bxi<cnp> $$0) {
      $$0.a(cro.k, 10, ImmutableList.of(cae.a(1.0F), cbm.a(cnp::p, bzg.a(40)), cbm.a(cnp::e_, bzg.a(15)), cao.a()), cfk.o);
   }

   private Optional<? extends bwg> g(ash $$0) {
      return this.ec().c(cfk.h).orElse(cfm.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(ash $$0, bwg $$1) {
      bvr<?> $$2 = $$1.aq();
      return $$2 != bvr.bN && $$2 != bvr.F && cgq.c($$0, this, $$1);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   @Override
   public void a(alc<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.m_();
      }
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxn.a m() {
      return cmx.gt().a(bxo.s, 40.0).a(bxo.v, 0.3F).a(bxo.p, 0.6F).a(bxo.d, 1.0).a(bxo.c, 6.0);
   }

   public boolean p() {
      return !this.e_();
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
      if ($$1 instanceof bwg $$2) {
         this.ck = 10;
         $$0.a(this, (byte)4);
         this.b(axf.DO);
         return coh.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void e(bwg $$0) {
      if (!this.e_()) {
         coh.a(this, $$0);
      }
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwg $$4) {
         if (this.c($$4) && !byb.a(this, $$4, 4.0)) {
            this.j($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void j(bwg $$0) {
      this.bF.b(cfk.E);
      this.bF.a(cfk.o, $$0, 200L);
   }

   @Override
   public bxi<cnp> ec() {
      return (bxi<cnp>)super.ec();
   }

   protected void t() {
      cro $$0 = this.bF.g().orElse(null);
      this.bF.a(ImmutableList.of(cro.k, cro.b));
      cro $$1 = this.bF.g().orElse(null);
      if ($$1 == cro.k && $$0 != cro.k) {
         this.go();
      }

      this.w(this.bF.a(cfk.o));
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("zoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bZ, $$0);
      if (!this.dW().C && $$0) {
         this.g(bxo.c).a(0.5);
      }
   }

   @Override
   public boolean e_() {
      return this.au().a(bZ);
   }

   @Override
   public void d_() {
      if (this.ck > 0) {
         this.ck--;
      }

      super.d_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(axf.DO);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int x() {
      return this.ck;
   }

   @Override
   protected axe u() {
      if (this.dW().C) {
         return null;
      } else {
         return this.bF.a(cfk.o) ? axf.DN : axf.DM;
      }
   }

   @Override
   protected axe e(bua $$0) {
      return axf.DQ;
   }

   @Override
   protected axe o_() {
      return axf.DP;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.DR, 0.15F, 1.0F);
   }

   protected void go() {
      this.b(axf.DN);
   }

   @Nullable
   @Override
   public bwg O_() {
      return this.O();
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.e_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
