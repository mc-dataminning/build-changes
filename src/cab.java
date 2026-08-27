import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cab extends bzi {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bkk c = new bkk(b, "Baby speed boost", 0.5, bkk.a.b);
   private static final aef<Boolean> d = aei.a(cab.class, aeh.k);
   private static final aef<Integer> bX = aei.a(cab.class, aeh.b);
   private static final aef<Boolean> bY = aei.a(cab.class, aeh.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bgv> ca = $$0 -> $$0 == bgv.d;
   private final bpl cb = new bpl(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public cab(biu<? extends cab> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public cab(cpv $$0) {
      this(biu.bp, $$0);
   }

   @Override
   protected void z() {
      this.bO.a(4, new cab.a(this, 1.0, 3));
      this.bO.a(8, new bqj(this, cbu.class, 8.0F));
      this.bO.a(8, new bqw(this));
      this.s();
   }

   @Override
   protected void s() {
      this.bO.a(2, new brq(this, 1.0, false));
      this.bO.a(6, new bqn(this, 1.0, true, 4, this::gl));
      this.bO.a(7, new bro(this, 1.0));
      this.bP.a(1, new brt(this).a(cad.class));
      this.bP.a(2, new bru<>(this, cbu.class, true));
      this.bP.a(3, new bru<>(this, cbc.class, false));
      this.bP.a(3, new bru<>(this, bvd.class, true));
      this.bP.a(5, new bru<>(this, bvs.class, 10, true, false, bvs.bU));
   }

   public static bkl.a gh() {
      return bzi.gj().a(bkm.b, 35.0).a(bkm.d, 0.23F).a(bkm.f, 3.0).a(bkm.i, 2.0).a(bkm.m);
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
      if (this.t() && btx.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bso)this.L()).b($$0);
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
         bki $$1 = this.a(bkm.d);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(aef<?> $$0) {
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
            if (this.a(apy.a)) {
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
            cjf $$1 = this.c(biv.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(biv.f);
                     this.a(biv.f, cjf.b);
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
      this.b(biu.y);
      if (!this.aS()) {
         this.dL().a(null, 1040, this.dl(), 0);
      }
   }

   protected void b(biu<? extends cab> $$0) {
      cab $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dL().d_($$1.dl()).d());
         $$1.x($$1.t() && this.gl());
      }
   }

   protected boolean ab_() {
      return true;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dL() instanceof akr)) {
         return false;
      } else {
         akr $$2 = (akr)this.dL();
         bjg $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof bjg) {
            $$3 = (bjg)$$0.d();
         }

         if ($$3 != null && this.dL().ai() == bgv.d && (double)this.ag.i() < this.b(bkm.m) && this.dL().X().b(cpr.e)) {
            int $$4 = arx.a(this.dq());
            int $$5 = arx.a(this.ds());
            int $$6 = arx.a(this.dw());
            cab $$7 = new cab(this.dL());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + arx.a(this.ag, 7, 40) * arx.a(this.ag, -1, 1);
               int $$10 = $$5 + arx.a(this.ag, 7, 40) * arx.a(this.ag, -1, 1);
               int $$11 = $$6 + arx.a(this.ag, 7, 40) * arx.a(this.ag, -1, 1);
               gw $$12 = new gw($$9, $$10, $$11);
               biu<?> $$13 = $$7.ag();
               bka.c $$14 = bka.a($$13);
               if (cqg.a($$14, this.dL(), $$12, $$13) && bka.a($$13, $$2, bjk.j, $$12, this.dL().z)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dL().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dL().f($$7) && this.dL().g($$7) && !this.dL().d($$7.cG())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dL().d_($$7.dl()), bjk.j, null, null);
                     $$2.a_($$7);
                     this.a(bkm.m).c(new bkk("Zombie reinforcement caller charge", -0.05F, bkk.a.a));
                     $$7.a(bkm.m).c(new bkk("Zombie reinforcement callee charge", -0.05F, bkk.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(biq $$0) {
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
   protected apd w() {
      return ape.Ba;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.Bk;
   }

   @Override
   protected apd l_() {
      return ape.Bf;
   }

   protected apd y() {
      return ape.Bq;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public bjl eR() {
      return bjl.b;
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dL().ai() == bgv.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(biv.a, new cjf(cji.om));
         } else {
            this.a(biv.a, new cjf(cji.on));
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
   public boolean a(akr $$0, bjg $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ai() == bgv.c || $$0.ai() == bgv.d) && $$1 instanceof cbh $$3) {
         if ($$0.ai() != bgv.d && this.ag.h()) {
            return $$2;
         }

         cac $$4 = $$3.a(biu.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dl()), bjk.i, new cab.b(false, true), null);
            $$4.a($$3.go());
            $$4.a($$3.gy().a(rj.a));
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
   protected float b(bjs $$0, bir $$1) {
      return this.m_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(cjf $$0) {
      return $$0.a(cji.qd) && this.m_() && this.bN() ? false : super.j($$0);
   }

   @Override
   public boolean k(cjf $$0) {
      return $$0.a(cji.qs) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qy $$4) {
      asc $$5 = $$0.D_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new cab.b(a($$5), true);
      }

      if ($$3 instanceof cab.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<buw> $$8 = $$0.a(buw.class, this.cG().c(5.0, 3.0, 5.0), bit.c);
                  if (!$$8.isEmpty()) {
                     buw $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  buw $$10 = biu.q.a(this.dL());
                  if ($$10 != null) {
                     $$10.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
                     $$10.a($$0, $$1, bjk.g, null, null);
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

      if (this.c(biv.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(biv.f, new cjf($$5.i() < 0.1F ? csw.eg : csw.ef));
            this.bR[biv.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(asc $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gm();
      this.a(bkm.c).c(new bkk("Random spawn bonus", this.ag.j() * 0.05F, bkk.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bkm.b).c(new bkk("Random zombie-spawn bonus", $$1, bkk.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bkm.m).c(new bkk("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bkk.a.a));
         this.a(bkm.a).c(new bkk("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bkk.a.c));
         this.x(this.t());
      }
   }

   protected void gm() {
      this.a(bkm.m).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(biq $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bho $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byu $$4 && $$4.ge()) {
         cjf $$5 = this.gd();
         if (!$$5.b()) {
            $$4.gf();
            this.b($$5);
         }
      }
   }

   protected cjf gd() {
      return new cjf(cji.tu);
   }

   class a extends brd {
      a(bjp $$0, double $$1, int $$2) {
         super(csw.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cpw $$0, gw $$1) {
         $$0.a(null, $$1, ape.Bg, apf.f, 0.5F, 0.9F + cab.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cpv $$0, gw $$1) {
         $$0.a(null, $$1, ape.yl, apf.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bjz {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
