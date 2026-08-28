import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpr extends coz implements cqi {
   private static final akl<Boolean> e = akp.a(cpr.class, akn.k);
   private static final int f = 40;
   private static final int bI = 1;
   private static final float bJ = 0.6F;
   private static final int bK = 6;
   private static final float bL = 0.5F;
   private static final int bM = 40;
   private static final int bN = 15;
   private static final int bO = 200;
   private static final float bP = 0.3F;
   private static final float bQ = 0.4F;
   private static final boolean bR = false;
   private int bS;
   protected static final ImmutableList<? extends cid<? extends cic<? super cpr>>> a = ImmutableList.of(cid.c, cid.d);
   protected static final ImmutableList<? extends cgw<?>> b = ImmutableList.of(cgw.g, cgw.h, cgw.k, cgw.l, cgw.o, cgw.n, cgw.F, cgw.u, cgw.p, cgw.q);

   public cpr(bxc<? extends cpr> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @Override
   protected byu.b<cpr> ed() {
      return byu.a(b, a);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      byu<cpr> $$1 = this.ed().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(ctr.a));
      $$1.b(ctr.b);
      $$1.f();
      return $$1;
   }

   private static void a(byu<cpr> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new car(45, 90), new cav()));
   }

   private static void b(byu<cpr> $$0) {
      $$0.a(
         ctr.b,
         10,
         ImmutableList.of(
            cbx.a(($$0x, $$1) -> $$1.g($$0x)),
            cbl.a(8.0F, buc.a(30, 60)),
            new cbi(ImmutableList.of(Pair.of(cbd.a(0.4F), 2), Pair.of(cbs.a(0.4F, 3), 2), Pair.of(new bzv(30, 60), 1)))
         )
      );
   }

   private static void c(byu<cpr> $$0) {
      $$0.a(ctr.k, 10, ImmutableList.of(cbq.a(1.0F), ccy.a(cpr::m, cas.a(40)), ccy.a(cpr::n_, cas.a(15)), cca.a()), cgw.p);
   }

   private Optional<? extends bxu> g(ars $$0) {
      return this.ec().c(cgw.h).orElse(cgy.a()).a($$1 -> this.c($$0, $$1));
   }

   private boolean c(ars $$0, bxu $$1) {
      bxc<?> $$2 = $$1.an();
      return $$2 != bxc.bO && $$2 != bxc.F && cic.c($$0, this, $$1);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.i_();
      }
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      if ($$0.G_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static byz.a j() {
      return coz.gx().a(bza.s, 40.0).a(bza.v, 0.3F).a(bza.p, 0.6F).a(bza.d, 1.0).a(bza.c, 6.0);
   }

   public boolean m() {
      return !this.n_();
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      if ($$1 instanceof bxu $$2) {
         this.bS = 10;
         $$0.a(this, (byte)4);
         this.b(awp.En);
         return cqi.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void d(bxu $$0) {
      if (!this.n_()) {
         cqi.a(this, $$0);
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxu $$4) {
         if (this.c($$4) && !bzn.a(this, $$4, 4.0)) {
            this.i($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void i(bxu $$0) {
      this.bs.b(cgw.F);
      this.bs.a(cgw.p, $$0, 200L);
   }

   @Override
   public byu<cpr> ec() {
      return (byu<cpr>)super.ec();
   }

   protected void n() {
      ctr $$0 = this.bs.g().orElse(null);
      this.bs.a(ImmutableList.of(ctr.k, ctr.b));
      ctr $$1 = this.bs.g().orElse(null);
      if ($$1 == ctr.k && $$0 != ctr.k) {
         this.t();
      }

      this.v(this.bs.a(cgw.p));
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("zoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      this.n();
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(e, $$0);
      if (!this.dV().C && $$0) {
         this.g(bza.c).a(0.5);
      }
   }

   @Override
   public boolean n_() {
      return this.ar().a(e);
   }

   @Override
   public void k_() {
      if (this.bS > 0) {
         this.bS--;
      }

      super.k_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bS = 10;
         this.b(awp.En);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bS;
   }

   @Override
   protected awo u() {
      if (this.dV().C) {
         return null;
      } else {
         return this.bs.a(cgw.p) ? awp.Em : awp.El;
      }
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.Ep;
   }

   @Override
   protected awo l_() {
      return awp.Eo;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.Eq, 0.15F, 1.0F);
   }

   protected void t() {
      this.b(awp.Em);
   }

   @Nullable
   @Override
   public bxu f() {
      return this.Q();
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.b("IsBaby", false));
   }
}
