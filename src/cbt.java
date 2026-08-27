import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbt extends cba {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bmc c = new bmc(b, "Baby speed boost", 0.5, bmc.a.b);
   private static final afm<Boolean> d = afp.a(cbt.class, afo.k);
   private static final afm<Integer> bX = afp.a(cbt.class, afo.b);
   private static final afm<Boolean> bY = afp.a(cbt.class, afo.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bin> ca = $$0 -> $$0 == bin.d;
   private final brd cb = new brd(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public cbt(bkm<? extends cbt> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cbt(crs $$0) {
      this(bkm.bp, $$0);
   }

   @Override
   protected void z() {
      this.bO.a(4, new cbt.a(this, 1.0, 3));
      this.bO.a(8, new bsb(this, cdm.class, 8.0F));
      this.bO.a(8, new bso(this));
      this.s();
   }

   @Override
   protected void s() {
      this.bO.a(2, new bti(this, 1.0, false));
      this.bO.a(6, new bsf(this, 1.0, true, 4, this::gm));
      this.bO.a(7, new btg(this, 1.0));
      this.bP.a(1, new btl(this).a(cbv.class));
      this.bP.a(2, new btm<>(this, cdm.class, true));
      this.bP.a(3, new btm<>(this, ccu.class, false));
      this.bP.a(3, new btm<>(this, bwv.class, true));
      this.bP.a(5, new btm<>(this, bxk.class, 10, true, false, bxk.bU));
   }

   public static bmd.a gi() {
      return cba.gk().a(bme.g, 35.0).a(bme.m, 0.23F).a(bme.c, 3.0).a(bme.a, 2.0).a(bme.n);
   }

   @Override
   protected void b_() {
      super.b_();
      this.al().a(d, false);
      this.al().a(bX, 0);
      this.al().a(bY, false);
   }

   public boolean gl() {
      return this.al().b(bY);
   }

   public boolean gm() {
      return this.cc;
   }

   public void x(boolean $$0) {
      if (this.t() && bvp.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bug)this.L()).b($$0);
            if ($$0) {
               this.bO.a(1, this.cb);
            } else {
               this.bO.a(this.cb);
            }
         }
      } else if (this.cc) {
         this.bO.a(this.cb);
         this.cc = false;
      }
   }

   protected boolean t() {
      return true;
   }

   @Override
   public boolean n_() {
      return this.al().b(d);
   }

   @Override
   public int ed() {
      if (this.n_()) {
         this.bJ = (int)((double)this.bJ * 2.5);
      }

      return super.ed();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (this.dL() != null && !this.dL().B) {
         bma $$1 = this.a(bme.m);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(afm<?> $$0) {
      if (d.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gf() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dL().B && this.bv() && !this.fU()) {
         if (this.gl()) {
            this.ce--;
            if (this.ce < 0) {
               this.gh();
            }
         } else if (this.gf()) {
            if (this.a(arh.a)) {
               this.cd++;
               if (this.cd >= 600) {
                  this.b(300);
               }
            } else {
               this.cd = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void c_() {
      if (this.bv()) {
         boolean $$0 = this.ac_() && this.fY();
         if ($$0) {
            clb $$1 = this.c(bkn.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bkn.f);
                     this.a(bkn.f, clb.b);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.g(8);
            }
         }
      }

      super.c_();
   }

   private void b(int $$0) {
      this.ce = $$0;
      this.al().b(bY, true);
   }

   protected void gh() {
      this.b(bkm.y);
      if (!this.aS()) {
         this.dL().a(null, 1040, this.dl(), 0);
      }
   }

   protected void b(bkm<? extends cbt> $$0) {
      cbt $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dL().d_($$1.dl()).d());
         $$1.x($$1.t() && this.gm());
      }
   }

   protected boolean ac_() {
      return true;
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dL() instanceof ama)) {
         return false;
      } else {
         ama $$2 = (ama)this.dL();
         bky $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof bky) {
            $$3 = (bky)$$0.d();
         }

         if ($$3 != null && this.dL().ai() == bin.d && (double)this.ag.i() < this.b(bme.n) && this.dL().X().b(cro.e)) {
            int $$4 = ati.a(this.dq());
            int $$5 = ati.a(this.ds());
            int $$6 = ati.a(this.dw());
            cbt $$7 = new cbt(this.dL());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ati.a(this.ag, 7, 40) * ati.a(this.ag, -1, 1);
               int $$10 = $$5 + ati.a(this.ag, 7, 40) * ati.a(this.ag, -1, 1);
               int $$11 = $$6 + ati.a(this.ag, 7, 40) * ati.a(this.ag, -1, 1);
               ht $$12 = new ht($$9, $$10, $$11);
               bkm<?> $$13 = $$7.ag();
               bls.c $$14 = bls.a($$13);
               if (csd.a($$14, this.dL(), $$12, $$13) && bls.a($$13, $$2, blc.j, $$12, this.dL().z)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dL().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dL().f($$7) && this.dL().g($$7) && !this.dL().d($$7.cG())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dL().d_($$7.dl()), blc.j, null, null);
                     $$2.a_($$7);
                     this.a(bme.n).c(new bmc("Zombie reinforcement caller charge", -0.05F, bmc.a.a));
                     $$7.a(bme.n).c(new bmc("Zombie reinforcement callee charge", -0.05F, bmc.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bki $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dL().d_(this.dl()).b();
         if (this.eS().b() && this.bM() && this.ag.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected aqm w() {
      return aqn.Bf;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.Bp;
   }

   @Override
   protected aqm m_() {
      return aqn.Bk;
   }

   protected aqm y() {
      return aqn.Bv;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public bld eR() {
      return bld.b;
   }

   @Override
   protected void a(ato $$0, bio $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dL().ai() == bin.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bkn.a, new clb(cle.om));
         } else {
            this.a(bkn.a, new clb(cle.on));
         }
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gm());
      $$0.a("InWaterTime", this.aX() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gl() ? this.ce : -1);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(ama $$0, bky $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ai() == bin.c || $$0.ai() == bin.d) && $$1 instanceof ccz $$3) {
         if ($$0.ai() != bin.d && this.ag.h()) {
            return $$2;
         }

         cbu $$4 = $$3.a(bkm.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dl()), blc.i, new cbt.b(false, true), null);
            $$4.a($$3.gp());
            $$4.a($$3.gz().a(sn.a));
            $$4.c($$3.gg().a());
            $$4.b($$3.t());
            if (!this.aS()) {
               $$0.a(null, 1026, this.dl(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return this.n_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(clb $$0) {
      return $$0.a(cle.qd) && this.n_() && this.bN() ? false : super.j($$0);
   }

   @Override
   public boolean k(clb $$0) {
      return $$0.a(cle.qs) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ato $$5 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new cbt.b(a($$5), true);
      }

      if ($$3 instanceof cbt.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bwo> $$8 = $$0.a(bwo.class, this.cG().c(5.0, 3.0, 5.0), bkl.c);
                  if (!$$8.isEmpty()) {
                     bwo $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bwo $$10 = bkm.q.a(this.dL());
                  if ($$10 != null) {
                     $$10.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
                     $$10.a($$0, $$1, blc.g, null, null);
                     $$10.w(true);
                     this.n($$10);
                     $$0.b($$10);
                  }
               }
            }
         }

         this.x(this.t() && $$5.i() < $$6 * 0.1F);
         this.a($$5, $$1);
         this.b($$5, $$1);
      }

      if (this.c(bkn.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bkn.f, new clb($$5.i() < 0.1F ? cuv.ef : cuv.ee));
            this.bR[bkn.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(ato $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gn();
      this.a(bme.i).c(new bmc("Random spawn bonus", this.ag.j() * 0.05F, bmc.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bme.g).c(new bmc("Random zombie-spawn bonus", $$1, bmc.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bme.n).c(new bmc("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bmc.a.a));
         this.a(bme.l).c(new bmc("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bmc.a.c));
         this.x(this.t());
      }
   }

   protected void gn() {
      this.a(bme.n).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(bki $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bjg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cam $$4 && $$4.gf()) {
         clb $$5 = this.ge();
         if (!$$5.b()) {
            $$4.gg();
            this.b($$5);
         }
      }
   }

   protected clb ge() {
      return new clb(cle.tv);
   }

   class a extends bsv {
      a(blh $$0, double $$1, int $$2) {
         super(cuv.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(crt $$0, ht $$1) {
         $$0.a(null, $$1, aqn.Bl, aqo.f, 0.5F, 0.9F + cbt.this.ag.i() * 0.2F);
      }

      @Override
      public void a(crs $$0, ht $$1) {
         $$0.a(null, $$1, aqn.yp, aqo.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements blr {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
