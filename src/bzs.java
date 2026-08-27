import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzs extends byz {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bkb c = new bkb(b, "Baby speed boost", 0.5, bkb.a.b);
   private static final adx<Boolean> d = aea.a(bzs.class, adz.k);
   private static final adx<Integer> bX = aea.a(bzs.class, adz.b);
   private static final adx<Boolean> bY = aea.a(bzs.class, adz.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bgl> ca = $$0 -> $$0 == bgl.d;
   private final bpc cb = new bpc(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public bzs(bik<? extends bzs> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public bzs(cpk $$0) {
      this(bik.bp, $$0);
   }

   @Override
   protected void w() {
      this.bO.a(4, new bzs.a(this, 1.0, 3));
      this.bO.a(8, new bqa(this, cbl.class, 8.0F));
      this.bO.a(8, new bqn(this));
      this.p();
   }

   @Override
   protected void p() {
      this.bO.a(2, new brh(this, 1.0, false));
      this.bO.a(6, new bqe(this, 1.0, true, 4, this::gh));
      this.bO.a(7, new brf(this, 1.0));
      this.bP.a(1, new brk(this).a(bzu.class));
      this.bP.a(2, new brl<>(this, cbl.class, true));
      this.bP.a(3, new brl<>(this, cat.class, false));
      this.bP.a(3, new brl<>(this, buu.class, true));
      this.bP.a(5, new brl<>(this, bvj.class, 10, true, false, bvj.bU));
   }

   public static bkc.a gd() {
      return byz.gf().a(bkd.b, 35.0).a(bkd.d, 0.23F).a(bkd.f, 3.0).a(bkd.i, 2.0).a(bkd.m);
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
      if (this.q() && bto.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bsf)this.H()).b($$0);
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
         bjz $$1 = this.a(bkd.d);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(adx<?> $$0) {
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
            if (this.a(apo.a)) {
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
            ciw $$1 = this.c(bil.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bil.f);
                     this.a(bil.f, ciw.b);
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
      this.b(bik.y);
      if (!this.aS()) {
         this.dK().a(null, 1040, this.dk(), 0);
      }
   }

   protected void b(bik<? extends bzs> $$0) {
      bzs $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dK().d_($$1.dk()).d());
         $$1.x($$1.q() && this.gh());
      }
   }

   protected boolean X_() {
      return true;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dK() instanceof aki)) {
         return false;
      } else {
         aki $$2 = (aki)this.dK();
         biw $$3 = this.j();
         if ($$3 == null && $$0.d() instanceof biw) {
            $$3 = (biw)$$0.d();
         }

         if ($$3 != null && this.dK().ai() == bgl.d && (double)this.ag.i() < this.b(bkd.m) && this.dK().X().b(cpg.e)) {
            int $$4 = aro.a(this.dp());
            int $$5 = aro.a(this.dr());
            int $$6 = aro.a(this.dv());
            bzs $$7 = new bzs(this.dK());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + aro.a(this.ag, 7, 40) * aro.a(this.ag, -1, 1);
               int $$10 = $$5 + aro.a(this.ag, 7, 40) * aro.a(this.ag, -1, 1);
               int $$11 = $$6 + aro.a(this.ag, 7, 40) * aro.a(this.ag, -1, 1);
               gv $$12 = new gv($$9, $$10, $$11);
               bik<?> $$13 = $$7.ag();
               bjr.c $$14 = bjr.a($$13);
               if (cpv.a($$14, this.dK(), $$12, $$13) && bjr.a($$13, $$2, bja.j, $$12, this.dK().z)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dK().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dK().f($$7) && this.dK().g($$7) && !this.dK().d($$7.cG())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dK().d_($$7.dk()), bja.j, null, null);
                     $$2.a_($$7);
                     this.a(bkd.m).c(new bkb("Zombie reinforcement caller charge", -0.05F, bkb.a.a));
                     $$7.a(bkd.m).c(new bkb("Zombie reinforcement callee charge", -0.05F, bkb.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(big $$0) {
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
   protected aot r() {
      return aou.AQ;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.Ba;
   }

   @Override
   protected aot h_() {
      return aou.AV;
   }

   protected aot t() {
      return aou.Bg;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   @Override
   public bjb eQ() {
      return bjb.b;
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dK().ai() == bgl.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bil.a, new ciw(ciz.om));
         } else {
            this.a(bil.a, new ciw(ciz.on));
         }
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.i_());
      $$0.a("CanBreakDoors", this.gh());
      $$0.a("InWaterTime", this.aX() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gg() ? this.ce : -1);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aki $$0, biw $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ai() == bgl.c || $$0.ai() == bgl.d) && $$1 instanceof cay $$3) {
         if ($$0.ai() != bgl.d && this.ag.h()) {
            return $$2;
         }

         bzt $$4 = $$3.a(bik.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dk()), bja.i, new bzs.b(false, true), null);
            $$4.a($$3.gk());
            $$4.a($$3.gu().a(rd.a));
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
   protected float b(bji $$0, bih $$1) {
      return this.i_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(ciw $$0) {
      return $$0.a(ciz.qd) && this.i_() && this.bN() ? false : super.j($$0);
   }

   @Override
   public boolean k(ciw $$0) {
      return $$0.a(ciz.qs) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      art $$5 = $$0.y_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new bzs.b(a($$5), true);
      }

      if ($$3 instanceof bzs.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bun> $$8 = $$0.a(bun.class, this.cG().c(5.0, 3.0, 5.0), bij.c);
                  if (!$$8.isEmpty()) {
                     bun $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bun $$10 = bik.q.a(this.dK());
                  if ($$10 != null) {
                     $$10.b(this.dp(), this.dr(), this.dv(), this.dA(), 0.0F);
                     $$10.a($$0, $$1, bja.g, null, null);
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

      if (this.c(bil.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bil.f, new ciw($$5.i() < 0.1F ? csl.eg : csl.ef));
            this.bR[bil.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(art $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gi();
      this.a(bkd.c).c(new bkb("Random spawn bonus", this.ag.j() * 0.05F, bkb.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bkd.b).c(new bkb("Random zombie-spawn bonus", $$1, bkb.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bkd.m).c(new bkb("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bkb.a.a));
         this.a(bkd.a).c(new bkb("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bkb.a.c));
         this.x(this.q());
      }
   }

   protected void gi() {
      this.a(bkd.m).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(big $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bhe $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byl $$4 && $$4.ga()) {
         ciw $$5 = this.fZ();
         if (!$$5.b()) {
            $$4.gb();
            this.b($$5);
         }
      }
   }

   protected ciw fZ() {
      return new ciw(ciz.tu);
   }

   class a extends bqu {
      a(bjf $$0, double $$1, int $$2) {
         super(csl.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cpl $$0, gv $$1) {
         $$0.a(null, $$1, aou.AW, aov.f, 0.5F, 0.9F + bzs.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cpk $$0, gv $$1) {
         $$0.a(null, $$1, aou.yg, aov.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bjq {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
