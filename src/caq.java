import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class caq extends cap implements bzb, cbl {
   private static final aef<Boolean> bV = aei.a(caq.class, aeh.k);
   private static final aef<Boolean> bW = aei.a(caq.class, aeh.k);
   private static final aef<Boolean> bX = aei.a(caq.class, aeh.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bkq bZ = new bkq(bY, "Baby speed boost", 0.2F, bkq.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bhl cj = new bhl(8);
   private boolean ck;
   protected static final ImmutableList<bts<? extends btr<? super caq>>> bT = ImmutableList.of(bts.c, bts.d, bts.b, bts.f, bts.k);
   protected static final ImmutableList<bsn<?>> bU = ImmutableList.of(
      bsn.n,
      bsn.v,
      bsn.g,
      bsn.h,
      bsn.k,
      bsn.l,
      bsn.an,
      bsn.am,
      bsn.K,
      bsn.aO,
      bsn.x,
      bsn.y,
      new bsn[]{
         bsn.m,
         bsn.E,
         bsn.o,
         bsn.p,
         bsn.q,
         bsn.t,
         bsn.aa,
         bsn.ab,
         bsn.z,
         bsn.ac,
         bsn.ad,
         bsn.af,
         bsn.ae,
         bsn.ah,
         bsn.ai,
         bsn.ag,
         bsn.ak,
         bsn.L,
         bsn.aq,
         bsn.s,
         bsn.ar,
         bsn.as,
         bsn.aj,
         bsn.al,
         bsn.at,
         bsn.au,
         bsn.av
      }
   );

   public caq(bja<? extends cap> $$0, cqb $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(qw $$0) {
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
   public void a(qw $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @atd
   @Override
   public bhl y() {
      return this.cj;
   }

   @Override
   protected void a(bhu $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bza $$4 && $$4.gf()) {
         cjl $$5 = new cjl(cjo.tx);
         $$4.gg();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cjl l(cjl $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cjl $$0) {
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
   public void a(aef<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.i_();
      }
   }

   public static bkr.a gl() {
      return bzo.gk().a(bks.l, 16.0).a(bks.m, 0.35F).a(bks.c, 5.0);
   }

   public static boolean b(bja<caq> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return !$$1.a_($$3.d()).a(cte.kK);
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      ash $$5 = $$0.D_();
      if ($$2 != bjq.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gf()) {
            this.a(bjb.a, this.gn());
         }
      }

      car.a(this, $$0.D_());
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
      return !this.fL();
   }

   @Override
   protected void a(ash $$0, bhc $$1) {
      if (this.gf()) {
         this.a(bjb.f, new cjl(cjo.pa), $$0);
         this.a(bjb.e, new cjl(cjo.pb), $$0);
         this.a(bjb.d, new cjl(cjo.pc), $$0);
         this.a(bjb.c, new cjl(cjo.pd), $$0);
      }
   }

   private void a(bjb $$0, cjl $$1, ash $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bkm.b<caq> dO() {
      return bkm.a(bU, bT);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      return car.a(this, this.dO().a($$0));
   }

   @Override
   public bkm<caq> dN() {
      return (bkm<caq>)super.dN();
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      bhe $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dL().B) {
         return car.a(this, $$0, $$1);
      } else {
         boolean $$3 = car.b(this, $$0.b($$1)) && this.gg() != cas.d;
         return $$3 ? bhe.a : bhe.d;
      }
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      float $$2 = super.b($$0, $$1);
      return this.m_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(bV, $$0);
      if (!this.dL().B) {
         bko $$1 = this.a(bks.m);
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
      this.dN().a((akt)this.dL(), this);
      this.dL().ad().c();
      car.a(this);
      super.X();
   }

   @Override
   public int ed() {
      return this.bJ;
   }

   @Override
   protected void c(akt $$0) {
      car.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cjl gn() {
      return (double)this.ag.i() < 0.5 ? new cjl(cjo.uZ) : new cjl(cjo.oh);
   }

   private boolean go() {
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
   public cas gg() {
      if (this.gm()) {
         return cas.e;
      } else if (car.a(this.eT())) {
         return cas.d;
      } else if (this.fW() && this.gh()) {
         return cas.a;
      } else if (this.go()) {
         return cas.c;
      } else {
         return this.fW() && this.b(cjo.uZ) ? cas.b : cas.f;
      }
   }

   public boolean gm() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bjm) {
            car.a(this, (bjm)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bjm $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bjm $$0, cjl $$1, ccs $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(ckb $$0) {
      return $$0 == cjo.uZ;
   }

   protected void n(cjl $$0) {
      this.b(bjb.a, $$0);
   }

   protected void o(cjl $$0) {
      if ($$0.a(car.c)) {
         this.a(bjb.b, $$0);
         this.e(bjb.b);
      } else {
         this.b(bjb.b, $$0);
      }
   }

   @Override
   public boolean k(cjl $$0) {
      return this.dL().X().b(cpx.c) && this.fK() && car.a(this, $$0);
   }

   protected boolean p(cjl $$0) {
      bjb $$1 = bjo.h($$0);
      cjl $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cjl $$0, cjl $$1) {
      if (cnw.d($$1)) {
         return false;
      } else {
         boolean $$2 = car.a($$0) || $$0.a(cjo.uZ);
         boolean $$3 = car.a($$1) || $$1.a(cjo.uZ);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gf() && !$$0.a(cjo.uZ) && $$1.a(cjo.uZ) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(byt $$0) {
      this.a($$0);
      car.a(this, $$0);
   }

   @Override
   public boolean a(biw $$0, boolean $$1) {
      if (this.m_() && $$0.ag() == bja.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private biw b(biw $$0, int $$1) {
      List<biw> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected apf w() {
      return this.dL().B ? null : car.c(this).orElse(null);
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.rZ;
   }

   @Override
   protected apf l_() {
      return apg.rX;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.sb, 0.15F, 1.0F);
   }

   protected void b(apf $$0) {
      this.a($$0, this.eV(), this.eW());
   }

   @Override
   protected void gi() {
      this.b(apg.sc);
   }
}
