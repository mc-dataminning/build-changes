import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmp extends clx implements cng {
   private static final ajy<Boolean> bY = akc.a(cmp.class, aka.k);
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
   protected static final ImmutableList<? extends cfr<? extends cfq<? super cmp>>> a = ImmutableList.of(cfr.c, cfr.d);
   protected static final ImmutableList<? extends cek<?>> b = ImmutableList.of(cek.g, cek.h, cek.k, cek.l, cek.n, cek.m, cek.E, cek.t, cek.o, cek.p);

   public cmp(bur<? extends cmp> $$0, dgh $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bwi.b<cmp> ec() {
      return bwi.a(b, a);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      bwi<cmp> $$1 = this.ec().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cqn.a));
      $$1.b(cqn.b);
      $$1.f();
      return $$1;
   }

   private static void a(bwi<cmp> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new byf(45, 90), new byj()));
   }

   private static void b(bwi<cmp> $$0) {
      $$0.a(
         cqn.b,
         10,
         ImmutableList.of(
            bzl.a(($$0x, $$1) -> $$1.g($$0x)),
            byz.a(8.0F, bru.a(30, 60)),
            new byw(ImmutableList.of(Pair.of(byr.a(0.4F), 2), Pair.of(bzg.a(0.4F, 3), 2), Pair.of(new bxj(30, 60), 1)))
         )
      );
   }

   private static void c(bwi<cmp> $$0) {
      $$0.a(cqn.k, 10, ImmutableList.of(bze.a(1.0F), cam.a(cmp::p, byg.a(40)), cam.a(cmp::e_, byg.a(15)), bzo.a()), cek.o);
   }

   private Optional<? extends bvg> g(ard $$0) {
      return this.eb().c(cek.h).orElse(cem.a()).a($$1 -> this.b($$0, $$1));
   }

   private boolean b(ard $$0, bvg $$1) {
      bur<?> $$2 = $$1.aq();
      return $$2 != bur.bM && $$2 != bur.E && cfq.c($$0, this, $$1);
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
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwn.a m() {
      return clx.gx().a(bwo.s, 40.0).a(bwo.v, 0.3F).a(bwo.p, 0.6F).a(bwo.d, 1.0).a(bwo.c, 6.0);
   }

   public boolean p() {
      return !this.e_();
   }

   @Override
   public boolean c(ard $$0, buk $$1) {
      if ($$1 instanceof bvg $$2) {
         this.cj = 10;
         $$0.a(this, (byte)4);
         this.b(awa.Ed);
         return cng.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void e(bvg $$0) {
      if (!this.e_()) {
         cng.a(this, $$0);
      }
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvg $$4) {
         if (this.c($$4) && !bxb.a(this, $$4, 4.0)) {
            this.j($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void j(bvg $$0) {
      this.bE.b(cek.E);
      this.bE.a(cek.o, $$0, 200L);
   }

   @Override
   public bwi<cmp> eb() {
      return (bwi<cmp>)super.eb();
   }

   protected void t() {
      cqn $$0 = this.bE.g().orElse(null);
      this.bE.a(ImmutableList.of(cqn.k, cqn.b));
      cqn $$1 = this.bE.g().orElse(null);
      if ($$1 == cqn.k && $$0 != cqn.k) {
         this.gs();
      }

      this.w(this.bE.a(cek.o));
   }

   @Override
   protected void a(ard $$0) {
      bos $$1 = bor.a();
      $$1.a("zoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bY, $$0);
      if (!this.dV().C && $$0) {
         this.g(bwo.c).a(0.5);
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
         return this.bE.a(cek.o) ? awa.Ec : awa.Eb;
      }
   }

   @Override
   protected avz e(bta $$0) {
      return awa.Ef;
   }

   @Override
   protected avz o_() {
      return awa.Ee;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
      this.a(awa.Eg, 0.15F, 1.0F);
   }

   protected void gs() {
      this.b(awa.Ec);
   }

   @Nullable
   @Override
   public bvg O_() {
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
