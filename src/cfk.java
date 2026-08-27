import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfk extends bsw implements clj, dye {
   private static final Logger e = LogUtils.getLogger();
   private static final jv ch = new jv(1, 1, 1);
   private static final int ci = 5;
   private static final float cj = 55.0F;
   private static final float ck = 15.0F;
   private static final cyv cl = cyv.a(cuk.pV);
   private static final int cm = 6000;
   private static final int cn = 3;
   private static final ajy<Boolean> co = akc.a(cfk.class, aka.k);
   private static final ajy<Boolean> cp = akc.a(cfk.class, aka.k);
   protected static final ImmutableList<ccy<? extends ccx<? super cfk>>> b = ImmutableList.of(ccy.c, ccy.d, ccy.f, ccy.b);
   protected static final ImmutableList<cbr<?>> c = ImmutableList.of(
      cbr.t, cbr.n, cbr.h, cbr.m, cbr.E, cbr.x, cbr.L, cbr.aM, cbr.aN, cbr.aO, cbr.aP, cbr.Z, new cbr[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final dxs<dye.b> cq;
   private dye.a cr;
   private final dye.d cs;
   private final dxs<cfk.a> ct;
   private final bqj cu = new bqj(1);
   @Nullable
   private ir cv;
   private long cw;
   private float cx;
   private float cy;
   private float cz;
   private float cA;
   private float cB;

   public cfk(bsb<? extends cfk> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new byl(this, 20, true);
      this.a_(this.gd());
      this.cs = new cfk.b();
      this.cr = new dye.a();
      this.cq = new dxs<>(new dye.b(this));
      this.ct = new dxs<>(new cfk.a(this.cs.b(), dxv.E.a().a()));
   }

   @Override
   protected btp.b<cfk> ea() {
      return btp.a(c, b);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return cfl.a(this.ea().a($$0));
   }

   @Override
   public btp<cfk> dZ() {
      return (btp<cfk>)super.dZ();
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 20.0).a(btv.j, 0.1F).a(btv.r, 0.1F).a(btv.c, 2.0).a(btv.k, 48.0);
   }

   @Override
   protected cbz b(dca $$0) {
      cbx $$1 = new cbx(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(co, false);
      $$0.a(cp, true);
   }

   @Override
   public void a(ewu $$0) {
      if (this.df()) {
         if (this.bi()) {
            this.a(0.02F, $$0);
            this.a(bst.a, this.dx());
            this.g(this.dx().a(0.8F));
         } else if (this.bx()) {
            this.a(0.02F, $$0);
            this.a(bst.a, this.dx());
            this.g(this.dx().a(0.5));
         } else {
            this.a(this.fw(), $$0);
            this.a(bst.a, this.dx());
            this.g(this.dx().a(0.91F));
         }
      }

      this.r(false);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if ($$0.d() instanceof cly $$2) {
         Optional<UUID> $$3 = this.dZ().c(cbr.aM);
         if ($$3.isPresent() && $$2.cE().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, ir $$3) {
   }

   @Override
   protected avn u() {
      return this.b(bsc.a) ? avo.a : avo.b;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.d;
   }

   @Override
   protected avn n_() {
      return avo.c;
   }

   @Override
   protected float fn() {
      return 0.4F;
   }

   @Override
   protected void Y() {
      this.dU().ag().a("allayBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().c();
      this.dU().ag().a("allayActivityUpdate");
      cfl.a(this);
      this.dU().ag().c();
      super.Y();
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dU().C && this.bI() && this.am % 10 == 0) {
         this.c(1.0F);
      }

      if (this.gy() && this.gD() && this.am % 20 == 0) {
         this.w(false);
         this.cv = null;
      }

      this.gE();
   }

   @Override
   public void l() {
      super.l();
      if (this.dU().C) {
         this.cy = this.cx;
         if (this.t()) {
            this.cx = aym.a(this.cx + 1.0F, 0.0F, 5.0F);
         } else {
            this.cx = aym.a(this.cx - 1.0F, 0.0F, 5.0F);
         }

         if (this.gy()) {
            this.cz++;
            this.cB = this.cA;
            if (this.gz()) {
               this.cA++;
            } else {
               this.cA--;
            }

            this.cA = aym.a(this.cA, 0.0F, 15.0F);
         } else {
            this.cz = 0.0F;
            this.cA = 0.0F;
            this.cB = 0.0F;
         }
      } else {
         dye.c.a(this.dU(), this.cr, this.cs);
         if (this.gv()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean gd() {
      return !this.gC() && this.t();
   }

   public boolean t() {
      return !this.b(bpz.a).d();
   }

   @Override
   public boolean f(cuh $$0) {
      return false;
   }

   private boolean gC() {
      return this.dZ().a(cbr.aP, cbs.a);
   }

   @Override
   protected bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      cuh $$3 = this.b(bpz.a);
      if (this.gy() && this.n($$2) && this.gH()) {
         this.gF();
         this.dU().a(this, (byte)18);
         this.dU().a($$0, this, avo.J, avq.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bqa.a;
      } else if ($$3.d() && !$$2.d()) {
         cuh $$4 = $$2.c(1);
         this.a(bpz.a, $$4);
         this.a($$0, $$2);
         this.dU().a($$0, this, avo.e, avq.g, 2.0F, 1.0F);
         this.dZ().a(cbr.aM, $$0.cE());
         return bqa.a;
      } else if (!$$3.d() && $$1 == bpz.a && $$2.d()) {
         this.a(bsc.a, cuh.i);
         this.dU().a($$0, this, avo.f, avq.g, 2.0F, 1.0F);
         this.a(bpz.a);

         for (cuh $$5 : this.x().f()) {
            bui.a(this, $$5, this.ds());
         }

         this.dZ().b(cbr.aM);
         $$0.i($$3);
         return bqa.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ir $$0, boolean $$1) {
      if ($$1) {
         if (!this.gy()) {
            this.cv = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.cv) || this.cv == null) {
         this.cv = null;
         this.w(false);
      }
   }

   @Override
   public bqj x() {
      return this.cu;
   }

   @Override
   protected jv U() {
      return ch;
   }

   @Override
   public boolean k(cuh $$0) {
      cuh $$1 = this.b(bpz.a);
      return !$$1.d() && this.dU().ab().b(dbw.c) && this.cu.c($$0) && this.d($$1, $$0);
   }

   private boolean d(cuh $$0, cuh $$1) {
      return cuh.b($$0, $$1) && !this.e($$0, $$1);
   }

   private boolean e(cuh $$0, cuh $$1) {
      cwr $$2 = $$0.a(ke.E);
      cwr $$3 = $$1.a(ke.E);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void b(cig $$0) {
      clj.a(this, this, $$0);
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   @Override
   public boolean aZ() {
      return !this.aE();
   }

   @Override
   public void a(BiConsumer<dxs<?>, aqt> $$0) {
      if (this.dU() instanceof aqt $$1) {
         $$0.accept(this.cq, $$1);
         $$0.accept(this.ct, $$1);
      }
   }

   public boolean gy() {
      return this.as.a(co);
   }

   public void w(boolean $$0) {
      if (!this.dU().C && this.dg() && (!$$0 || !this.gv())) {
         this.as.a(co, $$0);
      }
   }

   private boolean gD() {
      return this.cv == null || !this.cv.a(this.ds(), (double)dxv.E.a().a()) || !this.dU().a_(this.cv).a(dfe.eH);
   }

   public float G(float $$0) {
      return aym.i($$0, this.cy, this.cx) / 5.0F;
   }

   public boolean gz() {
      float $$0 = this.cz % 55.0F;
      return $$0 < 15.0F;
   }

   public float H(float $$0) {
      return aym.i($$0, this.cB, this.cA) / 15.0F;
   }

   @Override
   public boolean a(cuh $$0, cuh $$1) {
      return !this.d($$0, $$1);
   }

   @Override
   protected void eL() {
      super.eL();
      this.cu.f().forEach(this::b);
      cuh $$0 = this.d(bsc.a);
      if (!$$0.d() && !dae.g($$0)) {
         this.b($$0);
         this.a(bsc.a, cuh.i);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.b($$0, this.dY());
      dye.a.a.encodeStart(uy.a, this.cr).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cw);
      $$0.a("CanDuplicate", this.gH());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a($$0, this.dY());
      if ($$0.b("listener", 10)) {
         dye.a.a.parse(new Dynamic(uy.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.cr = $$0x);
      }

      this.cw = (long)$$0.h("DuplicationCooldown");
      this.as.a(cp, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gw() {
      return false;
   }

   private void gE() {
      if (this.cw > 0L) {
         this.cw--;
      }

      if (!this.dU().x_() && this.cw == 0L && !this.gH()) {
         this.as.a(cp, true);
      }
   }

   private boolean n(cuh $$0) {
      return cl.a($$0);
   }

   private void gF() {
      cfk $$0 = bsb.a.a(this.dU());
      if ($$0 != null) {
         $$0.e(this.ds());
         $$0.gc();
         $$0.gG();
         this.gG();
         this.dU().b($$0);
      }
   }

   private void gG() {
      this.cw = 6000L;
      this.as.a(cp, false);
   }

   private boolean gH() {
      return this.as.a(cp);
   }

   private void a(cly $$0, cuh $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)this.cQ() * 0.6, (double)this.do() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gI();
         }
      } else {
         super.b($$0);
      }
   }

   private void gI() {
      double $$0 = this.al.k() * 0.02;
      double $$1 = this.al.k() * 0.02;
      double $$2 = this.al.k() * 0.02;
      this.dU().a(lb.O, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public dye.a gA() {
      return this.cr;
   }

   @Override
   public dye.d gB() {
      return this.cs;
   }

   class a implements dxx {
      private final dxz b;
      private final int c;

      public a(dxz $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public dxz a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aqt $$0, ja<dxv> $$1, dxv.a $$2, ewu $$3) {
         if ($$1.a(dxv.E)) {
            cfk.this.b(ir.a($$3), true);
            return true;
         } else if ($$1.a(dxv.F)) {
            cfk.this.b(ir.a($$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements dye.d {
      private static final int b = 16;
      private final dxz c = new dxt(cfk.this, cfk.this.cQ());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxz b() {
         return this.c;
      }

      @Override
      public boolean a(aqt $$0, ir $$1, ja<dxv> $$2, dxv.a $$3) {
         if (cfk.this.go()) {
            return false;
         } else {
            Optional<iz> $$4 = cfk.this.dZ().c(cbr.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               iz $$5 = $$4.get();
               return $$5.a().equals($$0.af()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aqt $$0, ir $$1, ja<dxv> $$2, @Nullable brv $$3, @Nullable brv $$4, float $$5) {
         if ($$2.a(dxv.H)) {
            cfl.a(cfk.this, new ir($$1));
         }
      }

      @Override
      public awt<dxv> c() {
         return awk.e;
      }
   }
}
