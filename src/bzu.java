import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzu extends bzb {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bkd c = new bkd(b, "Baby speed boost", 0.5, bkd.a.b);
   private static final adz<Boolean> d = aec.a(bzu.class, aeb.k);
   private static final adz<Integer> bX = aec.a(bzu.class, aeb.b);
   private static final adz<Boolean> bY = aec.a(bzu.class, aeb.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bgn> ca = $$0 -> $$0 == bgn.d;
   private final bpe cb = new bpe(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public bzu(bim<? extends bzu> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public bzu(cpm $$0) {
      this(bim.bp, $$0);
   }

   @Override
   protected void w() {
      this.bO.a(4, new bzu.a(this, 1.0, 3));
      this.bO.a(8, new bqc(this, cbn.class, 8.0F));
      this.bO.a(8, new bqp(this));
      this.p();
   }

   @Override
   protected void p() {
      this.bO.a(2, new brj(this, 1.0, false));
      this.bO.a(6, new bqg(this, 1.0, true, 4, this::gh));
      this.bO.a(7, new brh(this, 1.0));
      this.bP.a(1, new brm(this).a(bzw.class));
      this.bP.a(2, new brn<>(this, cbn.class, true));
      this.bP.a(3, new brn<>(this, cav.class, false));
      this.bP.a(3, new brn<>(this, buw.class, true));
      this.bP.a(5, new brn<>(this, bvl.class, 10, true, false, bvl.bU));
   }

   public static bke.a gd() {
      return bzb.gf().a(bkf.b, 35.0).a(bkf.d, 0.23F).a(bkf.f, 3.0).a(bkf.i, 2.0).a(bkf.m);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(d, false);
      this.al().a(bX, 0);
      this.al().a(bY, false);
   }

   public boolean gg() {
      return this.al().b(bY);
   }

   public boolean gh() {
      return this.cc;
   }

   public void x(boolean $$0) {
      if (this.q() && btq.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bsh)this.H()).b($$0);
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
         bkb $$1 = this.a(bkf.d);
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

   protected boolean ga() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dK().B && this.bv() && !this.fQ()) {
         if (this.gg()) {
            this.ce--;
            if (this.ce < 0) {
               this.gc();
            }
         } else if (this.ga()) {
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
         boolean $$0 = this.X_() && this.fT();
         if ($$0) {
            ciy $$1 = this.c(bin.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bin.f);
                     this.a(bin.f, ciy.b);
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

   protected void gc() {
      this.b(bim.y);
      if (!this.aS()) {
         this.dK().a(null, 1040, this.dk(), 0);
      }
   }

   protected void b(bim<? extends bzu> $$0) {
      bzu $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dK().d_($$1.dk()).d());
         $$1.x($$1.q() && this.gh());
      }
   }

   protected boolean X_() {
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

         if ($$3 != null && this.dK().ai() == bgn.d && (double)this.ag.i() < this.b(bkf.m) && this.dK().X().b(cpi.e)) {
            int $$4 = arp.a(this.dp());
            int $$5 = arp.a(this.dr());
            int $$6 = arp.a(this.dv());
            bzu $$7 = new bzu(this.dK());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + arp.a(this.ag, 7, 40) * arp.a(this.ag, -1, 1);
               int $$10 = $$5 + arp.a(this.ag, 7, 40) * arp.a(this.ag, -1, 1);
               int $$11 = $$6 + arp.a(this.ag, 7, 40) * arp.a(this.ag, -1, 1);
               gu $$12 = new gu($$9, $$10, $$11);
               bim<?> $$13 = $$7.ag();
               bjt.c $$14 = bjt.a($$13);
               if (cpx.a($$14, this.dK(), $$12, $$13) && bjt.a($$13, $$2, bjc.j, $$12, this.dK().z)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dK().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dK().f($$7) && this.dK().g($$7) && !this.dK().d($$7.cG())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dK().d_($$7.dk()), bjc.j, null, null);
                     $$2.a_($$7);
                     this.a(bkf.m).c(new bkd("Zombie reinforcement caller charge", -0.05F, bkd.a.a));
                     $$7.a(bkf.m).c(new bkd("Zombie reinforcement callee charge", -0.05F, bkd.a.a));
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
      return aow.AQ;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.Ba;
   }

   @Override
   protected aov h_() {
      return aow.AV;
   }

   protected aov t() {
      return aow.Bg;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
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
            this.a(bin.a, new ciy(cjb.om));
         } else {
            this.a(bin.a, new ciy(cjb.on));
         }
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.i_());
      $$0.a("CanBreakDoors", this.gh());
      $$0.a("InWaterTime", this.aX() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gg() ? this.ce : -1);
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
      if (($$0.ai() == bgn.c || $$0.ai() == bgn.d) && $$1 instanceof cba $$3) {
         if ($$0.ai() != bgn.d && this.ag.h()) {
            return $$2;
         }

         bzv $$4 = $$3.a(bim.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dk()), bjc.i, new bzu.b(false, true), null);
            $$4.a($$3.gk());
            $$4.a($$3.gu().a(rc.a));
            $$4.c($$3.gb().a());
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
   public boolean j(ciy $$0) {
      return $$0.a(cjb.qd) && this.i_() && this.bN() ? false : super.j($$0);
   }

   @Override
   public boolean k(ciy $$0) {
      return $$0.a(cjb.qs) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new bzu.b(a($$5), true);
      }

      if ($$3 instanceof bzu.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bup> $$8 = $$0.a(bup.class, this.cG().c(5.0, 3.0, 5.0), bil.c);
                  if (!$$8.isEmpty()) {
                     bup $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bup $$10 = bim.q.a(this.dK());
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
            this.a(bin.f, new ciy($$5.i() < 0.1F ? csn.eg : csn.ef));
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
      this.gi();
      this.a(bkf.c).c(new bkd("Random spawn bonus", this.ag.j() * 0.05F, bkd.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bkf.b).c(new bkd("Random zombie-spawn bonus", $$1, bkd.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bkf.m).c(new bkd("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bkd.a.a));
         this.a(bkf.a).c(new bkd("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bkd.a.c));
         this.x(this.q());
      }
   }

   protected void gi() {
      this.a(bkf.m).a(this.ag.j() * 0.1F);
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
      if ($$0.d() instanceof byn $$4 && $$4.ga()) {
         ciy $$5 = this.fZ();
         if (!$$5.b()) {
            $$4.gb();
            this.b($$5);
         }
      }
   }

   protected ciy fZ() {
      return new ciy(cjb.tu);
   }

   class a extends bqw {
      a(bjh $$0, double $$1, int $$2) {
         super(csn.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cpn $$0, gu $$1) {
         $$0.a(null, $$1, aow.AW, aox.f, 0.5F, 0.9F + bzu.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cpm $$0, gu $$1) {
         $$0.a(null, $$1, aow.yg, aox.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bjs {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
