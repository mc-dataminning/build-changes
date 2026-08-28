import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnk extends cms implements coc {
   private static final alc<Boolean> bZ = alg.a(cnk.class, ale.k);
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
   protected static final ImmutableList<? extends cgm<? extends cgl<? super cnk>>> a = ImmutableList.of(cgm.c, cgm.d);
   protected static final ImmutableList<? extends cff<?>> b = ImmutableList.of(cff.g, cff.h, cff.k, cff.l, cff.n, cff.m, cff.E, cff.t, cff.o, cff.p);

   public cnk(bvm<? extends cnk> $$0, dha $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   protected bxd.b<cnk> ec() {
      return bxd.a(b, a);
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      bxd<cnk> $$1 = this.ec().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(crj.a));
      $$1.b(crj.b);
      $$1.f();
      return $$1;
   }

   private static void a(bxd<cnk> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new bza(45, 90), new bze()));
   }

   private static void b(bxd<cnk> $$0) {
      $$0.a(
         crj.b,
         10,
         ImmutableList.of(
            cag.a(($$0x, $$1) -> $$1.g($$0x)),
            bzu.a(8.0F, bsp.a(30, 60)),
            new bzr(ImmutableList.of(Pair.of(bzm.a(0.4F), 2), Pair.of(cab.a(0.4F, 3), 2), Pair.of(new bye(30, 60), 1)))
         )
      );
   }

   private static void c(bxd<cnk> $$0) {
      $$0.a(crj.k, 10, ImmutableList.of(bzz.a(1.0F), cbh.a(cnk::p, bzb.a(40)), cbh.a(cnk::e_, bzb.a(15)), caj.a()), cff.o);
   }

   private Optional<? extends bwb> g(ash $$0) {
      return this.eb().c(cff.h).orElse(cfh.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(ash $$0, bwb $$1) {
      bvm<?> $$2 = $$1.aq();
      return $$2 != bvm.bN && $$2 != bvm.F && cgl.c($$0, this, $$1);
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
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.s, 40.0).a(bxj.v, 0.3F).a(bxj.p, 0.6F).a(bxj.d, 1.0).a(bxj.c, 6.0);
   }

   public boolean p() {
      return !this.e_();
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      if ($$1 instanceof bwb $$2) {
         this.ck = 10;
         $$0.a(this, (byte)4);
         this.b(axf.DN);
         return coc.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void e(bwb $$0) {
      if (!this.e_()) {
         coc.a(this, $$0);
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwb $$4) {
         if (this.c($$4) && !bxw.a(this, $$4, 4.0)) {
            this.j($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void j(bwb $$0) {
      this.bF.b(cff.E);
      this.bF.a(cff.o, $$0, 200L);
   }

   @Override
   public bxd<cnk> eb() {
      return (bxd<cnk>)super.eb();
   }

   protected void t() {
      crj $$0 = this.bF.g().orElse(null);
      this.bF.a(ImmutableList.of(crj.k, crj.b));
      crj $$1 = this.bF.g().orElse(null);
      if ($$1 == crj.k && $$0 != crj.k) {
         this.gm();
      }

      this.w(this.bF.a(cff.o));
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("zoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bZ, $$0);
      if (!this.dV().C && $$0) {
         this.g(bxj.c).a(0.5);
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
         this.b(axf.DN);
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
      if (this.dV().C) {
         return null;
      } else {
         return this.bF.a(cff.o) ? axf.DM : axf.DL;
      }
   }

   @Override
   protected axe e(btv $$0) {
      return axf.DP;
   }

   @Override
   protected axe o_() {
      return axf.DO;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.DQ, 0.15F, 1.0F);
   }

   protected void gm() {
      this.b(axf.DM);
   }

   @Nullable
   @Override
   public bwb O_() {
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
