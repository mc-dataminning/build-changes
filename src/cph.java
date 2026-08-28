import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cph extends cpg implements cng, cqc {
   private static final akh<Boolean> bG = akl.a(cph.class, akj.k);
   private static final akh<Boolean> bH = akl.a(cph.class, akj.k);
   private static final akh<Boolean> bI = akl.a(cph.class, akj.k);
   private static final ale bJ = ale.b("baby");
   private static final byd bK = new byd(bJ, 0.2F, byd.a.b);
   private static final int bL = 16;
   private static final float bM = 0.35F;
   private static final int bN = 5;
   private static final float bO = 0.1F;
   private static final int bP = 3;
   private static final float bQ = 0.2F;
   private static final bwd bR = bwj.aR.n().a(0.5F).b(0.97F);
   private static final double bS = 0.5;
   private final buf bT = new buf(8);
   private boolean bU;
   protected static final ImmutableList<chi<? extends chh<? super cph>>> d = ImmutableList.of(chi.c, chi.d, chi.b, chi.f, chi.l);
   protected static final ImmutableList<cgb<?>> bF = ImmutableList.of(
      cgb.o,
      cgb.w,
      cgb.g,
      cgb.h,
      cgb.k,
      cgb.l,
      cgb.ap,
      cgb.ao,
      cgb.M,
      cgb.aQ,
      cgb.y,
      cgb.z,
      new cgb[]{
         cgb.n,
         cgb.F,
         cgb.p,
         cgb.q,
         cgb.r,
         cgb.u,
         cgb.ac,
         cgb.ad,
         cgb.A,
         cgb.ae,
         cgb.af,
         cgb.ah,
         cgb.ag,
         cgb.aj,
         cgb.ak,
         cgb.ai,
         cgb.am,
         cgb.N,
         cgb.as,
         cgb.t,
         cgb.at,
         cgb.au,
         cgb.al,
         cgb.an,
         cgb.av,
         cgb.aw,
         cgb.ax
      }
   );

   public cph(bwj<? extends cpg> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 5;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.n_()) {
         $$0.a("IsBaby", true);
      }

      if (this.bU) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dX());
   }

   @bat
   @Override
   public buf n() {
      return this.bT;
   }

   @Override
   protected void a(aro $$0, bup $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnf $$4 && $$4.x()) {
         cys $$5 = new cys(cyw.vu);
         $$4.gq();
         this.a($$0, $$5);
      }

      this.bT.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cys j(cys $$0) {
      return this.bT.b($$0);
   }

   protected boolean k(cys $$0) {
      return this.bT.c($$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
      $$0.a(bH, false);
      $$0.a(bI, false);
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (bG.equals($$0)) {
         this.i_();
      }
   }

   public static bye.a gu() {
      return cnt.gt().a(byf.s, 16.0).a(byf.v, 0.35F).a(byf.c, 5.0);
   }

   public static boolean b(bwj<cph> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return !$$1.a_($$3.e()).a(dlw.lm);
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      azt $$4 = $$0.C_();
      if ($$2 != bwi.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.t()) {
            this.a(bwk.a, this.gw());
         }
      }

      cpi.a(this, $$0.C_());
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
   protected void a(azt $$0, btw $$1) {
      if (this.t()) {
         this.a(bwk.f, new cys(cyw.qx), $$0);
         this.a(bwk.e, new cys(cyw.qy), $$0);
         this.a(bwk.d, new cys(cyw.qz), $$0);
         this.a(bwk.c, new cys(cyw.qA), $$0);
      }
   }

   private void a(bwk $$0, cys $$1, azt $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bxz.b<cph> ec() {
      return bxz.a(bF, d);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return cpi.a(this, this.ec().a($$0));
   }

   @Override
   public bxz<cph> eb() {
      return (bxz<cph>)super.eb();
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      bty $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof aro $$3) {
         return cpi.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cpi.b(this, $$0.b($$1)) && this.x() != cpj.d;
         return (bty)($$4 ? bty.a : bty.e);
      }
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? bR : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bG, $$0);
      if (!this.dV().C) {
         byb $$1 = this.g(byf.v);
         $$1.c(bK.b());
         if ($$0) {
            $$1.b(bK);
         }
      }
   }

   @Override
   public boolean n_() {
      return this.au().a(bG);
   }

   private void y(boolean $$0) {
      this.bU = $$0;
   }

   @Override
   protected boolean j() {
      return !this.bU;
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("piglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cpi.a(this);
      super.a($$0);
   }

   @Override
   protected int e(aro $$0) {
      return this.bx;
   }

   @Override
   protected void g(aro $$0) {
      cpi.a($$0, this);
      this.bT.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cys gw() {
      return (double)this.ae.i() < 0.5 ? new cys(cyw.wZ) : new cys(cyw.pF);
   }

   @Override
   public axp<cyo> Y() {
      return this.n_() ? null : axi.bU;
   }

   private boolean gx() {
      return this.al.a(bH);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(bH, $$0);
   }

   @Override
   public void a() {
      this.bd = 0;
   }

   @Override
   public cpj x() {
      if (this.gv()) {
         return cpj.e;
      } else if (cpi.a(this.fb())) {
         return cpj.d;
      } else if (this.gh() && this.gq()) {
         return cpj.a;
      } else if (this.gx()) {
         return cpj.c;
      } else {
         return this.b(cyw.wZ) && cxl.g(this.dZ()) ? cpj.b : cpj.f;
      }
   }

   public boolean gv() {
      return this.al.a(bI);
   }

   public void x(boolean $$0) {
      this.al.a(bI, $$0);
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwz $$4) {
         cpi.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bwz $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(czn $$0) {
      return $$0 == cyw.wZ;
   }

   protected void l(cys $$0) {
      this.b(bwk.a, $$0);
   }

   protected void m(cys $$0) {
      if ($$0.a(cpi.c)) {
         this.a(bwk.b, $$0);
         this.g(bwk.b);
      } else {
         this.b(bwk.b, $$0);
      }
   }

   @Override
   public boolean c(aro $$0, cys $$1) {
      return $$0.O().c(dil.c) && this.fM() && cpi.a(this, $$1);
   }

   protected boolean n(cys $$0) {
      bwk $$1 = this.g($$0);
      cys $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cys $$0, cys $$1, bwk $$2) {
      if (dfh.a($$1, dfg.E)) {
         return false;
      } else {
         axp<cyo> $$3 = this.Y();
         boolean $$4 = cpi.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cpi.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(aro $$0, cmx $$1) {
      this.a($$1);
      cpi.a($$0, this, $$1);
   }

   @Override
   public boolean a(bwa $$0, boolean $$1) {
      if (this.n_() && $$0.aq() == bwj.aj) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bwa b(bwa $$0, int $$1) {
      List<bwa> $$2 = $$0.cY();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected awk u() {
      return this.dV().C ? null : cpi.b(this).orElse(null);
   }

   @Override
   protected awk e(bup $$0) {
      return awl.uv;
   }

   @Override
   protected awk l_() {
      return awl.ut;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.ux, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(awl.uy);
   }
}
