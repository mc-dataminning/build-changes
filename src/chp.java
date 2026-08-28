import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class chp extends cfv implements bve<jn<cgg>> {
   protected static final ImmutableList<cep<? extends ceo<? super chp>>> bZ = ImmutableList.of(cep.c, cep.f, cep.v, cep.s, cep.w);
   protected static final ImmutableList<cdi<?>> ca = ImmutableList.of(
      cdi.n, cdi.g, cdi.h, cdi.m, cdi.E, cdi.t, cdi.r, cdi.S, cdi.T, cdi.o, cdi.O, cdi.P, new cdi[]{cdi.R, cdi.x, cdi.y, cdi.B, cdi.X, cdi.Y, cdi.Z, cdi.aa}
   );
   private static final akg<jn<cgg>> ch = akk.a(chp.class, aki.z);
   private static final akg<OptionalInt> ci = akk.a(chp.class, aki.v);
   private static final int cj = 5;
   public static final String cb = "variant";
   private static final ala<cgg> ck = cgg.b;
   public final btd cd = new btd();
   public final btd ce = new btd();
   public final btd cf = new btd();
   public final btd cg = new btd();

   public chp(btq<? extends cfv> $$0, dds $$1) {
      super($$0, $$1);
      this.bP = new chp.a(this);
      this.a(eqs.j, 4.0F);
      this.a(eqs.e, -1.0F);
      this.bQ = new cah(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bvg.b<chp> dY() {
      return bvg.a(ca, bZ);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return chq.a(this.dY().a($$0));
   }

   @Override
   public bvg<chp> dX() {
      return (bvg<chp>)super.dX();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ch, lu.aj.g(ck));
      $$0.a(ci, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.am.a(ci, OptionalInt.empty());
   }

   public Optional<btj> t() {
      return this.am.a(ci).stream().mapToObj(this.dS()::a).filter(Objects::nonNull).findFirst();
   }

   public void c(btj $$0) {
      this.am.a(ci, OptionalInt.of($$0.ap()));
   }

   @Override
   public int fQ() {
      return 35;
   }

   @Override
   public int ag() {
      return 5;
   }

   public jn<cgg> y() {
      return this.am.a(ch);
   }

   public void j(jn<cgg> $$0) {
      this.am.a(ch, $$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(ck).a().toString());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      Optional.ofNullable(alb.c($$0.l("variant"))).map($$0x -> ala.a(lv.F, $$0x)).flatMap(lu.aj::b).ifPresent(this::j);
   }

   @Override
   protected void ad() {
      this.dS().ah().a("frogBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("frogActivityUpdate");
      chq.a(this);
      this.dS().ah().c();
      super.ad();
   }

   @Override
   public void l() {
      if (this.dS().w_()) {
         this.cg.a(this.bl() && !this.aQ.d(), this.ag);
      }

      super.l();
   }

   @Override
   public void a(akg<?> $$0) {
      if (ar.equals($$0)) {
         bur $$1 = this.av();
         if ($$1 == bur.g) {
            this.cd.a(this.ag);
         } else {
            this.cd.a();
         }

         if ($$1 == bur.i) {
            this.ce.a(this.ag);
         } else {
            this.ce.a();
         }

         if ($$1 == bur.j) {
            this.cf.a(this.ag);
         } else {
            this.cf.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.cd.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aQ.a($$1, 0.4F, this.o_() ? 3.0F : 1.0F);
   }

   @Override
   public void gu() {
      this.dS().a(null, this, awd.jO, awe.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      chp $$2 = btq.R.a($$0, btp.e);
      if ($$2 != null) {
         chq.a($$2, $$0.C_());
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
   public void a(arg $$0, cfv $$1) {
      this.a($$0, $$1, null);
      this.dX().a(cdi.Y, bah.a);
   }

   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      jn<det> $$4 = $$0.t(this.ds());
      if ($$4.a(awr.ai)) {
         this.j(lu.aj.g(cgg.d));
      } else if ($$4.a(awr.aj)) {
         this.j(lu.aj.g(cgg.c));
      } else {
         this.j(lu.aj.g(ck));
      }

      chq.a(this, $$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bvl.a go() {
      return cfv.gt().a(bvm.v, 1.0).a(bvm.s, 10.0).a(bvm.c, 10.0).a(bvm.B, 1.0);
   }

   @Nullable
   @Override
   protected awc w() {
      return awd.jM;
   }

   @Nullable
   @Override
   protected awc d(bsb $$0) {
      return awd.jP;
   }

   @Nullable
   @Override
   protected awc n_() {
      return awd.jN;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.jS, 0.15F, 1.0F);
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
   public void a_(eye $$0) {
      if (this.de() && this.bi()) {
         this.a(this.fm(), $$0);
         this.a(buj.a, this.dv());
         this.h(this.dv().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(buf $$0) {
      if ($$0 instanceof cle $$1 && $$1.gp() != 1) {
         return false;
      }

      return $$0.ao().a(aww.n);
   }

   @Override
   protected cdq b(dds $$0) {
      return new chp.c(this, $$0);
   }

   @Nullable
   @Override
   public buf m() {
      return this.R();
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.al);
   }

   public static boolean c(btq<? extends cfv> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.a_($$3.e()).a(aws.ch) && a($$1, $$3);
   }

   class a extends cae {
      a(final buh $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return chp.this.t().isEmpty();
      }
   }

   static class b extends eqk {
      private final je.a l = new je.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eqn a() {
         return !this.b.bi() ? super.a() : this.c(new je(azc.a(this.b.cO().a), azc.a(this.b.cO().b), azc.a(this.b.cO().c)));
      }

      @Override
      public eqs a(equ $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dua $$4 = $$0.a(this.l);
         return $$4.a(aws.bS) ? eqs.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cdn {
      c(chp $$0, dds $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eqs $$0) {
         return $$0 != eqs.k && super.b($$0);
      }

      @Override
      protected eqr a(int $$0) {
         this.o = new chp.b(true);
         this.o.a(true);
         return new eqr(this.o, $$0);
      }
   }
}
