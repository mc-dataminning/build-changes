import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cno extends cmw implements cog {
   private static final alc<Boolean> bZ = alg.a(cno.class, ale.k);
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
   protected static final ImmutableList<? extends cgq<? extends cgp<? super cno>>> a = ImmutableList.of(cgq.c, cgq.d);
   protected static final ImmutableList<? extends cfj<?>> b = ImmutableList.of(cfj.g, cfj.h, cfj.k, cfj.l, cfj.n, cfj.m, cfj.E, cfj.t, cfj.o, cfj.p);

   public cno(bvq<? extends cno> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   protected bxh.b<cno> ec() {
      return bxh.a(b, a);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      bxh<cno> $$1 = this.ec().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(crn.a));
      $$1.b(crn.b);
      $$1.f();
      return $$1;
   }

   private static void a(bxh<cno> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new bze(45, 90), new bzi()));
   }

   private static void b(bxh<cno> $$0) {
      $$0.a(
         crn.b,
         10,
         ImmutableList.of(
            cak.a(($$0x, $$1) -> $$1.g($$0x)),
            bzy.a(8.0F, bst.a(30, 60)),
            new bzv(ImmutableList.of(Pair.of(bzq.a(0.4F), 2), Pair.of(caf.a(0.4F, 3), 2), Pair.of(new byi(30, 60), 1)))
         )
      );
   }

   private static void c(bxh<cno> $$0) {
      $$0.a(crn.k, 10, ImmutableList.of(cad.a(1.0F), cbl.a(cno::p, bzf.a(40)), cbl.a(cno::e_, bzf.a(15)), can.a()), cfj.o);
   }

   private Optional<? extends bwf> g(ash $$0) {
      return this.eb().c(cfj.h).orElse(cfl.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(ash $$0, bwf $$1) {
      bvq<?> $$2 = $$1.aq();
      return $$2 != bvq.bN && $$2 != bvq.F && cgp.c($$0, this, $$1);
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
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxm.a m() {
      return cmw.gr().a(bxn.s, 40.0).a(bxn.v, 0.3F).a(bxn.p, 0.6F).a(bxn.d, 1.0).a(bxn.c, 6.0);
   }

   public boolean p() {
      return !this.e_();
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
      if ($$1 instanceof bwf $$2) {
         this.ck = 10;
         $$0.a(this, (byte)4);
         this.b(axf.DO);
         return cog.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void e(bwf $$0) {
      if (!this.e_()) {
         cog.a(this, $$0);
      }
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwf $$4) {
         if (this.c($$4) && !bya.a(this, $$4, 4.0)) {
            this.j($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void j(bwf $$0) {
      this.bF.b(cfj.E);
      this.bF.a(cfj.o, $$0, 200L);
   }

   @Override
   public bxh<cno> eb() {
      return (bxh<cno>)super.eb();
   }

   protected void t() {
      crn $$0 = this.bF.g().orElse(null);
      this.bF.a(ImmutableList.of(crn.k, crn.b));
      crn $$1 = this.bF.g().orElse(null);
      if ($$1 == crn.k && $$0 != crn.k) {
         this.gm();
      }

      this.w(this.bF.a(cfj.o));
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("zoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bZ, $$0);
      if (!this.dV().C && $$0) {
         this.g(bxn.c).a(0.5);
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
      if (this.dV().C) {
         return null;
      } else {
         return this.bF.a(cfj.o) ? axf.DN : axf.DM;
      }
   }

   @Override
   protected axe e(btz $$0) {
      return axf.DQ;
   }

   @Override
   protected axe o_() {
      return axf.DP;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.DR, 0.15F, 1.0F);
   }

   protected void gm() {
      this.b(axf.DN);
   }

   @Nullable
   @Override
   public bwf O_() {
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
