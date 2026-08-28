import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmo extends clw implements cnf {
   private static final ajx<Boolean> bY = akb.a(cmo.class, ajz.k);
   private static final int bZ = 40;
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
   protected static final ImmutableList<? extends cfq<? extends cfp<? super cmo>>> a = ImmutableList.of(cfq.c, cfq.d);
   protected static final ImmutableList<? extends cej<?>> b = ImmutableList.of(cej.g, cej.h, cej.k, cej.l, cej.n, cej.m, cej.E, cej.t, cej.o, cej.p);

   public cmo(buq<? extends cmo> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bwh.b<cmo> ed() {
      return bwh.a(b, a);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      bwh<cmo> $$1 = this.ed().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cqm.a));
      $$1.b(cqm.b);
      $$1.f();
      return $$1;
   }

   private static void a(bwh<cmo> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bye(45, 90), new byi()));
   }

   private static void b(bwh<cmo> $$0) {
      $$0.a(
         cqm.b,
         10,
         ImmutableList.of(
            bzk.a(($$0x, $$1) -> $$1.g($$0x)),
            byy.a(8.0F, brt.a(30, 60)),
            new byv(ImmutableList.of(Pair.of(byq.a(0.4F), 2), Pair.of(bzf.a(0.4F, 3), 2), Pair.of(new bxi(30, 60), 1)))
         )
      );
   }

   private static void c(bwh<cmo> $$0) {
      $$0.a(cqm.k, 10, ImmutableList.of(bzd.a(1.0F), cal.a(cmo::p, byf.a(40)), cal.a(cmo::e_, byf.a(15)), bzn.a()), cej.o);
   }

   private Optional<? extends bvf> g(arc $$0) {
      return this.ec().c(cej.h).orElse(cel.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(arc $$0, bvf $$1) {
      buq<?> $$2 = $$1.aq();
      return $$2 != buq.bM && $$2 != buq.E && cfp.c($$0, this, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (bY.equals($$0)) {
         this.m_();
      }
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwm.a m() {
      return clw.gu().a(bwn.s, 40.0).a(bwn.v, 0.3F).a(bwn.p, 0.6F).a(bwn.d, 1.0).a(bwn.c, 6.0);
   }

   public boolean p() {
      return !this.e_();
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      if ($$1 instanceof bvf $$2) {
         this.cj = 10;
         $$0.a(this, (byte)4);
         this.b(avz.Ed);
         return cnf.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void e(bvf $$0) {
      if (!this.e_()) {
         cnf.a(this, $$0);
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvf $$4) {
         if (this.c($$4) && !bxa.a(this, $$4, 4.0)) {
            this.j($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void j(bvf $$0) {
      this.bE.b(cej.E);
      this.bE.a(cej.o, $$0, 200L);
   }

   @Override
   public bwh<cmo> ec() {
      return (bwh<cmo>)super.ec();
   }

   protected void t() {
      cqm $$0 = this.bE.g().orElse(null);
      this.bE.a(ImmutableList.of(cqm.k, cqm.b));
      cqm $$1 = this.bE.g().orElse(null);
      if ($$1 == cqm.k && $$0 != cqm.k) {
         this.gp();
      }

      this.w(this.bE.a(cej.o));
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("zoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bY, $$0);
      if (!this.dW().C && $$0) {
         this.g(bwn.c).a(0.5);
      }
   }

   @Override
   public boolean e_() {
      return this.au().a(bY);
   }

   @Override
   public void d_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.d_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(avz.Ed);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int x() {
      return this.cj;
   }

   @Override
   protected avy u() {
      if (this.dW().C) {
         return null;
      } else {
         return this.bE.a(cej.o) ? avz.Ec : avz.Eb;
      }
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.Ef;
   }

   @Override
   protected avy o_() {
      return avz.Ee;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.Eg, 0.15F, 1.0F);
   }

   protected void gp() {
      this.b(avz.Ec);
   }

   @Nullable
   @Override
   public bvf O_() {
      return this.O();
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.e_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
