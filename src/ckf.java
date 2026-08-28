import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckf extends cjn implements cjf, ckt {
   private static final ajp<Boolean> d = ajt.a(ckf.class, ajr.k);
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
   protected static final ImmutableList<? extends cdj<? extends cdi<? super ckf>>> b = ImmutableList.of(cdj.c, cdj.d);
   protected static final ImmutableList<? extends ccc<?>> c = ImmutableList.of(ccc.g, ccc.h, ccc.k, ccc.l, ccc.n, ccc.m, ccc.E, ccc.t, ccc.o, ccc.p);

   public ckf(bsj<? extends ckf> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   protected bua.b<ckf> dU() {
      return bua.a(c, b);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      bua<ckf> $$1 = this.dU().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cnw.a));
      $$1.b(cnw.b);
      $$1.f();
      return $$1;
   }

   private static void a(bua<ckf> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bvx(45, 90), new bwb()));
   }

   private static void b(bua<ckf> $$0) {
      $$0.a(
         cnw.b,
         10,
         ImmutableList.of(
            bxd.a(ckf::gp),
            bwr.a(8.0F, bpo.a(30, 60)),
            new bwo(ImmutableList.of(Pair.of(bwj.a(0.4F), 2), Pair.of(bwy.a(0.4F, 3), 2), Pair.of(new bvb(30, 60), 1)))
         )
      );
   }

   private static void c(bua<ckf> $$0) {
      $$0.a(cnw.k, 10, ImmutableList.of(bww.a(1.0F), bye.a(ckf::u, bvy.a(40)), bye.a(ckf::p_, bvy.a(15)), bxg.a()), ccc.o);
   }

   private Optional<? extends bsy> gp() {
      return this.dT().c(ccc.h).orElse(cce.a()).a(this::j);
   }

   private boolean j(bsy $$0) {
      bsj<?> $$1 = $$0.ak();
      return $$1 != bsj.bt && $$1 != bsj.x && cdi.c(this, $$0);
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

   public static buf.a s() {
      return cjn.gt().a(bug.s, 40.0).a(bug.v, 0.3F).a(bug.p, 0.6F).a(bug.d, 1.0).a(bug.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean D(bsd $$0) {
      if (!($$0 instanceof bsy)) {
         return false;
      } else {
         this.cj = 10;
         this.dP().a(this, (byte)4);
         this.b(avf.Do);
         return ckt.a(this, (bsy)$$0);
      }
   }

   @Override
   public boolean a(cmh $$0) {
      return !this.fZ();
   }

   @Override
   protected void e(bsy $$0) {
      if (!this.p_()) {
         ckt.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bsy) {
         bsy $$3 = (bsy)$$0.d();
         if (this.c($$3) && !but.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bsy $$0) {
      this.bF.b(ccc.E);
      this.bF.a(ccc.o, $$0, 200L);
   }

   @Override
   public bua<ckf> dT() {
      return (bua<ckf>)super.dT();
   }

   protected void y() {
      cnw $$0 = this.bF.g().orElse(null);
      this.bF.a(ImmutableList.of(cnw.k, cnw.b));
      cnw $$1 = this.bF.g().orElse(null);
      if ($$1 == cnw.k && $$0 != cnw.k) {
         this.go();
      }

      this.v(this.bF.a(ccc.o));
   }

   @Override
   protected void Z() {
      this.dP().ag().a("zoglinBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (!this.dP().B && $$0) {
         this.f(bug.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.ap().a(d);
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
         this.b(avf.Do);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gn() {
      return this.cj;
   }

   @Override
   protected ave v() {
      if (this.dP().B) {
         return null;
      } else {
         return this.bF.a(ccc.o) ? avf.Dn : avf.Dm;
      }
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.Dq;
   }

   @Override
   protected ave o_() {
      return avf.Dp;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.Dr, 0.15F, 1.0F);
   }

   protected void go() {
      this.b(avf.Dn);
   }

   @Nullable
   @Override
   public bsy p() {
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
