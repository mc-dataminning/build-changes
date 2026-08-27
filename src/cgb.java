import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgb extends cga implements cee, cgw {
   private static final aie<Boolean> bU = aih.a(cgb.class, aig.k);
   private static final aie<Boolean> bV = aih.a(cgb.class, aig.k);
   private static final aie<Boolean> bW = aih.a(cgb.class, aig.k);
   private static final UUID bX = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bpn bY = new bpn(bX, "Baby speed boost", 0.2F, bpn.a.b);
   private static final int bZ = 16;
   private static final float ca = 0.35F;
   private static final int cb = 5;
   private static final float cc = 1.6F;
   private static final float cd = 0.1F;
   private static final int ce = 3;
   private static final float cf = 0.2F;
   private static final bnt cg = bnw.ay.n().a(0.5F).b(0.97F);
   private static final double ch = 0.5;
   private final bmf ci = new bmf(8);
   private boolean cj;
   protected static final ImmutableList<bys<? extends byr<? super cgb>>> e = ImmutableList.of(bys.c, bys.d, bys.b, bys.f, bys.l);
   protected static final ImmutableList<bxl<?>> bT = ImmutableList.of(
      bxl.n,
      bxl.v,
      bxl.g,
      bxl.h,
      bxl.k,
      bxl.l,
      bxl.ao,
      bxl.an,
      bxl.L,
      bxl.aP,
      bxl.x,
      bxl.y,
      new bxl[]{
         bxl.m,
         bxl.E,
         bxl.o,
         bxl.p,
         bxl.q,
         bxl.t,
         bxl.ab,
         bxl.ac,
         bxl.z,
         bxl.ad,
         bxl.ae,
         bxl.ag,
         bxl.af,
         bxl.ai,
         bxl.aj,
         bxl.ah,
         bxl.al,
         bxl.M,
         bxl.ar,
         bxl.s,
         bxl.as,
         bxl.at,
         bxl.ak,
         bxl.am,
         bxl.au,
         bxl.av,
         bxl.aw
      }
   );

   public cgb(bnw<? extends cga> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cj) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @axl
   @Override
   public bmf A() {
      return this.ci;
   }

   @Override
   protected void a(bmp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ced $$4 && $$4.gh()) {
         cpd $$5 = new cpd(cpg.un);
         $$4.gi();
         this.b($$5);
      }

      this.ci.f().forEach(this::b);
   }

   protected cpd l(cpd $$0) {
      return this.ci.a($$0);
   }

   protected boolean m(cpd $$0) {
      return this.ci.b($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bU, false);
      this.am.a(bV, false);
      this.am.a(bW, false);
   }

   @Override
   public void a(aie<?> $$0) {
      super.a($$0);
      if (bU.equals($$0)) {
         this.k_();
      }
   }

   public static bpo.a gn() {
      return cer.gm().a(bpp.n, 16.0).a(bpp.o, 0.35F).a(bpp.c, 5.0);
   }

   public static boolean b(bnw<cgb> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return !$$1.a_($$3.d()).a(cyu.kK);
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      awp $$5 = $$0.F_();
      if ($$2 != bom.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gh()) {
            this.a(bnx.a, this.gp());
         }
      }

      cgc.a(this, $$0.F_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean Y() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fN();
   }

   @Override
   protected void a(awp $$0, blu $$1) {
      if (this.gh()) {
         this.a(bnx.f, new cpd(cpg.pN), $$0);
         this.a(bnx.e, new cpd(cpg.pO), $$0);
         this.a(bnx.d, new cpd(cpg.pP), $$0);
         this.a(bnx.c, new cpd(cpg.pQ), $$0);
      }
   }

   private void a(bnx $$0, cpd $$1, awp $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bpj.b<cgb> dP() {
      return bpj.a(bT, e);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cgc.a(this, this.dP().a($$0));
   }

   @Override
   public bpj<cgb> dO() {
      return (bpj<cgb>)super.dO();
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      blw $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dM().B) {
         return cgc.a(this, $$0, $$1);
      } else {
         boolean $$3 = cgc.b(this, $$0.b($$1)) && this.gi() != cgd.d;
         return $$3 ? blw.a : blw.d;
      }
   }

   @Override
   public bnt e(bot $$0) {
      return this.o_() ? cg : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(bU, $$0);
      if (!this.dM().B) {
         bpl $$1 = this.f(bpp.o);
         $$1.b(bY.a());
         if ($$0) {
            $$1.c(bY);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(bU);
   }

   private void y(boolean $$0) {
      this.cj = $$0;
   }

   @Override
   protected boolean u() {
      return !this.cj;
   }

   @Override
   protected void aa() {
      this.dM().ae().a("piglinBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().c();
      cgc.a(this);
      super.aa();
   }

   @Override
   public int ef() {
      return this.bJ;
   }

   @Override
   protected void c(aow $$0) {
      cgc.b(this);
      this.ci.f().forEach(this::b);
      super.c($$0);
   }

   private cpd gp() {
      return (double)this.af.i() < 0.5 ? new cpd(cpg.vP) : new cpd(cpg.oU);
   }

   private boolean gq() {
      return this.am.b(bV);
   }

   @Override
   public void b(boolean $$0) {
      this.am.b(bV, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public cgd gi() {
      if (this.go()) {
         return cgd.e;
      } else if (cgc.a(this.eU())) {
         return cgd.d;
      } else if (this.fY() && this.gj()) {
         return cgd.a;
      } else if (this.gq()) {
         return cgd.c;
      } else {
         return this.fY() && this.b(cpg.vP) ? cgd.b : cgd.f;
      }
   }

   public boolean go() {
      return this.am.b(bW);
   }

   public void x(boolean $$0) {
      this.am.b(bW, $$0);
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof boi) {
            cgc.a(this, (boi)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(boi $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(boi $$0, cpd $$1, cid $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cpt $$0) {
      return $$0 == cpg.vP;
   }

   protected void n(cpd $$0) {
      this.b(bnx.a, $$0);
   }

   protected void o(cpd $$0) {
      if ($$0.a(cgc.c)) {
         this.a(bnx.b, $$0);
         this.e(bnx.b);
      } else {
         this.b(bnx.b, $$0);
      }
   }

   @Override
   public boolean k(cpd $$0) {
      return this.dM().Z().b(cvn.c) && this.fM() && cgc.a(this, $$0);
   }

   protected boolean p(cpd $$0) {
      bnx $$1 = bok.h($$0);
      cpd $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cpd $$0, cpd $$1) {
      if (ctn.d($$1)) {
         return false;
      } else {
         boolean $$2 = cgc.a($$0) || $$0.a(cpg.vP);
         boolean $$3 = cgc.a($$1) || $$1.a(cpg.vP);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gh() && !$$0.a(cpg.vP) && $$1.a(cpg.vP) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cdw $$0) {
      this.a($$0);
      cgc.a(this, $$0);
   }

   @Override
   public boolean a(bnq $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == bnw.Y) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bnq b(bnq $$0, int $$1) {
      List<bnq> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected atk y() {
      return this.dM().B ? null : cgc.c(this).orElse(null);
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.te;
   }

   @Override
   protected atk n_() {
      return atl.tc;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.tg, 0.15F, 1.0F);
   }

   @Override
   protected void gk() {
      this.b(atl.th);
   }
}
