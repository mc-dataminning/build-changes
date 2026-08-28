import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckw extends cke implements cjw, clk {
   private static final akk<Boolean> d = ako.a(ckw.class, akm.k);
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
   protected static final ImmutableList<? extends ceb<? extends cea<? super ckw>>> b = ImmutableList.of(ceb.c, ceb.d);
   protected static final ImmutableList<? extends ccu<?>> c = ImmutableList.of(ccu.g, ccu.h, ccu.k, ccu.l, ccu.n, ccu.m, ccu.E, ccu.t, ccu.o, ccu.p);

   public ckw(btb<? extends ckw> $$0, dbz $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bus.b<ckw> dT() {
      return bus.a(c, b);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      bus<ckw> $$1 = this.dT().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(coo.a));
      $$1.b(coo.b);
      $$1.f();
      return $$1;
   }

   private static void a(bus<ckw> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new bwp(45, 90), new bwt()));
   }

   private static void b(bus<ckw> $$0) {
      $$0.a(
         coo.b,
         10,
         ImmutableList.of(
            bxv.a(ckw::gs),
            bxj.a(8.0F, bqg.a(30, 60)),
            new bxg(ImmutableList.of(Pair.of(bxb.a(0.4F), 2), Pair.of(bxq.a(0.4F, 3), 2), Pair.of(new bvt(30, 60), 1)))
         )
      );
   }

   private static void c(bus<ckw> $$0) {
      $$0.a(coo.k, 10, ImmutableList.of(bxo.a(1.0F), byw.a(ckw::u, bwq.a(40)), byw.a(ckw::p_, bwq.a(15)), bxy.a()), ccu.o);
   }

   private Optional<? extends btq> gs() {
      return this.dS().c(ccu.h).orElse(ccw.a()).a(this::j);
   }

   private boolean j(btq $$0) {
      btb<?> $$1 = $$0.ak();
      return $$1 != btb.bt && $$1 != btb.x && cea.c(this, $$0);
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

   public static bux.a s() {
      return cke.gw().a(buy.q, 40.0).a(buy.r, 0.3F).a(buy.n, 0.6F).a(buy.d, 1.0).a(buy.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(bsv $$0) {
      if (!($$0 instanceof btq)) {
         return false;
      } else {
         this.ch = 10;
         this.dP().a(this, (byte)4);
         this.b(awa.Dl);
         return clk.a(this, (btq)$$0);
      }
   }

   @Override
   public boolean a(cmy $$0) {
      return !this.gd();
   }

   @Override
   protected void e(btq $$0) {
      if (!this.p_()) {
         clk.b(this, $$0);
      }
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof btq) {
         btq $$3 = (btq)$$0.d();
         if (this.c($$3) && !bvl.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(btq $$0) {
      this.bD.b(ccu.E);
      this.bD.a(ccu.o, $$0, 200L);
   }

   @Override
   public bus<ckw> dS() {
      return (bus<ckw>)super.dS();
   }

   protected void y() {
      coo $$0 = this.bD.g().orElse(null);
      this.bD.a(ImmutableList.of(coo.k, coo.b));
      coo $$1 = this.bD.g().orElse(null);
      if ($$1 == coo.k && $$0 != coo.k) {
         this.gr();
      }

      this.v(this.bD.a(ccu.o));
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
         this.f(buy.c).a(0.5);
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
         return this.bD.a(ccu.o) ? awa.Dk : awa.Dj;
      }
   }

   @Override
   protected avz d(bro $$0) {
      return awa.Dn;
   }

   @Override
   protected avz o_() {
      return awa.Dm;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.Do, 0.15F, 1.0F);
   }

   protected void gr() {
      this.b(awa.Dk);
   }

   @Nullable
   @Override
   public btq p() {
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
