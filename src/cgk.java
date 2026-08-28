import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgk extends btx implements cmh, dxd {
   private static final Logger e = LogUtils.getLogger();
   private static final kd bY = new kd(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final cyr cc = cyr.a(cur.oC);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final akj<Boolean> cf = akn.a(cgk.class, akl.k);
   private static final akj<Boolean> cg = akn.a(cgk.class, akl.k);
   protected static final ImmutableList<cdz<? extends cdy<? super cgk>>> b = ImmutableList.of(cdz.c, cdz.d, cdz.f, cdz.b);
   protected static final ImmutableList<ccs<?>> c = ImmutableList.of(
      ccs.t, ccs.n, ccs.h, ccs.m, ccs.E, ccs.x, ccs.L, ccs.aM, ccs.aN, ccs.aO, ccs.aP, ccs.Z, new ccs[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dwr<dxd.b> ch;
   private dxd.a ci;
   private final dxd.d cj;
   private final dwr<cgk.a> ck;
   private final brc cl = new brc(1);
   @Nullable
   private iz cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cgk(bsz<? extends cgk> $$0, dbx $$1) {
      super($$0, $$1);
      this.bP = new bzm(this, 20, true);
      this.a_(this.fV());
      this.cj = new cgk.b();
      this.ci = new dxd.a();
      this.ch = new dwr<>(new dxd.b(this));
      this.ck = new dwr<>(new cgk.a(this.cj.b(), dwu.E.a().a()));
   }

   @Override
   protected buq.b<cgk> dT() {
      return buq.a(c, b);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgl.a(this.dT().a($$0));
   }

   @Override
   public buq<cgk> dS() {
      return (buq<cgk>)super.dS();
   }

   public static buv.a s() {
      return btq.A().a(buw.q, 20.0).a(buw.j, 0.1F).a(buw.r, 0.1F).a(buw.c, 2.0).a(buw.k, 48.0);
   }

   @Override
   protected cda b(dbx $$0) {
      ccy $$1 = new ccy(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a(evq $$0) {
      if (this.da()) {
         if (this.be()) {
            this.a(0.02F, $$0);
            this.a(btt.a, this.ds());
            this.h(this.ds().a(0.8F));
         } else if (this.bs()) {
            this.a(0.02F, $$0);
            this.a(btt.a, this.ds());
            this.h(this.ds().a(0.5));
         } else {
            this.a(this.fn(), $$0);
            this.a(btt.a, this.ds());
            this.h(this.ds().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      if ($$0.d() instanceof cmw $$2) {
         Optional<UUID> $$3 = this.dS().c(ccs.aM);
         if ($$3.isPresent() && $$2.cz().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dsb $$2, iz $$3) {
   }

   @Override
   protected avy v() {
      return this.c(bta.a) ? avz.a : avz.b;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.d;
   }

   @Override
   protected avy o_() {
      return avz.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("allayBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("allayActivityUpdate");
      cgl.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B && this.bD() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gq() && this.gv() && this.ai % 20 == 0) {
         this.w(false);
         this.cm = null;
      }

      this.gw();
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         this.cp = this.co;
         if (this.u()) {
            this.co = ayy.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = ayy.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.gq()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gr()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = ayy.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         dxd.c.a(this.dP(), this.ci, this.cj);
         if (this.gn()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fV() {
      return !this.gu() && this.u();
   }

   public boolean u() {
      return !this.b(bqs.a).e();
   }

   @Override
   public boolean f(cuo $$0) {
      return false;
   }

   private boolean gu() {
      return this.dS().a(ccs.aP, cct.a);
   }

   @Override
   protected bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      cuo $$3 = this.b(bqs.a);
      if (this.gq() && this.n($$2) && this.gz()) {
         this.gx();
         this.dP().a(this, (byte)18);
         this.dP().a($$0, this, avz.E, awa.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqt.a;
      } else if ($$3.e() && !$$2.e()) {
         cuo $$4 = $$2.c(1);
         this.a(bqs.a, $$4);
         this.a($$0, $$2);
         this.dP().a($$0, this, avz.e, awa.g, 2.0F, 1.0F);
         this.dS().a(ccs.aM, $$0.cz());
         return bqt.a;
      } else if (!$$3.e() && $$1 == bqs.a && $$2.e()) {
         this.a(bta.a, cuo.l);
         this.dP().a($$0, this, avz.f, awa.g, 2.0F, 1.0F);
         this.a(bqs.a);

         for (cuo $$5 : this.y().f()) {
            bvj.a(this, $$5, this.dn());
         }

         this.dS().b(ccs.aM);
         $$0.i($$3);
         return bqt.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(iz $$0, boolean $$1) {
      if ($$1) {
         if (!this.gq()) {
            this.cm = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.w(false);
      }
   }

   @Override
   public brc y() {
      return this.cl;
   }

   @Override
   protected kd V() {
      return bY;
   }

   @Override
   public boolean k(cuo $$0) {
      cuo $$1 = this.b(bqs.a);
      return !$$1.e() && this.dP().ab().b(dbt.c) && this.cl.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cuo $$0, cuo $$1) {
      return cuo.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cuo $$0, cuo $$1) {
      cwp $$2 = $$0.a(km.G);
      cwp $$3 = $$1.a(km.G);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cjg $$0) {
      cmh.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   public boolean aV() {
      return !this.aE();
   }

   @Override
   public void a(BiConsumer<dwr<?>, are> $$0) {
      if (this.dP() instanceof are $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean gq() {
      return this.ao.a(cf);
   }

   public void w(boolean $$0) {
      if (!this.dP().B && this.db() && (!$$0 || !this.gn())) {
         this.ao.a(cf, $$0);
      }
   }

   private boolean gv() {
      return this.cm == null || !this.cm.a(this.dn(), (double)dwu.E.a().a()) || !this.dP().a_(this.cm).a(dfa.dT);
   }

   public float G(float $$0) {
      return ayy.i($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gr() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return ayy.i($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cuo $$0, cuo $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eD() {
      super.eD();
      this.cl.f().forEach(this::b);
      cuo $$0 = this.a(bta.a);
      if (!$$0.e() && !daa.g($$0)) {
         this.b($$0);
         this.a(bta.a, cuo.l);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      this.b($$0, this.dR());
      dxd.a.a.encodeStart(vf.a, this.ci).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gz());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      if ($$0.b("listener", 10)) {
         dxd.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.ao.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean go() {
      return false;
   }

   private void gw() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dP().x_() && this.cn == 0L && !this.gz()) {
         this.ao.a(cg, true);
      }
   }

   private boolean n(cuo $$0) {
      return cc.a($$0);
   }

   private void gx() {
      cgk $$0 = bsz.a.a(this.dP());
      if ($$0 != null) {
         $$0.e(this.dn());
         $$0.fU();
         $$0.gy();
         this.gy();
         this.dP().b($$0);
      }
   }

   private void gy() {
      this.cn = 6000L;
      this.ao.a(cg, false);
   }

   private boolean gz() {
      return this.ao.a(cg);
   }

   private void a(cmw $$0, cuo $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public evq cM() {
      return new evq(0.0, (double)this.cL() * 0.6, (double)this.dj() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gA();
         }
      } else {
         super.b($$0);
      }
   }

   private void gA() {
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dP().a(li.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dxd.a gs() {
      return this.ci;
   }

   @Override
   public dxd.d gt() {
      return this.cj;
   }

   class a implements dww {
      private final dwy b;
      private final int c;

      public a(final dwy $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dwy a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(are $$0, ji<dwu> $$1, dwu.a $$2, evq $$3) {
         if ($$1.a(dwu.E)) {
            cgk.this.b(iz.a($$3), true);
            return true;
         } else if ($$1.a(dwu.F)) {
            cgk.this.b(iz.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dxd.d {
      private static final int b = 16;
      private final dwy c = new dws(cgk.this, cgk.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dwy b() {
         return this.c;
      }

      @Override
      public boolean a(are $$0, iz $$1, ji<dwu> $$2, dwu.a $$3) {
         if (cgk.this.gg()) {
            return false;
         } else {
            Optional<jh> $$4 = cgk.this.dS().c(ccs.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jh $$5 = $$4.get();
               return $$5.a().equals($$0.af()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(are $$0, iz $$1, ji<dwu> $$2, @Nullable bst $$3, @Nullable bst $$4, float $$5) {
         if ($$2.a(dwu.H)) {
            cgl.a(cgk.this, new iz($$1));
         }
      }

      @Override
      public axe<dwu> c() {
         return awv.e;
      }
   }
}
