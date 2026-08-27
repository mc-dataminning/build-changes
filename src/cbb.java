import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cbb extends boq implements cgw, dqf {
   private static final Logger e = LogUtils.getLogger();
   private static final jd bT = new jd(1, 1, 1);
   private static final int bU = 5;
   private static final float bV = 55.0F;
   private static final float bW = 15.0F;
   private static final csc bX = csc.a(cpg.oB);
   private static final int bY = 6000;
   private static final int bZ = 3;
   private static final aie<Boolean> ca = aih.a(cbb.class, aig.k);
   private static final aie<Boolean> cb = aih.a(cbb.class, aig.k);
   protected static final ImmutableList<bys<? extends byr<? super cbb>>> b = ImmutableList.of(bys.c, bys.d, bys.f, bys.b);
   protected static final ImmutableList<bxl<?>> c = ImmutableList.of(
      bxl.t, bxl.n, bxl.h, bxl.m, bxl.E, bxl.x, bxl.L, bxl.aM, bxl.aN, bxl.aO, bxl.aP, bxl.Z, new bxl[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dpt<dqf.b> cc;
   private dqf.a cd;
   private final dqf.d ce;
   private final dpt<cbb.a> cf;
   private final bmf cg = new bmf(1);
   @Nullable
   private hz ch;
   private long ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public cbb(bnw<? extends cbb> $$0, cvr $$1) {
      super($$0, $$1);
      this.bL = new buf(this, 20, true);
      this.s(this.fM());
      this.ce = new cbb.b();
      this.cd = new dqf.a();
      this.cc = new dpt<>(new dqf.b(this));
      this.cf = new dpt<>(new cbb.a(this.ce.b(), dpw.E.a().a()));
   }

   @Override
   protected bpj.b<cbb> dP() {
      return bpj.a(c, b);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cbc.a(this.dP().a($$0));
   }

   @Override
   public bpj<cbb> dO() {
      return (bpj<cbb>)super.dO();
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 20.0).a(bpp.h, 0.1F).a(bpp.o, 0.1F).a(bpp.c, 2.0).a(bpp.i, 48.0);
   }

   @Override
   protected bxt b(cvr $$0) {
      bxr $$1 = new bxr(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ca, false);
      this.am.a(cb, true);
   }

   @Override
   public void a(enz $$0) {
      if (this.cX()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(bon.a, this.dp());
            this.g(this.dp().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(bon.a, this.dp());
            this.g(this.dp().a(0.5));
         } else {
            this.a(this.ff(), $$0);
            this.a(bon.a, this.dp());
            this.g(this.dp().a(0.91F));
         }
      }

      this.q(false);
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if ($$0.d() instanceof chl $$2) {
         Optional<UUID> $$3 = this.dO().c(bxl.aM);
         if ($$3.isPresent() && $$2.cw().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dlj $$2, hz $$3) {
   }

   @Override
   protected atk y() {
      return this.b(bnx.a) ? atl.a : atl.b;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.d;
   }

   @Override
   protected atk n_() {
      return atl.c;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected void aa() {
      this.dM().ae().a("allayBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("allayActivityUpdate");
      cbc.a(this);
      this.dM().ae().c();
      super.aa();
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B && this.bx() && this.ag % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gg() && this.gl() && this.ag % 20 == 0) {
         this.w(false);
         this.ch = null;
      }

      this.gm();
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         this.ck = this.cj;
         if (this.w()) {
            this.cj = awi.a(this.cj + 1.0F, 0.0F, 5.0F);
         } else {
            this.cj = awi.a(this.cj - 1.0F, 0.0F, 5.0F);
         }

         if (this.gg()) {
            this.cl++;
            this.cn = this.cm;
            if (this.gh()) {
               this.cm++;
            } else {
               this.cm--;
            }

            this.cm = awi.a(this.cm, 0.0F, 15.0F);
         } else {
            this.cl = 0.0F;
            this.cm = 0.0F;
            this.cn = 0.0F;
         }
      } else {
         dqf.c.a(this.dM(), this.cd, this.ce);
         if (this.gd()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fM() {
      return !this.gk() && this.w();
   }

   public boolean w() {
      return !this.b(blv.a).b();
   }

   @Override
   public boolean f(cpd $$0) {
      return false;
   }

   private boolean gk() {
      return this.dO().a(bxl.aP, bxm.a);
   }

   @Override
   protected blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      cpd $$3 = this.b(blv.a);
      if (this.gg() && this.l($$2) && this.gp()) {
         this.gn();
         this.dM().a(this, (byte)18);
         this.dM().a($$0, this, atl.E, atm.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return blw.a;
      } else if ($$3.b() && !$$2.b()) {
         cpd $$4 = $$2.c(1);
         this.a(blv.a, $$4);
         this.a($$0, $$2);
         this.dM().a($$0, this, atl.e, atm.g, 2.0F, 1.0F);
         this.dO().a(bxl.aM, $$0.cw());
         return blw.a;
      } else if (!$$3.b() && $$1 == blv.a && $$2.b()) {
         this.a(bnx.a, cpd.h);
         this.dM().a($$0, this, atl.f, atm.g, 2.0F, 1.0F);
         this.a(blv.a);

         for (cpd $$5 : this.A().f()) {
            bqc.a(this, $$5, this.dk());
         }

         this.dO().b(bxl.aM);
         $$0.i($$3);
         return blw.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(hz $$0, boolean $$1) {
      if ($$1) {
         if (!this.gg()) {
            this.ch = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.ch) || this.ch == null) {
         this.ch = null;
         this.w(false);
      }
   }

   @Override
   public bmf A() {
      return this.cg;
   }

   @Override
   protected jd W() {
      return bT;
   }

   @Override
   public boolean k(cpd $$0) {
      cpd $$1 = this.b(blv.a);
      return !$$1.b() && this.dM().Z().b(cvn.c) && this.cg.b($$0) && this.d($$1, $$0);
   }

   private boolean d(cpd $$0, cpd $$1) {
      return cpd.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cpd $$0, cpd $$1) {
      sw $$2 = $$0.w();
      boolean $$3 = $$2 != null && $$2.e("Potion");
      if (!$$3) {
         return false;
      } else {
         sw $$4 = $$1.w();
         boolean $$5 = $$4 != null && $$4.e("Potion");
         if (!$$5) {
            return true;
         } else {
            tt $$6 = $$2.c("Potion");
            tt $$7 = $$4.c("Potion");
            return $$6 != null && $$7 != null && !$$6.equals($$7);
         }
      }
   }

   @Override
   protected void b(cdw $$0) {
      cgw.a(this, this, $$0);
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public boolean aT() {
      return !this.aC();
   }

   @Override
   public void a(BiConsumer<dpt<?>, aow> $$0) {
      if (this.dM() instanceof aow $$1) {
         $$0.accept(this.cc, $$1);
         $$0.accept(this.cf, $$1);
      }
   }

   public boolean gg() {
      return this.am.b(ca);
   }

   public void w(boolean $$0) {
      if (!this.dM().B && this.cY() && (!$$0 || !this.gd())) {
         this.am.b(ca, $$0);
      }
   }

   private boolean gl() {
      return this.ch == null || !this.ch.a(this.dk(), (double)dpw.E.a().a()) || !this.dM().a_(this.ch).a(cyu.dT);
   }

   public float E(float $$0) {
      return awi.i($$0, this.ck, this.cj) / 5.0F;
   }

   public boolean gh() {
      float $$0 = this.cl % 55.0F;
      return $$0 < 15.0F;
   }

   public float F(float $$0) {
      return awi.i($$0, this.cn, this.cm) / 15.0F;
   }

   @Override
   public boolean a(cpd $$0, cpd $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void ez() {
      super.ez();
      this.cg.f().forEach(this::b);
      cpd $$0 = this.c(bnx.a);
      if (!$$0.b() && !ctn.e($$0)) {
         this.b($$0);
         this.a(bnx.a, cpd.h);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      this.a_($$0);
      dqf.a.a.encodeStart(tk.a, this.cd).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.ci);
      $$0.a("CanDuplicate", this.gp());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.c($$0);
      if ($$0.b("listener", 10)) {
         dqf.a.a.parse(new Dynamic(tk.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cd = $$0x);
      }

      this.ci = (long)$$0.h("DuplicationCooldown");
      this.am.b(cb, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean ge() {
      return false;
   }

   private void gm() {
      if (this.ci > 0L) {
         this.ci--;
      }

      if (!this.dM().y_() && this.ci == 0L && !this.gp()) {
         this.am.b(cb, true);
      }
   }

   private boolean l(cpd $$0) {
      return bX.a($$0);
   }

   private void gn() {
      cbb $$0 = bnw.b.a(this.dM());
      if ($$0 != null) {
         $$0.e(this.dk());
         $$0.fL();
         $$0.go();
         this.go();
         this.dM().b($$0);
      }
   }

   private void go() {
      this.ci = 6000L;
      this.am.b(cb, false);
   }

   private boolean gp() {
      return this.am.b(cb);
   }

   private void a(chl $$0, cpd $$1) {
      if (!$$0.fU().d) {
         $$1.h(1);
      }
   }

   @Override
   public enz cJ() {
      return new enz(0.0, (double)this.cI() * 0.6, (double)this.dg() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gq();
         }
      } else {
         super.b($$0);
      }
   }

   private void gq() {
      double $$0 = this.af.k() * 0.02;
      double $$1 = this.af.k() * 0.02;
      double $$2 = this.af.k() * 0.02;
      this.dM().a(jz.O, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dqf.a gi() {
      return this.cd;
   }

   @Override
   public dqf.d gj() {
      return this.ce;
   }

   class a implements dpy {
      private final dqa b;
      private final int c;

      public a(dqa $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dqa a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aow $$0, ij<dpw> $$1, dpw.a $$2, enz $$3) {
         if ($$1.a(dpw.E)) {
            cbb.this.b(hz.a($$3), true);
            return true;
         } else if ($$1.a(dpw.F)) {
            cbb.this.b(hz.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dqf.d {
      private static final int b = 16;
      private final dqa c = new dpu(cbb.this, cbb.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dqa b() {
         return this.c;
      }

      @Override
      public boolean a(aow $$0, hz $$1, ij<dpw> $$2, dpw.a $$3) {
         if (cbb.this.fW()) {
            return false;
         } else {
            Optional<ii> $$4 = cbb.this.dO().c(bxl.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               ii $$5 = $$4.get();
               return $$5.a().equals($$0.ad()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aow $$0, hz $$1, ij<dpw> $$2, @Nullable bnq $$3, @Nullable bnq $$4, float $$5) {
         if ($$2.a(dpw.H)) {
            cbc.a(cbb.this, new hz($$1));
         }
      }

      @Override
      public aup<dpw> c() {
         return aug.e;
      }
   }
}
