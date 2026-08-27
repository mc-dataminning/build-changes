import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cko extends ckn implements cip, clj {
   private static final ajy<Boolean> ci = akc.a(cko.class, aka.k);
   private static final ajy<Boolean> cj = akc.a(cko.class, aka.k);
   private static final ajy<Boolean> ck = akc.a(cko.class, aka.k);
   private static final UUID cl = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final btt cm = new btt(cl, "Baby speed boost", 0.2F, btt.a.b);
   private static final int cn = 16;
   private static final float co = 0.35F;
   private static final int cp = 5;
   private static final float cq = 0.1F;
   private static final int cr = 3;
   private static final float cs = 0.2F;
   private static final bry ct = bsb.aB.n().a(0.5F).b(0.97F);
   private static final double cu = 0.5;
   private final bqj cv = new bqj(8);
   private boolean cw;
   protected static final ImmutableList<ccy<? extends ccx<? super cko>>> e = ImmutableList.of(ccy.c, ccy.d, ccy.b, ccy.f, ccy.l);
   protected static final ImmutableList<cbr<?>> ch = ImmutableList.of(
      cbr.n,
      cbr.v,
      cbr.g,
      cbr.h,
      cbr.k,
      cbr.l,
      cbr.ao,
      cbr.an,
      cbr.L,
      cbr.aP,
      cbr.x,
      cbr.y,
      new cbr[]{
         cbr.m,
         cbr.E,
         cbr.o,
         cbr.p,
         cbr.q,
         cbr.t,
         cbr.ab,
         cbr.ac,
         cbr.z,
         cbr.ad,
         cbr.ae,
         cbr.ag,
         cbr.af,
         cbr.ai,
         cbr.aj,
         cbr.ah,
         cbr.al,
         cbr.M,
         cbr.ar,
         cbr.s,
         cbr.as,
         cbr.at,
         cbr.ak,
         cbr.am,
         cbr.au,
         cbr.av,
         cbr.aw
      }
   );

   public cko(bsb<? extends ckn> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 5;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cw) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dY());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dY());
   }

   @azp
   @Override
   public bqj x() {
      return this.cv;
   }

   @Override
   protected void a(bqt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cio $$4 && $$4.gz()) {
         cuh $$5 = new cuh(cuk.wc);
         $$4.gA();
         this.b($$5);
      }

      this.cv.f().forEach(this::b);
   }

   protected cuh n(cuh $$0) {
      return this.cv.b($$0);
   }

   protected boolean o(cuh $$0) {
      return this.cv.c($$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ci, false);
      $$0.a(cj, false);
      $$0.a(ck, false);
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (ci.equals($$0)) {
         this.i_();
      }
   }

   public static btu.a gD() {
      return cjd.gG().a(btv.q, 16.0).a(btv.r, 0.35F).a(btv.c, 5.0);
   }

   public static boolean b(bsb<cko> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return !$$1.a_($$3.d()).a(dfe.lI);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ayt $$4 = $$0.F_();
      if ($$2 != bss.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gz()) {
            this.a(bsc.a, this.gH());
         }
      }

      ckp.a(this, $$0.F_());
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean W() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.ge();
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      if (this.gz()) {
         this.a(bsc.f, new cuh(cuk.rh), $$0);
         this.a(bsc.e, new cuh(cuk.ri), $$0);
         this.a(bsc.d, new cuh(cuk.rj), $$0);
         this.a(bsc.c, new cuh(cuk.rk), $$0);
      }
   }

   private void a(bsc $$0, cuh $$1, ayt $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected btp.b<cko> ea() {
      return btp.a(ch, e);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return ckp.a(this, this.ea().a($$0));
   }

   @Override
   public btp<cko> dZ() {
      return (btp<cko>)super.dZ();
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      bqa $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dU().C) {
         return ckp.a(this, $$0, $$1);
      } else {
         boolean $$3 = ckp.b(this, $$0.b($$1)) && this.gA() != ckq.d;
         return $$3 ? bqa.a : bqa.d;
      }
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? ct : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(ci, $$0);
      if (!this.dU().C) {
         btr $$1 = this.f(btv.r);
         $$1.b(cm.b());
         if ($$0) {
            $$1.c(cm);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.ap().a(ci);
   }

   private void y(boolean $$0) {
      this.cw = $$0;
   }

   @Override
   protected boolean r() {
      return !this.cw;
   }

   @Override
   protected void Y() {
      this.dU().ag().a("piglinBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().c();
      ckp.a(this);
      super.Y();
   }

   @Override
   public int er() {
      return this.bW;
   }

   @Override
   protected void a(aqt $$0) {
      ckp.b(this);
      this.cv.f().forEach(this::b);
      super.a($$0);
   }

   private cuh gH() {
      return (double)this.al.i() < 0.5 ? new cuh(cuk.xE) : new cuh(cuk.qo);
   }

   private boolean gI() {
      return this.as.a(cj);
   }

   @Override
   public void b(boolean $$0) {
      this.as.a(cj, $$0);
   }

   @Override
   public void a() {
      this.bq = 0;
   }

   @Override
   public ckq gA() {
      if (this.gE()) {
         return ckq.e;
      } else if (ckp.a(this.fh())) {
         return ckq.d;
      } else if (this.gq() && this.gB()) {
         return ckq.a;
      } else if (this.gI()) {
         return ckq.c;
      } else {
         return this.gq() && this.b(cuk.xE) ? ckq.b : ckq.f;
      }
   }

   public boolean gE() {
      return this.as.a(ck);
   }

   public void x(boolean $$0) {
      this.as.a(ck, $$0);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dU().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bso) {
            ckp.a(this, (bso)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bso $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cvi $$0) {
      return $$0 == cuk.xE;
   }

   protected void p(cuh $$0) {
      this.b(bsc.a, $$0);
   }

   protected void q(cuh $$0) {
      if ($$0.a(ckp.c)) {
         this.a(bsc.b, $$0);
         this.f(bsc.b);
      } else {
         this.b(bsc.b, $$0);
      }
   }

   @Override
   public boolean k(cuh $$0) {
      return this.dU().ab().b(dbw.c) && this.gd() && ckp.a(this, $$0);
   }

   protected boolean r(cuh $$0) {
      bsc $$1 = bsq.h($$0);
      cuh $$2 = this.d($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cuh $$0, cuh $$1) {
      if (dae.f($$1)) {
         return false;
      } else {
         boolean $$2 = ckp.a($$0) || $$0.a(cuk.xE);
         boolean $$3 = ckp.a($$1) || $$1.a(cuk.xE);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gz() && !$$0.a(cuk.xE) && $$1.a(cuk.xE) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cig $$0) {
      this.a($$0);
      ckp.a(this, $$0);
   }

   @Override
   public boolean a(brv $$0, boolean $$1) {
      if (this.o_() && $$0.ak() == bsb.ab) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private brv b(brv $$0, int $$1) {
      List<brv> $$2 = $$0.cX();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avn u() {
      return this.dU().C ? null : ckp.c(this).orElse(null);
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.ug;
   }

   @Override
   protected avn n_() {
      return avo.ue;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.ui, 0.15F, 1.0F);
   }

   @Override
   protected void gC() {
      this.b(avo.uj);
   }
}
