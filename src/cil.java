import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cil extends cgr implements bwa<jq<chc>> {
   protected static final ImmutableList<cfl<? extends cfk<? super cil>>> bY = ImmutableList.of(cfl.c, cfl.f, cfl.v, cfl.s, cfl.w);
   protected static final ImmutableList<cee<?>> bZ = ImmutableList.of(
      cee.n, cee.g, cee.h, cee.m, cee.E, cee.t, cee.r, cee.S, cee.T, cee.o, cee.O, cee.P, new cee[]{cee.R, cee.x, cee.y, cee.B, cee.X, cee.Y, cee.Z, cee.aa}
   );
   private static final akl<jq<chc>> cg = akp.a(cil.class, akn.z);
   private static final akl<OptionalInt> ch = akp.a(cil.class, akn.v);
   private static final int ci = 5;
   public static final String ca = "variant";
   private static final alh<chc> cj = chc.b;
   public final btw cc = new btw();
   public final btw cd = new btw();
   public final btw ce = new btw();
   public final btw cf = new btw();

   public cil(bul<? extends cgr> $$0, dfb $$1) {
      super($$0, $$1);
      this.bO = new cil.a(this);
      this.a(esb.j, 4.0F);
      this.a(esb.e, -1.0F);
      this.bP = new cbd(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bwc.b<cil> ee() {
      return bwc.a(bZ, bY);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cim.a(this.ee().a($$0));
   }

   @Override
   public bwc<cil> ed() {
      return (bwc<cil>)super.ed();
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cg, ly.aj.b(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.am.a(ch, OptionalInt.empty());
   }

   public Optional<bue> t() {
      return this.am.a(ch).stream().mapToObj(this.dX()::a).filter(Objects::nonNull).findFirst();
   }

   public void c(bue $$0) {
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

   public jq<chc> y() {
      return this.am.a(cg);
   }

   public void j(jq<chc> $$0) {
      this.am.a(cg, $$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cj).a().toString());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      Optional.ofNullable(ali.c($$0.l("variant"))).map($$0x -> alh.a(lz.F, $$0x)).flatMap(ly.aj::a).ifPresent(this::j);
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("frogBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.c();
      $$0.a("frogActivityUpdate");
      cim.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   public void l() {
      if (this.dX().y_()) {
         this.cf.a(this.bn() && !this.aT.d(), this.ag);
      }

      super.l();
   }

   @Override
   public void a(akl<?> $$0) {
      if (ar.equals($$0)) {
         bvm $$1 = this.ay();
         if ($$1 == bvm.g) {
            this.cc.a(this.ag);
         } else {
            this.cc.a();
         }

         if ($$1 == bvm.i) {
            this.cd.a(this.ag);
         } else {
            this.cd.a();
         }

         if ($$1 == bvm.j) {
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
   public void gA() {
      this.dX().a(null, this, awl.jO, awm.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      cil $$2 = bul.R.a($$0, buk.e);
      if ($$2 != null) {
         cim.a($$2, $$0.E_());
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
   public void a(arn $$0, cgr $$1) {
      this.a($$0, $$1, null);
      this.ed().a(cee.Y, bap.a);
   }

   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      jq<dgc> $$4 = $$0.t(this.dx());
      if ($$4.a(awz.ai)) {
         this.j(ly.aj.b(chc.d));
      } else if ($$4.a(awz.aj)) {
         this.j(ly.aj.b(chc.c));
      } else {
         this.j(ly.aj.b(cj));
      }

      cim.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwh.a gu() {
      return cgr.gz().a(bwi.v, 1.0).a(bwi.s, 10.0).a(bwi.c, 10.0).a(bwi.B, 1.0);
   }

   @Nullable
   @Override
   protected awk w() {
      return awl.jM;
   }

   @Nullable
   @Override
   protected awk d(bsu $$0) {
      return awl.jP;
   }

   @Nullable
   @Override
   protected awk o_() {
      return awl.jN;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.jS, 0.15F, 1.0F);
   }

   @Override
   public boolean cK() {
      return false;
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 5;
   }

   @Override
   public void a_(ezn $$0) {
      if (this.dj() && this.bk()) {
         this.a(this.fr(), $$0);
         this.a(bve.a, this.dA());
         this.h(this.dA().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bva $$0) {
      if ($$0 instanceof cma $$1 && $$1.gv() != 1) {
         return false;
      }

      return $$0.ar().a(axe.n);
   }

   @Override
   protected cem b(dfb $$0) {
      return new cil.c(this, $$0);
   }

   @Nullable
   @Override
   public bva m() {
      return this.R();
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.ao);
   }

   public static boolean c(bul<? extends cgr> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.a_($$3.e()).a(axa.ch) && a($$1, $$3);
   }

   class a extends cba {
      a(final bvc $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cil.this.t().isEmpty();
      }
   }

   static class b extends ert {
      private final jh.a l = new jh.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public erw a() {
         return !this.b.bk() ? super.a() : this.c(new jh(azk.a(this.b.cS().a), azk.a(this.b.cS().b), azk.a(this.b.cS().c)));
      }

      @Override
      public esb a(esd $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dvj $$4 = $$0.a(this.l);
         return $$4.a(axa.bS) ? esb.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cej {
      c(cil $$0, dfb $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(esb $$0) {
         return $$0 != esb.k && super.b($$0);
      }

      @Override
      protected esa a(int $$0) {
         this.o = new cil.b(true);
         this.o.a(true);
         return new esa(this.o, $$0);
      }
   }
}
