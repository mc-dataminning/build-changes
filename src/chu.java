import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class chu extends cga implements bvj<jn<cgl>> {
   protected static final ImmutableList<ceu<? extends cet<? super chu>>> bY = ImmutableList.of(ceu.c, ceu.f, ceu.v, ceu.s, ceu.w);
   protected static final ImmutableList<cdn<?>> bZ = ImmutableList.of(
      cdn.n, cdn.g, cdn.h, cdn.m, cdn.E, cdn.t, cdn.r, cdn.S, cdn.T, cdn.o, cdn.O, cdn.P, new cdn[]{cdn.R, cdn.x, cdn.y, cdn.B, cdn.X, cdn.Y, cdn.Z, cdn.aa}
   );
   private static final akg<jn<cgl>> cg = akk.a(chu.class, aki.z);
   private static final akg<OptionalInt> ch = akk.a(chu.class, aki.v);
   private static final int ci = 5;
   public static final String ca = "variant";
   private static final alb<cgl> cj = cgl.b;
   public final bti cc = new bti();
   public final bti cd = new bti();
   public final bti ce = new bti();
   public final bti cf = new bti();

   public chu(btv<? extends cga> $$0, deg $$1) {
      super($$0, $$1);
      this.bO = new chu.a(this);
      this.a(erg.j, 4.0F);
      this.a(erg.e, -1.0F);
      this.bP = new cam(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bvl.b<chu> dY() {
      return bvl.a(bZ, bY);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return chv.a(this.dY().a($$0));
   }

   @Override
   public bvl<chu> dX() {
      return (bvl<chu>)super.dX();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cg, lu.aj.g(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.am.a(ch, OptionalInt.empty());
   }

   public Optional<bto> t() {
      return this.am.a(ch).stream().mapToObj(this.dS()::a).filter(Objects::nonNull).findFirst();
   }

   public void c(bto $$0) {
      this.am.a(ch, OptionalInt.of($$0.ap()));
   }

   @Override
   public int fR() {
      return 35;
   }

   @Override
   public int ag() {
      return 5;
   }

   public jn<cgl> y() {
      return this.am.a(cg);
   }

   public void j(jn<cgl> $$0) {
      this.am.a(cg, $$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cj).a().toString());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      Optional.ofNullable(alc.c($$0.l("variant"))).map($$0x -> alb.a(lv.F, $$0x)).flatMap(lu.aj::b).ifPresent(this::j);
   }

   @Override
   protected void ad() {
      this.dS().ah().a("frogBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("frogActivityUpdate");
      chv.a(this);
      this.dS().ah().c();
      super.ad();
   }

   @Override
   public void l() {
      if (this.dS().w_()) {
         this.cf.a(this.bl() && !this.aP.d(), this.ag);
      }

      super.l();
   }

   @Override
   public void a(akg<?> $$0) {
      if (ar.equals($$0)) {
         buw $$1 = this.av();
         if ($$1 == buw.g) {
            this.cc.a(this.ag);
         } else {
            this.cc.a();
         }

         if ($$1 == buw.i) {
            this.cd.a(this.ag);
         } else {
            this.cd.a();
         }

         if ($$1 == buw.j) {
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

      this.aP.a($$1, 0.4F, this.o_() ? 3.0F : 1.0F);
   }

   @Override
   public void gv() {
      this.dS().a(null, this, awe.jO, awf.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      chu $$2 = btv.R.a($$0, btu.e);
      if ($$2 != null) {
         chv.a($$2, $$0.C_());
      }

      return $$2;
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(arh $$0, cga $$1) {
      this.a($$0, $$1, null);
      this.dX().a(cdn.Y, bai.a);
   }

   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      jn<dfh> $$4 = $$0.t(this.ds());
      if ($$4.a(aws.ai)) {
         this.j(lu.aj.g(cgl.d));
      } else if ($$4.a(aws.aj)) {
         this.j(lu.aj.g(cgl.c));
      } else {
         this.j(lu.aj.g(cj));
      }

      chv.a(this, $$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bvq.a gp() {
      return cga.gu().a(bvr.v, 1.0).a(bvr.s, 10.0).a(bvr.c, 10.0).a(bvr.B, 1.0);
   }

   @Nullable
   @Override
   protected awd w() {
      return awe.jM;
   }

   @Nullable
   @Override
   protected awd d(bsg $$0) {
      return awe.jP;
   }

   @Nullable
   @Override
   protected awd n_() {
      return awe.jN;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.jS, 0.15F, 1.0F);
   }

   @Override
   public boolean cG() {
      return false;
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 5;
   }

   @Override
   public void a_(eys $$0) {
      if (this.de() && this.bi()) {
         this.a(this.fm(), $$0);
         this.a(buo.a, this.dv());
         this.h(this.dv().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(buk $$0) {
      if ($$0 instanceof clj $$1 && $$1.gq() != 1) {
         return false;
      }

      return $$0.ao().a(awx.n);
   }

   @Override
   protected cdv b(deg $$0) {
      return new chu.c(this, $$0);
   }

   @Nullable
   @Override
   public buk m() {
      return this.R();
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.al);
   }

   public static boolean c(btv<? extends cga> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.a_($$3.e()).a(awt.ch) && a($$1, $$3);
   }

   class a extends caj {
      a(final bum $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return chu.this.t().isEmpty();
      }
   }

   static class b extends eqy {
      private final je.a l = new je.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public erb a() {
         return !this.b.bi() ? super.a() : this.c(new je(azd.a(this.b.cO().a), azd.a(this.b.cO().b), azd.a(this.b.cO().c)));
      }

      @Override
      public erg a(eri $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         duo $$4 = $$0.a(this.l);
         return $$4.a(awt.bS) ? erg.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cds {
      c(chu $$0, deg $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(erg $$0) {
         return $$0 != erg.k && super.b($$0);
      }

      @Override
      protected erf a(int $$0) {
         this.o = new chu.b(true);
         this.o.a(true);
         return new erf(this.o, $$0);
      }
   }
}
