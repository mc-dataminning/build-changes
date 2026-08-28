import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckt extends ckb implements cjt, clh {
   private static final ajv<Boolean> d = ajz.a(ckt.class, ajx.k);
   private static final int e = 40;
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
   protected static final ImmutableList<? extends cdx<? extends cdw<? super ckt>>> b = ImmutableList.of(cdx.c, cdx.d);
   protected static final ImmutableList<? extends ccq<?>> c = ImmutableList.of(ccq.g, ccq.h, ccq.k, ccq.l, ccq.n, ccq.m, ccq.E, ccq.t, ccq.o, ccq.p);

   public ckt(bsw<? extends ckt> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   protected buo.b<ckt> dV() {
      return buo.a(c, b);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      buo<ckt> $$1 = this.dV().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cok.a));
      $$1.b(cok.b);
      $$1.f();
      return $$1;
   }

   private static void a(buo<ckt> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bwl(45, 90), new bwp()));
   }

   private static void b(buo<ckt> $$0) {
      $$0.a(
         cok.b,
         10,
         ImmutableList.of(
            bxr.a(ckt::go),
            bxf.a(8.0F, bqb.a(30, 60)),
            new bxc(ImmutableList.of(Pair.of(bwx.a(0.4F), 2), Pair.of(bxm.a(0.4F, 3), 2), Pair.of(new bvp(30, 60), 1)))
         )
      );
   }

   private static void c(buo<ckt> $$0) {
      $$0.a(cok.k, 10, ImmutableList.of(bxk.a(1.0F), bys.a(ckt::t, bwm.a(40)), bys.a(ckt::o_, bwm.a(15)), bxu.a()), ccq.o);
   }

   private Optional<? extends btl> go() {
      return this.dU().c(ccq.h).orElse(ccs.a()).a(this::j);
   }

   private boolean j(btl $$0) {
      bsw<?> $$1 = $$0.am();
      return $$1 != bsw.bt && $$1 != bsw.x && cdw.c(this, $$0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(ajv<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.i_();
      }
   }

   public static but.a s() {
      return ckb.gs().a(buu.s, 40.0).a(buu.v, 0.3F).a(buu.p, 0.6F).a(buu.d, 1.0).a(buu.c, 6.0);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   public boolean D(bsq $$0) {
      if (!($$0 instanceof btl)) {
         return false;
      } else {
         this.cj = 10;
         this.dQ().a(this, (byte)4);
         this.b(avo.Dp);
         return clh.a(this, (btl)$$0);
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return !this.fY();
   }

   @Override
   protected void e(btl $$0) {
      if (!this.o_()) {
         clh.b(this, $$0);
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dQ().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof btl) {
         btl $$3 = (btl)$$0.d();
         if (this.c($$3) && !bvh.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(btl $$0) {
      this.bF.b(ccq.E);
      this.bF.a(ccq.o, $$0, 200L);
   }

   @Override
   public buo<ckt> dU() {
      return (buo<ckt>)super.dU();
   }

   protected void x() {
      cok $$0 = this.bF.g().orElse(null);
      this.bF.a(ImmutableList.of(cok.k, cok.b));
      cok $$1 = this.bF.g().orElse(null);
      if ($$1 == cok.k && $$0 != cok.k) {
         this.gn();
      }

      this.v(this.bF.a(ccq.o));
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("zoglinBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      this.x();
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(d, $$0);
      if (!this.dQ().B && $$0) {
         this.f(buu.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.ar().a(d);
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
         this.b(avo.Dp);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gm() {
      return this.cj;
   }

   @Override
   protected avn v() {
      if (this.dQ().B) {
         return null;
      } else {
         return this.bF.a(ccq.o) ? avo.Do : avo.Dn;
      }
   }

   @Override
   protected avn d(brj $$0) {
      return avo.Dr;
   }

   @Override
   protected avn n_() {
      return avo.Dq;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.Ds, 0.15F, 1.0F);
   }

   protected void gn() {
      this.b(avo.Do);
   }

   @Nullable
   @Override
   public btl p() {
      return this.N();
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
