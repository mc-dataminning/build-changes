import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckk extends cjr {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bui c = new bui(b, "Baby speed boost", 0.5, bui.a.b);
   private static final ajp<Boolean> d = ajt.a(ckk.class, ajr.k);
   private static final ajp<Integer> cd = ajt.a(ckk.class, ajr.b);
   private static final ajp<Boolean> ce = ajt.a(ckk.class, ajr.k);
   public static final float e = 0.05F;
   public static final int ca = 50;
   public static final int cb = 40;
   public static final int cc = 7;
   private static final bsk cf = bsn.bu.n().a(0.5F).b(0.93F);
   private static final float cg = 0.1F;
   private static final Predicate<bqe> ch = $$0 -> $$0 == bqe.d;
   private final bzk ci = new bzk(this, ch);
   private boolean cj;
   private int ck;
   private int cl;

   public ckk(bsn<? extends ckk> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public ckk(dcg $$0) {
      this(bsn.bu, $$0);
   }

   @Override
   protected void z() {
      this.bU.a(4, new ckk.a(this, 1.0, 3));
      this.bU.a(8, new cai(this, cml.class, 8.0F));
      this.bU.a(8, new cav(this));
      this.t();
   }

   protected void t() {
      this.bU.a(2, new cbp(this, 1.0, false));
      this.bU.a(6, new cam(this, 1.0, true, 4, this::gv));
      this.bU.a(7, new cbn(this, 1.0));
      this.bV.a(1, new cbs(this).a(ckm.class));
      this.bV.a(2, new cbt<>(this, cml.class, true));
      this.bV.a(3, new cbt<>(this, clt.class, false));
      this.bV.a(3, new cbt<>(this, cfe.class, true));
      this.bV.a(5, new cbt<>(this, cft.class, 10, true, false, cft.ca));
   }

   public static buj.a gr() {
      return cjr.gt().a(buk.m, 35.0).a(buk.v, 0.23F).a(buk.c, 3.0).a(buk.a, 2.0).a(buk.A);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, false);
      $$0.a(cd, 0);
      $$0.a(ce, false);
   }

   public boolean gu() {
      return this.ar().a(ce);
   }

   public boolean gv() {
      return this.cj;
   }

   public void x(boolean $$0) {
      if (this.x() && cdy.a(this)) {
         if (this.cj != $$0) {
            this.cj = $$0;
            ((ccn)this.J()).b($$0);
            if ($$0) {
               this.bU.a(1, this.ci);
            } else {
               this.bU.a(this.ci);
            }
         }
      } else if (this.cj) {
         this.bU.a(this.ci);
         this.cj = false;
      }
   }

   protected boolean x() {
      return true;
   }

   @Override
   public boolean o_() {
      return this.ar().a(d);
   }

   @Override
   protected int ei() {
      if (this.o_()) {
         this.bP = (int)((double)this.bP * 2.5);
      }

      return super.ei();
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(d, $$0);
      if (this.dR() != null && !this.dR().B) {
         bug $$1 = this.f(buk.v);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      if (d.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   protected boolean gp() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dR().B && this.bF() && !this.gc()) {
         if (this.gu()) {
            this.cl--;
            if (this.cl < 0) {
               this.ac_();
            }
         } else if (this.gp()) {
            if (this.a(awc.a)) {
               this.ck++;
               if (this.ck >= 600) {
                  this.b(300);
               }
            } else {
               this.ck = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      if (this.bF()) {
         boolean $$0 = this.ad_() && this.gh();
         if ($$0) {
            cud $$1 = this.a(bso.f);
            if (!$$1.e()) {
               if ($$1.l()) {
                  cty $$2 = $$1.g();
                  $$1.b($$1.n() + this.ah.a(2));
                  if ($$1.n() >= $$1.o()) {
                     this.a($$2, bso.f);
                     this.a(bso.f, cud.l);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.d(8.0F);
            }
         }
      }

      super.m_();
   }

   private void b(int $$0) {
      this.cl = $$0;
      this.ar().a(ce, true);
   }

   protected void ac_() {
      this.b(bsn.B);
      if (!this.aY()) {
         this.dR().a(null, 1040, this.dr(), 0);
      }
   }

   protected void b(bsn<? extends ckk> $$0) {
      ckk $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.H($$1.dR().d_($$1.dr()).d());
         $$1.x($$1.x() && this.gv());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dR() instanceof aqm)) {
         return false;
      } else {
         aqm $$2 = (aqm)this.dR();
         btc $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof btc) {
            $$3 = (btc)$$0.d();
         }

         if ($$3 != null && this.dR().al() == bqe.d && (double)this.ah.i() < this.g(buk.A) && this.dR().ab().b(dcc.e)) {
            int $$4 = ayg.a(this.dw());
            int $$5 = ayg.a(this.dy());
            int $$6 = ayg.a(this.dC());
            ckk $$7 = new ckk(this.dR());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ayg.a(this.ah, 7, 40) * ayg.a(this.ah, -1, 1);
               int $$10 = $$5 + ayg.a(this.ah, 7, 40) * ayg.a(this.ah, -1, 1);
               int $$11 = $$6 + ayg.a(this.ah, 7, 40) * ayg.a(this.ah, -1, 1);
               ja $$12 = new ja($$9, $$10, $$11);
               bsn<?> $$13 = $$7.am();
               if (bty.a($$13, this.dR(), $$12) && bty.a($$13, $$2, btg.j, $$12, this.dR().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dR().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dR().f($$7) && this.dR().g($$7) && !this.dR().d($$7.cM())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dR().d_($$7.dr()), btg.j, null);
                     $$2.a_($$7);
                     this.f(buk.A).d(new bui("Zombie reinforcement caller charge", -0.05F, bui.a.a));
                     $$7.f(buk.A).d(new bui("Zombie reinforcement callee charge", -0.05F, bui.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean D(bsh $$0) {
      boolean $$1 = super.D($$0);
      if ($$1) {
         float $$2 = this.dR().d_(this.dr()).b();
         if (this.eV().e() && this.bS() && this.ah.i() < $$2 * 0.3F) {
            $$0.d((float)(2 * (int)$$2));
         }
      }

      return $$1;
   }

   @Override
   protected avg v() {
      return avh.Ds;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.DC;
   }

   @Override
   protected avg n_() {
      return avh.Dx;
   }

   protected avg gn() {
      return avh.DI;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(this.gn(), 0.15F, 1.0F);
   }

   @Override
   protected void a(ayo $$0, bqf $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dR().al() == bqe.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bso.a, new cud(cug.pb));
         } else {
            this.a(bso.a, new cud(cug.pc));
         }
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gv());
      $$0.a("InWaterTime", this.bg() ? this.ck : -1);
      $$0.a("DrownedConversionTime", this.gu() ? this.cl : -1);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ck = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aqm $$0, btc $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == bqe.c || $$0.al() == bqe.d) && $$1 instanceof cly $$3) {
         if ($$0.al() != bqe.d && this.ah.h()) {
            return $$2;
         }

         ckl $$4 = $$3.a(bsn.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dr()), btg.i, new ckk.b(false, true));
            $$4.a($$3.gy());
            $$4.a($$3.gI().a(ul.a));
            $$4.a($$3.gp().a());
            $$4.b($$3.t());
            if (!this.aY()) {
               $$0.a(null, 1026, this.dr(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? cf : super.e($$0);
   }

   @Override
   public boolean j(cud $$0) {
      return $$0.a(cug.qR) && this.o_() && this.bT() ? false : super.j($$0);
   }

   @Override
   public boolean k(cud $$0) {
      return $$0.a(cug.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      ayo $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new ckk.b(a($$4), true);
      }

      if ($$3 instanceof ckk.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cex> $$7 = $$0.a(cex.class, this.cM().c(5.0, 3.0, 5.0), bsm.c);
                  if (!$$7.isEmpty()) {
                     cex $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cex $$9 = bsn.t.a(this.dR());
                  if ($$9 != null) {
                     $$9.b(this.dw(), this.dy(), this.dC(), this.dH(), 0.0F);
                     $$9.a($$0, $$1, btg.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x(this.x() && $$4.i() < $$5 * 0.1F);
         this.a($$4, $$1);
         this.a($$0, $$4, $$1);
      }

      if (this.a(bso.f).e()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bso.f, new cud($$4.i() < 0.1F ? dfk.ef : dfk.ee));
            this.bX[bso.f.b()] = 0.0F;
         }
      }

      this.H($$5);
      return $$3;
   }

   public static boolean a(ayo $$0) {
      return $$0.i() < 0.05F;
   }

   protected void H(float $$0) {
      this.gw();
      this.f(buk.p).d(new bui("Random spawn bonus", this.ah.j() * 0.05F, bui.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(buk.m).d(new bui("Random zombie-spawn bonus", $$1, bui.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(buk.A).d(new bui("Leader zombie bonus", this.ah.j() * 0.25 + 0.5, bui.a.a));
         this.f(buk.s).d(new bui("Leader zombie bonus", this.ah.j() * 3.0 + 1.0, bui.a.c));
         this.x(this.x());
      }
   }

   protected void gw() {
      this.f(buk.A).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(aqm $$0, bra $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjd $$4 && $$4.go()) {
         cud $$5 = this.go();
         if (!$$5.e()) {
            $$4.gp();
            this.b($$5);
         }
      }
   }

   protected cud go() {
      return new cud(cug.uo);
   }

   class a extends cbc {
      a(final btl $$0, final double $$1, final int $$2) {
         super(dfk.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dch $$0, ja $$1) {
         $$0.a(null, $$1, avh.Dy, avi.f, 0.5F, 0.9F + ckk.this.ah.i() * 0.2F);
      }

      @Override
      public void a(dcg $$0, ja $$1) {
         $$0.a(null, $$1, avh.Ai, avi.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements btv {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
