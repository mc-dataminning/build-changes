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

public class chb extends bun implements cna, dzg {
   private static final Logger e = LogUtils.getLogger();
   private static final ki bZ = new ki(1, 1, 1);
   private static final int ca = 5;
   private static final float cb = 55.0F;
   private static final float cc = 15.0F;
   private static final Predicate<cvl> cd = $$0 -> $$0.a(cvo.oE);
   private static final int ce = 6000;
   private static final int cf = 3;
   private static final akg<Boolean> cg = akk.a(chb.class, aki.k);
   private static final akg<Boolean> ch = akk.a(chb.class, aki.k);
   protected static final ImmutableList<cep<? extends ceo<? super chb>>> b = ImmutableList.of(cep.c, cep.d, cep.f, cep.b);
   protected static final ImmutableList<cdi<?>> c = ImmutableList.of(
      cdi.t, cdi.n, cdi.h, cdi.m, cdi.E, cdi.x, cdi.L, cdi.aM, cdi.aN, cdi.aO, cdi.aP, cdi.Z, new cdi[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dyu<dzg.b> ci;
   private dzg.a cj;
   private final dzg.d ck;
   private final dyu<chb.a> cl;
   private final brr cm = new brr(1);
   @Nullable
   private je cn;
   private long co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;

   public chb(btq<? extends chb> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new cac(this, 20, true);
      this.a_(this.fW());
      this.ck = new chb.b();
      this.cj = new dzg.a();
      this.ci = new dyu<>(new dzg.b(this));
      this.cl = new dyu<>(new chb.a(this.ck.b(), dyx.E.a().a()));
   }

   @Override
   protected bvg.b<chb> dY() {
      return bvg.a(c, b);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return chc.a(this.dY().a($$0));
   }

   @Override
   public bvg<chb> dX() {
      return (bvg<chb>)super.dX();
   }

   public static bvl.a q() {
      return buh.E().a(bvm.s, 20.0).a(bvm.l, 0.1F).a(bvm.v, 0.1F).a(bvm.c, 2.0);
   }

   @Override
   protected cdq b(dds $$0) {
      cdo $$1 = new cdo(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cg, false);
      $$0.a(ch, true);
   }

   @Override
   public void a_(eye $$0) {
      if (this.de()) {
         if (this.bi()) {
            this.a(0.02F, $$0);
            this.a(buj.a, this.dv());
            this.h(this.dv().c(0.8F));
         } else if (this.bw()) {
            this.a(0.02F, $$0);
            this.a(buj.a, this.dv());
            this.h(this.dv().c(0.5));
         } else {
            this.a(this.fm(), $$0);
            this.a(buj.a, this.dv());
            this.h(this.dv().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if ($$0.d() instanceof cnp $$2) {
         Optional<UUID> $$3 = this.dX().c(cdi.aM);
         if ($$3.isPresent() && $$2.cD().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(je $$0, dua $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dua $$2, je $$3) {
   }

   @Override
   protected awc w() {
      return this.d(btr.a) ? awd.a : awd.b;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.d;
   }

   @Override
   protected awc n_() {
      return awd.c;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("allayBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("allayActivityUpdate");
      chc.a(this);
      this.dS().ah().c();
      super.ad();
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B && this.bI() && this.ag % 10 == 0) {
         this.c(1.0F);
      }

      if (this.go() && this.gt() && this.ag % 20 == 0) {
         this.x(false);
         this.cn = null;
      }

      this.gu();
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         this.cq = this.cp;
         if (this.t()) {
            this.cp = azc.a(this.cp + 1.0F, 0.0F, 5.0F);
         } else {
            this.cp = azc.a(this.cp - 1.0F, 0.0F, 5.0F);
         }

         if (this.go()) {
            this.cr++;
            this.ct = this.cs;
            if (this.gp()) {
               this.cs++;
            } else {
               this.cs--;
            }

            this.cs = azc.a(this.cs, 0.0F, 15.0F);
         } else {
            this.cr = 0.0F;
            this.cs = 0.0F;
            this.ct = 0.0F;
         }
      } else {
         dzg.c.a(this.dS(), this.cj, this.ck);
         if (this.gl()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fW() {
      return !this.gs() && this.t();
   }

   public boolean t() {
      return !this.b(brj.a).f();
   }

   @Override
   public boolean g(cvl $$0) {
      return false;
   }

   private boolean gs() {
      return this.dX().a(cdi.aP, cdj.a);
   }

   @Override
   protected brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      cvl $$3 = this.b(brj.a);
      if (this.go() && this.o($$2) && this.gx()) {
         this.gv();
         this.dS().a(this, (byte)18);
         this.dS().a($$0, this, awd.E, awe.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return brk.a;
      } else if ($$3.f() && !$$2.f()) {
         cvl $$4 = $$2.c(1);
         this.a(brj.a, $$4);
         this.a($$0, $$2);
         this.dS().a($$0, this, awd.e, awe.g, 2.0F, 1.0F);
         this.dX().a(cdi.aM, $$0.cD());
         return brk.a;
      } else if (!$$3.f() && $$1 == brj.a && $$2.f()) {
         this.a(btr.a, cvl.k);
         this.dS().a($$0, this, awd.f, awe.g, 2.0F, 1.0F);
         this.a(brj.a);

         for (cvl $$5 : this.y().f()) {
            bvz.a(this, $$5, this.dq());
         }

         this.dX().b(cdi.aM);
         $$0.k($$3);
         return brk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(je $$0, boolean $$1) {
      if ($$1) {
         if (!this.go()) {
            this.cn = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cn) || this.cn == null) {
         this.cn = null;
         this.x(false);
      }
   }

   @Override
   public brr y() {
      return this.cm;
   }

   @Override
   protected ki Z() {
      return bZ;
   }

   @Override
   public boolean l(cvl $$0) {
      cvl $$1 = this.b(brj.a);
      return !$$1.f() && this.dS().ac().b(ddo.c) && this.cm.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cvl $$0, cvl $$1) {
      return cvl.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cvl $$0, cvl $$1) {
      cxn $$2 = $$0.a(kr.I);
      cxn $$3 = $$1.a(kr.I);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cjz $$0) {
      cna.a(this, this, $$0);
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public boolean aZ() {
      return !this.aH();
   }

   @Override
   public void a(BiConsumer<dyu<?>, arg> $$0) {
      if (this.dS() instanceof arg $$1) {
         $$0.accept(this.ci, $$1);
         $$0.accept(this.cl, $$1);
      }
   }

   public boolean go() {
      return this.am.a(cg);
   }

   public void x(boolean $$0) {
      if (!this.dS().B && this.df() && (!$$0 || !this.gl())) {
         this.am.a(cg, $$0);
      }
   }

   private boolean gt() {
      return this.cn == null || !this.cn.a(this.dq(), (double)dyx.E.a().a()) || !this.dS().a_(this.cn).a(dgx.dT);
   }

   public float J(float $$0) {
      return azc.h($$0, this.cq, this.cp) / 5.0F;
   }

   public boolean gp() {
      float $$0 = this.cr % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azc.h($$0, this.ct, this.cs) / 15.0F;
   }

   @Override
   public boolean a(cvl $$0, cvl $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eD() {
      super.eD();
      this.cm.f().forEach(this::b);
      cvl $$0 = this.a(btr.a);
      if (!$$0.f() && !day.a($$0, dax.D)) {
         this.b($$0);
         this.a(btr.a, cvl.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.b($$0, this.dU());
      akz<vc> $$1 = this.dU().a(ut.a);
      dzg.a.a
         .encodeStart($$1, this.cj)
         .resultOrPartial($$0x -> e.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.co);
      $$0.a("CanDuplicate", this.gx());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a($$0, this.dU());
      akz<vc> $$1 = this.dU().a(ut.a);
      if ($$0.b("listener", 10)) {
         dzg.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> e.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.cj = $$0x);
      }

      this.co = (long)$$0.h("DuplicationCooldown");
      this.am.a(ch, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gm() {
      return false;
   }

   private void gu() {
      if (this.co > 0L) {
         this.co--;
      }

      if (!this.dS().w_() && this.co == 0L && !this.gx()) {
         this.am.a(ch, true);
      }
   }

   private boolean o(cvl $$0) {
      return cd.test($$0);
   }

   private void gv() {
      chb $$0 = btq.a.a(this.dS(), btp.e);
      if ($$0 != null) {
         $$0.e(this.dq());
         $$0.fV();
         $$0.gw();
         this.gw();
         this.dS().b($$0);
      }
   }

   private void gw() {
      this.co = 6000L;
      this.am.a(ch, false);
   }

   private boolean gx() {
      return this.am.a(ch);
   }

   private void a(cnp $$0, cvl $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)this.cP() * 0.6, (double)this.dn() * 0.1);
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
      this.dS().a(ln.Q, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dzg.a gq() {
      return this.cj;
   }

   @Override
   public dzg.d gr() {
      return this.ck;
   }

   class a implements dyz {
      private final dzb b;
      private final int c;

      public a(final dzb $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dzb a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arg $$0, jn<dyx> $$1, dyx.a $$2, eye $$3) {
         if ($$1.a(dyx.E)) {
            chb.this.b(je.a((jx)$$3), true);
            return true;
         } else if ($$1.a(dyx.F)) {
            chb.this.b(je.a((jx)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dzg.d {
      private static final int b = 16;
      private final dzb c = new dyv(chb.this, chb.this.cP());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dzb b() {
         return this.c;
      }

      @Override
      public boolean a(arg $$0, je $$1, jn<dyx> $$2, dyx.a $$3) {
         if (chb.this.gd()) {
            return false;
         } else {
            Optional<jm> $$4 = chb.this.dX().c(cdi.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jm $$5 = $$4.get();
               return $$5.a().equals($$0.ag()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arg $$0, je $$1, jn<dyx> $$2, @Nullable btj $$3, @Nullable btj $$4, float $$5) {
         if ($$2.a(dyx.H)) {
            chc.a(chb.this, new je($$1));
         }
      }

      @Override
      public axi<dyx> c() {
         return awz.e;
      }
   }
}
