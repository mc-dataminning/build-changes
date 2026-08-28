import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqc extends cpk implements cqt {
   private static final aku<Boolean> e = aky.a(cqc.class, akw.k);
   private static final int f = 40;
   private static final int bI = 1;
   private static final float bJ = 0.6F;
   private static final int bK = 6;
   private static final float bL = 0.5F;
   private static final int bM = 40;
   private static final int bN = 15;
   private static final int bO = 200;
   private static final float bP = 0.3F;
   private static final float bQ = 0.4F;
   private static final boolean bR = false;
   private int bS;
   protected static final ImmutableList<? extends cio<? extends cin<? super cqc>>> a = ImmutableList.of(cio.c, cio.d);
   protected static final ImmutableList<? extends chh<?>> b = ImmutableList.of(chh.g, chh.h, chh.k, chh.l, chh.o, chh.n, chh.F, chh.u, chh.p, chh.q);

   public cqc(bxn<? extends cqc> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @Override
   protected bzf.b<cqc> ed() {
      return bzf.a(b, a);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      bzf<cqc> $$1 = this.ed().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cuc.a));
      $$1.b(cuc.b);
      $$1.f();
      return $$1;
   }

   private static void a(bzf<cqc> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new cbc(45, 90), new cbg()));
   }

   private static void b(bzf<cqc> $$0) {
      $$0.a(
         cuc.b,
         10,
         ImmutableList.of(
            cci.a(($$0x, $$1) -> $$1.g($$0x)),
            cbw.a(8.0F, bun.a(30, 60)),
            new cbt(ImmutableList.of(Pair.of(cbo.a(0.4F), 2), Pair.of(ccd.a(0.4F, 3), 2), Pair.of(new cag(30, 60), 1)))
         )
      );
   }

   private static void c(bzf<cqc> $$0) {
      $$0.a(cuc.k, 10, ImmutableList.of(ccb.a(1.0F), cdj.a(cqc::p, cbd.a(40)), cdj.a(cqc::e_, cbd.a(15)), ccl.a()), chh.p);
   }

   private Optional<? extends byf> g(asb $$0) {
      return this.ec().c(chh.h).orElse(chj.a()).a($$1 -> this.c($$0, $$1));
   }

   private boolean c(asb $$0, byf $$1) {
      bxn<?> $$2 = $$1.an();
      return $$2 != bxn.bO && $$2 != bxn.F && cin.c($$0, this, $$1);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void a(aku<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.h_();
      }
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      if ($$0.G_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bzk.a m() {
      return cpk.gA().a(bzl.s, 40.0).a(bzl.v, 0.3F).a(bzl.p, 0.6F).a(bzl.d, 1.0).a(bzl.c, 6.0);
   }

   public boolean p() {
      return !this.e_();
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      if ($$1 instanceof byf $$2) {
         this.bS = 10;
         $$0.a(this, (byte)4);
         this.b(awy.En);
         return cqt.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void d(byf $$0) {
      if (!this.e_()) {
         cqt.a(this, $$0);
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof byf $$4) {
         if (this.c($$4) && !bzy.a(this, $$4, 4.0)) {
            this.i($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void i(byf $$0) {
      this.bs.b(chh.F);
      this.bs.a(chh.p, $$0, 200L);
   }

   @Override
   public bzf<cqc> ec() {
      return (bzf<cqc>)super.ec();
   }

   protected void u() {
      cuc $$0 = this.bs.g().orElse(null);
      this.bs.a(ImmutableList.of(cuc.k, cuc.b));
      cuc $$1 = this.bs.g().orElse(null);
      if ($$1 == cuc.k && $$0 != cuc.k) {
         this.gv();
      }

      this.v(this.bs.a(chh.p));
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("zoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      this.u();
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(e, $$0);
      if (!this.dV().C && $$0) {
         this.g(bzl.c).a(0.5);
      }
   }

   @Override
   public boolean e_() {
      return this.ar().a(e);
   }

   @Override
   public void d_() {
      if (this.bS > 0) {
         this.bS--;
      }

      super.d_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bS = 10;
         this.b(awy.En);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gu() {
      return this.bS;
   }

   @Override
   protected awx s() {
      if (this.dV().C) {
         return null;
      } else {
         return this.bs.a(chh.p) ? awy.Em : awy.El;
      }
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.Ep;
   }

   @Override
   protected awx j_() {
      return awy.Eo;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.Eq, 0.15F, 1.0F);
   }

   protected void gv() {
      this.b(awy.Em);
   }

   @Nullable
   @Override
   public byf e() {
      return this.P();
   }

   @Override
   protected void ab() {
      super.ab();
      agx.a(this);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.e_());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.b("IsBaby", false));
   }
}
