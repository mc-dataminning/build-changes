import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cju extends cjc implements ciu, cki {
   private static final ajr<Boolean> d = ajv.a(cju.class, ajt.k);
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
   protected static final ImmutableList<? extends ccz<? extends ccy<? super cju>>> b = ImmutableList.of(ccz.c, ccz.d);
   protected static final ImmutableList<? extends cbs<?>> c = ImmutableList.of(cbs.g, cbs.h, cbs.k, cbs.l, cbs.n, cbs.m, cbs.E, cbs.t, cbs.o, cbs.p);

   public cju(bsa<? extends cju> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected btq.b<cju> dT() {
      return btq.a(c, b);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      btq<cju> $$1 = this.dT().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cnl.a));
      $$1.b(cnl.b);
      $$1.f();
      return $$1;
   }

   private static void a(btq<cju> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new bvn(45, 90), new bvr()));
   }

   private static void b(btq<cju> $$0) {
      $$0.a(
         cnl.b,
         10,
         ImmutableList.of(
            bwt.a(cju::gr),
            bwh.a(8.0F, bpf.a(30, 60)),
            new bwe(ImmutableList.of(Pair.of(bvz.a(0.4F), 2), Pair.of(bwo.a(0.4F, 3), 2), Pair.of(new bur(30, 60), 1)))
         )
      );
   }

   private static void c(btq<cju> $$0) {
      $$0.a(cnl.k, 10, ImmutableList.of(bwm.a(1.0F), bxu.a(cju::u, bvo.a(40)), bxu.a(cju::p_, bvo.a(15)), bww.a()), cbs.o);
   }

   private Optional<? extends bso> gr() {
      return this.dS().c(cbs.h).orElse(cbu.a()).a(this::j);
   }

   private boolean j(bso $$0) {
      bsa<?> $$1 = $$0.ak();
      return $$1 != bsa.bt && $$1 != bsa.x && ccy.c(this, $$0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(ajr<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static btv.a s() {
      return cjc.gv().a(btw.q, 40.0).a(btw.r, 0.3F).a(btw.n, 0.6F).a(btw.d, 1.0).a(btw.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(bru $$0) {
      if (!($$0 instanceof bso)) {
         return false;
      } else {
         this.ch = 10;
         this.dP().a(this, (byte)4);
         this.b(avh.Dl);
         return cki.a(this, (bso)$$0);
      }
   }

   @Override
   public boolean a(clw $$0) {
      return !this.gc();
   }

   @Override
   protected void e(bso $$0) {
      if (!this.p_()) {
         cki.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bso) {
         bso $$3 = (bso)$$0.d();
         if (this.c($$3) && !buj.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bso $$0) {
      this.bE.b(cbs.E);
      this.bE.a(cbs.o, $$0, 200L);
   }

   @Override
   public btq<cju> dS() {
      return (btq<cju>)super.dS();
   }

   protected void y() {
      cnl $$0 = this.bE.g().orElse(null);
      this.bE.a(ImmutableList.of(cnl.k, cnl.b));
      cnl $$1 = this.bE.g().orElse(null);
      if ($$1 == cnl.k && $$0 != cnl.k) {
         this.gq();
      }

      this.v(this.bE.a(cbs.o));
   }

   @Override
   protected void Y() {
      this.dP().af().a("zoglinBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (!this.dP().B && $$0) {
         this.f(btw.c).a(0.5);
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
         this.b(avh.Dl);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gp() {
      return this.ch;
   }

   @Override
   protected avg v() {
      if (this.dP().B) {
         return null;
      } else {
         return this.bE.a(cbs.o) ? avh.Dk : avh.Dj;
      }
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.Dn;
   }

   @Override
   protected avg o_() {
      return avh.Dm;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.Do, 0.15F, 1.0F);
   }

   protected void gq() {
      this.b(avh.Dk);
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
