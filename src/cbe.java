import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbe extends cal {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bln c = new bln(b, "Baby speed boost", 0.5, bln.a.b);
   private static final afc<Boolean> d = aff.a(cbe.class, afe.k);
   private static final afc<Integer> bX = aff.a(cbe.class, afe.b);
   private static final afc<Boolean> bY = aff.a(cbe.class, afe.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bhy> ca = $$0 -> $$0 == bhy.d;
   private final bqo cb = new bqo(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public cbe(bjx<? extends cbe> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cbe(cqz $$0) {
      this(bjx.bp, $$0);
   }

   @Override
   protected void z() {
      this.bO.a(4, new cbe.a(this, 1.0, 3));
      this.bO.a(8, new brm(this, ccx.class, 8.0F));
      this.bO.a(8, new brz(this));
      this.s();
   }

   @Override
   protected void s() {
      this.bO.a(2, new bst(this, 1.0, false));
      this.bO.a(6, new brq(this, 1.0, true, 4, this::gm));
      this.bO.a(7, new bsr(this, 1.0));
      this.bP.a(1, new bsw(this).a(cbg.class));
      this.bP.a(2, new bsx<>(this, ccx.class, true));
      this.bP.a(3, new bsx<>(this, ccf.class, false));
      this.bP.a(3, new bsx<>(this, bwg.class, true));
      this.bP.a(5, new bsx<>(this, bwv.class, 10, true, false, bwv.bU));
   }

   public static blo.a gi() {
      return cal.gk().a(blp.g, 35.0).a(blp.m, 0.23F).a(blp.c, 3.0).a(blp.a, 2.0).a(blp.n);
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
      if (this.t() && bva.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((btr)this.L()).b($$0);
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
         bll $$1 = this.a(blp.m);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(afc<?> $$0) {
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
            if (this.a(aqx.a)) {
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
            ckj $$1 = this.c(bjy.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bjy.f);
                     this.a(bjy.f, ckj.b);
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
      this.b(bjx.y);
      if (!this.aS()) {
         this.dL().a(null, 1040, this.dl(), 0);
      }
   }

   protected void b(bjx<? extends cbe> $$0) {
      cbe $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dL().d_($$1.dl()).d());
         $$1.x($$1.t() && this.gm());
      }
   }

   protected boolean ac_() {
      return true;
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dL() instanceof alq)) {
         return false;
      } else {
         alq $$2 = (alq)this.dL();
         bkj $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof bkj) {
            $$3 = (bkj)$$0.d();
         }

         if ($$3 != null && this.dL().ai() == bhy.d && (double)this.ag.i() < this.b(blp.n) && this.dL().X().b(cqv.e)) {
            int $$4 = asy.a(this.dq());
            int $$5 = asy.a(this.ds());
            int $$6 = asy.a(this.dw());
            cbe $$7 = new cbe(this.dL());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + asy.a(this.ag, 7, 40) * asy.a(this.ag, -1, 1);
               int $$10 = $$5 + asy.a(this.ag, 7, 40) * asy.a(this.ag, -1, 1);
               int $$11 = $$6 + asy.a(this.ag, 7, 40) * asy.a(this.ag, -1, 1);
               ht $$12 = new ht($$9, $$10, $$11);
               bjx<?> $$13 = $$7.ag();
               bld.c $$14 = bld.a($$13);
               if (crk.a($$14, this.dL(), $$12, $$13) && bld.a($$13, $$2, bkn.j, $$12, this.dL().z)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dL().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dL().f($$7) && this.dL().g($$7) && !this.dL().d($$7.cG())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dL().d_($$7.dl()), bkn.j, null, null);
                     $$2.a_($$7);
                     this.a(blp.n).c(new bln("Zombie reinforcement caller charge", -0.05F, bln.a.a));
                     $$7.a(blp.n).c(new bln("Zombie reinforcement callee charge", -0.05F, bln.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bjt $$0) {
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
   protected aqc w() {
      return aqd.Bd;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.Bn;
   }

   @Override
   protected aqc m_() {
      return aqd.Bi;
   }

   protected aqc y() {
      return aqd.Bt;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public bko eR() {
      return bko.b;
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dL().ai() == bhy.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bjy.a, new ckj(ckm.om));
         } else {
            this.a(bjy.a, new ckj(ckm.on));
         }
      }
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gm());
      $$0.a("InWaterTime", this.aX() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gl() ? this.ce : -1);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(alq $$0, bkj $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ai() == bhy.c || $$0.ai() == bhy.d) && $$1 instanceof cck $$3) {
         if ($$0.ai() != bhy.d && this.ag.h()) {
            return $$2;
         }

         cbf $$4 = $$3.a(bjx.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dl()), bkn.i, new cbe.b(false, true), null);
            $$4.a($$3.gp());
            $$4.a($$3.gz().a(sf.a));
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
   protected float b(bkv $$0, bju $$1) {
      return this.n_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(ckj $$0) {
      return $$0.a(ckm.qd) && this.n_() && this.bN() ? false : super.j($$0);
   }

   @Override
   public boolean k(ckj $$0) {
      return $$0.a(ckm.qs) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      ate $$5 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new cbe.b(a($$5), true);
      }

      if ($$3 instanceof cbe.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bvz> $$8 = $$0.a(bvz.class, this.cG().c(5.0, 3.0, 5.0), bjw.c);
                  if (!$$8.isEmpty()) {
                     bvz $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bvz $$10 = bjx.q.a(this.dL());
                  if ($$10 != null) {
                     $$10.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
                     $$10.a($$0, $$1, bkn.g, null, null);
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

      if (this.c(bjy.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bjy.f, new ckj($$5.i() < 0.1F ? cuc.ef : cuc.ee));
            this.bR[bjy.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(ate $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gn();
      this.a(blp.i).c(new bln("Random spawn bonus", this.ag.j() * 0.05F, bln.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(blp.g).c(new bln("Random zombie-spawn bonus", $$1, bln.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(blp.n).c(new bln("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bln.a.a));
         this.a(blp.l).c(new bln("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bln.a.c));
         this.x(this.t());
      }
   }

   protected void gn() {
      this.a(blp.n).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(bjt $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bir $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bzx $$4 && $$4.gf()) {
         ckj $$5 = this.ge();
         if (!$$5.b()) {
            $$4.gg();
            this.b($$5);
         }
      }
   }

   protected ckj ge() {
      return new ckj(ckm.tu);
   }

   class a extends bsg {
      a(bks $$0, double $$1, int $$2) {
         super(cuc.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cra $$0, ht $$1) {
         $$0.a(null, $$1, aqd.Bj, aqe.f, 0.5F, 0.9F + cbe.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cqz $$0, ht $$1) {
         $$0.a(null, $$1, aqd.yn, aqe.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements blc {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
