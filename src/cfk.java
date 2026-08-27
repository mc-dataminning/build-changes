import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfk extends bsx implements clh, dwd {
   private static final Logger e = LogUtils.getLogger();
   private static final js bY = new js(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final cxr cc = cxr.a(ctr.oC);
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final ajr<Boolean> cf = ajv.a(cfk.class, ajt.k);
   private static final ajr<Boolean> cg = ajv.a(cfk.class, ajt.k);
   protected static final ImmutableList<ccz<? extends ccy<? super cfk>>> b = ImmutableList.of(ccz.c, ccz.d, ccz.f, ccz.b);
   protected static final ImmutableList<cbs<?>> c = ImmutableList.of(
      cbs.t, cbs.n, cbs.h, cbs.m, cbs.E, cbs.x, cbs.L, cbs.aM, cbs.aN, cbs.aO, cbs.aP, cbs.Z, new cbs[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dvr<dwd.b> ch;
   private dwd.a ci;
   private final dwd.d cj;
   private final dvr<cfk.a> ck;
   private final bqd cl = new bqd(1);
   @Nullable
   private io cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cfk(bsa<? extends cfk> $$0, dax $$1) {
      super($$0, $$1);
      this.bP = new bym(this, 20, true);
      this.a_(this.fU());
      this.cj = new cfk.b();
      this.ci = new dwd.a();
      this.ch = new dvr<>(new dwd.b(this));
      this.ck = new dvr<>(new cfk.a(this.cj.b(), dvu.E.a().a()));
   }

   @Override
   protected btq.b<cfk> dT() {
      return btq.a(c, b);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return cfl.a(this.dT().a($$0));
   }

   @Override
   public btq<cfk> dS() {
      return (btq<cfk>)super.dS();
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 20.0).a(btw.j, 0.1F).a(btw.r, 0.1F).a(btw.c, 2.0).a(btw.k, 48.0);
   }

   @Override
   protected cca b(dax $$0) {
      cby $$1 = new cby(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a(euk $$0) {
      if (this.da()) {
         if (this.be()) {
            this.a(0.02F, $$0);
            this.a(bst.a, this.ds());
            this.g(this.ds().a(0.8F));
         } else if (this.bs()) {
            this.a(0.02F, $$0);
            this.a(bst.a, this.ds());
            this.g(this.ds().a(0.5));
         } else {
            this.a(this.fn(), $$0);
            this.a(bst.a, this.ds());
            this.g(this.ds().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if ($$0.d() instanceof clw $$2) {
         Optional<UUID> $$3 = this.dS().c(cbs.aM);
         if ($$3.isPresent() && $$2.cz().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(io $$0, drb $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, drb $$2, io $$3) {
   }

   @Override
   protected avg v() {
      return this.c(bsb.a) ? avh.a : avh.b;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.d;
   }

   @Override
   protected avg o_() {
      return avh.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void Y() {
      this.dP().af().a("allayBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("allayActivityUpdate");
      cfl.a(this);
      this.dP().af().c();
      super.Y();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B && this.bD() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gp() && this.gu() && this.ai % 20 == 0) {
         this.w(false);
         this.cm = null;
      }

      this.gv();
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         this.cp = this.co;
         if (this.u()) {
            this.co = ayd.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = ayd.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.gp()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gq()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = ayd.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         dwd.c.a(this.dP(), this.ci, this.cj);
         if (this.gm()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fU() {
      return !this.gt() && this.u();
   }

   public boolean u() {
      return !this.b(bpt.a).e();
   }

   @Override
   public boolean f(cto $$0) {
      return false;
   }

   private boolean gt() {
      return this.dS().a(cbs.aP, cbt.a);
   }

   @Override
   protected bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      cto $$3 = this.b(bpt.a);
      if (this.gp() && this.n($$2) && this.gy()) {
         this.gw();
         this.dP().a(this, (byte)18);
         this.dP().a($$0, this, avh.E, avi.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bpu.a;
      } else if ($$3.e() && !$$2.e()) {
         cto $$4 = $$2.c(1);
         this.a(bpt.a, $$4);
         this.a($$0, $$2);
         this.dP().a($$0, this, avh.e, avi.g, 2.0F, 1.0F);
         this.dS().a(cbs.aM, $$0.cz());
         return bpu.a;
      } else if (!$$3.e() && $$1 == bpt.a && $$2.e()) {
         this.a(bsb.a, cto.i);
         this.dP().a($$0, this, avh.f, avi.g, 2.0F, 1.0F);
         this.a(bpt.a);

         for (cto $$5 : this.y().f()) {
            buj.a(this, $$5, this.dn());
         }

         this.dS().b(cbs.aM);
         $$0.i($$3);
         return bpu.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(io $$0, boolean $$1) {
      if ($$1) {
         if (!this.gp()) {
            this.cm = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.w(false);
      }
   }

   @Override
   public bqd y() {
      return this.cl;
   }

   @Override
   protected js U() {
      return bY;
   }

   @Override
   public boolean k(cto $$0) {
      cto $$1 = this.b(bpt.a);
      return !$$1.e() && this.dP().aa().b(dat.c) && this.cl.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cto $$0, cto $$1) {
      return cto.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cto $$0, cto $$1) {
      cvp $$2 = $$0.a(kb.F);
      cvp $$3 = $$1.a(kb.F);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cig $$0) {
      clh.a(this, this, $$0);
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   @Override
   public boolean aV() {
      return !this.aE();
   }

   @Override
   public void a(BiConsumer<dvr<?>, aqm> $$0) {
      if (this.dP() instanceof aqm $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean gp() {
      return this.ao.a(cf);
   }

   public void w(boolean $$0) {
      if (!this.dP().B && this.db() && (!$$0 || !this.gm())) {
         this.ao.a(cf, $$0);
      }
   }

   private boolean gu() {
      return this.cm == null || !this.cm.a(this.dn(), (double)dvu.E.a().a()) || !this.dP().a_(this.cm).a(dea.dT);
   }

   public float G(float $$0) {
      return ayd.i($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gq() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return ayd.i($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cto $$0, cto $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eD() {
      super.eD();
      this.cl.f().forEach(this::b);
      cto $$0 = this.a(bsb.a);
      if (!$$0.e() && !cza.g($$0)) {
         this.b($$0);
         this.a(bsb.a, cto.i);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      this.b($$0, this.dR());
      dwd.a.a.encodeStart(ur.a, this.ci).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gy());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      if ($$0.b("listener", 10)) {
         dwd.a.a.parse(new Dynamic(ur.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.ao.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gn() {
      return false;
   }

   private void gv() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dP().x_() && this.cn == 0L && !this.gy()) {
         this.ao.a(cg, true);
      }
   }

   private boolean n(cto $$0) {
      return cc.a($$0);
   }

   private void gw() {
      cfk $$0 = bsa.a.a(this.dP());
      if ($$0 != null) {
         $$0.e(this.dn());
         $$0.fT();
         $$0.gx();
         this.gx();
         this.dP().b($$0);
      }
   }

   private void gx() {
      this.cn = 6000L;
      this.ao.a(cg, false);
   }

   private boolean gy() {
      return this.ao.a(cg);
   }

   private void a(clw $$0, cto $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public euk cM() {
      return new euk(0.0, (double)this.cL() * 0.6, (double)this.dj() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gz();
         }
      } else {
         super.b($$0);
      }
   }

   private void gz() {
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dP().a(ky.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dwd.a gr() {
      return this.ci;
   }

   @Override
   public dwd.d gs() {
      return this.cj;
   }

   class a implements dvw {
      private final dvy b;
      private final int c;

      public a(dvy $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dvy a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aqm $$0, ix<dvu> $$1, dvu.a $$2, euk $$3) {
         if ($$1.a(dvu.E)) {
            cfk.this.b(io.a($$3), true);
            return true;
         } else if ($$1.a(dvu.F)) {
            cfk.this.b(io.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dwd.d {
      private static final int b = 16;
      private final dvy c = new dvs(cfk.this, cfk.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dvy b() {
         return this.c;
      }

      @Override
      public boolean a(aqm $$0, io $$1, ix<dvu> $$2, dvu.a $$3) {
         if (cfk.this.gf()) {
            return false;
         } else {
            Optional<iw> $$4 = cfk.this.dS().c(cbs.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               iw $$5 = $$4.get();
               return $$5.a().equals($$0.ae()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aqm $$0, io $$1, ix<dvu> $$2, @Nullable bru $$3, @Nullable bru $$4, float $$5) {
         if ($$2.a(dvu.H)) {
            cfl.a(cfk.this, new io($$1));
         }
      }

      @Override
      public awl<dvu> c() {
         return awc.e;
      }
   }
}
