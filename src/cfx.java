import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfx extends btk implements clv, dxp {
   private static final Logger e = LogUtils.getLogger();
   private static final ke ca = new ke(1, 1, 1);
   private static final int cb = 5;
   private static final float cc = 55.0F;
   private static final float cd = 15.0F;
   private static final cyf ce = cyf.a(cuf.oD);
   private static final int cf = 6000;
   private static final int cg = 3;
   private static final ajp<Boolean> ch = ajt.a(cfx.class, ajr.k);
   private static final ajp<Boolean> ci = ajt.a(cfx.class, ajr.k);
   protected static final ImmutableList<cdm<? extends cdl<? super cfx>>> b = ImmutableList.of(cdm.c, cdm.d, cdm.f, cdm.b);
   protected static final ImmutableList<ccf<?>> c = ImmutableList.of(
      ccf.t, ccf.n, ccf.h, ccf.m, ccf.E, ccf.x, ccf.L, ccf.aM, ccf.aN, ccf.aO, ccf.aP, ccf.Z, new ccf[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dxd<dxp.b> cj;
   private dxp.a ck;
   private final dxp.d cl;
   private final dxd<cfx.a> cm;
   private final bqp cn = new bqp(1);
   @Nullable
   private ja co;
   private long cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;

   public cfx(bsm<? extends cfx> $$0, dcf $$1) {
      super($$0, $$1);
      this.bR = new byz(this, 20, true);
      this.a_(this.fS());
      this.cl = new cfx.b();
      this.ck = new dxp.a();
      this.cj = new dxd<>(new dxp.b(this));
      this.cm = new dxd<>(new cfx.a(this.cl.b(), dxg.E.a().a()));
   }

   @Override
   protected bud.b<cfx> dV() {
      return bud.a(c, b);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return cfy.a(this.dV().a($$0));
   }

   @Override
   public bud<cfx> dU() {
      return (bud<cfx>)super.dU();
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 20.0).a(buj.l, 0.1F).a(buj.v, 0.1F).a(buj.c, 2.0).a(buj.m, 48.0);
   }

   @Override
   protected ccn b(dcf $$0) {
      ccl $$1 = new ccl(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
   }

   @Override
   public void a(ewf $$0) {
      if (this.db()) {
         if (this.bf()) {
            this.a(0.02F, $$0);
            this.a(btg.a, this.dt());
            this.i(this.dt().a(0.8F));
         } else if (this.bt()) {
            this.a(0.02F, $$0);
            this.a(btg.a, this.dt());
            this.i(this.dt().a(0.5));
         } else {
            this.a(this.fk(), $$0);
            this.a(btg.a, this.dt());
            this.i(this.dt().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if ($$0.d() instanceof cmk $$2) {
         Optional<UUID> $$3 = this.dU().c(ccf.aM);
         if ($$3.isPresent() && $$2.cA().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dsk $$2, ja $$3) {
   }

   @Override
   protected avg v() {
      return this.c(bsn.a) ? avh.a : avh.b;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.d;
   }

   @Override
   protected avg o_() {
      return avh.c;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("allayBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("allayActivityUpdate");
      cfy.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dQ().B && this.bE() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.go() && this.gt() && this.ai % 20 == 0) {
         this.w(false);
         this.co = null;
      }

      this.gu();
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B) {
         this.cr = this.cq;
         if (this.u()) {
            this.cq = ayg.a(this.cq + 1.0F, 0.0F, 5.0F);
         } else {
            this.cq = ayg.a(this.cq - 1.0F, 0.0F, 5.0F);
         }

         if (this.go()) {
            this.cs++;
            this.cu = this.ct;
            if (this.gp()) {
               this.ct++;
            } else {
               this.ct--;
            }

            this.ct = ayg.a(this.ct, 0.0F, 15.0F);
         } else {
            this.cs = 0.0F;
            this.ct = 0.0F;
            this.cu = 0.0F;
         }
      } else {
         dxp.c.a(this.dQ(), this.ck, this.cl);
         if (this.gl()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fS() {
      return !this.gs() && this.u();
   }

   public boolean u() {
      return !this.b(bqf.a).e();
   }

   @Override
   public boolean f(cuc $$0) {
      return false;
   }

   private boolean gs() {
      return this.dU().a(ccf.aP, ccg.a);
   }

   @Override
   protected bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      cuc $$3 = this.b(bqf.a);
      if (this.go() && this.n($$2) && this.gx()) {
         this.gv();
         this.dQ().a(this, (byte)18);
         this.dQ().a($$0, this, avh.E, avi.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqg.a;
      } else if ($$3.e() && !$$2.e()) {
         cuc $$4 = $$2.c(1);
         this.a(bqf.a, $$4);
         this.a($$0, $$2);
         this.dQ().a($$0, this, avh.e, avi.g, 2.0F, 1.0F);
         this.dU().a(ccf.aM, $$0.cA());
         return bqg.a;
      } else if (!$$3.e() && $$1 == bqf.a && $$2.e()) {
         this.a(bsn.a, cuc.l);
         this.dQ().a($$0, this, avh.f, avi.g, 2.0F, 1.0F);
         this.a(bqf.a);

         for (cuc $$5 : this.y().f()) {
            buw.a(this, $$5, this.do());
         }

         this.dU().b(ccf.aM);
         $$0.i($$3);
         return bqg.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ja $$0, boolean $$1) {
      if ($$1) {
         if (!this.go()) {
            this.co = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.co) || this.co == null) {
         this.co = null;
         this.w(false);
      }
   }

   @Override
   public bqp y() {
      return this.cn;
   }

   @Override
   protected ke V() {
      return ca;
   }

   @Override
   public boolean k(cuc $$0) {
      cuc $$1 = this.b(bqf.a);
      return !$$1.e() && this.dQ().ab().b(dcb.c) && this.cn.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cuc $$0, cuc $$1) {
      return cuc.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cuc $$0, cuc $$1) {
      cwd $$2 = $$0.a(kn.G);
      cwd $$3 = $$1.a(kn.G);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(ciu $$0) {
      clv.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public boolean aW() {
      return !this.aF();
   }

   @Override
   public void a(BiConsumer<dxd<?>, aqm> $$0) {
      if (this.dQ() instanceof aqm $$1) {
         $$0.accept(this.cj, $$1);
         $$0.accept(this.cm, $$1);
      }
   }

   public boolean go() {
      return this.ao.a(ch);
   }

   public void w(boolean $$0) {
      if (!this.dQ().B && this.dc() && (!$$0 || !this.gl())) {
         this.ao.a(ch, $$0);
      }
   }

   private boolean gt() {
      return this.co == null || !this.co.a(this.do(), (double)dxg.E.a().a()) || !this.dQ().a_(this.co).a(dfj.dT);
   }

   public float H(float $$0) {
      return ayg.i($$0, this.cr, this.cq) / 5.0F;
   }

   public boolean gp() {
      float $$0 = this.cs % 55.0F;
      return $$0 < 15.0F;
   }

   public float I(float $$0) {
      return ayg.i($$0, this.cu, this.ct) / 15.0F;
   }

   @Override
   public boolean a(cuc $$0, cuc $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eA() {
      super.eA();
      this.cn.f().forEach(this::b);
      cuc $$0 = this.a(bsn.a);
      if (!$$0.e() && !czn.a($$0, czm.D)) {
         this.b($$0);
         this.a(bsn.a, cuc.l);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.b($$0, this.dS());
      dxp.a.a.encodeStart(ul.a, this.ck).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cp);
      $$0.a("CanDuplicate", this.gx());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0, this.dS());
      if ($$0.b("listener", 10)) {
         dxp.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ck = $$0x);
      }

      this.cp = (long)$$0.h("DuplicationCooldown");
      this.ao.a(ci, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gm() {
      return false;
   }

   private void gu() {
      if (this.cp > 0L) {
         this.cp--;
      }

      if (!this.dQ().x_() && this.cp == 0L && !this.gx()) {
         this.ao.a(ci, true);
      }
   }

   private boolean n(cuc $$0) {
      return ce.a($$0);
   }

   private void gv() {
      cfx $$0 = bsm.a.a(this.dQ());
      if ($$0 != null) {
         $$0.e(this.do());
         $$0.fR();
         $$0.gw();
         this.gw();
         this.dQ().b($$0);
      }
   }

   private void gw() {
      this.cp = 6000L;
      this.ao.a(ci, false);
   }

   private boolean gx() {
      return this.ao.a(ci);
   }

   private void a(cmk $$0, cuc $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)this.cM() * 0.6, (double)this.dk() * 0.1);
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
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dQ().a(lj.Q, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dxp.a gq() {
      return this.ck;
   }

   @Override
   public dxp.d gr() {
      return this.cl;
   }

   class a implements dxi {
      private final dxk b;
      private final int c;

      public a(final dxk $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dxk a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aqm $$0, jj<dxg> $$1, dxg.a $$2, ewf $$3) {
         if ($$1.a(dxg.E)) {
            cfx.this.b(ja.a($$3), true);
            return true;
         } else if ($$1.a(dxg.F)) {
            cfx.this.b(ja.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dxp.d {
      private static final int b = 16;
      private final dxk c = new dxe(cfx.this, cfx.this.cM());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxk b() {
         return this.c;
      }

      @Override
      public boolean a(aqm $$0, ja $$1, jj<dxg> $$2, dxg.a $$3) {
         if (cfx.this.gd()) {
            return false;
         } else {
            Optional<ji> $$4 = cfx.this.dU().c(ccf.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ji $$5 = $$4.get();
               return $$5.a().equals($$0.af()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aqm $$0, ja $$1, jj<dxg> $$2, @Nullable bsg $$3, @Nullable bsg $$4, float $$5) {
         if ($$2.a(dxg.H)) {
            cfy.a(cfx.this, new ja($$1));
         }
      }

      @Override
      public awm<dxg> c() {
         return awd.e;
      }
   }
}
