import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cip extends cgv implements bwe<jq<chg>> {
   protected static final ImmutableList<cfp<? extends cfo<? super cip>>> bY = ImmutableList.of(cfp.c, cfp.f, cfp.v, cfp.s, cfp.w);
   protected static final ImmutableList<cei<?>> bZ = ImmutableList.of(
      cei.n, cei.g, cei.h, cei.m, cei.E, cei.t, cei.r, cei.S, cei.T, cei.o, cei.O, cei.P, new cei[]{cei.R, cei.x, cei.y, cei.B, cei.X, cei.Y, cei.Z, cei.aa}
   );
   private static final ako<jq<chg>> cg = aks.a(cip.class, akq.z);
   private static final ako<OptionalInt> ch = aks.a(cip.class, akq.v);
   private static final int ci = 5;
   public static final String ca = "variant";
   private static final alk<chg> cj = chg.b;
   public final bua cc = new bua();
   public final bua cd = new bua();
   public final bua ce = new bua();
   public final bua cf = new bua();

   public cip(bup<? extends cgv> $$0, dff $$1) {
      super($$0, $$1);
      this.bO = new cip.a(this);
      this.a(esf.j, 4.0F);
      this.a(esf.e, -1.0F);
      this.bP = new cbh(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bwg.b<cip> ef() {
      return bwg.a(bZ, bY);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return ciq.a(this.ef().a($$0));
   }

   @Override
   public bwg<cip> ee() {
      return (bwg<cip>)super.ee();
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cg, lz.aj.b(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.am.a(ch, OptionalInt.empty());
   }

   public Optional<bui> t() {
      return this.am.a(ch).stream().mapToObj(this.dY()::a).filter(Objects::nonNull).findFirst();
   }

   public void c(bui $$0) {
      this.am.a(ch, OptionalInt.of($$0.as()));
   }

   @Override
   public int ah() {
      return 35;
   }

   @Override
   public int ae() {
      return 5;
   }

   public jq<chg> y() {
      return this.am.a(cg);
   }

   public void j(jq<chg> $$0) {
      this.am.a(cg, $$0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cj).a().toString());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      Optional.ofNullable(all.c($$0.l("variant"))).map($$0x -> alk.a(ma.F, $$0x)).flatMap(lz.aj::a).ifPresent(this::j);
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("frogBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.c();
      $$0.a("frogActivityUpdate");
      ciq.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   public void l() {
      if (this.dY().y_()) {
         this.cf.a(this.bo() && !this.aT.d(), this.ag);
      }

      super.l();
   }

   @Override
   public void a(ako<?> $$0) {
      if (ar.equals($$0)) {
         bvq $$1 = this.ay();
         if ($$1 == bvq.g) {
            this.cc.a(this.ag);
         } else {
            this.cc.a();
         }

         if ($$1 == bvq.i) {
            this.cd.a(this.ag);
         } else {
            this.cd.a();
         }

         if ($$1 == bvq.j) {
            this.ce.a(this.ag);
         } else {
            this.ce.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.cc.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aT.a($$1, 0.4F, this.p_() ? 3.0F : 1.0F);
   }

   @Override
   public void gB() {
      this.dY().a(null, this, awo.jO, awp.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public btz a(arq $$0, btz $$1) {
      cip $$2 = bup.R.a($$0, buo.e);
      if ($$2 != null) {
         ciq.a($$2, $$0.E_());
      }

      return $$2;
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(arq $$0, cgv $$1) {
      this.a($$0, $$1, null);
      this.ee().a(cei.Y, bat.a);
   }

   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      jq<dgh> $$4 = $$0.t(this.dy());
      if ($$4.a(axc.ai)) {
         this.j(lz.aj.b(chg.d));
      } else if ($$4.a(axc.aj)) {
         this.j(lz.aj.b(chg.c));
      } else {
         this.j(lz.aj.b(cj));
      }

      ciq.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwl.a gv() {
      return cgv.gA().a(bwm.v, 1.0).a(bwm.s, 10.0).a(bwm.c, 10.0).a(bwm.B, 1.0);
   }

   @Nullable
   @Override
   protected awn w() {
      return awo.jM;
   }

   @Nullable
   @Override
   protected awn d(bsy $$0) {
      return awo.jP;
   }

   @Nullable
   @Override
   protected awn o_() {
      return awo.jN;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.jS, 0.15F, 1.0F);
   }

   @Override
   public boolean cL() {
      return false;
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 5;
   }

   @Override
   public void a_(ezr $$0) {
      if (this.dk() && this.bl()) {
         this.a(this.fs(), $$0);
         this.a(bvi.a, this.dB());
         this.h(this.dB().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bve $$0) {
      if ($$0 instanceof cme $$1 && $$1.gw() != 1) {
         return false;
      }

      return $$0.ar().a(axh.n);
   }

   @Override
   protected ceq b(dff $$0) {
      return new cip.c(this, $$0);
   }

   @Nullable
   @Override
   public bve m() {
      return this.R();
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ap);
   }

   public static boolean c(bup<? extends cgv> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axd.ch) && a($$1, $$3);
   }

   class a extends cbe {
      a(final bvg $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cip.this.t().isEmpty();
      }
   }

   static class b extends erx {
      private final jh.a l = new jh.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public esa a() {
         return !this.b.bl() ? super.a() : this.c(new jh(azn.a(this.b.cT().a), azn.a(this.b.cT().b), azn.a(this.b.cT().c)));
      }

      @Override
      public esf a(esh $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dvo $$4 = $$0.a(this.l);
         return $$4.a(axd.bS) ? esf.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cen {
      c(cip $$0, dff $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(esf $$0) {
         return $$0 != esf.k && super.b($$0);
      }

      @Override
      protected ese a(int $$0) {
         this.o = new cip.b(true);
         this.o.a(true);
         return new ese(this.o, $$0);
      }
   }
}
