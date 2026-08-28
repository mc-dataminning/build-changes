import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cki extends cjq implements cji, ckw {
   private static final ajp<Boolean> d = ajt.a(cki.class, ajr.k);
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
   protected static final ImmutableList<? extends cdm<? extends cdl<? super cki>>> b = ImmutableList.of(cdm.c, cdm.d);
   protected static final ImmutableList<? extends ccf<?>> c = ImmutableList.of(ccf.g, ccf.h, ccf.k, ccf.l, ccf.n, ccf.m, ccf.E, ccf.t, ccf.o, ccf.p);

   public cki(bsm<? extends cki> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   protected bud.b<cki> dV() {
      return bud.a(c, b);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      bud<cki> $$1 = this.dV().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cnz.a));
      $$1.b(cnz.b);
      $$1.f();
      return $$1;
   }

   private static void a(bud<cki> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bwa(45, 90), new bwe()));
   }

   private static void b(bud<cki> $$0) {
      $$0.a(
         cnz.b,
         10,
         ImmutableList.of(
            bxg.a(cki::gq),
            bwu.a(8.0F, bpr.a(30, 60)),
            new bwr(ImmutableList.of(Pair.of(bwm.a(0.4F), 2), Pair.of(bxb.a(0.4F, 3), 2), Pair.of(new bve(30, 60), 1)))
         )
      );
   }

   private static void c(bud<cki> $$0) {
      $$0.a(cnz.k, 10, ImmutableList.of(bwz.a(1.0F), byh.a(cki::u, bwb.a(40)), byh.a(cki::p_, bwb.a(15)), bxj.a()), ccf.o);
   }

   private Optional<? extends btb> gq() {
      return this.dU().c(ccf.h).orElse(cch.a()).a(this::j);
   }

   private boolean j(btb $$0) {
      bsm<?> $$1 = $$0.al();
      return $$1 != bsm.bt && $$1 != bsm.x && cdl.c(this, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static bui.a s() {
      return cjq.gu().a(buj.s, 40.0).a(buj.v, 0.3F).a(buj.p, 0.6F).a(buj.d, 1.0).a(buj.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean D(bsg $$0) {
      if (!($$0 instanceof btb)) {
         return false;
      } else {
         this.cj = 10;
         this.dQ().a(this, (byte)4);
         this.b(avh.Do);
         return ckw.a(this, (btb)$$0);
      }
   }

   @Override
   public boolean a(cmk $$0) {
      return !this.ga();
   }

   @Override
   protected void e(btb $$0) {
      if (!this.p_()) {
         ckw.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dQ().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof btb) {
         btb $$3 = (btb)$$0.d();
         if (this.c($$3) && !buw.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(btb $$0) {
      this.bF.b(ccf.E);
      this.bF.a(ccf.o, $$0, 200L);
   }

   @Override
   public bud<cki> dU() {
      return (bud<cki>)super.dU();
   }

   protected void y() {
      cnz $$0 = this.bF.g().orElse(null);
      this.bF.a(ImmutableList.of(cnz.k, cnz.b));
      cnz $$1 = this.bF.g().orElse(null);
      if ($$1 == cnz.k && $$0 != cnz.k) {
         this.gp();
      }

      this.v(this.bF.a(ccf.o));
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("zoglinBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.aq().a(d, $$0);
      if (!this.dQ().B && $$0) {
         this.f(buj.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.aq().a(d);
   }

   @Override
   public void n_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.n_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(avh.Do);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int go() {
      return this.cj;
   }

   @Override
   protected avg v() {
      if (this.dQ().B) {
         return null;
      } else {
         return this.bF.a(ccf.o) ? avh.Dn : avh.Dm;
      }
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.Dq;
   }

   @Override
   protected avg o_() {
      return avh.Dp;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.Dr, 0.15F, 1.0F);
   }

   protected void gp() {
      this.b(avh.Dn);
   }

   @Nullable
   @Override
   public btb p() {
      return this.N();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
