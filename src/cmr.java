import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmr extends clz implements cni {
   private static final ajy<Boolean> bY = akc.a(cmr.class, aka.k);
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
   protected static final ImmutableList<? extends cft<? extends cfs<? super cmr>>> a = ImmutableList.of(cft.c, cft.d);
   protected static final ImmutableList<? extends cem<?>> b = ImmutableList.of(cem.g, cem.h, cem.k, cem.l, cem.n, cem.m, cem.E, cem.t, cem.o, cem.p);

   public cmr(but<? extends cmr> $$0, dgj $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bwk.b<cmr> ec() {
      return bwk.a(b, a);
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      bwk<cmr> $$1 = this.ec().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cqp.a));
      $$1.b(cqp.b);
      $$1.f();
      return $$1;
   }

   private static void a(bwk<cmr> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new byh(45, 90), new byl()));
   }

   private static void b(bwk<cmr> $$0) {
      $$0.a(
         cqp.b,
         10,
         ImmutableList.of(
            bzn.a(($$0x, $$1) -> $$1.g($$0x)),
            bzb.a(8.0F, brw.a(30, 60)),
            new byy(ImmutableList.of(Pair.of(byt.a(0.4F), 2), Pair.of(bzi.a(0.4F, 3), 2), Pair.of(new bxl(30, 60), 1)))
         )
      );
   }

   private static void c(bwk<cmr> $$0) {
      $$0.a(cqp.k, 10, ImmutableList.of(bzg.a(1.0F), cao.a(cmr::p, byi.a(40)), cao.a(cmr::e_, byi.a(15)), bzq.a()), cem.o);
   }

   private Optional<? extends bvi> g(ard $$0) {
      return this.eb().c(cem.h).orElse(ceo.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(ard $$0, bvi $$1) {
      but<?> $$2 = $$1.aq();
      return $$2 != but.bM && $$2 != but.E && cfs.c($$0, this, $$1);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (bY.equals($$0)) {
         this.m_();
      }
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwp.a m() {
      return clz.gx().a(bwq.s, 40.0).a(bwq.v, 0.3F).a(bwq.p, 0.6F).a(bwq.d, 1.0).a(bwq.c, 6.0);
   }

   public boolean p() {
      return !this.e_();
   }

   @Override
   public boolean c(ard $$0, bum $$1) {
      if ($$1 instanceof bvi $$2) {
         this.cj = 10;
         $$0.a(this, (byte)4);
         this.b(awa.Ed);
         return cni.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void e(bvi $$0) {
      if (!this.e_()) {
         cni.a(this, $$0);
      }
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvi $$4) {
         if (this.c($$4) && !bxd.a(this, $$4, 4.0)) {
            this.j($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void j(bvi $$0) {
      this.bE.b(cem.E);
      this.bE.a(cem.o, $$0, 200L);
   }

   @Override
   public bwk<cmr> eb() {
      return (bwk<cmr>)super.eb();
   }

   protected void t() {
      cqp $$0 = this.bE.g().orElse(null);
      this.bE.a(ImmutableList.of(cqp.k, cqp.b));
      cqp $$1 = this.bE.g().orElse(null);
      if ($$1 == cqp.k && $$0 != cqp.k) {
         this.gs();
      }

      this.w(this.bE.a(cem.o));
   }

   @Override
   protected void a(ard $$0) {
      bou $$1 = bot.a();
      $$1.a("zoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bY, $$0);
      if (!this.dV().C && $$0) {
         this.g(bwq.c).a(0.5);
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
         this.b(awa.Ed);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int x() {
      return this.cj;
   }

   @Override
   protected avz u() {
      if (this.dV().C) {
         return null;
      } else {
         return this.bE.a(cem.o) ? awa.Ec : awa.Eb;
      }
   }

   @Override
   protected avz e(btc $$0) {
      return awa.Ef;
   }

   @Override
   protected avz o_() {
      return awa.Ee;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.Eg, 0.15F, 1.0F);
   }

   protected void gs() {
      this.b(awa.Ec);
   }

   @Nullable
   @Override
   public bvi O_() {
      return this.R();
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
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
