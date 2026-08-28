import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckv extends ckd implements cjv, clj {
   private static final ajw<Boolean> d = aka.a(ckv.class, ajy.k);
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
   protected static final ImmutableList<? extends cdz<? extends cdy<? super ckv>>> b = ImmutableList.of(cdz.c, cdz.d);
   protected static final ImmutableList<? extends ccs<?>> c = ImmutableList.of(ccs.g, ccs.h, ccs.k, ccs.l, ccs.n, ccs.m, ccs.E, ccs.t, ccs.o, ccs.p);

   public ckv(bsx<? extends ckv> $$0, dcw $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   protected buq.b<ckv> dU() {
      return buq.a(c, b);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      buq<ckv> $$1 = this.dU().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(com.a));
      $$1.b(com.b);
      $$1.f();
      return $$1;
   }

   private static void a(buq<ckv> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new bwn(45, 90), new bwr()));
   }

   private static void b(buq<ckv> $$0) {
      $$0.a(
         com.b,
         10,
         ImmutableList.of(
            bxt.a(ckv::gm),
            bxh.a(8.0F, bqc.a(30, 60)),
            new bxe(ImmutableList.of(Pair.of(bwz.a(0.4F), 2), Pair.of(bxo.a(0.4F, 3), 2), Pair.of(new bvr(30, 60), 1)))
         )
      );
   }

   private static void c(buq<ckv> $$0) {
      $$0.a(com.k, 10, ImmutableList.of(bxm.a(1.0F), byu.a(ckv::t, bwo.a(40)), byu.a(ckv::o_, bwo.a(15)), bxw.a()), ccs.o);
   }

   private Optional<? extends btn> gm() {
      return this.dT().c(ccs.h).orElse(ccu.a()).a(this::j);
   }

   private boolean j(btn $$0) {
      bsx<?> $$1 = $$0.am();
      return $$1 != bsx.bt && $$1 != bsx.x && cdy.c(this, $$0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(ajw<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.i_();
      }
   }

   public static buv.a s() {
      return ckd.gq().a(buw.s, 40.0).a(buw.v, 0.3F).a(buw.p, 0.6F).a(buw.d, 1.0).a(buw.c, 6.0);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   public boolean D(bsr $$0) {
      if (!($$0 instanceof btn)) {
         return false;
      } else {
         this.cj = 10;
         this.dO().a(this, (byte)4);
         this.b(avp.Dp);
         return clj.a(this, (btn)$$0);
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void e(btn $$0) {
      if (!this.o_()) {
         clj.b(this, $$0);
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dO().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof btn) {
         btn $$3 = (btn)$$0.d();
         if (this.c($$3) && !bvj.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(btn $$0) {
      this.bF.b(ccs.E);
      this.bF.a(ccs.o, $$0, 200L);
   }

   @Override
   public buq<ckv> dT() {
      return (buq<ckv>)super.dT();
   }

   protected void x() {
      com $$0 = this.bF.g().orElse(null);
      this.bF.a(ImmutableList.of(com.k, com.b));
      com $$1 = this.bF.g().orElse(null);
      if ($$1 == com.k && $$0 != com.k) {
         this.gl();
      }

      this.w(this.bF.a(ccs.o));
   }

   @Override
   protected void ab() {
      this.dO().ag().a("zoglinBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().c();
      this.x();
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(d, $$0);
      if (!this.dO().B && $$0) {
         this.f(buw.c).a(0.5);
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
         this.b(avp.Dp);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gk() {
      return this.cj;
   }

   @Override
   protected avo v() {
      if (this.dO().B) {
         return null;
      } else {
         return this.bF.a(ccs.o) ? avp.Do : avp.Dn;
      }
   }

   @Override
   protected avo d(brk $$0) {
      return avp.Dr;
   }

   @Override
   protected avo n_() {
      return avp.Dq;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.Ds, 0.15F, 1.0F);
   }

   protected void gl() {
      this.b(avp.Do);
   }

   @Nullable
   @Override
   public btn p() {
      return this.P();
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
