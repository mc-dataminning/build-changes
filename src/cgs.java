import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cgs extends cga implements cfs, chg {
   private static final aim<Boolean> d = aiq.a(cgs.class, aio.k);
   private static final int e = 40;
   private static final int bX = 1;
   private static final float bY = 0.6F;
   private static final int bZ = 6;
   private static final float ca = 0.5F;
   private static final int cb = 40;
   private static final int cc = 15;
   private static final int cd = 200;
   private static final float ce = 0.3F;
   private static final float cf = 0.4F;
   private int cg;
   protected static final ImmutableList<? extends bzz<? extends bzy<? super cgs>>> b = ImmutableList.of(bzz.c, bzz.d);
   protected static final ImmutableList<? extends bys<?>> c = ImmutableList.of(bys.g, bys.h, bys.k, bys.l, bys.n, bys.m, bys.E, bys.t, bys.o, bys.p);

   public cgs(bpd<? extends cgs> $$0, cxb $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   protected bqq.b<cgs> dQ() {
      return bqq.a(c, b);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      bqq<cgs> $$1 = this.dQ().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(ckj.a));
      $$1.b(ckj.b);
      $$1.f();
      return $$1;
   }

   private static void a(bqq<cgs> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new bsn(45, 90), new bsr()));
   }

   private static void b(bqq<cgs> $$0) {
      $$0.a(
         ckj.b,
         10,
         ImmutableList.of(
            btt.a(cgs::gp),
            bth.a(8.0F, bmo.a(30, 60)),
            new bte(ImmutableList.of(Pair.of(bsz.a(0.4F), 2), Pair.of(bto.a(0.4F, 3), 2), Pair.of(new brr(30, 60), 1)))
         )
      );
   }

   private static void c(bqq<cgs> $$0) {
      $$0.a(ckj.k, 10, ImmutableList.of(btm.a(1.0F), buu.a(cgs::s, bso.a(40)), buu.a(cgs::o_, bso.a(15)), btw.a()), bys.o);
   }

   private Optional<? extends bpp> gp() {
      return this.dP().c(bys.h).orElse(byu.a()).a(this::j);
   }

   private boolean j(bpp $$0) {
      bpd<?> $$1 = $$0.ai();
      return $$1 != bpd.bt && $$1 != bpd.y && bzy.c(this, $$0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(aim<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static bqv.a r() {
      return cga.gt().a(bqw.q, 40.0).a(bqw.r, 0.3F).a(bqw.n, 0.6F).a(bqw.d, 1.0).a(bqw.c, 6.0);
   }

   public boolean s() {
      return !this.o_();
   }

   @Override
   public boolean C(box $$0) {
      if (!($$0 instanceof bpp)) {
         return false;
      } else {
         this.cg = 10;
         this.dM().a(this, (byte)4);
         this.b(aty.CK);
         return chg.a(this, (bpp)$$0);
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return !this.gb();
   }

   @Override
   protected void e(bpp $$0) {
      if (!this.o_()) {
         chg.b(this, $$0);
      }
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bpp) {
         bpp $$3 = (bpp)$$0.d();
         if (this.c($$3) && !brj.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bpp $$0) {
      this.bC.b(bys.E);
      this.bC.a(bys.o, $$0, 200L);
   }

   @Override
   public bqq<cgs> dP() {
      return (bqq<cgs>)super.dP();
   }

   protected void y() {
      ckj $$0 = this.bC.g().orElse(null);
      this.bC.a(ImmutableList.of(ckj.k, ckj.b));
      ckj $$1 = this.bC.g().orElse(null);
      if ($$1 == ckj.k && $$0 != ckj.k) {
         this.go();
      }

      this.v(this.bC.a(bys.o));
   }

   @Override
   protected void Y() {
      this.dM().ae().a("zoglinBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(d, $$0);
      if (!this.dM().B && $$0) {
         this.f(bqw.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.an().a(d);
   }

   @Override
   public void m_() {
      if (this.cg > 0) {
         this.cg--;
      }

      super.m_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cg = 10;
         this.b(aty.CK);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gn() {
      return this.cg;
   }

   @Override
   protected atx v() {
      if (this.dM().B) {
         return null;
      } else {
         return this.bC.a(bys.o) ? aty.CJ : aty.CI;
      }
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.CM;
   }

   @Override
   protected atx n_() {
      return aty.CL;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.CN, 0.15F, 1.0F);
   }

   protected void go() {
      this.b(aty.CJ);
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
