import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class bxe extends bxd implements bvp, bxz {
   private static final aby<Boolean> bV = acb.a(bxe.class, aca.k);
   private static final aby<Boolean> bW = acb.a(bxe.class, aca.k);
   private static final aby<Boolean> bX = acb.a(bxe.class, aca.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bhe bZ = new bhe(bY, "Baby speed boost", 0.2F, bhe.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bee cj = new bee(8);
   private boolean ck;
   protected static final ImmutableList<bqg<? extends bqf<? super bxe>>> bT = ImmutableList.of(bqg.c, bqg.d, bqg.b, bqg.f, bqg.k);
   protected static final ImmutableList<bpb<?>> bU = ImmutableList.of(
      bpb.n,
      bpb.v,
      bpb.g,
      bpb.h,
      bpb.k,
      bpb.l,
      bpb.an,
      bpb.am,
      bpb.K,
      bpb.aO,
      bpb.x,
      bpb.y,
      new bpb[]{
         bpb.m,
         bpb.E,
         bpb.o,
         bpb.p,
         bpb.q,
         bpb.t,
         bpb.aa,
         bpb.ab,
         bpb.z,
         bpb.ac,
         bpb.ad,
         bpb.af,
         bpb.ae,
         bpb.ah,
         bpb.ai,
         bpb.ag,
         bpb.ak,
         bpb.L,
         bpb.aq,
         bpb.s,
         bpb.ar,
         bpb.as,
         bpb.aj,
         bpb.al,
         bpb.at,
         bpb.au,
         bpb.av
      }
   );

   public bxe(bfn<? extends bxd> $$0, cmm $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.h_()) {
         $$0.a("IsBaby", true);
      }

      if (this.ck) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @aqa
   @Override
   public bee w() {
      return this.cj;
   }

   @Override
   protected void a(ben $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bvo $$4 && $$4.fZ()) {
         cfz $$5 = new cfz(cgc.tx);
         $$4.ga();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cfz l(cfz $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cfz $$0) {
      return this.cj.b($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bV, false);
      this.am.a(bW, false);
      this.am.a(bX, false);
   }

   @Override
   public void a(aby<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.d_();
      }
   }

   public static bhf.a gf() {
      return bwc.ge().a(bhg.a, 16.0).a(bhg.d, 0.35F).a(bhg.f, 5.0);
   }

   public static boolean b(bfn<bxe> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return !$$1.a_($$3.d()).a(cpo.kK);
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      apf $$5 = $$0.y_();
      if ($$2 != bgd.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.fZ()) {
            this.a(bfo.a, this.gh());
         }
      }

      bxf.a(this, $$0.y_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean U() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fH();
   }

   @Override
   protected void a(apf $$0, bdv $$1) {
      if (this.fZ()) {
         this.a(bfo.f, new cfz(cgc.pa), $$0);
         this.a(bfo.e, new cfz(cgc.pb), $$0);
         this.a(bfo.d, new cfz(cgc.pc), $$0);
         this.a(bfo.c, new cfz(cgc.pd), $$0);
      }
   }

   private void a(bfo $$0, cfz $$1, apf $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bha.b<bxe> dL() {
      return bha.a(bU, bT);
   }

   @Override
   protected bha<?> a(Dynamic<?> $$0) {
      return bxf.a(this, this.dL().a($$0));
   }

   @Override
   public bha<bxe> dK() {
      return (bha<bxe>)super.dK();
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      bdx $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dI().B) {
         return bxf.a(this, $$0, $$1);
      } else {
         boolean $$3 = bxf.b(this, $$0.b($$1)) && this.ga() != bxg.d;
         return $$3 ? bdx.a : bdx.d;
      }
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      float $$2 = super.b($$0, $$1);
      return this.h_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public double bx() {
      return (double)this.de() * 0.92;
   }

   @Override
   public void a(boolean $$0) {
      this.aj().b(bV, $$0);
      if (!this.dI().B) {
         bhc $$1 = this.a(bhg.d);
         $$1.d(bZ);
         if ($$0) {
            $$1.b(bZ);
         }
      }
   }

   @Override
   public boolean h_() {
      return this.aj().b(bV);
   }

   private void y(boolean $$0) {
      this.ck = $$0;
   }

   @Override
   protected boolean q() {
      return !this.ck;
   }

   @Override
   protected void W() {
      this.dI().ad().a("piglinBrain");
      this.dK().a((aif)this.dI(), this);
      this.dI().ad().c();
      bxf.a(this);
      super.W();
   }

   @Override
   public int ea() {
      return this.bJ;
   }

   @Override
   protected void c(aif $$0) {
      bxf.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cfz gh() {
      return (double)this.af.i() < 0.5 ? new cfz(cgc.uZ) : new cfz(cgc.oh);
   }

   private boolean gi() {
      return this.am.b(bW);
   }

   @Override
   public void b(boolean $$0) {
      this.am.b(bW, $$0);
   }

   @Override
   public void a() {
      this.bc = 0;
   }

   @Override
   public bxg ga() {
      if (this.gg()) {
         return bxg.e;
      } else if (bxf.a(this.eP())) {
         return bxg.d;
      } else if (this.fS() && this.gb()) {
         return bxg.a;
      } else if (this.gi()) {
         return bxg.c;
      } else {
         return this.fS() && this.b(cgc.uZ) ? bxg.b : bxg.f;
      }
   }

   public boolean gg() {
      return this.am.b(bX);
   }

   public void x(boolean $$0) {
      this.am.b(bX, $$0);
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dI().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bfz) {
            bxf.a(this, (bfz)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bfz $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bfz $$0, cfz $$1, bzg $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cgp $$0) {
      return $$0 == cgc.uZ;
   }

   protected void n(cfz $$0) {
      this.b(bfo.a, $$0);
   }

   protected void o(cfz $$0) {
      if ($$0.a(bxf.c)) {
         this.a(bfo.b, $$0);
         this.e(bfo.b);
      } else {
         this.b(bfo.b, $$0);
      }
   }

   @Override
   public boolean k(cfz $$0) {
      return this.dI().X().b(cmi.c) && this.fG() && bxf.a(this, $$0);
   }

   protected boolean p(cfz $$0) {
      bfo $$1 = bgb.h($$0);
      cfz $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cfz $$0, cfz $$1) {
      if (cki.d($$1)) {
         return false;
      } else {
         boolean $$2 = bxf.a($$0) || $$0.a(cgc.uZ);
         boolean $$3 = bxf.a($$1) || $$1.a(cgc.uZ);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.fZ() && !$$0.a(cgc.uZ) && $$1.a(cgc.uZ) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(bvh $$0) {
      this.a($$0);
      bxf.a(this, $$0);
   }

   @Override
   public boolean a(bfj $$0, boolean $$1) {
      if (this.h_() && $$0.ae() == bfn.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bfj b(bfj $$0, int $$1) {
      List<bfj> $$2 = $$0.cN();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected amg s() {
      return this.dI().B ? null : bxf.c(this).orElse(null);
   }

   @Override
   protected amg d(ben $$0) {
      return amh.rZ;
   }

   @Override
   protected amg g_() {
      return amh.rX;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(amh.sb, 0.15F, 1.0F);
   }

   protected void b(amg $$0) {
      this.a($$0, this.eR(), this.eS());
   }

   @Override
   protected void gc() {
      this.b(amh.sc);
   }
}
