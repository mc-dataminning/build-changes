import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cox extends cow implements cmw, cps {
   private static final akg<Boolean> bF = akk.a(cox.class, aki.k);
   private static final akg<Boolean> bG = akk.a(cox.class, aki.k);
   private static final akg<Boolean> bH = akk.a(cox.class, aki.k);
   private static final ald bI = ald.b("baby");
   private static final bxv bJ = new bxv(bI, 0.2F, bxv.a.b);
   private static final int bK = 16;
   private static final float bL = 0.35F;
   private static final int bM = 5;
   private static final float bN = 0.1F;
   private static final int bO = 3;
   private static final float bP = 0.2F;
   private static final bvv bQ = bwb.aR.n().a(0.5F).b(0.97F);
   private static final double bR = 0.5;
   private final btx bS = new btx(8);
   private boolean bT;
   protected static final ImmutableList<cha<? extends cgz<? super cox>>> d = ImmutableList.of(cha.c, cha.d, cha.b, cha.f, cha.l);
   protected static final ImmutableList<cft<?>> bE = ImmutableList.of(
      cft.o,
      cft.w,
      cft.g,
      cft.h,
      cft.k,
      cft.l,
      cft.ap,
      cft.ao,
      cft.M,
      cft.aQ,
      cft.y,
      cft.z,
      new cft[]{
         cft.n,
         cft.F,
         cft.p,
         cft.q,
         cft.r,
         cft.u,
         cft.ac,
         cft.ad,
         cft.A,
         cft.ae,
         cft.af,
         cft.ah,
         cft.ag,
         cft.aj,
         cft.ak,
         cft.ai,
         cft.am,
         cft.N,
         cft.as,
         cft.t,
         cft.at,
         cft.au,
         cft.al,
         cft.an,
         cft.av,
         cft.aw,
         cft.ax
      }
   );

   public cox(bwb<? extends cow> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 5;
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }

      if (this.bT) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dX());
   }

   @bar
   @Override
   public btx n() {
      return this.bS;
   }

   @Override
   protected void a(arn $$0, buh $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmv $$4 && $$4.x()) {
         cxy $$5 = new cxy(cyc.vu);
         $$4.gq();
         this.a($$0, $$5);
      }

      this.bS.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cxy j(cxy $$0) {
      return this.bS.b($$0);
   }

   protected boolean k(cxy $$0) {
      return this.bS.c($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
      $$0.a(bG, false);
      $$0.a(bH, false);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (bF.equals($$0)) {
         this.i_();
      }
   }

   public static bxw.a gu() {
      return cnj.gt().a(bxx.s, 16.0).a(bxx.v, 0.35F).a(bxx.c, 5.0);
   }

   public static boolean b(bwb<cox> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return !$$1.a_($$3.e()).a(dkw.lm);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      azs $$4 = $$0.C_();
      if ($$2 != bwa.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.t()) {
            this.a(bwc.a, this.gw());
         }
      }

      coy.a(this, $$0.C_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean aa() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fZ();
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      if (this.t()) {
         this.a(bwc.f, new cxy(cyc.qx), $$0);
         this.a(bwc.e, new cxy(cyc.qy), $$0);
         this.a(bwc.d, new cxy(cyc.qz), $$0);
         this.a(bwc.c, new cxy(cyc.qA), $$0);
      }
   }

   private void a(bwc $$0, cxy $$1, azs $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bxr.b<cox> ec() {
      return bxr.a(bE, d);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return coy.a(this, this.ec().a($$0));
   }

   @Override
   public bxr<cox> eb() {
      return (bxr<cox>)super.eb();
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      btq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof arn $$3) {
         return coy.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = coy.b(this, $$0.b($$1)) && this.x() != coz.d;
         return (btq)($$4 ? btq.a : btq.e);
      }
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bQ : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bF, $$0);
      if (!this.dV().C) {
         bxt $$1 = this.g(bxx.v);
         $$1.c(bJ.b());
         if ($$0) {
            $$1.b(bJ);
         }
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bF);
   }

   private void y(boolean $$0) {
      this.bT = $$0;
   }

   @Override
   protected boolean j() {
      return !this.bT;
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("piglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      coy.a(this);
      super.a($$0);
   }

   @Override
   protected int e(arn $$0) {
      return this.bw;
   }

   @Override
   protected void g(arn $$0) {
      coy.a($$0, this);
      this.bS.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cxy gw() {
      return (double)this.ae.i() < 0.5 ? new cxy(cyc.wZ) : new cxy(cyc.pF);
   }

   @Override
   public axp<cxu> Y() {
      return this.n_() ? null : axi.bU;
   }

   private boolean gx() {
      return this.al.a(bG);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(bG, $$0);
   }

   @Override
   public void a() {
      this.bc = 0;
   }

   @Override
   public coz x() {
      if (this.gv()) {
         return coz.e;
      } else if (coy.a(this.fb())) {
         return coz.d;
      } else if (this.gh() && this.gq()) {
         return coz.a;
      } else if (this.gx()) {
         return coz.c;
      } else {
         return this.b(cyc.wZ) && cwq.g(this.dZ()) ? coz.b : coz.f;
      }
   }

   public boolean gv() {
      return this.al.a(bH);
   }

   public void x(boolean $$0) {
      this.al.a(bH, $$0);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwr $$4) {
         coy.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bwr $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cyt $$0) {
      return $$0 == cyc.wZ;
   }

   protected void l(cxy $$0) {
      this.b(bwc.a, $$0);
   }

   protected void m(cxy $$0) {
      if ($$0.a(coy.c)) {
         this.a(bwc.b, $$0);
         this.g(bwc.b);
      } else {
         this.b(bwc.b, $$0);
      }
   }

   @Override
   public boolean c(arn $$0, cxy $$1) {
      return $$0.O().c(dhl.c) && this.fM() && coy.a(this, $$1);
   }

   protected boolean n(cxy $$0) {
      bwc $$1 = this.g($$0);
      cxy $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cxy $$0, cxy $$1, bwc $$2) {
      if (dej.a($$1, dei.E)) {
         return false;
      } else {
         axp<cxu> $$3 = this.Y();
         boolean $$4 = coy.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = coy.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arn $$0, cmn $$1) {
      this.a($$1);
      coy.a($$0, this, $$1);
   }

   @Override
   public boolean a(bvs $$0, boolean $$1) {
      if (this.n_() && $$0.aq() == bwb.aj) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bvs b(bvs $$0, int $$1) {
      List<bvs> $$2 = $$0.cY();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected awj u() {
      return this.dV().C ? null : coy.b(this).orElse(null);
   }

   @Override
   protected awj e(buh $$0) {
      return awk.uv;
   }

   @Override
   protected awj l_() {
      return awk.ut;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.ux, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(awk.uy);
   }
}
