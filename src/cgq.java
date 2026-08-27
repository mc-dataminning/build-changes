import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cgq extends cfy implements cfq, che {
   private static final aim<Boolean> d = aiq.a(cgq.class, aio.k);
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
   protected static final ImmutableList<? extends bzy<? extends bzx<? super cgq>>> b = ImmutableList.of(bzy.c, bzy.d);
   protected static final ImmutableList<? extends byr<?>> c = ImmutableList.of(byr.g, byr.h, byr.k, byr.l, byr.n, byr.m, byr.E, byr.t, byr.o, byr.p);

   public cgq(bpc<? extends cgq> $$0, cwz $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   protected bqp.b<cgq> dQ() {
      return bqp.a(c, b);
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      bqp<cgq> $$1 = this.dQ().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(ckh.a));
      $$1.b(ckh.b);
      $$1.f();
      return $$1;
   }

   private static void a(bqp<cgq> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bsm(45, 90), new bsq()));
   }

   private static void b(bqp<cgq> $$0) {
      $$0.a(
         ckh.b,
         10,
         ImmutableList.of(
            bts.a(cgq::gp),
            btg.a(8.0F, bmn.a(30, 60)),
            new btd(ImmutableList.of(Pair.of(bsy.a(0.4F), 2), Pair.of(btn.a(0.4F, 3), 2), Pair.of(new brq(30, 60), 1)))
         )
      );
   }

   private static void c(bqp<cgq> $$0) {
      $$0.a(ckh.k, 10, ImmutableList.of(btl.a(1.0F), but.a(cgq::s, bsn.a(40)), but.a(cgq::o_, bsn.a(15)), btv.a()), byr.o);
   }

   private Optional<? extends bpo> gp() {
      return this.dP().c(byr.h).orElse(byt.a()).a(this::j);
   }

   private boolean j(bpo $$0) {
      bpc<?> $$1 = $$0.ai();
      return $$1 != bpc.bs && $$1 != bpc.x && bzx.c(this, $$0);
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

   public static bqu.a r() {
      return cfy.gt().a(bqv.q, 40.0).a(bqv.r, 0.3F).a(bqv.n, 0.6F).a(bqv.d, 1.0).a(bqv.c, 6.0);
   }

   public boolean s() {
      return !this.o_();
   }

   @Override
   public boolean C(bow $$0) {
      if (!($$0 instanceof bpo)) {
         return false;
      } else {
         this.cg = 10;
         this.dM().a(this, (byte)4);
         this.b(aty.CF);
         return che.a(this, (bpo)$$0);
      }
   }

   @Override
   public boolean a(cis $$0) {
      return !this.gb();
   }

   @Override
   protected void e(bpo $$0) {
      if (!this.o_()) {
         che.b(this, $$0);
      }
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bpo) {
         bpo $$3 = (bpo)$$0.d();
         if (this.c($$3) && !bri.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bpo $$0) {
      this.bC.b(byr.E);
      this.bC.a(byr.o, $$0, 200L);
   }

   @Override
   public bqp<cgq> dP() {
      return (bqp<cgq>)super.dP();
   }

   protected void y() {
      ckh $$0 = this.bC.g().orElse(null);
      this.bC.a(ImmutableList.of(ckh.k, ckh.b));
      ckh $$1 = this.bC.g().orElse(null);
      if ($$1 == ckh.k && $$0 != ckh.k) {
         this.go();
      }

      this.v(this.bC.a(byr.o));
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
         this.f(bqv.c).a(0.5);
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
         this.b(aty.CF);
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
         return this.bC.a(byr.o) ? aty.CE : aty.CD;
      }
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.CH;
   }

   @Override
   protected atx n_() {
      return aty.CG;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.CI, 0.15F, 1.0F);
   }

   protected void go() {
      this.b(aty.CE);
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
