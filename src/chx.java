import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class chx extends cgd implements bvm<jo<cgo>> {
   protected static final ImmutableList<cex<? extends cew<? super chx>>> bY = ImmutableList.of(cex.c, cex.f, cex.v, cex.s, cex.w);
   protected static final ImmutableList<cdq<?>> bZ = ImmutableList.of(
      cdq.n, cdq.g, cdq.h, cdq.m, cdq.E, cdq.t, cdq.r, cdq.S, cdq.T, cdq.o, cdq.O, cdq.P, new cdq[]{cdq.R, cdq.x, cdq.y, cdq.B, cdq.X, cdq.Y, cdq.Z, cdq.aa}
   );
   private static final akh<jo<cgo>> cg = akl.a(chx.class, akj.z);
   private static final akh<OptionalInt> ch = akl.a(chx.class, akj.v);
   private static final int ci = 5;
   public static final String ca = "variant";
   private static final ald<cgo> cj = cgo.b;
   public final btl cc = new btl();
   public final btl cd = new btl();
   public final btl ce = new btl();
   public final btl cf = new btl();

   public chx(bty<? extends cgd> $$0, dej $$1) {
      super($$0, $$1);
      this.bO = new chx.a(this);
      this.a(erk.j, 4.0F);
      this.a(erk.e, -1.0F);
      this.bP = new cap(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bvo.b<chx> dZ() {
      return bvo.a(bZ, bY);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return chy.a(this.dZ().a($$0));
   }

   @Override
   public bvo<chx> dY() {
      return (bvo<chx>)super.dY();
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cg, lv.aj.b(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.am.a(ch, OptionalInt.empty());
   }

   public Optional<btr> t() {
      return this.am.a(ch).stream().mapToObj(this.dS()::a).filter(Objects::nonNull).findFirst();
   }

   public void c(btr $$0) {
      this.am.a(ch, OptionalInt.of($$0.ap()));
   }

   @Override
   public int ah() {
      return 35;
   }

   @Override
   public int ae() {
      return 5;
   }

   public jo<cgo> y() {
      return this.am.a(cg);
   }

   public void j(jo<cgo> $$0) {
      this.am.a(cg, $$0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cj).a().toString());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      Optional.ofNullable(ale.c($$0.l("variant"))).map($$0x -> ald.a(lw.F, $$0x)).flatMap(lv.aj::a).ifPresent(this::j);
   }

   @Override
   protected void ac() {
      this.dS().ah().a("frogBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("frogActivityUpdate");
      chy.a(this);
      this.dS().ah().c();
      super.ac();
   }

   @Override
   public void l() {
      if (this.dS().x_()) {
         this.cf.a(this.bl() && !this.aP.d(), this.ag);
      }

      super.l();
   }

   @Override
   public void a(akh<?> $$0) {
      if (ar.equals($$0)) {
         buz $$1 = this.av();
         if ($$1 == buz.g) {
            this.cc.a(this.ag);
         } else {
            this.cc.a();
         }

         if ($$1 == buz.i) {
            this.cd.a(this.ag);
         } else {
            this.cd.a();
         }

         if ($$1 == buz.j) {
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

      this.aP.a($$1, 0.4F, this.p_() ? 3.0F : 1.0F);
   }

   @Override
   public void gu() {
      this.dS().a(null, this, awg.jO, awh.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      chx $$2 = bty.R.a($$0, btx.e);
      if ($$2 != null) {
         chy.a($$2, $$0.D_());
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
   public void a(arj $$0, cgd $$1) {
      this.a($$0, $$1, null);
      this.dY().a(cdq.Y, bak.a);
   }

   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      jo<dfk> $$4 = $$0.t(this.ds());
      if ($$4.a(awu.ai)) {
         this.j(lv.aj.b(cgo.d));
      } else if ($$4.a(awu.aj)) {
         this.j(lv.aj.b(cgo.c));
      } else {
         this.j(lv.aj.b(cj));
      }

      chy.a(this, $$0.D_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bvt.a go() {
      return cgd.gt().a(bvu.v, 1.0).a(bvu.s, 10.0).a(bvu.c, 10.0).a(bvu.B, 1.0);
   }

   @Nullable
   @Override
   protected awf w() {
      return awg.jM;
   }

   @Nullable
   @Override
   protected awf d(bsj $$0) {
      return awg.jP;
   }

   @Nullable
   @Override
   protected awf o_() {
      return awg.jN;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.jS, 0.15F, 1.0F);
   }

   @Override
   public boolean cG() {
      return false;
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 5;
   }

   @Override
   public void a_(eyw $$0) {
      if (this.de() && this.bi()) {
         this.a(this.fm(), $$0);
         this.a(bur.a, this.dv());
         this.h(this.dv().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bun $$0) {
      if ($$0 instanceof clm $$1 && $$1.gp() != 1) {
         return false;
      }

      return $$0.ao().a(awz.n);
   }

   @Override
   protected cdy b(dej $$0) {
      return new chx.c(this, $$0);
   }

   @Nullable
   @Override
   public bun m() {
      return this.R();
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.al);
   }

   public static boolean c(bty<? extends cgd> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.a_($$3.e()).a(awv.ch) && a($$1, $$3);
   }

   class a extends cam {
      a(final bup $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return chx.this.t().isEmpty();
      }
   }

   static class b extends erc {
      private final jf.a l = new jf.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public erf a() {
         return !this.b.bi() ? super.a() : this.c(new jf(azf.a(this.b.cO().a), azf.a(this.b.cO().b), azf.a(this.b.cO().c)));
      }

      @Override
      public erk a(erm $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dus $$4 = $$0.a(this.l);
         return $$4.a(awv.bS) ? erk.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cdv {
      c(chx $$0, dej $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(erk $$0) {
         return $$0 != erk.k && super.b($$0);
      }

      @Override
      protected erj a(int $$0) {
         this.o = new chx.b(true);
         this.o.a(true);
         return new erj(this.o, $$0);
      }
   }
}
