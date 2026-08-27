import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzw extends bzd {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bkf c = new bkf(b, "Baby speed boost", 0.5, bkf.a.b);
   private static final aec<Boolean> d = aef.a(bzw.class, aee.k);
   private static final aec<Integer> bX = aef.a(bzw.class, aee.b);
   private static final aec<Boolean> bY = aef.a(bzw.class, aee.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bgq> ca = $$0 -> $$0 == bgq.d;
   private final bpg cb = new bpg(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public bzw(bip<? extends bzw> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public bzw(cpq $$0) {
      this(bip.bp, $$0);
   }

   @Override
   protected void w() {
      this.bO.a(4, new bzw.a(this, 1.0, 3));
      this.bO.a(8, new bqe(this, cbp.class, 8.0F));
      this.bO.a(8, new bqr(this));
      this.p();
   }

   @Override
   protected void p() {
      this.bO.a(2, new brl(this, 1.0, false));
      this.bO.a(6, new bqi(this, 1.0, true, 4, this::gi));
      this.bO.a(7, new brj(this, 1.0));
      this.bP.a(1, new bro(this).a(bzy.class));
      this.bP.a(2, new brp<>(this, cbp.class, true));
      this.bP.a(3, new brp<>(this, cax.class, false));
      this.bP.a(3, new brp<>(this, buy.class, true));
      this.bP.a(5, new brp<>(this, bvn.class, 10, true, false, bvn.bU));
   }

   public static bkg.a ge() {
      return bzd.gg().a(bkh.b, 35.0).a(bkh.d, 0.23F).a(bkh.f, 3.0).a(bkh.i, 2.0).a(bkh.m);
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
      if (this.q() && bts.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bsj)this.H()).b($$0);
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
         bkd $$1 = this.a(bkh.d);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(aec<?> $$0) {
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
            if (this.a(apt.a)) {
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
            cja $$1 = this.c(biq.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(biq.f);
                     this.a(biq.f, cja.b);
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
      this.b(bip.y);
      if (!this.aS()) {
         this.dK().a(null, 1040, this.dk(), 0);
      }
   }

   protected void b(bip<? extends bzw> $$0) {
      bzw $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dK().d_($$1.dk()).d());
         $$1.x($$1.q() && this.gi());
      }
   }

   protected boolean W_() {
      return true;
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dK() instanceof akn)) {
         return false;
      } else {
         akn $$2 = (akn)this.dK();
         bjb $$3 = this.j();
         if ($$3 == null && $$0.d() instanceof bjb) {
            $$3 = (bjb)$$0.d();
         }

         if ($$3 != null && this.dK().ai() == bgq.d && (double)this.ag.i() < this.b(bkh.m) && this.dK().X().b(cpm.e)) {
            int $$4 = ars.a(this.dp());
            int $$5 = ars.a(this.dr());
            int $$6 = ars.a(this.dv());
            bzw $$7 = new bzw(this.dK());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ars.a(this.ag, 7, 40) * ars.a(this.ag, -1, 1);
               int $$10 = $$5 + ars.a(this.ag, 7, 40) * ars.a(this.ag, -1, 1);
               int $$11 = $$6 + ars.a(this.ag, 7, 40) * ars.a(this.ag, -1, 1);
               gw $$12 = new gw($$9, $$10, $$11);
               bip<?> $$13 = $$7.ag();
               bjv.c $$14 = bjv.a($$13);
               if (cqb.a($$14, this.dK(), $$12, $$13) && bjv.a($$13, $$2, bjf.j, $$12, this.dK().z)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dK().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dK().f($$7) && this.dK().g($$7) && !this.dK().d($$7.cG())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dK().d_($$7.dk()), bjf.j, null, null);
                     $$2.a_($$7);
                     this.a(bkh.m).c(new bkf("Zombie reinforcement caller charge", -0.05F, bkf.a.a));
                     $$7.a(bkh.m).c(new bkf("Zombie reinforcement callee charge", -0.05F, bkf.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bil $$0) {
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
   protected aoy r() {
      return aoz.Ba;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.Bk;
   }

   @Override
   protected aoy h_() {
      return aoz.Bf;
   }

   protected aoy t() {
      return aoz.Bq;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   @Override
   public bjg eQ() {
      return bjg.b;
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dK().ai() == bgq.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(biq.a, new cja(cjd.om));
         } else {
            this.a(biq.a, new cja(cjd.on));
         }
      }
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.i_());
      $$0.a("CanBreakDoors", this.gi());
      $$0.a("InWaterTime", this.aX() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gh() ? this.ce : -1);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(akn $$0, bjb $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ai() == bgq.c || $$0.ai() == bgq.d) && $$1 instanceof cbc $$3) {
         if ($$0.ai() != bgq.d && this.ag.h()) {
            return $$2;
         }

         bzx $$4 = $$3.a(bip.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dk()), bjf.i, new bzw.b(false, true), null);
            $$4.a($$3.gl());
            $$4.a($$3.gv().a(rf.a));
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
   protected float b(bjn $$0, bim $$1) {
      return this.i_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(cja $$0) {
      return $$0.a(cjd.qd) && this.i_() && this.bN() ? false : super.j($$0);
   }

   @Override
   public boolean k(cja $$0) {
      return $$0.a(cjd.qs) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      arx $$5 = $$0.y_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new bzw.b(a($$5), true);
      }

      if ($$3 instanceof bzw.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bur> $$8 = $$0.a(bur.class, this.cG().c(5.0, 3.0, 5.0), bio.c);
                  if (!$$8.isEmpty()) {
                     bur $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bur $$10 = bip.q.a(this.dK());
                  if ($$10 != null) {
                     $$10.b(this.dp(), this.dr(), this.dv(), this.dA(), 0.0F);
                     $$10.a($$0, $$1, bjf.g, null, null);
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

      if (this.c(biq.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(biq.f, new cja($$5.i() < 0.1F ? csr.eg : csr.ef));
            this.bR[biq.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(arx $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gj();
      this.a(bkh.c).c(new bkf("Random spawn bonus", this.ag.j() * 0.05F, bkf.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bkh.b).c(new bkf("Random zombie-spawn bonus", $$1, bkf.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bkh.m).c(new bkf("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bkf.a.a));
         this.a(bkh.a).c(new bkf("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bkf.a.c));
         this.x(this.q());
      }
   }

   protected void gj() {
      this.a(bkh.m).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(bil $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bhj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byp $$4 && $$4.gb()) {
         cja $$5 = this.ga();
         if (!$$5.b()) {
            $$4.gc();
            this.b($$5);
         }
      }
   }

   protected cja ga() {
      return new cja(cjd.tu);
   }

   class a extends bqy {
      a(bjk $$0, double $$1, int $$2) {
         super(csr.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cpr $$0, gw $$1) {
         $$0.a(null, $$1, aoz.Bg, apa.f, 0.5F, 0.9F + bzw.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cpq $$0, gw $$1) {
         $$0.a(null, $$1, aoz.yl, apa.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bju {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
