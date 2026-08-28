import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmq extends cly implements cne {
   private static final akm<Boolean> bY = akq.a(cmq.class, ako.k);
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

   public cmq(bus<? extends cmq> $$0, dfm $$1) {
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
      $$1.a(ImmutableSet.of(cql.a));
      $$1.b(cql.b);
      $$1.f();
      return $$1;
   }

   private static void a(bwj<cmq> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new byg(45, 90), new byk()));
   }

   private static void b(bwj<cmq> $$0) {
      $$0.a(
         cql.b,
         10,
         ImmutableList.of(
            bzm.a(($$0x, $$1) -> $$1.g($$0x)),
            bza.a(8.0F, brv.a(30, 60)),
            new byx(ImmutableList.of(Pair.of(bys.a(0.4F), 2), Pair.of(bzh.a(0.4F, 3), 2), Pair.of(new bxk(30, 60), 1)))
         )
      );
   }

   private static void c(bwj<cmq> $$0) {
      $$0.a(cql.k, 10, ImmutableList.of(bzf.a(1.0F), can.a(cmq::q, byh.a(40)), can.a(cmq::e_, byh.a(15)), bzp.a()), cel.o);
   }

   private Optional<? extends bvh> g(arp $$0) {
      return this.eb().c(cel.h).orElse(cen.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(arp $$0, bvh $$1) {
      bus<?> $$2 = $$1.aq();
      return $$2 != bus.bJ && $$2 != bus.D && cfr.c($$0, this, $$1);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void a(akm<?> $$0) {
      super.a($$0);
      if (bY.equals($$0)) {
         this.l_();
      }
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$0.G_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.s, 40.0).a(bwp.v, 0.3F).a(bwp.p, 0.6F).a(bwp.d, 1.0).a(bwp.c, 6.0);
   }

   public boolean q() {
      return !this.e_();
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      if ($$1 instanceof bvh $$2) {
         this.cj = 10;
         $$0.a(this, (byte)4);
         this.b(awn.Dt);
         return cne.a($$0, this, $$2);
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
         cne.a(this, $$0);
      }
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
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

   protected void v() {
      cql $$0 = this.bE.g().orElse(null);
      this.bE.a(ImmutableList.of(cql.k, cql.b));
      cql $$1 = this.bE.g().orElse(null);
      if ($$1 == cql.k && $$0 != cql.k) {
         this.gn();
      }

      this.w(this.bE.a(cel.o));
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("zoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      this.v();
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
         this.b(awn.Dt);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gm() {
      return this.cj;
   }

   @Override
   protected awm t() {
      if (this.dV().C) {
         return null;
      } else {
         return this.bE.a(cel.o) ? awn.Ds : awn.Dr;
      }
   }

   @Override
   protected awm e(btb $$0) {
      return awn.Dv;
   }

   @Override
   protected awm n_() {
      return awn.Du;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.Dw, 0.15F, 1.0F);
   }

   protected void gn() {
      this.b(awn.Ds);
   }

   @Nullable
   @Override
   public bvh aa_() {
      return this.O();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (this.e_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
