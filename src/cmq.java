import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmq extends cly implements cnh {
   private static final ajy<Boolean> bY = akc.a(cmq.class, aka.k);
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
   protected static final ImmutableList<? extends cfs<? extends cfr<? super cmq>>> a = ImmutableList.of(cfs.c, cfs.d);
   protected static final ImmutableList<? extends cel<?>> b = ImmutableList.of(cel.g, cel.h, cel.k, cel.l, cel.n, cel.m, cel.E, cel.t, cel.o, cel.p);

   public cmq(bus<? extends cmq> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bwj.b<cmq> ec() {
      return bwj.a(b, a);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      bwj<cmq> $$1 = this.ec().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cqo.a));
      $$1.b(cqo.b);
      $$1.f();
      return $$1;
   }

   private static void a(bwj<cmq> $$0) {
      $$0.a(cqo.a, 0, ImmutableList.of(new byg(45, 90), new byk()));
   }

   private static void b(bwj<cmq> $$0) {
      $$0.a(
         cqo.b,
         10,
         ImmutableList.of(
            bzm.a(($$0x, $$1) -> $$1.g($$0x)),
            bza.a(8.0F, brv.a(30, 60)),
            new byx(ImmutableList.of(Pair.of(bys.a(0.4F), 2), Pair.of(bzh.a(0.4F, 3), 2), Pair.of(new bxk(30, 60), 1)))
         )
      );
   }

   private static void c(bwj<cmq> $$0) {
      $$0.a(cqo.k, 10, ImmutableList.of(bzf.a(1.0F), can.a(cmq::p, byh.a(40)), can.a(cmq::e_, byh.a(15)), bzp.a()), cel.o);
   }

   private Optional<? extends bvh> g(ard $$0) {
      return this.eb().c(cel.h).orElse(cen.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(ard $$0, bvh $$1) {
      bus<?> $$2 = $$1.aq();
      return $$2 != bus.bM && $$2 != bus.E && cfr.c($$0, this, $$1);
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
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwo.a m() {
      return cly.gx().a(bwp.s, 40.0).a(bwp.v, 0.3F).a(bwp.p, 0.6F).a(bwp.d, 1.0).a(bwp.c, 6.0);
   }

   public boolean p() {
      return !this.e_();
   }

   @Override
   public boolean c(ard $$0, bul $$1) {
      if ($$1 instanceof bvh $$2) {
         this.cj = 10;
         $$0.a(this, (byte)4);
         this.b(awa.Ed);
         return cnh.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void e(bvh $$0) {
      if (!this.e_()) {
         cnh.a(this, $$0);
      }
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvh $$4) {
         if (this.c($$4) && !bxc.a(this, $$4, 4.0)) {
            this.j($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void j(bvh $$0) {
      this.bE.b(cel.E);
      this.bE.a(cel.o, $$0, 200L);
   }

   @Override
   public bwj<cmq> eb() {
      return (bwj<cmq>)super.eb();
   }

   protected void t() {
      cqo $$0 = this.bE.g().orElse(null);
      this.bE.a(ImmutableList.of(cqo.k, cqo.b));
      cqo $$1 = this.bE.g().orElse(null);
      if ($$1 == cqo.k && $$0 != cqo.k) {
         this.gs();
      }

      this.w(this.bE.a(cel.o));
   }

   @Override
   protected void a(ard $$0) {
      bot $$1 = bos.a();
      $$1.a("zoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bY, $$0);
      if (!this.dV().C && $$0) {
         this.g(bwp.c).a(0.5);
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
         return this.bE.a(cel.o) ? awa.Ec : awa.Eb;
      }
   }

   @Override
   protected avz e(btb $$0) {
      return awa.Ef;
   }

   @Override
   protected avz o_() {
      return awa.Ee;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.Eg, 0.15F, 1.0F);
   }

   protected void gs() {
      this.b(awa.Ec);
   }

   @Nullable
   @Override
   public bvh O_() {
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
