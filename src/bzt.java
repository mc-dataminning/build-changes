import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzt extends bza {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bkc c = new bkc(b, "Baby speed boost", 0.5, bkc.a.b);
   private static final adz<Boolean> d = aec.a(bzt.class, aeb.k);
   private static final adz<Integer> bX = aec.a(bzt.class, aeb.b);
   private static final adz<Boolean> bY = aec.a(bzt.class, aeb.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bgn> ca = $$0 -> $$0 == bgn.d;
   private final bpd cb = new bpd(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public bzt(bim<? extends bzt> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public bzt(cpl $$0) {
      this(bim.bp, $$0);
   }

   @Override
   protected void w() {
      this.bO.a(4, new bzt.a(this, 1.0, 3));
      this.bO.a(8, new bqb(this, cbm.class, 8.0F));
      this.bO.a(8, new bqo(this));
      this.p();
   }

   @Override
   protected void p() {
      this.bO.a(2, new bri(this, 1.0, false));
      this.bO.a(6, new bqf(this, 1.0, true, 4, this::gi));
      this.bO.a(7, new brg(this, 1.0));
      this.bP.a(1, new brl(this).a(bzv.class));
      this.bP.a(2, new brm<>(this, cbm.class, true));
      this.bP.a(3, new brm<>(this, cau.class, false));
      this.bP.a(3, new brm<>(this, buv.class, true));
      this.bP.a(5, new brm<>(this, bvk.class, 10, true, false, bvk.bU));
   }

   public static bkd.a ge() {
      return bza.gg().a(bke.b, 35.0).a(bke.d, 0.23F).a(bke.f, 3.0).a(bke.i, 2.0).a(bke.m);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(d, false);
      this.al().a(bX, 0);
      this.al().a(bY, false);
   }

   public boolean gh() {
      return this.al().b(bY);
   }

   public boolean gi() {
      return this.cc;
   }

   public void x(boolean $$0) {
      if (this.q() && btp.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bsg)this.H()).b($$0);
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

   protected boolean q() {
      return true;
   }

   @Override
   public boolean i_() {
      return this.al().b(d);
   }

   @Override
   public int ec() {
      if (this.i_()) {
         this.bJ = (int)((double)this.bJ * 2.5);
      }

      return super.ec();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (this.dK() != null && !this.dK().B) {
         bka $$1 = this.a(bke.d);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(adz<?> $$0) {
      if (d.equals($$0)) {
         this.e_();
      }

      super.a($$0);
   }

   protected boolean gb() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dK().B && this.bv() && !this.fQ()) {
         if (this.gh()) {
            this.ce--;
            if (this.ce < 0) {
               this.gd();
            }
         } else if (this.gb()) {
            if (this.a(apq.a)) {
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
         boolean $$0 = this.W_() && this.fU();
         if ($$0) {
            cix $$1 = this.c(bin.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bin.f);
                     this.a(bin.f, cix.b);
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

   protected void gd() {
      this.b(bim.y);
      if (!this.aS()) {
         this.dK().a(null, 1040, this.dk(), 0);
      }
   }

   protected void b(bim<? extends bzt> $$0) {
      bzt $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dK().d_($$1.dk()).d());
         $$1.x($$1.q() && this.gi());
      }
   }

   protected boolean W_() {
      return true;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dK() instanceof akk)) {
         return false;
      } else {
         akk $$2 = (akk)this.dK();
         biy $$3 = this.j();
         if ($$3 == null && $$0.d() instanceof biy) {
            $$3 = (biy)$$0.d();
         }

         if ($$3 != null && this.dK().ai() == bgn.d && (double)this.ag.i() < this.b(bke.m) && this.dK().X().b(cph.e)) {
            int $$4 = arp.a(this.dp());
            int $$5 = arp.a(this.dr());
            int $$6 = arp.a(this.dv());
            bzt $$7 = new bzt(this.dK());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + arp.a(this.ag, 7, 40) * arp.a(this.ag, -1, 1);
               int $$10 = $$5 + arp.a(this.ag, 7, 40) * arp.a(this.ag, -1, 1);
               int $$11 = $$6 + arp.a(this.ag, 7, 40) * arp.a(this.ag, -1, 1);
               gu $$12 = new gu($$9, $$10, $$11);
               bim<?> $$13 = $$7.ag();
               bjs.c $$14 = bjs.a($$13);
               if (cpw.a($$14, this.dK(), $$12, $$13) && bjs.a($$13, $$2, bjc.j, $$12, this.dK().z)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dK().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dK().f($$7) && this.dK().g($$7) && !this.dK().d($$7.cG())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dK().d_($$7.dk()), bjc.j, null, null);
                     $$2.a_($$7);
                     this.a(bke.m).c(new bkc("Zombie reinforcement caller charge", -0.05F, bkc.a.a));
                     $$7.a(bke.m).c(new bkc("Zombie reinforcement callee charge", -0.05F, bkc.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bii $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dK().d_(this.dk()).b();
         if (this.eR().b() && this.bM() && this.ag.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected aov r() {
      return aow.Ba;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.Bk;
   }

   @Override
   protected aov h_() {
      return aow.Bf;
   }

   protected aov t() {
      return aow.Bq;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   @Override
   public bjd eQ() {
      return bjd.b;
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dK().ai() == bgn.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bin.a, new cix(cja.om));
         } else {
            this.a(bin.a, new cix(cja.on));
         }
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.i_());
      $$0.a("CanBreakDoors", this.gi());
      $$0.a("InWaterTime", this.aX() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gh() ? this.ce : -1);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(akk $$0, biy $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ai() == bgn.c || $$0.ai() == bgn.d) && $$1 instanceof caz $$3) {
         if ($$0.ai() != bgn.d && this.ag.h()) {
            return $$2;
         }

         bzu $$4 = $$3.a(bim.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dk()), bjc.i, new bzt.b(false, true), null);
            $$4.a($$3.gl());
            $$4.a($$3.gv().a(rc.a));
            $$4.c($$3.gc().a());
            $$4.b($$3.q());
            if (!this.aS()) {
               $$0.a(null, 1026, this.dk(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.i_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(cix $$0) {
      return $$0.a(cja.qd) && this.i_() && this.bN() ? false : super.j($$0);
   }

   @Override
   public boolean k(cix $$0) {
      return $$0.a(cja.qs) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new bzt.b(a($$5), true);
      }

      if ($$3 instanceof bzt.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<buo> $$8 = $$0.a(buo.class, this.cG().c(5.0, 3.0, 5.0), bil.c);
                  if (!$$8.isEmpty()) {
                     buo $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  buo $$10 = bim.q.a(this.dK());
                  if ($$10 != null) {
                     $$10.b(this.dp(), this.dr(), this.dv(), this.dA(), 0.0F);
                     $$10.a($$0, $$1, bjc.g, null, null);
                     $$10.w(true);
                     this.n($$10);
                     $$0.b($$10);
                  }
               }
            }
         }

         this.x(this.q() && $$5.i() < $$6 * 0.1F);
         this.a($$5, $$1);
         this.b($$5, $$1);
      }

      if (this.c(bin.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bin.f, new cix($$5.i() < 0.1F ? csm.eg : csm.ef));
            this.bR[bin.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(aru $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gj();
      this.a(bke.c).c(new bkc("Random spawn bonus", this.ag.j() * 0.05F, bkc.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bke.b).c(new bkc("Random zombie-spawn bonus", $$1, bkc.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bke.m).c(new bkc("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bkc.a.a));
         this.a(bke.a).c(new bkc("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bkc.a.c));
         this.x(this.q());
      }
   }

   protected void gj() {
      this.a(bke.m).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(bii $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bhg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bym $$4 && $$4.gb()) {
         cix $$5 = this.ga();
         if (!$$5.b()) {
            $$4.gc();
            this.b($$5);
         }
      }
   }

   protected cix ga() {
      return new cix(cja.tu);
   }

   class a extends bqv {
      a(bjh $$0, double $$1, int $$2) {
         super(csm.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cpm $$0, gu $$1) {
         $$0.a(null, $$1, aow.Bg, aox.f, 0.5F, 0.9F + bzt.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cpl $$0, gu $$1) {
         $$0.a(null, $$1, aow.yl, aox.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bjr {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
