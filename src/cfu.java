import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfu extends bth implements cls, dxj {
   private static final Logger e = LogUtils.getLogger();
   private static final ke ca = new ke(1, 1, 1);
   private static final int cb = 5;
   private static final float cc = 55.0F;
   private static final float cd = 15.0F;
   private static final cyd ce = cyd.a(cud.oC);
   private static final int cf = 6000;
   private static final int cg = 3;
   private static final ajp<Boolean> ch = ajt.a(cfu.class, ajr.k);
   private static final ajp<Boolean> ci = ajt.a(cfu.class, ajr.k);
   protected static final ImmutableList<cdj<? extends cdi<? super cfu>>> b = ImmutableList.of(cdj.c, cdj.d, cdj.f, cdj.b);
   protected static final ImmutableList<ccc<?>> c = ImmutableList.of(
      ccc.t, ccc.n, ccc.h, ccc.m, ccc.E, ccc.x, ccc.L, ccc.aM, ccc.aN, ccc.aO, ccc.aP, ccc.Z, new ccc[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dwx<dxj.b> cj;
   private dxj.a ck;
   private final dxj.d cl;
   private final dwx<cfu.a> cm;
   private final bqm cn = new bqm(1);
   @Nullable
   private ja co;
   private long cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;

   public cfu(bsj<? extends cfu> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new byw(this, 20, true);
      this.a_(this.fR());
      this.cl = new cfu.b();
      this.ck = new dxj.a();
      this.cj = new dwx<>(new dxj.b(this));
      this.cm = new dwx<>(new cfu.a(this.cl.b(), dxa.E.a().a()));
   }

   @Override
   protected bua.b<cfu> dU() {
      return bua.a(c, b);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return cfv.a(this.dU().a($$0));
   }

   @Override
   public bua<cfu> dT() {
      return (bua<cfu>)super.dT();
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 20.0).a(bug.l, 0.1F).a(bug.v, 0.1F).a(bug.c, 2.0).a(bug.m, 48.0);
   }

   @Override
   protected cck b(dcd $$0) {
      cci $$1 = new cci(this, $$0);
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
   public void a(evz $$0) {
      if (this.da()) {
         if (this.be()) {
            this.a(0.02F, $$0);
            this.a(btd.a, this.ds());
            this.h(this.ds().a(0.8F));
         } else if (this.bs()) {
            this.a(0.02F, $$0);
            this.a(btd.a, this.ds());
            this.h(this.ds().a(0.5));
         } else {
            this.a(this.fj(), $$0);
            this.a(btd.a, this.ds());
            this.h(this.ds().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if ($$0.d() instanceof cmh $$2) {
         Optional<UUID> $$3 = this.dT().c(ccc.aM);
         if ($$3.isPresent() && $$2.cz().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dsh $$2, ja $$3) {
   }

   @Override
   protected ave v() {
      return this.c(bsk.a) ? avf.a : avf.b;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.d;
   }

   @Override
   protected ave o_() {
      return avf.c;
   }

   @Override
   protected float fa() {
      return 0.4F;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("allayBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("allayActivityUpdate");
      cfv.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B && this.bD() && this.ai % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gn() && this.gs() && this.ai % 20 == 0) {
         this.w(false);
         this.co = null;
      }

      this.gt();
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         this.cr = this.cq;
         if (this.u()) {
            this.cq = aye.a(this.cq + 1.0F, 0.0F, 5.0F);
         } else {
            this.cq = aye.a(this.cq - 1.0F, 0.0F, 5.0F);
         }

         if (this.gn()) {
            this.cs++;
            this.cu = this.ct;
            if (this.go()) {
               this.ct++;
            } else {
               this.ct--;
            }

            this.ct = aye.a(this.ct, 0.0F, 15.0F);
         } else {
            this.cs = 0.0F;
            this.ct = 0.0F;
            this.cu = 0.0F;
         }
      } else {
         dxj.c.a(this.dP(), this.ck, this.cl);
         if (this.gk()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fR() {
      return !this.gr() && this.u();
   }

   public boolean u() {
      return !this.b(bqc.a).e();
   }

   @Override
   public boolean f(cua $$0) {
      return false;
   }

   private boolean gr() {
      return this.dT().a(ccc.aP, ccd.a);
   }

   @Override
   protected bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      cua $$3 = this.b(bqc.a);
      if (this.gn() && this.n($$2) && this.gw()) {
         this.gu();
         this.dP().a(this, (byte)18);
         this.dP().a($$0, this, avf.E, avg.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqd.a;
      } else if ($$3.e() && !$$2.e()) {
         cua $$4 = $$2.c(1);
         this.a(bqc.a, $$4);
         this.a($$0, $$2);
         this.dP().a($$0, this, avf.e, avg.g, 2.0F, 1.0F);
         this.dT().a(ccc.aM, $$0.cz());
         return bqd.a;
      } else if (!$$3.e() && $$1 == bqc.a && $$2.e()) {
         this.a(bsk.a, cua.l);
         this.dP().a($$0, this, avf.f, avg.g, 2.0F, 1.0F);
         this.a(bqc.a);

         for (cua $$5 : this.y().f()) {
            but.a(this, $$5, this.dn());
         }

         this.dT().b(ccc.aM);
         $$0.i($$3);
         return bqd.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ja $$0, boolean $$1) {
      if ($$1) {
         if (!this.gn()) {
            this.co = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.co) || this.co == null) {
         this.co = null;
         this.w(false);
      }
   }

   @Override
   public bqm y() {
      return this.cn;
   }

   @Override
   protected ke V() {
      return ca;
   }

   @Override
   public boolean k(cua $$0) {
      cua $$1 = this.b(bqc.a);
      return !$$1.e() && this.dP().ab().b(dbz.c) && this.cn.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cua $$0, cua $$1) {
      return cua.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cua $$0, cua $$1) {
      cwb $$2 = $$0.a(kn.G);
      cwb $$3 = $$1.a(kn.G);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cir $$0) {
      cls.a(this, this, $$0);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public boolean aV() {
      return !this.aE();
   }

   @Override
   public void a(BiConsumer<dwx<?>, aqk> $$0) {
      if (this.dP() instanceof aqk $$1) {
         $$0.accept(this.cj, $$1);
         $$0.accept(this.cm, $$1);
      }
   }

   public boolean gn() {
      return this.ao.a(ch);
   }

   public void w(boolean $$0) {
      if (!this.dP().B && this.db() && (!$$0 || !this.gk())) {
         this.ao.a(ch, $$0);
      }
   }

   private boolean gs() {
      return this.co == null || !this.co.a(this.dn(), (double)dxa.E.a().a()) || !this.dP().a_(this.co).a(dfh.dT);
   }

   public float H(float $$0) {
      return aye.i($$0, this.cr, this.cq) / 5.0F;
   }

   public boolean go() {
      float $$0 = this.cs % 55.0F;
      return $$0 < 15.0F;
   }

   public float I(float $$0) {
      return aye.i($$0, this.cu, this.ct) / 15.0F;
   }

   @Override
   public boolean a(cua $$0, cua $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ez() {
      super.ez();
      this.cn.f().forEach(this::b);
      cua $$0 = this.a(bsk.a);
      if (!$$0.e() && !czl.a($$0, czk.E)) {
         this.b($$0);
         this.a(bsk.a, cua.l);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.b($$0, this.dR());
      dxj.a.a.encodeStart(ul.a, this.ck).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cp);
      $$0.a("CanDuplicate", this.gw());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      if ($$0.b("listener", 10)) {
         dxj.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ck = $$0x);
      }

      this.cp = (long)$$0.h("DuplicationCooldown");
      this.ao.a(ci, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gl() {
      return false;
   }

   private void gt() {
      if (this.cp > 0L) {
         this.cp--;
      }

      if (!this.dP().x_() && this.cp == 0L && !this.gw()) {
         this.ao.a(ci, true);
      }
   }

   private boolean n(cua $$0) {
      return ce.a($$0);
   }

   private void gu() {
      cfu $$0 = bsj.a.a(this.dP());
      if ($$0 != null) {
         $$0.e(this.dn());
         $$0.fQ();
         $$0.gv();
         this.gv();
         this.dP().b($$0);
      }
   }

   private void gv() {
      this.cp = 6000L;
      this.ao.a(ci, false);
   }

   private boolean gw() {
      return this.ao.a(ci);
   }

   private void a(cmh $$0, cua $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)this.cL() * 0.6, (double)this.dj() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gx();
         }
      } else {
         super.b($$0);
      }
   }

   private void gx() {
      double $$0 = this.ah.k() * 0.02;
      double $$1 = this.ah.k() * 0.02;
      double $$2 = this.ah.k() * 0.02;
      this.dP().a(lj.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dxj.a gp() {
      return this.ck;
   }

   @Override
   public dxj.d gq() {
      return this.cl;
   }

   class a implements dxc {
      private final dxe b;
      private final int c;

      public a(final dxe $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dxe a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aqk $$0, jj<dxa> $$1, dxa.a $$2, evz $$3) {
         if ($$1.a(dxa.E)) {
            cfu.this.b(ja.a($$3), true);
            return true;
         } else if ($$1.a(dxa.F)) {
            cfu.this.b(ja.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dxj.d {
      private static final int b = 16;
      private final dxe c = new dwy(cfu.this, cfu.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxe b() {
         return this.c;
      }

      @Override
      public boolean a(aqk $$0, ja $$1, jj<dxa> $$2, dxa.a $$3) {
         if (cfu.this.gc()) {
            return false;
         } else {
            Optional<ji> $$4 = cfu.this.dT().c(ccc.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ji $$5 = $$4.get();
               return $$5.a().equals($$0.af()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aqk $$0, ja $$1, jj<dxa> $$2, @Nullable bsd $$3, @Nullable bsd $$4, float $$5) {
         if ($$2.a(dxa.H)) {
            cfv.a(cfu.this, new ja($$1));
         }
      }

      @Override
      public awk<dxa> c() {
         return awb.e;
      }
   }
}
