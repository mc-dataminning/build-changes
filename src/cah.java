import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cah extends bzo {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bkq c = new bkq(b, "Baby speed boost", 0.5, bkq.a.b);
   private static final aef<Boolean> d = aei.a(cah.class, aeh.k);
   private static final aef<Integer> bX = aei.a(cah.class, aeh.b);
   private static final aef<Boolean> bY = aei.a(cah.class, aeh.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bhb> ca = $$0 -> $$0 == bhb.d;
   private final bpr cb = new bpr(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public cah(bja<? extends cah> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public cah(cqb $$0) {
      this(bja.bp, $$0);
   }

   @Override
   protected void z() {
      this.bO.a(4, new cah.a(this, 1.0, 3));
      this.bO.a(8, new bqp(this, cca.class, 8.0F));
      this.bO.a(8, new brc(this));
      this.s();
   }

   @Override
   protected void s() {
      this.bO.a(2, new brw(this, 1.0, false));
      this.bO.a(6, new bqt(this, 1.0, true, 4, this::gm));
      this.bO.a(7, new bru(this, 1.0));
      this.bP.a(1, new brz(this).a(caj.class));
      this.bP.a(2, new bsa<>(this, cca.class, true));
      this.bP.a(3, new bsa<>(this, cbi.class, false));
      this.bP.a(3, new bsa<>(this, bvj.class, true));
      this.bP.a(5, new bsa<>(this, bvy.class, 10, true, false, bvy.bU));
   }

   public static bkr.a gi() {
      return bzo.gk().a(bks.g, 35.0).a(bks.m, 0.23F).a(bks.c, 3.0).a(bks.a, 2.0).a(bks.n);
   }

   @Override
   protected void a_() {
      super.a_();
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
      if (this.t() && bud.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bsu)this.L()).b($$0);
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
         bko $$1 = this.a(bks.m);
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
            if (this.a(aqa.a)) {
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
         boolean $$0 = this.ab_() && this.fY();
         if ($$0) {
            cjl $$1 = this.c(bjb.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bjb.f);
                     this.a(bjb.f, cjl.b);
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

   protected void gh() {
      this.b(bja.y);
      if (!this.aS()) {
         this.dL().a(null, 1040, this.dl(), 0);
      }
   }

   protected void b(bja<? extends cah> $$0) {
      cah $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dL().d_($$1.dl()).d());
         $$1.x($$1.t() && this.gm());
      }
   }

   protected boolean ab_() {
      return true;
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dL() instanceof akt)) {
         return false;
      } else {
         akt $$2 = (akt)this.dL();
         bjm $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof bjm) {
            $$3 = (bjm)$$0.d();
         }

         if ($$3 != null && this.dL().ai() == bhb.d && (double)this.ag.i() < this.b(bks.n) && this.dL().X().b(cpx.e)) {
            int $$4 = asb.a(this.dq());
            int $$5 = asb.a(this.ds());
            int $$6 = asb.a(this.dw());
            cah $$7 = new cah(this.dL());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + asb.a(this.ag, 7, 40) * asb.a(this.ag, -1, 1);
               int $$10 = $$5 + asb.a(this.ag, 7, 40) * asb.a(this.ag, -1, 1);
               int $$11 = $$6 + asb.a(this.ag, 7, 40) * asb.a(this.ag, -1, 1);
               gw $$12 = new gw($$9, $$10, $$11);
               bja<?> $$13 = $$7.ag();
               bkg.c $$14 = bkg.a($$13);
               if (cqm.a($$14, this.dL(), $$12, $$13) && bkg.a($$13, $$2, bjq.j, $$12, this.dL().z)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dL().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dL().f($$7) && this.dL().g($$7) && !this.dL().d($$7.cG())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dL().d_($$7.dl()), bjq.j, null, null);
                     $$2.a_($$7);
                     this.a(bks.n).c(new bkq("Zombie reinforcement caller charge", -0.05F, bkq.a.a));
                     $$7.a(bks.n).c(new bkq("Zombie reinforcement callee charge", -0.05F, bkq.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(biw $$0) {
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
   protected apf w() {
      return apg.Ba;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.Bk;
   }

   @Override
   protected apf l_() {
      return apg.Bf;
   }

   protected apf y() {
      return apg.Bq;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public bjr eR() {
      return bjr.b;
   }

   @Override
   protected void a(ash $$0, bhc $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dL().ai() == bhb.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bjb.a, new cjl(cjo.om));
         } else {
            this.a(bjb.a, new cjl(cjo.on));
         }
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.m_());
      $$0.a("CanBreakDoors", this.gm());
      $$0.a("InWaterTime", this.aX() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gl() ? this.ce : -1);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(akt $$0, bjm $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ai() == bhb.c || $$0.ai() == bhb.d) && $$1 instanceof cbn $$3) {
         if ($$0.ai() != bhb.d && this.ag.h()) {
            return $$2;
         }

         cai $$4 = $$3.a(bja.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dl()), bjq.i, new cah.b(false, true), null);
            $$4.a($$3.gp());
            $$4.a($$3.gz().a(ri.a));
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
   protected float b(bjy $$0, bix $$1) {
      return this.m_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(cjl $$0) {
      return $$0.a(cjo.qd) && this.m_() && this.bN() ? false : super.j($$0);
   }

   @Override
   public boolean k(cjl $$0) {
      return $$0.a(cjo.qs) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      ash $$5 = $$0.D_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new cah.b(a($$5), true);
      }

      if ($$3 instanceof cah.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bvc> $$8 = $$0.a(bvc.class, this.cG().c(5.0, 3.0, 5.0), biz.c);
                  if (!$$8.isEmpty()) {
                     bvc $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bvc $$10 = bja.q.a(this.dL());
                  if ($$10 != null) {
                     $$10.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
                     $$10.a($$0, $$1, bjq.g, null, null);
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

      if (this.c(bjb.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bjb.f, new cjl($$5.i() < 0.1F ? cte.ef : cte.ee));
            this.bR[bjb.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(ash $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gn();
      this.a(bks.i).c(new bkq("Random spawn bonus", this.ag.j() * 0.05F, bkq.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bks.g).c(new bkq("Random zombie-spawn bonus", $$1, bkq.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bks.n).c(new bkq("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bkq.a.a));
         this.a(bks.l).c(new bkq("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bkq.a.c));
         this.x(this.t());
      }
   }

   protected void gn() {
      this.a(bks.n).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(biw $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bhu $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bza $$4 && $$4.gf()) {
         cjl $$5 = this.ge();
         if (!$$5.b()) {
            $$4.gg();
            this.b($$5);
         }
      }
   }

   protected cjl ge() {
      return new cjl(cjo.tu);
   }

   class a extends brj {
      a(bjv $$0, double $$1, int $$2) {
         super(cte.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cqc $$0, gw $$1) {
         $$0.a(null, $$1, apg.Bg, aph.f, 0.5F, 0.9F + cah.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cqb $$0, gw $$1) {
         $$0.a(null, $$1, apg.yl, aph.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bkf {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
