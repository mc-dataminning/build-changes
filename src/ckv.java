import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckv extends ckd implements cjv, clj {
   private static final akk<Boolean> d = ako.a(ckv.class, akm.k);
   private static final int e = 40;
   private static final int bY = 1;
   private static final float bZ = 0.6F;
   private static final int ca = 6;
   private static final float cb = 0.5F;
   private static final int cc = 40;
   private static final int cd = 15;
   private static final int ce = 200;
   private static final float cf = 0.3F;
   private static final float cg = 0.4F;
   private int ch;
   protected static final ImmutableList<? extends cea<? extends cdz<? super ckv>>> b = ImmutableList.of(cea.c, cea.d);
   protected static final ImmutableList<? extends cct<?>> c = ImmutableList.of(cct.g, cct.h, cct.k, cct.l, cct.n, cct.m, cct.E, cct.t, cct.o, cct.p);

   public ckv(bta<? extends ckv> $$0, dby $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bur.b<ckv> dT() {
      return bur.a(c, b);
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      bur<ckv> $$1 = this.dT().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(com.a));
      $$1.b(com.b);
      $$1.f();
      return $$1;
   }

   private static void a(bur<ckv> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new bwo(45, 90), new bws()));
   }

   private static void b(bur<ckv> $$0) {
      $$0.a(
         com.b,
         10,
         ImmutableList.of(
            bxu.a(ckv::gs),
            bxi.a(8.0F, bqf.a(30, 60)),
            new bxf(ImmutableList.of(Pair.of(bxa.a(0.4F), 2), Pair.of(bxp.a(0.4F, 3), 2), Pair.of(new bvs(30, 60), 1)))
         )
      );
   }

   private static void c(bur<ckv> $$0) {
      $$0.a(com.k, 10, ImmutableList.of(bxn.a(1.0F), byv.a(ckv::u, bwp.a(40)), byv.a(ckv::p_, bwp.a(15)), bxx.a()), cct.o);
   }

   private Optional<? extends btp> gs() {
      return this.dS().c(cct.h).orElse(ccv.a()).a(this::j);
   }

   private boolean j(btp $$0) {
      bta<?> $$1 = $$0.ak();
      return $$1 != bta.bt && $$1 != bta.x && cdz.c(this, $$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static buw.a s() {
      return ckd.gw().a(bux.q, 40.0).a(bux.r, 0.3F).a(bux.n, 0.6F).a(bux.d, 1.0).a(bux.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(bsu $$0) {
      if (!($$0 instanceof btp)) {
         return false;
      } else {
         this.ch = 10;
         this.dP().a(this, (byte)4);
         this.b(awa.Dl);
         return clj.a(this, (btp)$$0);
      }
   }

   @Override
   public boolean a(cmx $$0) {
      return !this.gd();
   }

   @Override
   protected void e(btp $$0) {
      if (!this.p_()) {
         clj.b(this, $$0);
      }
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof btp) {
         btp $$3 = (btp)$$0.d();
         if (this.c($$3) && !bvk.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(btp $$0) {
      this.bD.b(cct.E);
      this.bD.a(cct.o, $$0, 200L);
   }

   @Override
   public bur<ckv> dS() {
      return (bur<ckv>)super.dS();
   }

   protected void y() {
      com $$0 = this.bD.g().orElse(null);
      this.bD.a(ImmutableList.of(com.k, com.b));
      com $$1 = this.bD.g().orElse(null);
      if ($$1 == com.k && $$0 != com.k) {
         this.gr();
      }

      this.v(this.bD.a(cct.o));
   }

   @Override
   protected void Z() {
      this.dP().ag().a("zoglinBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (!this.dP().B && $$0) {
         this.f(bux.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.ap().a(d);
   }

   @Override
   public void n_() {
      if (this.ch > 0) {
         this.ch--;
      }

      super.n_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.b(awa.Dl);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gq() {
      return this.ch;
   }

   @Override
   protected avz v() {
      if (this.dP().B) {
         return null;
      } else {
         return this.bD.a(cct.o) ? awa.Dk : awa.Dj;
      }
   }

   @Override
   protected avz d(brn $$0) {
      return awa.Dn;
   }

   @Override
   protected avz o_() {
      return awa.Dm;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.Do, 0.15F, 1.0F);
   }

   protected void gr() {
      this.b(awa.Dk);
   }

   @Nullable
   @Override
   public btp p() {
      return this.N();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
