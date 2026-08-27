import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cam extends cal implements byx, cbh {
   private static final aeg<Boolean> bV = aej.a(cam.class, aei.k);
   private static final aeg<Boolean> bW = aej.a(cam.class, aei.k);
   private static final aeg<Boolean> bX = aej.a(cam.class, aei.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bkm bZ = new bkm(bY, "Baby speed boost", 0.2F, bkm.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bhh cj = new bhh(8);
   private boolean ck;
   protected static final ImmutableList<bto<? extends btn<? super cam>>> bT = ImmutableList.of(bto.c, bto.d, bto.b, bto.f, bto.k);
   protected static final ImmutableList<bsj<?>> bU = ImmutableList.of(
      bsj.n,
      bsj.v,
      bsj.g,
      bsj.h,
      bsj.k,
      bsj.l,
      bsj.an,
      bsj.am,
      bsj.K,
      bsj.aO,
      bsj.x,
      bsj.y,
      new bsj[]{
         bsj.m,
         bsj.E,
         bsj.o,
         bsj.p,
         bsj.q,
         bsj.t,
         bsj.aa,
         bsj.ab,
         bsj.z,
         bsj.ac,
         bsj.ad,
         bsj.af,
         bsj.ae,
         bsj.ah,
         bsj.ai,
         bsj.ag,
         bsj.ak,
         bsj.L,
         bsj.aq,
         bsj.s,
         bsj.ar,
         bsj.as,
         bsj.aj,
         bsj.al,
         bsj.at,
         bsj.au,
         bsj.av
      }
   );

   public cam(biw<? extends cal> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      if (this.m_()) {
         $$0.a("IsBaby", true);
      }

      if (this.ck) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @ata
   @Override
   public bhh y() {
      return this.cj;
   }

   @Override
   protected void a(bhq $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byw $$4 && $$4.ge()) {
         cjh $$5 = new cjh(cjk.tx);
         $$4.gf();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cjh l(cjh $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cjh $$0) {
      return this.cj.b($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bV, false);
      this.an.a(bW, false);
      this.an.a(bX, false);
   }

   @Override
   public void a(aeg<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.i_();
      }
   }

   public static bkn.a gk() {
      return bzk.gj().a(bko.a, 16.0).a(bko.d, 0.35F).a(bko.f, 5.0);
   }

   public static boolean b(biw<cam> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return !$$1.a_($$3.d()).a(csy.kK);
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      ase $$5 = $$0.D_();
      if ($$2 != bjm.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.ge()) {
            this.a(bix.a, this.gm());
         }
      }

      can.a(this, $$0.D_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean V() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fK();
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      if (this.ge()) {
         this.a(bix.f, new cjh(cjk.pa), $$0);
         this.a(bix.e, new cjh(cjk.pb), $$0);
         this.a(bix.d, new cjh(cjk.pc), $$0);
         this.a(bix.c, new cjh(cjk.pd), $$0);
      }
   }

   private void a(bix $$0, cjh $$1, ase $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bki.b<cam> dO() {
      return bki.a(bU, bT);
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      return can.a(this, this.dO().a($$0));
   }

   @Override
   public bki<cam> dN() {
      return (bki<cam>)super.dN();
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      bha $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dL().B) {
         return can.a(this, $$0, $$1);
      } else {
         boolean $$3 = can.b(this, $$0.b($$1)) && this.gf() != cao.d;
         return $$3 ? bha.a : bha.d;
      }
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      float $$2 = super.b($$0, $$1);
      return this.m_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(bV, $$0);
      if (!this.dL().B) {
         bkk $$1 = this.a(bko.d);
         $$1.b(bZ.a());
         if ($$0) {
            $$1.b(bZ);
         }
      }
   }

   @Override
   public boolean m_() {
      return this.al().b(bV);
   }

   private void y(boolean $$0) {
      this.ck = $$0;
   }

   @Override
   protected boolean s() {
      return !this.ck;
   }

   @Override
   protected void X() {
      this.dL().ad().a("piglinBrain");
      this.dN().a((aks)this.dL(), this);
      this.dL().ad().c();
      can.a(this);
      super.X();
   }

   @Override
   public int ed() {
      return this.bJ;
   }

   @Override
   protected void c(aks $$0) {
      can.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cjh gm() {
      return (double)this.ag.i() < 0.5 ? new cjh(cjk.uZ) : new cjh(cjk.oh);
   }

   private boolean gn() {
      return this.an.b(bW);
   }

   @Override
   public void b(boolean $$0) {
      this.an.b(bW, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public cao gf() {
      if (this.gl()) {
         return cao.e;
      } else if (can.a(this.eT())) {
         return cao.d;
      } else if (this.fV() && this.gg()) {
         return cao.a;
      } else if (this.gn()) {
         return cao.c;
      } else {
         return this.fV() && this.b(cjk.uZ) ? cao.b : cao.f;
      }
   }

   public boolean gl() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bji) {
            can.a(this, (bji)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bji $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bji $$0, cjh $$1, cco $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cjx $$0) {
      return $$0 == cjk.uZ;
   }

   protected void n(cjh $$0) {
      this.b(bix.a, $$0);
   }

   protected void o(cjh $$0) {
      if ($$0.a(can.c)) {
         this.a(bix.b, $$0);
         this.e(bix.b);
      } else {
         this.b(bix.b, $$0);
      }
   }

   @Override
   public boolean k(cjh $$0) {
      return this.dL().X().b(cpt.c) && this.fJ() && can.a(this, $$0);
   }

   protected boolean p(cjh $$0) {
      bix $$1 = bjk.h($$0);
      cjh $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cjh $$0, cjh $$1) {
      if (cns.d($$1)) {
         return false;
      } else {
         boolean $$2 = can.a($$0) || $$0.a(cjk.uZ);
         boolean $$3 = can.a($$1) || $$1.a(cjk.uZ);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.ge() && !$$0.a(cjk.uZ) && $$1.a(cjk.uZ) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(byp $$0) {
      this.a($$0);
      can.a(this, $$0);
   }

   @Override
   public boolean a(bis $$0, boolean $$1) {
      if (this.m_() && $$0.ag() == biw.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bis b(bis $$0, int $$1) {
      List<bis> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected ape w() {
      return this.dL().B ? null : can.c(this).orElse(null);
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.rZ;
   }

   @Override
   protected ape l_() {
      return apf.rX;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.sb, 0.15F, 1.0F);
   }

   protected void b(ape $$0) {
      this.a($$0, this.eV(), this.eW());
   }

   @Override
   protected void gh() {
      this.b(apf.sc);
   }
}
