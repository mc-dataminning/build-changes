import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chj extends buv implements cni, dzy {
   private static final Logger e = LogUtils.getLogger();
   private static final kj bY = new kj(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final Predicate<cvs> cc = $$0 -> $$0.a(cvw.oE);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final akh<Boolean> cf = akl.a(chj.class, akj.k);
   private static final akh<Boolean> cg = akl.a(chj.class, akj.k);
   protected static final ImmutableList<cex<? extends cew<? super chj>>> b = ImmutableList.of(cex.c, cex.d, cex.f, cex.b);
   protected static final ImmutableList<cdq<?>> c = ImmutableList.of(
      cdq.t, cdq.n, cdq.h, cdq.m, cdq.E, cdq.x, cdq.L, cdq.aM, cdq.aN, cdq.aO, cdq.aP, cdq.Z, new cdq[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dzm<dzy.b> ch;
   private dzy.a ci;
   private final dzy.d cj;
   private final dzm<chj.a> ck;
   private final brz cl = new brz(1);
   @Nullable
   private jf cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public chj(bty<? extends chj> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new cak(this, 20, true);
      this.a_(this.fJ());
      this.cj = new chj.b();
      this.ci = new dzy.a();
      this.ch = new dzm<>(new dzy.b(this));
      this.ck = new dzm<>(new chj.a(this.cj.b(), dzp.E.a().a()));
   }

   @Override
   protected bvo.b<chj> dZ() {
      return bvo.a(c, b);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return chk.a(this.dZ().a($$0));
   }

   @Override
   public bvo<chj> dY() {
      return (bvo<chj>)super.dY();
   }

   public static bvt.a q() {
      return bup.E().a(bvu.s, 20.0).a(bvu.l, 0.1F).a(bvu.v, 0.1F).a(bvu.c, 2.0);
   }

   @Override
   protected cdy b(dej $$0) {
      cdw $$1 = new cdw(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a_(eyw $$0) {
      if (this.de()) {
         if (this.bi()) {
            this.a(0.02F, $$0);
            this.a(bur.a, this.dv());
            this.h(this.dv().c(0.8F));
         } else if (this.bw()) {
            this.a(0.02F, $$0);
            this.a(bur.a, this.dv());
            this.h(this.dv().c(0.5));
         } else {
            this.a(this.fm(), $$0);
            this.a(bur.a, this.dv());
            this.h(this.dv().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if ($$0.d() instanceof cnx $$2) {
         Optional<UUID> $$3 = this.dY().c(cdq.aM);
         if ($$3.isPresent() && $$2.cD().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(jf $$0, dus $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dus $$2, jf $$3) {
   }

   @Override
   protected awf w() {
      return this.d(btz.a) ? awg.a : awg.b;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.d;
   }

   @Override
   protected awf o_() {
      return awg.c;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   protected void ac() {
      this.dS().ah().a("allayBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("allayActivityUpdate");
      chk.a(this);
      this.dS().ah().c();
      super.ac();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dS().B && this.bI() && this.ag % 10 == 0) {
         this.c(1.0F);
      }

      if (this.go() && this.gt() && this.ag % 20 == 0) {
         this.x(false);
         this.cm = null;
      }

      this.gu();
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         this.cp = this.co;
         if (this.t()) {
            this.co = azf.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = azf.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.go()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gp()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = azf.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         dzy.c.a(this.dS(), this.ci, this.cj);
         if (this.gl()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fJ() {
      return !this.gs() && this.t();
   }

   public boolean t() {
      return !this.b(brr.a).f();
   }

   @Override
   public boolean e(cvs $$0) {
      return false;
   }

   private boolean gs() {
      return this.dY().a(cdq.aP, cdr.a);
   }

   @Override
   protected brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      cvs $$3 = this.b(brr.a);
      if (this.go() && this.m($$2) && this.gx()) {
         this.gv();
         this.dS().a(this, (byte)18);
         this.dS().a($$0, this, awg.E, awh.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return brs.a;
      } else if ($$3.f() && !$$2.f()) {
         cvs $$4 = $$2.c(1);
         this.a(brr.a, $$4);
         this.a($$0, $$2);
         this.dS().a($$0, this, awg.e, awh.g, 2.0F, 1.0F);
         this.dY().a(cdq.aM, $$0.cD());
         return brs.a;
      } else if (!$$3.f() && $$1 == brr.a && $$2.f()) {
         this.a(btz.a, cvs.k);
         this.dS().a($$0, this, awg.f, awh.g, 2.0F, 1.0F);
         this.a(brr.a);

         for (cvs $$5 : this.y().f()) {
            bwh.a(this, $$5, this.dq());
         }

         this.dY().b(cdq.aM);
         $$0.j($$3);
         return brs.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jf $$0, boolean $$1) {
      if ($$1) {
         if (!this.go()) {
            this.cm = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.x(false);
      }
   }

   @Override
   public brz y() {
      return this.cl;
   }

   @Override
   protected kj Y() {
      return bY;
   }

   @Override
   public boolean j(cvs $$0) {
      cvs $$1 = this.b(brr.a);
      return !$$1.f() && this.dS().ac().b(def.c) && this.cl.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cvs $$0, cvs $$1) {
      return cvs.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cvs $$0, cvs $$1) {
      cxr $$2 = $$0.a(ks.L);
      cxr $$3 = $$1.a(ks.L);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(ckh $$0) {
      cni.a(this, this, $$0);
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   @Override
   public boolean aZ() {
      return !this.aH();
   }

   @Override
   public void a(BiConsumer<dzm<?>, arj> $$0) {
      if (this.dS() instanceof arj $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean go() {
      return this.am.a(cf);
   }

   public void x(boolean $$0) {
      if (!this.dS().B && this.df() && (!$$0 || !this.gl())) {
         this.am.a(cf, $$0);
      }
   }

   private boolean gt() {
      return this.cm == null || !this.cm.a(this.dq(), (double)dzp.E.a().a()) || !this.dS().a_(this.cm).a(dho.dT);
   }

   public float J(float $$0) {
      return azf.h($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gp() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azf.h($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cvs $$0, cvs $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eE() {
      super.eE();
      this.cl.f().forEach(this::b);
      cvs $$0 = this.a(btz.a);
      if (!$$0.f() && !dbp.a($$0, dbo.D)) {
         this.b($$0);
         this.a(btz.a, cvs.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      this.b($$0, this.dU());
      alc<vd> $$1 = this.dU().a(uu.a);
      dzy.a.a
         .encodeStart($$1, this.ci)
         .resultOrPartial($$0x -> e.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gx());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a($$0, this.dU());
      alc<vd> $$1 = this.dU().a(uu.a);
      if ($$0.b("listener", 10)) {
         dzy.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> e.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.am.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gm() {
      return false;
   }

   private void gu() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dS().x_() && this.cn == 0L && !this.gx()) {
         this.am.a(cg, true);
      }
   }

   private boolean m(cvs $$0) {
      return cc.test($$0);
   }

   private void gv() {
      chj $$0 = bty.a.a(this.dS(), btx.e);
      if ($$0 != null) {
         $$0.e(this.dq());
         $$0.fW();
         $$0.gw();
         this.gw();
         this.dS().b($$0);
      }
   }

   private void gw() {
      this.cn = 6000L;
      this.am.a(cg, false);
   }

   private boolean gx() {
      return this.am.a(cg);
   }

   private void a(cnx $$0, cvs $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)this.cP() * 0.6, (double)this.dn() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gy();
         }
      } else {
         super.b($$0);
      }
   }

   private void gy() {
      double $$0 = this.af.k() * 0.02;
      double $$1 = this.af.k() * 0.02;
      double $$2 = this.af.k() * 0.02;
      this.dS().a(lo.Q, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dzy.a gq() {
      return this.ci;
   }

   @Override
   public dzy.d gr() {
      return this.cj;
   }

   class a implements dzr {
      private final dzt b;
      private final int c;

      public a(final dzt $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dzt a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arj $$0, jo<dzp> $$1, dzp.a $$2, eyw $$3) {
         if ($$1.a(dzp.E)) {
            chj.this.b(jf.a((jy)$$3), true);
            return true;
         } else if ($$1.a(dzp.F)) {
            chj.this.b(jf.a((jy)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dzy.d {
      private static final int b = 16;
      private final dzt c = new dzn(chj.this, chj.this.cP());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dzt b() {
         return this.c;
      }

      @Override
      public boolean a(arj $$0, jf $$1, jo<dzp> $$2, dzp.a $$3) {
         if (chj.this.gd()) {
            return false;
         } else {
            Optional<jn> $$4 = chj.this.dY().c(cdq.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jn $$5 = $$4.get();
               return $$5.a().equals($$0.ag()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arj $$0, jf $$1, jo<dzp> $$2, @Nullable btr $$3, @Nullable btr $$4, float $$5) {
         if ($$2.a(dzp.H)) {
            chk.a(chj.this, new jf($$1));
         }
      }

      @Override
      public axl<dzp> c() {
         return axc.e;
      }
   }
}
