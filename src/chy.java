import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class chy extends chg implements cgy, cim {
   private static final aja<Boolean> d = aje.a(chy.class, ajc.k);
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
   protected static final ImmutableList<? extends cbd<? extends cbc<? super chy>>> b = ImmutableList.of(cbd.c, cbd.d);
   protected static final ImmutableList<? extends bzw<?>> c = ImmutableList.of(bzw.g, bzw.h, bzw.k, bzw.l, bzw.n, bzw.m, bzw.E, bzw.t, bzw.o, bzw.p);

   public chy(bqg<? extends chy> $$0, czg $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   protected bru.b<chy> dQ() {
      return bru.a(c, b);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      bru<chy> $$1 = this.dQ().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(clp.a));
      $$1.b(clp.b);
      $$1.f();
      return $$1;
   }

   private static void a(bru<chy> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new btr(45, 90), new btv()));
   }

   private static void b(bru<chy> $$0) {
      $$0.a(
         clp.b,
         10,
         ImmutableList.of(
            bux.a(chy::gp),
            bul.a(8.0F, bnq.a(30, 60)),
            new bui(ImmutableList.of(Pair.of(bud.a(0.4F), 2), Pair.of(bus.a(0.4F, 3), 2), Pair.of(new bsv(30, 60), 1)))
         )
      );
   }

   private static void c(bru<chy> $$0) {
      $$0.a(clp.k, 10, ImmutableList.of(buq.a(1.0F), bvy.a(chy::u, bts.a(40)), bvy.a(chy::p_, bts.a(15)), bva.a()), bzw.o);
   }

   private Optional<? extends bqt> gp() {
      return this.dP().c(bzw.h).orElse(bzy.a()).a(this::j);
   }

   private boolean j(bqt $$0) {
      bqg<?> $$1 = $$0.ai();
      return $$1 != bqg.bs && $$1 != bqg.x && cbc.c(this, $$0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(aja<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static brz.a r() {
      return chg.gt().a(bsa.q, 40.0).a(bsa.r, 0.3F).a(bsa.n, 0.6F).a(bsa.d, 1.0).a(bsa.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(bqa $$0) {
      if (!($$0 instanceof bqt)) {
         return false;
      } else {
         this.cg = 10;
         this.dM().a(this, (byte)4);
         this.b(auo.CS);
         return cim.a(this, (bqt)$$0);
      }
   }

   @Override
   public boolean a(cka $$0) {
      return !this.gb();
   }

   @Override
   protected void e(bqt $$0) {
      if (!this.p_()) {
         cim.b(this, $$0);
      }
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bqt) {
         bqt $$3 = (bqt)$$0.d();
         if (this.c($$3) && !bsn.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bqt $$0) {
      this.bC.b(bzw.E);
      this.bC.a(bzw.o, $$0, 200L);
   }

   @Override
   public bru<chy> dP() {
      return (bru<chy>)super.dP();
   }

   protected void y() {
      clp $$0 = this.bC.g().orElse(null);
      this.bC.a(ImmutableList.of(clp.k, clp.b));
      clp $$1 = this.bC.g().orElse(null);
      if ($$1 == clp.k && $$0 != clp.k) {
         this.go();
      }

      this.v(this.bC.a(bzw.o));
   }

   @Override
   protected void Y() {
      this.dM().af().a("zoglinBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(d, $$0);
      if (!this.dM().B && $$0) {
         this.f(bsa.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.an().a(d);
   }

   @Override
   public void n_() {
      if (this.cg > 0) {
         this.cg--;
      }

      super.n_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cg = 10;
         this.b(auo.CS);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gn() {
      return this.cg;
   }

   @Override
   protected aun v() {
      if (this.dM().B) {
         return null;
      } else {
         return this.bC.a(bzw.o) ? auo.CR : auo.CQ;
      }
   }

   @Override
   protected aun d(boy $$0) {
      return auo.CU;
   }

   @Override
   protected aun o_() {
      return auo.CT;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.CV, 0.15F, 1.0F);
   }

   protected void go() {
      this.b(auo.CR);
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
