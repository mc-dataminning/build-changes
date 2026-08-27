import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cdo extends ccw implements cco, cec {
   private static final agn<Boolean> d = agq.a(cdo.class, agp.k);
   private static final int e = 40;
   private static final int bU = 1;
   private static final float bV = 0.6F;
   private static final int bW = 6;
   private static final float bX = 0.5F;
   private static final int bY = 40;
   private static final int bZ = 15;
   private static final int ca = 200;
   private static final float cb = 0.3F;
   private static final float cc = 0.4F;
   private int cd;
   protected static final ImmutableList<? extends bwx<? extends bww<? super cdo>>> b = ImmutableList.of(bwx.c, bwx.d);
   protected static final ImmutableList<? extends bvq<?>> c = ImmutableList.of(bvq.g, bvq.h, bvq.k, bvq.l, bvq.n, bvq.m, bvq.E, bvq.t, bvq.o, bvq.p);

   public cdo(bmc<? extends cdo> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 5;
   }

   @Override
   protected bno.b<cdo> dO() {
      return bno.a(c, b);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      bno<cdo> $$1 = this.dO().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(chc.a));
      $$1.b(chc.b);
      $$1.f();
      return $$1;
   }

   private static void a(bno<cdo> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new bpl(45, 90), new bpp()));
   }

   private static void b(bno<cdo> $$0) {
      $$0.a(
         chc.b,
         10,
         ImmutableList.of(
            bqr.a(cdo::gh),
            bqf.a(8.0F, bjn.a(30, 60)),
            new bqc(ImmutableList.of(Pair.of(bpx.a(0.4F), 2), Pair.of(bqm.a(0.4F, 3), 2), Pair.of(new bop(30, 60), 1)))
         )
      );
   }

   private static void c(bno<cdo> $$0) {
      $$0.a(chc.k, 10, ImmutableList.of(bqk.a(1.0F), brs.a(cdo::w, bpm.a(40)), brs.a(cdo::o_, bpm.a(15)), bqu.a()), bvq.o);
   }

   private Optional<? extends bmo> gh() {
      return this.dN().c(bvq.h).orElse(bvs.a()).a(this::j);
   }

   private boolean j(bmo $$0) {
      bmc<?> $$1 = $$0.ai();
      return $$1 != bmc.br && $$1 != bmc.w && bww.c(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, false);
   }

   @Override
   public void a(agn<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.k_();
      }
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.n, 40.0).a(bnu.o, 0.3F).a(bnu.k, 0.6F).a(bnu.d, 1.0).a(bnu.c, 6.0);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   public boolean B(blw $$0) {
      if (!($$0 instanceof bmo)) {
         return false;
      } else {
         this.cd = 10;
         this.dL().a(this, (byte)4);
         this.a(art.Cn, 1.0F, this.eX());
         return cec.a(this, (bmo)$$0);
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return !this.fT();
   }

   @Override
   protected void e(bmo $$0) {
      if (!this.o_()) {
         cec.b(this, $$0);
      }
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bmo) {
         bmo $$3 = (bmo)$$0.d();
         if (this.c($$3) && !boh.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bmo $$0) {
      this.bz.b(bvq.E);
      this.bz.a(bvq.o, $$0, 200L);
   }

   @Override
   public bno<cdo> dN() {
      return (bno<cdo>)super.dN();
   }

   protected void A() {
      chc $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(chc.k, chc.b));
      chc $$1 = this.bz.g().orElse(null);
      if ($$1 == chc.k && $$0 != chc.k) {
         this.gg();
      }

      this.v(this.bz.a(bvq.o));
   }

   @Override
   protected void aa() {
      this.dL().af().a("zoglinBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().c();
      this.A();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (!this.dL().B && $$0) {
         this.f(bnu.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(d);
   }

   @Override
   public void d_() {
      if (this.cd > 0) {
         this.cd--;
      }

      super.d_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cd = 10;
         this.a(art.Cn, 1.0F, this.eX());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gf() {
      return this.cd;
   }

   @Override
   protected ars y() {
      if (this.dL().B) {
         return null;
      } else {
         return this.bz.a(bvq.o) ? art.Cm : art.Cl;
      }
   }

   @Override
   protected ars d(bkv $$0) {
      return art.Cp;
   }

   @Override
   protected ars n_() {
      return art.Co;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.Cq, 0.15F, 1.0F);
   }

   protected void gg() {
      this.a(art.Cm, 1.0F, this.eX());
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   @Override
   public bmt eS() {
      return bmt.b;
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
