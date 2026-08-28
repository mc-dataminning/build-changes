import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ciq extends cgw implements bwf<jr<chh>> {
   protected static final ImmutableList<cfq<? extends cfp<? super ciq>>> bY = ImmutableList.of(cfq.c, cfq.f, cfq.v, cfq.s, cfq.w);
   protected static final ImmutableList<cej<?>> bZ = ImmutableList.of(
      cej.n, cej.g, cej.h, cej.m, cej.E, cej.t, cej.r, cej.S, cej.T, cej.o, cej.O, cej.P, new cej[]{cej.R, cej.x, cej.y, cej.B, cej.X, cej.Y, cej.Z, cej.aa}
   );
   private static final ajx<jr<chh>> cg = akb.a(ciq.class, ajz.z);
   private static final ajx<OptionalInt> ch = akb.a(ciq.class, ajz.v);
   private static final int ci = 5;
   public static final String ca = "variant";
   private static final akt<chh> cj = chh.b;
   public final bub cc = new bub();
   public final bub cd = new bub();
   public final bub ce = new bub();
   public final bub cf = new bub();

   public ciq(buq<? extends cgw> $$0, dgg $$1) {
      super($$0, $$1);
      this.bO = new ciq.a(this);
      this.a(eto.j, 4.0F);
      this.a(eto.e, -1.0F);
      this.bP = new cbi(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bwh.b<ciq> ed() {
      return bwh.a(bZ, bY);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cir.a(this.ed().a($$0));
   }

   @Override
   public bwh<ciq> ec() {
      return (bwh<ciq>)super.ec();
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cg, mb.aj.b(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   public void p() {
      this.al.a(ch, OptionalInt.empty());
   }

   public Optional<buj> t() {
      return this.al.a(ch).stream().mapToObj(this.dW()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(buj $$0) {
      this.al.a(ch, OptionalInt.of($$0.ar()));
   }

   @Override
   public int ad() {
      return 35;
   }

   @Override
   public int ab() {
      return 5;
   }

   public jr<chh> x() {
      return this.al.a(cg);
   }

   public void j(jr<chh> $$0) {
      this.al.a(cg, $$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("variant", this.x().e().orElse(cj).a().toString());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(aku.c($$0.l("variant"))).map($$0x -> akt.a(mc.F, $$0x)).flatMap(mb.aj::a).ifPresent(this::j);
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("frogBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cir.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dW().B_()) {
         this.cf.a(this.bm() && !this.aT.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(ajx<?> $$0) {
      if (aq.equals($$0)) {
         bvr $$1 = this.aw();
         if ($$1 == bvr.g) {
            this.cc.a(this.af);
         } else {
            this.cc.a();
         }

         if ($$1 == bvr.i) {
            this.cd.a(this.af);
         } else {
            this.cd.a();
         }

         if ($$1 == bvr.j) {
            this.ce.a(this.af);
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

      this.aT.a($$1, 0.4F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void gv() {
      this.dW().a(null, this, avz.kn, awa.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      ciq $$2 = buq.ab.a($$0, bup.e);
      if ($$2 != null) {
         cir.a($$2, $$0.H_());
      }

      return $$2;
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(arc $$0, cgw $$1) {
      this.a($$0, $$1, null);
      this.ec().a(cej.Y, bae.a);
   }

   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      jr<dhi> $$4 = $$0.t(this.dw());
      if ($$4.a(awn.ai)) {
         this.j(mb.aj.b(chh.d));
      } else if ($$4.a(awn.aj)) {
         this.j(mb.aj.b(chh.c));
      } else {
         this.j(mb.aj.b(cj));
      }

      cir.a(this, $$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwm.a gp() {
      return cgw.gu().a(bwn.v, 1.0).a(bwn.s, 10.0).a(bwn.c, 10.0).a(bwn.B, 1.0);
   }

   @Nullable
   @Override
   protected avy u() {
      return avz.kl;
   }

   @Nullable
   @Override
   protected avy e(bsz $$0) {
      return avz.ko;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.km;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.kr, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 5;
   }

   @Override
   public void a_(fay $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bvj.a, this.dz());
         this.h(this.dz().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bvf $$0) {
      if ($$0 instanceof cmf $$1 && $$1.gp() != 1) {
         return false;
      }

      return $$0.aq().a(aws.n);
   }

   @Override
   protected cer b(dgg $$0) {
      return new ciq.c(this, $$0);
   }

   @Nullable
   @Override
   public bvf O_() {
      return this.O();
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.ao);
   }

   public static boolean c(buq<? extends cgw> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.a_($$3.e()).a(awo.ci) && a($$1, $$3);
   }

   class a extends cbf {
      a(final bvh $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return ciq.this.t().isEmpty();
      }
   }

   static class b extends etg {
      private final ji.a a = new ji.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public etj a() {
         return !this.c.bj() ? super.a() : this.c(new ji(ayy.a(this.c.cR().a), ayy.a(this.c.cR().b), ayy.a(this.c.cR().c)));
      }

      @Override
      public eto a(etq $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dwv $$4 = $$0.a(this.a);
         return $$4.a(awo.bT) ? eto.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends ceo {
      c(ciq $$0, dgg $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eto $$0) {
         return $$0 != eto.k && super.b($$0);
      }

      @Override
      protected etn a(int $$0) {
         this.o = new ciq.b(true);
         return new etn(this.o, $$0);
      }
   }
}
