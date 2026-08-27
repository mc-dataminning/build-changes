import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cff extends cen implements cef, cft {
   private static final aie<Boolean> d = aih.a(cff.class, aig.k);
   private static final int e = 40;
   private static final int bT = 1;
   private static final float bU = 0.6F;
   private static final int bV = 6;
   private static final float bW = 0.5F;
   private static final int bX = 40;
   private static final int bY = 15;
   private static final int bZ = 200;
   private static final float ca = 0.3F;
   private static final float cb = 0.4F;
   private int cc;
   protected static final ImmutableList<? extends byo<? extends byn<? super cff>>> b = ImmutableList.of(byo.c, byo.d);
   protected static final ImmutableList<? extends bxh<?>> c = ImmutableList.of(bxh.g, bxh.h, bxh.k, bxh.l, bxh.n, bxh.m, bxh.E, bxh.t, bxh.o, bxh.p);

   public cff(bnu<? extends cff> $$0, cvn $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bpf.b<cff> dP() {
      return bpf.a(c, b);
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      bpf<cff> $$1 = this.dP().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(ciu.a));
      $$1.b(ciu.b);
      $$1.f();
      return $$1;
   }

   private static void a(bpf<cff> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new brc(45, 90), new brg()));
   }

   private static void b(bpf<cff> $$0) {
      $$0.a(
         ciu.b,
         10,
         ImmutableList.of(
            bsi.a(cff::gi),
            brw.a(8.0F, blf.a(30, 60)),
            new brt(ImmutableList.of(Pair.of(bro.a(0.4F), 2), Pair.of(bsd.a(0.4F, 3), 2), Pair.of(new bqg(30, 60), 1)))
         )
      );
   }

   private static void c(bpf<cff> $$0) {
      $$0.a(ciu.k, 10, ImmutableList.of(bsb.a(1.0F), btj.a(cff::w, brd.a(40)), btj.a(cff::o_, brd.a(15)), bsl.a()), bxh.o);
   }

   private Optional<? extends bog> gi() {
      return this.dO().c(bxh.h).orElse(bxj.a()).a(this::j);
   }

   private boolean j(bog $$0) {
      bnu<?> $$1 = $$0.ai();
      return $$1 != bnu.br && $$1 != bnu.w && byn.c(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, false);
   }

   @Override
   public void a(aie<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.k_();
      }
   }

   public static bpk.a u() {
      return cen.gm().a(bpl.n, 40.0).a(bpl.o, 0.3F).a(bpl.k, 0.6F).a(bpl.d, 1.0).a(bpl.c, 6.0);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   public boolean B(bno $$0) {
      if (!($$0 instanceof bog)) {
         return false;
      } else {
         this.cc = 10;
         this.dM().a(this, (byte)4);
         this.b(atk.Cn);
         return cft.a(this, (bog)$$0);
      }
   }

   @Override
   public boolean a(chh $$0) {
      return !this.fU();
   }

   @Override
   protected void e(bog $$0) {
      if (!this.o_()) {
         cft.b(this, $$0);
      }
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bog) {
         bog $$3 = (bog)$$0.d();
         if (this.c($$3) && !bpy.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bog $$0) {
      this.bz.b(bxh.E);
      this.bz.a(bxh.o, $$0, 200L);
   }

   @Override
   public bpf<cff> dO() {
      return (bpf<cff>)super.dO();
   }

   protected void A() {
      ciu $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(ciu.k, ciu.b));
      ciu $$1 = this.bz.g().orElse(null);
      if ($$1 == ciu.k && $$0 != ciu.k) {
         this.gh();
      }

      this.v(this.bz.a(bxh.o));
   }

   @Override
   protected void aa() {
      this.dM().af().a("zoglinBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().c();
      this.A();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (!this.dM().B && $$0) {
         this.f(bpl.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(d);
   }

   @Override
   public void d_() {
      if (this.cc > 0) {
         this.cc--;
      }

      super.d_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cc = 10;
         this.b(atk.Cn);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gg() {
      return this.cc;
   }

   @Override
   protected atj y() {
      if (this.dM().B) {
         return null;
      } else {
         return this.bz.a(bxh.o) ? atk.Cm : atk.Cl;
      }
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.Cp;
   }

   @Override
   protected atj n_() {
      return atk.Co;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.Cq, 0.15F, 1.0F);
   }

   protected void gh() {
      this.b(atk.Cm);
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
