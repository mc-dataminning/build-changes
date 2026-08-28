import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cig extends cgm implements bvv<jp<cgx>> {
   protected static final ImmutableList<cfg<? extends cff<? super cig>>> bY = ImmutableList.of(cfg.c, cfg.f, cfg.v, cfg.s, cfg.w);
   protected static final ImmutableList<cdz<?>> bZ = ImmutableList.of(
      cdz.n, cdz.g, cdz.h, cdz.m, cdz.E, cdz.t, cdz.r, cdz.S, cdz.T, cdz.o, cdz.O, cdz.P, new cdz[]{cdz.R, cdz.x, cdz.y, cdz.B, cdz.X, cdz.Y, cdz.Z, cdz.aa}
   );
   private static final akk<jp<cgx>> cg = ako.a(cig.class, akm.z);
   private static final akk<OptionalInt> ch = ako.a(cig.class, akm.v);
   private static final int ci = 5;
   public static final String ca = "variant";
   private static final alg<cgx> cj = cgx.b;
   public final btr cc = new btr();
   public final btr cd = new btr();
   public final btr ce = new btr();
   public final btr cf = new btr();

   public cig(bug<? extends cgm> $$0, dev $$1) {
      super($$0, $$1);
      this.bO = new cig.a(this);
      this.a(erv.j, 4.0F);
      this.a(erv.e, -1.0F);
      this.bP = new cay(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bvx.b<cig> ee() {
      return bvx.a(bZ, bY);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cih.a(this.ee().a($$0));
   }

   @Override
   public bvx<cig> ed() {
      return (bvx<cig>)super.ed();
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cg, lx.aj.b(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.am.a(ch, OptionalInt.empty());
   }

   public Optional<btz> t() {
      return this.am.a(ch).stream().mapToObj(this.dX()::a).filter(Objects::nonNull).findFirst();
   }

   public void c(btz $$0) {
      this.am.a(ch, OptionalInt.of($$0.ar()));
   }

   @Override
   public int ah() {
      return 35;
   }

   @Override
   public int ae() {
      return 5;
   }

   public jp<cgx> y() {
      return this.am.a(cg);
   }

   public void j(jp<cgx> $$0) {
      this.am.a(cg, $$0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cj).a().toString());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      Optional.ofNullable(alh.c($$0.l("variant"))).map($$0x -> alg.a(ly.F, $$0x)).flatMap(lx.aj::a).ifPresent(this::j);
   }

   @Override
   protected void ac() {
      this.dX().ah().a("frogBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().c();
      this.dX().ah().a("frogActivityUpdate");
      cih.a(this);
      this.dX().ah().c();
      super.ac();
   }

   @Override
   public void l() {
      if (this.dX().y_()) {
         this.cf.a(this.bn() && !this.aQ.d(), this.ag);
      }

      super.l();
   }

   @Override
   public void a(akk<?> $$0) {
      if (ar.equals($$0)) {
         bvh $$1 = this.ax();
         if ($$1 == bvh.g) {
            this.cc.a(this.ag);
         } else {
            this.cc.a();
         }

         if ($$1 == bvh.i) {
            this.cd.a(this.ag);
         } else {
            this.cd.a();
         }

         if ($$1 == bvh.j) {
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

      this.aQ.a($$1, 0.4F, this.p_() ? 3.0F : 1.0F);
   }

   @Override
   public void gB() {
      this.dX().a(null, this, awk.jO, awl.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      cig $$2 = bug.R.a($$0, buf.e);
      if ($$2 != null) {
         cih.a($$2, $$0.E_());
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
   public void a(arm $$0, cgm $$1) {
      this.a($$0, $$1, null);
      this.ed().a(cdz.Y, bao.a);
   }

   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      jp<dfw> $$4 = $$0.t(this.dx());
      if ($$4.a(awy.ai)) {
         this.j(lx.aj.b(cgx.d));
      } else if ($$4.a(awy.aj)) {
         this.j(lx.aj.b(cgx.c));
      } else {
         this.j(lx.aj.b(cj));
      }

      cih.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwc.a gv() {
      return cgm.gA().a(bwd.v, 1.0).a(bwd.s, 10.0).a(bwd.c, 10.0).a(bwd.B, 1.0);
   }

   @Nullable
   @Override
   protected awj w() {
      return awk.jM;
   }

   @Nullable
   @Override
   protected awj d(bsp $$0) {
      return awk.jP;
   }

   @Nullable
   @Override
   protected awj o_() {
      return awk.jN;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.jS, 0.15F, 1.0F);
   }

   @Override
   public boolean cK() {
      return false;
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 5;
   }

   @Override
   public void a_(ezh $$0) {
      if (this.dj() && this.bk()) {
         this.a(this.fr(), $$0);
         this.a(buz.a, this.dA());
         this.h(this.dA().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(buv $$0) {
      if ($$0 instanceof clv $$1 && $$1.gw() != 1) {
         return false;
      }

      return $$0.aq().a(axd.n);
   }

   @Override
   protected ceh b(dev $$0) {
      return new cig.c(this, $$0);
   }

   @Nullable
   @Override
   public buv m() {
      return this.R();
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.am);
   }

   public static boolean c(bug<? extends cgm> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.a_($$3.e()).a(awz.ch) && a($$1, $$3);
   }

   class a extends cav {
      a(final bux $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cig.this.t().isEmpty();
      }
   }

   static class b extends ern {
      private final jg.a l = new jg.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public erq a() {
         return !this.b.bk() ? super.a() : this.c(new jg(azj.a(this.b.cS().a), azj.a(this.b.cS().b), azj.a(this.b.cS().c)));
      }

      @Override
      public erv a(erx $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dvd $$4 = $$0.a(this.l);
         return $$4.a(awz.bS) ? erv.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cee {
      c(cig $$0, dev $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(erv $$0) {
         return $$0 != erv.k && super.b($$0);
      }

      @Override
      protected eru a(int $$0) {
         this.o = new cig.b(true);
         this.o.a(true);
         return new eru(this.o, $$0);
      }
   }
}
