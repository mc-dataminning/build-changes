import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cad extends bzk {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bkm c = new bkm(b, "Baby speed boost", 0.5, bkm.a.b);
   private static final aeg<Boolean> d = aej.a(cad.class, aei.k);
   private static final aeg<Integer> bX = aej.a(cad.class, aei.b);
   private static final aeg<Boolean> bY = aej.a(cad.class, aei.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bgx> ca = $$0 -> $$0 == bgx.d;
   private final bpn cb = new bpn(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public cad(biw<? extends cad> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cad(cpx $$0) {
      this(biw.bp, $$0);
   }

   @Override
   protected void z() {
      this.bO.a(4, new cad.a(this, 1.0, 3));
      this.bO.a(8, new bql(this, cbw.class, 8.0F));
      this.bO.a(8, new bqy(this));
      this.s();
   }

   @Override
   protected void s() {
      this.bO.a(2, new brs(this, 1.0, false));
      this.bO.a(6, new bqp(this, 1.0, true, 4, this::gl));
      this.bO.a(7, new brq(this, 1.0));
      this.bP.a(1, new brv(this).a(caf.class));
      this.bP.a(2, new brw<>(this, cbw.class, true));
      this.bP.a(3, new brw<>(this, cbe.class, false));
      this.bP.a(3, new brw<>(this, bvf.class, true));
      this.bP.a(5, new brw<>(this, bvu.class, 10, true, false, bvu.bU));
   }

   public static bkn.a gh() {
      return bzk.gj().a(bko.b, 35.0).a(bko.d, 0.23F).a(bko.f, 3.0).a(bko.i, 2.0).a(bko.m);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(d, false);
      this.al().a(bX, 0);
      this.al().a(bY, false);
   }

   public boolean gk() {
      return this.al().b(bY);
   }

   public boolean gl() {
      return this.cc;
   }

   public void x(boolean $$0) {
      if (this.t() && btz.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bsq)this.L()).b($$0);
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
   public boolean m_() {
      return this.al().b(d);
   }

   @Override
   public int ed() {
      if (this.m_()) {
         this.bJ = (int)((double)this.bJ * 2.5);
      }

      return super.ed();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (this.dL() != null && !this.dL().B) {
         bkk $$1 = this.a(bko.d);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(aeg<?> $$0) {
      if (d.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   protected boolean ge() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dL().B && this.bv() && !this.fT()) {
         if (this.gk()) {
            this.ce--;
            if (this.ce < 0) {
               this.gg();
            }
         } else if (this.ge()) {
            if (this.a(apz.a)) {
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
   public void b_() {
      if (this.bv()) {
         boolean $$0 = this.ab_() && this.fX();
         if ($$0) {
            cjh $$1 = this.c(bix.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bix.f);
                     this.a(bix.f, cjh.b);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.g(8);
            }
         }
      }

      super.b_();
   }

   private void b(int $$0) {
      this.ce = $$0;
      this.al().b(bY, true);
   }

   protected void gg() {
      this.b(biw.y);
      if (!this.aS()) {
         this.dL().a(null, 1040, this.dl(), 0);
      }
   }

   protected void b(biw<? extends cad> $$0) {
      cad $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dL().d_($$1.dl()).d());
         $$1.x($$1.t() && this.gl());
      }
   }

   protected boolean ab_() {
      return true;
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dL() instanceof aks)) {
         return false;
      } else {
         aks $$2 = (aks)this.dL();
         bji $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof bji) {
            $$3 = (bji)$$0.d();
         }

         if ($$3 != null && this.dL().ai() == bgx.d && (double)this.ag.i() < this.b(bko.m) && this.dL().X().b(cpt.e)) {
            int $$4 = ary.a(this.dq());
            int $$5 = ary.a(this.ds());
            int $$6 = ary.a(this.dw());
            cad $$7 = new cad(this.dL());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ary.a(this.ag, 7, 40) * ary.a(this.ag, -1, 1);
               int $$10 = $$5 + ary.a(this.ag, 7, 40) * ary.a(this.ag, -1, 1);
               int $$11 = $$6 + ary.a(this.ag, 7, 40) * ary.a(this.ag, -1, 1);
               gw $$12 = new gw($$9, $$10, $$11);
               biw<?> $$13 = $$7.ag();
               bkc.c $$14 = bkc.a($$13);
               if (cqi.a($$14, this.dL(), $$12, $$13) && bkc.a($$13, $$2, bjm.j, $$12, this.dL().z)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dL().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dL().f($$7) && this.dL().g($$7) && !this.dL().d($$7.cG())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dL().d_($$7.dl()), bjm.j, null, null);
                     $$2.a_($$7);
                     this.a(bko.m).c(new bkm("Zombie reinforcement caller charge", -0.05F, bkm.a.a));
                     $$7.a(bko.m).c(new bkm("Zombie reinforcement callee charge", -0.05F, bkm.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bis $$0) {
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
   protected ape w() {
      return apf.Ba;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.Bk;
   }

   @Override
   protected ape l_() {
      return apf.Bf;
   }

   protected ape y() {
      return apf.Bq;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public bjn eR() {
      return bjn.b;
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dL().ai() == bgx.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bix.a, new cjh(cjk.om));
         } else {
            this.a(bix.a, new cjh(cjk.on));
         }
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.m_());
      $$0.a("CanBreakDoors", this.gl());
      $$0.a("InWaterTime", this.aX() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gk() ? this.ce : -1);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aks $$0, bji $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ai() == bgx.c || $$0.ai() == bgx.d) && $$1 instanceof cbj $$3) {
         if ($$0.ai() != bgx.d && this.ag.h()) {
            return $$2;
         }

         cae $$4 = $$3.a(biw.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dl()), bjm.i, new cad.b(false, true), null);
            $$4.a($$3.go());
            $$4.a($$3.gy().a(rk.a));
            $$4.c($$3.gf().a());
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
   protected float b(bju $$0, bit $$1) {
      return this.m_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(cjh $$0) {
      return $$0.a(cjk.qd) && this.m_() && this.bN() ? false : super.j($$0);
   }

   @Override
   public boolean k(cjh $$0) {
      return $$0.a(cjk.qs) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      ase $$5 = $$0.D_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new cad.b(a($$5), true);
      }

      if ($$3 instanceof cad.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<buy> $$8 = $$0.a(buy.class, this.cG().c(5.0, 3.0, 5.0), biv.c);
                  if (!$$8.isEmpty()) {
                     buy $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  buy $$10 = biw.q.a(this.dL());
                  if ($$10 != null) {
                     $$10.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
                     $$10.a($$0, $$1, bjm.g, null, null);
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

      if (this.c(bix.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bix.f, new cjh($$5.i() < 0.1F ? csy.eg : csy.ef));
            this.bR[bix.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(ase $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gm();
      this.a(bko.c).c(new bkm("Random spawn bonus", this.ag.j() * 0.05F, bkm.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bko.b).c(new bkm("Random zombie-spawn bonus", $$1, bkm.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bko.m).c(new bkm("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bkm.a.a));
         this.a(bko.a).c(new bkm("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bkm.a.c));
         this.x(this.t());
      }
   }

   protected void gm() {
      this.a(bko.m).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(bis $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bhq $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byw $$4 && $$4.ge()) {
         cjh $$5 = this.gd();
         if (!$$5.b()) {
            $$4.gf();
            this.b($$5);
         }
      }
   }

   protected cjh gd() {
      return new cjh(cjk.tu);
   }

   class a extends brf {
      a(bjr $$0, double $$1, int $$2) {
         super(csy.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cpy $$0, gw $$1) {
         $$0.a(null, $$1, apf.Bg, apg.f, 0.5F, 0.9F + cad.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cpx $$0, gw $$1) {
         $$0.a(null, $$1, apf.yl, apg.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bkb {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
