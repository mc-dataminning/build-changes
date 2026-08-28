import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgj extends btw implements cmg, dxc {
   private static final Logger e = LogUtils.getLogger();
   private static final kd bY = new kd(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final cyq cc = cyq.a(cuq.oC);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final akj<Boolean> cf = akn.a(cgj.class, akl.k);
   private static final akj<Boolean> cg = akn.a(cgj.class, akl.k);
   protected static final ImmutableList<cdy<? extends cdx<? super cgj>>> b = ImmutableList.of(cdy.c, cdy.d, cdy.f, cdy.b);
   protected static final ImmutableList<ccr<?>> c = ImmutableList.of(
      ccr.t, ccr.n, ccr.h, ccr.m, ccr.E, ccr.x, ccr.L, ccr.aM, ccr.aN, ccr.aO, ccr.aP, ccr.Z, new ccr[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dwq<dxc.b> ch;
   private dxc.a ci;
   private final dxc.d cj;
   private final dwq<cgj.a> ck;
   private final brb cl = new brb(1);
   @Nullable
   private iz cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cgj(bsy<? extends cgj> $$0, dbw $$1) {
      super($$0, $$1);
      this.bP = new bzl(this, 20, true);
      this.a_(this.fV());
      this.cj = new cgj.b();
      this.ci = new dxc.a();
      this.ch = new dwq<>(new dxc.b(this));
      this.ck = new dwq<>(new cgj.a(this.cj.b(), dwt.E.a().a()));
   }

   @Override
   protected bup.b<cgj> dT() {
      return bup.a(c, b);
   }

   @Override
   protected bup<?> a(Dynamic<?> $$0) {
      return cgk.a(this.dT().a($$0));
   }

   @Override
   public bup<cgj> dS() {
      return (bup<cgj>)super.dS();
   }

   public static buu.a s() {
      return btp.A().a(buv.q, 20.0).a(buv.j, 0.1F).a(buv.r, 0.1F).a(buv.c, 2.0).a(buv.k, 48.0);
   }

   @Override
   protected ccz b(dbw $$0) {
      ccx $$1 = new ccx(this, $$0);
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
   public void a(evp $$0) {
      if (this.da()) {
         if (this.be()) {
            this.a(0.02F, $$0);
            this.a(bts.a, this.ds());
            this.h(this.ds().a(0.8F));
         } else if (this.bs()) {
            this.a(0.02F, $$0);
            this.a(bts.a, this.ds());
            this.h(this.ds().a(0.5));
         } else {
            this.a(this.fn(), $$0);
            this.a(bts.a, this.ds());
            this.h(this.ds().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      if ($$0.d() instanceof cmv $$2) {
         Optional<UUID> $$3 = this.dS().c(ccr.aM);
         if ($$3.isPresent() && $$2.cz().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dsa $$2, iz $$3) {
   }

   @Override
   protected avy v() {
      return this.c(bsz.a) ? avz.a : avz.b;
   }

   @Override
   protected avy d(brl $$0) {
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
      cgk.a(this);
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
            this.co = ayx.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = ayx.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.gq()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gr()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = ayx.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         dxc.c.a(this.dP(), this.ci, this.cj);
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
      return !this.b(bqr.a).e();
   }

   @Override
   public boolean f(cun $$0) {
      return false;
   }

   private boolean gu() {
      return this.dS().a(ccr.aP, ccs.a);
   }

   @Override
   protected bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      cun $$3 = this.b(bqr.a);
      if (this.gq() && this.n($$2) && this.gz()) {
         this.gx();
         this.dP().a(this, (byte)18);
         this.dP().a($$0, this, avz.E, awa.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqs.a;
      } else if ($$3.e() && !$$2.e()) {
         cun $$4 = $$2.c(1);
         this.a(bqr.a, $$4);
         this.a($$0, $$2);
         this.dP().a($$0, this, avz.e, awa.g, 2.0F, 1.0F);
         this.dS().a(ccr.aM, $$0.cz());
         return bqs.a;
      } else if (!$$3.e() && $$1 == bqr.a && $$2.e()) {
         this.a(bsz.a, cun.l);
         this.dP().a($$0, this, avz.f, awa.g, 2.0F, 1.0F);
         this.a(bqr.a);

         for (cun $$5 : this.y().f()) {
            bvi.a(this, $$5, this.dn());
         }

         this.dS().b(ccr.aM);
         $$0.i($$3);
         return bqs.a;
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
   public brb y() {
      return this.cl;
   }

   @Override
   protected kd V() {
      return bY;
   }

   @Override
   public boolean k(cun $$0) {
      cun $$1 = this.b(bqr.a);
      return !$$1.e() && this.dP().ab().b(dbs.c) && this.cl.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cun $$0, cun $$1) {
      return cun.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cun $$0, cun $$1) {
      cwo $$2 = $$0.a(km.F);
      cwo $$3 = $$1.a(km.F);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cjf $$0) {
      cmg.a(this, this, $$0);
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
   public void a(BiConsumer<dwq<?>, are> $$0) {
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
      return this.cm == null || !this.cm.a(this.dn(), (double)dwt.E.a().a()) || !this.dP().a_(this.cm).a(dez.dT);
   }

   public float G(float $$0) {
      return ayx.i($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gr() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return ayx.i($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cun $$0, cun $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eD() {
      super.eD();
      this.cl.f().forEach(this::b);
      cun $$0 = this.a(bsz.a);
      if (!$$0.e() && !czz.g($$0)) {
         this.b($$0);
         this.a(bsz.a, cun.l);
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
      dxc.a.a.encodeStart(vf.a, this.ci).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gz());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      if ($$0.b("listener", 10)) {
         dxc.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ci = $$0x);
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

   private boolean n(cun $$0) {
      return cc.a($$0);
   }

   private void gx() {
      cgj $$0 = bsy.a.a(this.dP());
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

   private void a(cmv $$0, cun $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public evp cM() {
      return new evp(0.0, (double)this.cL() * 0.6, (double)this.dj() * 0.1);
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
   public dxc.a gs() {
      return this.ci;
   }

   @Override
   public dxc.d gt() {
      return this.cj;
   }

   class a implements dwv {
      private final dwx b;
      private final int c;

      public a(final dwx $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dwx a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(are $$0, ji<dwt> $$1, dwt.a $$2, evp $$3) {
         if ($$1.a(dwt.E)) {
            cgj.this.b(iz.a($$3), true);
            return true;
         } else if ($$1.a(dwt.F)) {
            cgj.this.b(iz.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dxc.d {
      private static final int b = 16;
      private final dwx c = new dwr(cgj.this, cgj.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dwx b() {
         return this.c;
      }

      @Override
      public boolean a(are $$0, iz $$1, ji<dwt> $$2, dwt.a $$3) {
         if (cgj.this.gg()) {
            return false;
         } else {
            Optional<jh> $$4 = cgj.this.dS().c(ccr.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jh $$5 = $$4.get();
               return $$5.a().equals($$0.af()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(are $$0, iz $$1, ji<dwt> $$2, @Nullable bss $$3, @Nullable bss $$4, float $$5) {
         if ($$2.a(dwt.H)) {
            cgk.a(cgj.this, new iz($$1));
         }
      }

      @Override
      public axe<dwt> c() {
         return awv.e;
      }
   }
}
