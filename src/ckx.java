import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckx extends ckf implements cjx, cll {
   private static final akk<Boolean> d = ako.a(ckx.class, akm.k);
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
   protected static final ImmutableList<? extends cec<? extends ceb<? super ckx>>> b = ImmutableList.of(cec.c, cec.d);
   protected static final ImmutableList<? extends ccv<?>> c = ImmutableList.of(ccv.g, ccv.h, ccv.k, ccv.l, ccv.n, ccv.m, ccv.E, ccv.t, ccv.o, ccv.p);

   public ckx(btc<? extends ckx> $$0, dca $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected but.b<ckx> dT() {
      return but.a(c, b);
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      but<ckx> $$1 = this.dT().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cop.a));
      $$1.b(cop.b);
      $$1.f();
      return $$1;
   }

   private static void a(but<ckx> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bwq(45, 90), new bwu()));
   }

   private static void b(but<ckx> $$0) {
      $$0.a(
         cop.b,
         10,
         ImmutableList.of(
            bxw.a(ckx::gs),
            bxk.a(8.0F, bqh.a(30, 60)),
            new bxh(ImmutableList.of(Pair.of(bxc.a(0.4F), 2), Pair.of(bxr.a(0.4F, 3), 2), Pair.of(new bvu(30, 60), 1)))
         )
      );
   }

   private static void c(but<ckx> $$0) {
      $$0.a(cop.k, 10, ImmutableList.of(bxp.a(1.0F), byx.a(ckx::u, bwr.a(40)), byx.a(ckx::p_, bwr.a(15)), bxz.a()), ccv.o);
   }

   private Optional<? extends btr> gs() {
      return this.dS().c(ccv.h).orElse(ccx.a()).a(this::j);
   }

   private boolean j(btr $$0) {
      btc<?> $$1 = $$0.ak();
      return $$1 != btc.bt && $$1 != btc.x && ceb.c(this, $$0);
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

   public static buy.a s() {
      return ckf.gw().a(buz.q, 40.0).a(buz.r, 0.3F).a(buz.n, 0.6F).a(buz.d, 1.0).a(buz.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(bsw $$0) {
      if (!($$0 instanceof btr)) {
         return false;
      } else {
         this.ch = 10;
         this.dP().a(this, (byte)4);
         this.b(awa.Dl);
         return cll.a(this, (btr)$$0);
      }
   }

   @Override
   public boolean a(cmz $$0) {
      return !this.gd();
   }

   @Override
   protected void e(btr $$0) {
      if (!this.p_()) {
         cll.b(this, $$0);
      }
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof btr) {
         btr $$3 = (btr)$$0.d();
         if (this.c($$3) && !bvm.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(btr $$0) {
      this.bD.b(ccv.E);
      this.bD.a(ccv.o, $$0, 200L);
   }

   @Override
   public but<ckx> dS() {
      return (but<ckx>)super.dS();
   }

   protected void y() {
      cop $$0 = this.bD.g().orElse(null);
      this.bD.a(ImmutableList.of(cop.k, cop.b));
      cop $$1 = this.bD.g().orElse(null);
      if ($$1 == cop.k && $$0 != cop.k) {
         this.gr();
      }

      this.v(this.bD.a(ccv.o));
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
         this.f(buz.c).a(0.5);
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
         return this.bD.a(ccv.o) ? awa.Dk : awa.Dj;
      }
   }

   @Override
   protected avz d(brp $$0) {
      return awa.Dn;
   }

   @Override
   protected avz o_() {
      return awa.Dm;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.Do, 0.15F, 1.0F);
   }

   protected void gr() {
      this.b(awa.Dk);
   }

   @Nullable
   @Override
   public btr p() {
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
