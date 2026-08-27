import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgq extends cgp implements cet, chl {
   private static final aii<Boolean> bW = ail.a(cgq.class, aik.k);
   private static final aii<Boolean> bX = ail.a(cgq.class, aik.k);
   private static final aii<Boolean> bY = ail.a(cgq.class, aik.k);
   private static final UUID bZ = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bqc ca = new bqc(bZ, "Baby speed boost", 0.2F, bqc.a.b);
   private static final int cb = 16;
   private static final float cc = 0.35F;
   private static final int cd = 5;
   private static final float ce = 1.6F;
   private static final float cf = 0.1F;
   private static final int cg = 3;
   private static final float ch = 0.2F;
   private static final boi ci = bol.ay.n().a(0.5F).b(0.97F);
   private static final double cj = 0.5;
   private final bmu ck = new bmu(8);
   private boolean cl;
   protected static final ImmutableList<bzh<? extends bzg<? super cgq>>> e = ImmutableList.of(bzh.c, bzh.d, bzh.b, bzh.f, bzh.l);
   protected static final ImmutableList<bya<?>> bV = ImmutableList.of(
      bya.n,
      bya.v,
      bya.g,
      bya.h,
      bya.k,
      bya.l,
      bya.ao,
      bya.an,
      bya.L,
      bya.aP,
      bya.x,
      bya.y,
      new bya[]{
         bya.m,
         bya.E,
         bya.o,
         bya.p,
         bya.q,
         bya.t,
         bya.ab,
         bya.ac,
         bya.z,
         bya.ad,
         bya.ae,
         bya.ag,
         bya.af,
         bya.ai,
         bya.aj,
         bya.ah,
         bya.al,
         bya.M,
         bya.ar,
         bya.s,
         bya.as,
         bya.at,
         bya.ak,
         bya.am,
         bya.au,
         bya.av,
         bya.aw
      }
   );

   public cgq(bol<? extends cgp> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 5;
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cl) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @axp
   @Override
   public bmu A() {
      return this.ck;
   }

   @Override
   protected void a(bne $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ces $$4 && $$4.gm()) {
         cpq $$5 = new cpq(cpt.un);
         $$4.gn();
         this.b($$5);
      }

      this.ck.f().forEach(this::b);
   }

   protected cpq n(cpq $$0) {
      return this.ck.a($$0);
   }

   protected boolean o(cpq $$0) {
      return this.ck.b($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bW, false);
      this.am.a(bX, false);
      this.am.a(bY, false);
   }

   @Override
   public void a(aii<?> $$0) {
      super.a($$0);
      if (bW.equals($$0)) {
         this.k_();
      }
   }

   public static bqd.a gs() {
      return cfg.gr().a(bqe.n, 16.0).a(bqe.o, 0.35F).a(bqe.c, 5.0);
   }

   public static boolean b(bol<cgq> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return !$$1.a_($$3.d()).a(czh.kK);
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      awt $$4 = $$0.F_();
      if ($$2 != bpb.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gm()) {
            this.a(bom.a, this.gu());
         }
      }

      cgr.a(this, $$0.F_());
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean Y() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fS();
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      if (this.gm()) {
         this.a(bom.f, new cpq(cpt.pN), $$0);
         this.a(bom.e, new cpq(cpt.pO), $$0);
         this.a(bom.d, new cpq(cpt.pP), $$0);
         this.a(bom.c, new cpq(cpt.pQ), $$0);
      }
   }

   private void a(bom $$0, cpq $$1, awt $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bpy.b<cgq> dN() {
      return bpy.a(bV, e);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return cgr.a(this, this.dN().a($$0));
   }

   @Override
   public bpy<cgq> dM() {
      return (bpy<cgq>)super.dM();
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      bml $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dJ().B) {
         return cgr.a(this, $$0, $$1);
      } else {
         boolean $$3 = cgr.b(this, $$0.b($$1)) && this.gn() != cgs.d;
         return $$3 ? bml.a : bml.d;
      }
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? ci : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(bW, $$0);
      if (!this.dJ().B) {
         bqa $$1 = this.f(bqe.o);
         $$1.b(ca.a());
         if ($$0) {
            $$1.c(ca);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(bW);
   }

   private void y(boolean $$0) {
      this.cl = $$0;
   }

   @Override
   protected boolean u() {
      return !this.cl;
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("piglinBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().c();
      cgr.a(this);
      super.aa();
   }

   @Override
   public int ed() {
      return this.bK;
   }

   @Override
   protected void c(apa $$0) {
      cgr.b(this);
      this.ck.f().forEach(this::b);
      super.c($$0);
   }

   private cpq gu() {
      return (double)this.af.i() < 0.5 ? new cpq(cpt.vP) : new cpq(cpt.oU);
   }

   private boolean gv() {
      return this.am.b(bX);
   }

   @Override
   public void b(boolean $$0) {
      this.am.b(bX, $$0);
   }

   @Override
   public void a() {
      this.bc = 0;
   }

   @Override
   public cgs gn() {
      if (this.gt()) {
         return cgs.e;
      } else if (cgr.a(this.eS())) {
         return cgs.d;
      } else if (this.gd() && this.go()) {
         return cgs.a;
      } else if (this.gv()) {
         return cgs.c;
      } else {
         return this.gd() && this.b(cpt.vP) ? cgs.b : cgs.f;
      }
   }

   public boolean gt() {
      return this.am.b(bY);
   }

   public void x(boolean $$0) {
      this.am.b(bY, $$0);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dJ().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof box) {
            cgr.a(this, (box)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(box $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(box $$0, cpq $$1, cis $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cqg $$0) {
      return $$0 == cpt.vP;
   }

   protected void p(cpq $$0) {
      this.b(bom.a, $$0);
   }

   protected void q(cpq $$0) {
      if ($$0.a(cgr.c)) {
         this.a(bom.b, $$0);
         this.e(bom.b);
      } else {
         this.b(bom.b, $$0);
      }
   }

   @Override
   public boolean k(cpq $$0) {
      return this.dJ().Z().b(cwa.c) && this.fR() && cgr.a(this, $$0);
   }

   protected boolean r(cpq $$0) {
      bom $$1 = boz.h($$0);
      cpq $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cpq $$0, cpq $$1) {
      if (cua.d($$1)) {
         return false;
      } else {
         boolean $$2 = cgr.a($$0) || $$0.a(cpt.vP);
         boolean $$3 = cgr.a($$1) || $$1.a(cpt.vP);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gm() && !$$0.a(cpt.vP) && $$1.a(cpt.vP) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cel $$0) {
      this.a($$0);
      cgr.a(this, $$0);
   }

   @Override
   public boolean a(bof $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == bol.Y) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bof b(bof $$0, int $$1) {
      List<bof> $$2 = $$0.cM();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected ato y() {
      return this.dJ().B ? null : cgr.c(this).orElse(null);
   }

   @Override
   protected ato d(bne $$0) {
      return atp.te;
   }

   @Override
   protected ato n_() {
      return atp.tc;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.tg, 0.15F, 1.0F);
   }

   @Override
   protected void gp() {
      this.b(atp.th);
   }
}
