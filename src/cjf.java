import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cjf extends cin implements cif, cjt {
   private static final ajm<Boolean> d = ajq.a(cjf.class, ajo.k);
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
   protected static final ImmutableList<? extends cck<? extends ccj<? super cjf>>> b = ImmutableList.of(cck.c, cck.d);
   protected static final ImmutableList<? extends cbd<?>> c = ImmutableList.of(cbd.g, cbd.h, cbd.k, cbd.l, cbd.n, cbd.m, cbd.E, cbd.t, cbd.o, cbd.p);

   public cjf(brn<? extends cjf> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected btb.b<cjf> dR() {
      return btb.a(c, b);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      btb<cjf> $$1 = this.dR().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cmw.a));
      $$1.b(cmw.b);
      $$1.f();
      return $$1;
   }

   private static void a(btb<cjf> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new buy(45, 90), new bvc()));
   }

   private static void b(btb<cjf> $$0) {
      $$0.a(
         cmw.b,
         10,
         ImmutableList.of(
            bwe.a(cjf::gr),
            bvs.a(8.0F, box.a(30, 60)),
            new bvp(ImmutableList.of(Pair.of(bvk.a(0.4F), 2), Pair.of(bvz.a(0.4F, 3), 2), Pair.of(new buc(30, 60), 1)))
         )
      );
   }

   private static void c(btb<cjf> $$0) {
      $$0.a(cmw.k, 10, ImmutableList.of(bvx.a(1.0F), bxf.a(cjf::u, buz.a(40)), bxf.a(cjf::p_, buz.a(15)), bwh.a()), cbd.o);
   }

   private Optional<? extends bsa> gr() {
      return this.dQ().c(cbd.h).orElse(cbf.a()).a(this::j);
   }

   private boolean j(bsa $$0) {
      brn<?> $$1 = $$0.ai();
      return $$1 != brn.bs && $$1 != brn.x && ccj.c(this, $$0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(ajm<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static btg.a r() {
      return cin.gv().a(bth.q, 40.0).a(bth.r, 0.3F).a(bth.n, 0.6F).a(bth.d, 1.0).a(bth.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(brh $$0) {
      if (!($$0 instanceof bsa)) {
         return false;
      } else {
         this.ch = 10;
         this.dN().a(this, (byte)4);
         this.b(avc.Da);
         return cjt.a(this, (bsa)$$0);
      }
   }

   @Override
   public boolean a(clh $$0) {
      return !this.gc();
   }

   @Override
   protected void e(bsa $$0) {
      if (!this.p_()) {
         cjt.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bsa) {
         bsa $$3 = (bsa)$$0.d();
         if (this.c($$3) && !btu.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bsa $$0) {
      this.bE.b(cbd.E);
      this.bE.a(cbd.o, $$0, 200L);
   }

   @Override
   public btb<cjf> dQ() {
      return (btb<cjf>)super.dQ();
   }

   protected void y() {
      cmw $$0 = this.bE.g().orElse(null);
      this.bE.a(ImmutableList.of(cmw.k, cmw.b));
      cmw $$1 = this.bE.g().orElse(null);
      if ($$1 == cmw.k && $$0 != cmw.k) {
         this.gq();
      }

      this.v(this.bE.a(cbd.o));
   }

   @Override
   protected void Y() {
      this.dN().af().a("zoglinBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(d, $$0);
      if (!this.dN().B && $$0) {
         this.f(bth.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.an().a(d);
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
         this.b(avc.Da);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gp() {
      return this.ch;
   }

   @Override
   protected avb v() {
      if (this.dN().B) {
         return null;
      } else {
         return this.bE.a(cbd.o) ? avc.CZ : avc.CY;
      }
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.Dc;
   }

   @Override
   protected avb o_() {
      return avc.Db;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.Dd, 0.15F, 1.0F);
   }

   protected void gq() {
      this.b(avc.CZ);
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
