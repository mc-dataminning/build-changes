import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckq extends cjy implements cjq, cle {
   private static final akg<Boolean> d = akk.a(ckq.class, aki.k);
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
   protected static final ImmutableList<? extends cdv<? extends cdu<? super ckq>>> b = ImmutableList.of(cdv.c, cdv.d);
   protected static final ImmutableList<? extends cco<?>> c = ImmutableList.of(cco.g, cco.h, cco.k, cco.l, cco.n, cco.m, cco.E, cco.t, cco.o, cco.p);

   public ckq(bsv<? extends ckq> $$0, dbt $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bum.b<ckq> dT() {
      return bum.a(c, b);
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      bum<ckq> $$1 = this.dT().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(coh.a));
      $$1.b(coh.b);
      $$1.f();
      return $$1;
   }

   private static void a(bum<ckq> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new bwj(45, 90), new bwn()));
   }

   private static void b(bum<ckq> $$0) {
      $$0.a(
         coh.b,
         10,
         ImmutableList.of(
            bxp.a(ckq::gs),
            bxd.a(8.0F, bqa.a(30, 60)),
            new bxa(ImmutableList.of(Pair.of(bwv.a(0.4F), 2), Pair.of(bxk.a(0.4F, 3), 2), Pair.of(new bvn(30, 60), 1)))
         )
      );
   }

   private static void c(bum<ckq> $$0) {
      $$0.a(coh.k, 10, ImmutableList.of(bxi.a(1.0F), byq.a(ckq::u, bwk.a(40)), byq.a(ckq::p_, bwk.a(15)), bxs.a()), cco.o);
   }

   private Optional<? extends btk> gs() {
      return this.dS().c(cco.h).orElse(ccq.a()).a(this::j);
   }

   private boolean j(btk $$0) {
      bsv<?> $$1 = $$0.ak();
      return $$1 != bsv.bt && $$1 != bsv.x && cdu.c(this, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static bur.a s() {
      return cjy.gw().a(bus.q, 40.0).a(bus.r, 0.3F).a(bus.n, 0.6F).a(bus.d, 1.0).a(bus.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(bsp $$0) {
      if (!($$0 instanceof btk)) {
         return false;
      } else {
         this.ch = 10;
         this.dP().a(this, (byte)4);
         this.b(avw.Dl);
         return cle.a(this, (btk)$$0);
      }
   }

   @Override
   public boolean a(cms $$0) {
      return !this.gd();
   }

   @Override
   protected void e(btk $$0) {
      if (!this.p_()) {
         cle.b(this, $$0);
      }
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof btk) {
         btk $$3 = (btk)$$0.d();
         if (this.c($$3) && !bvf.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(btk $$0) {
      this.bD.b(cco.E);
      this.bD.a(cco.o, $$0, 200L);
   }

   @Override
   public bum<ckq> dS() {
      return (bum<ckq>)super.dS();
   }

   protected void y() {
      coh $$0 = this.bD.g().orElse(null);
      this.bD.a(ImmutableList.of(coh.k, coh.b));
      coh $$1 = this.bD.g().orElse(null);
      if ($$1 == coh.k && $$0 != coh.k) {
         this.gr();
      }

      this.v(this.bD.a(cco.o));
   }

   @Override
   protected void Z() {
      this.dP().ag().a("zoglinBrain");
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (!this.dP().B && $$0) {
         this.f(bus.c).a(0.5);
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
         this.b(avw.Dl);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gq() {
      return this.ch;
   }

   @Override
   protected avv v() {
      if (this.dP().B) {
         return null;
      } else {
         return this.bD.a(cco.o) ? avw.Dk : avw.Dj;
      }
   }

   @Override
   protected avv d(bri $$0) {
      return avw.Dn;
   }

   @Override
   protected avv o_() {
      return avw.Dm;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.Do, 0.15F, 1.0F);
   }

   protected void gr() {
      this.b(avw.Dk);
   }

   @Nullable
   @Override
   public btk p() {
      return this.N();
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
