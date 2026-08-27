import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjv extends cjc {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final btu c = new btu(b, "Baby speed boost", 0.5, btu.a.b);
   private static final ajr<Boolean> d = ajv.a(cjv.class, ajt.k);
   private static final ajr<Integer> cb = ajv.a(cjv.class, ajt.b);
   private static final ajr<Boolean> cc = ajv.a(cjv.class, ajt.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final brx cd = bsa.bu.n().a(0.5F).b(0.93F);
   private static final float ce = 0.1F;
   private static final Predicate<bpr> cf = $$0 -> $$0 == bpr.d;
   private final byw cg = new byw(this, cf);
   private boolean ch;
   private int ci;
   private int cj;

   public cjv(bsa<? extends cjv> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cjv(dax $$0) {
      this(bsa.bu, $$0);
   }

   @Override
   protected void z() {
      this.bS.a(4, new cjv.a(this, 1.0, 3));
      this.bS.a(8, new bzu(this, clw.class, 8.0F));
      this.bS.a(8, new cah(this));
      this.u();
   }

   protected void u() {
      this.bS.a(2, new cbb(this, 1.0, false));
      this.bS.a(6, new bzy(this, 1.0, true, 4, this::gx));
      this.bS.a(7, new caz(this, 1.0));
      this.bT.a(1, new cbe(this).a(cjx.class));
      this.bT.a(2, new cbf<>(this, clw.class, true));
      this.bT.a(3, new cbf<>(this, cle.class, false));
      this.bT.a(3, new cbf<>(this, ceq.class, true));
      this.bT.a(5, new cbf<>(this, cff.class, 10, true, false, cff.bY));
   }

   public static btv.a gt() {
      return cjc.gv().a(btw.k, 35.0).a(btw.r, 0.23F).a(btw.c, 3.0).a(btw.a, 2.0).a(btw.u);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(d, false);
      $$0.a(cb, 0);
      $$0.a(cc, false);
   }

   public boolean gw() {
      return this.ap().a(cc);
   }

   public boolean gx() {
      return this.ch;
   }

   public void x(boolean $$0) {
      if (this.y() && cdk.a(this)) {
         if (this.ch != $$0) {
            this.ch = $$0;
            ((cbz)this.K()).b($$0);
            if ($$0) {
               this.bS.a(1, this.cg);
            } else {
               this.bS.a(this.cg);
            }
         }
      } else if (this.ch) {
         this.bS.a(this.cg);
         this.ch = false;
      }
   }

   protected boolean y() {
      return true;
   }

   @Override
   public boolean p_() {
      return this.ap().a(d);
   }

   @Override
   public int ej() {
      if (this.p_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.ej();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (this.dP() != null && !this.dP().B) {
         bts $$1 = this.f(btw.r);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(ajr<?> $$0) {
      if (d.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gr() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && !this.gf()) {
         if (this.gw()) {
            this.cj--;
            if (this.cj < 0) {
               this.ac_();
            }
         } else if (this.gr()) {
            if (this.a(awb.a)) {
               this.ci++;
               if (this.ci >= 600) {
                  this.b(300);
               }
            } else {
               this.ci = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      if (this.bD()) {
         boolean $$0 = this.ad_() && this.gj();
         if ($$0) {
            cto $$1 = this.a(bsb.f);
            if (!$$1.e()) {
               if ($$1.l()) {
                  $$1.b($$1.n() + this.ah.a(2));
                  if ($$1.n() >= $$1.o()) {
                     this.e(bsb.f);
                     this.a(bsb.f, cto.i);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.g(8);
            }
         }
      }

      super.n_();
   }

   private void b(int $$0) {
      this.cj = $$0;
      this.ap().a(cc, true);
   }

   protected void ac_() {
      this.b(bsa.B);
      if (!this.aW()) {
         this.dP().a(null, 1040, this.dp(), 0);
      }
   }

   protected void b(bsa<? extends cjv> $$0) {
      cjv $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dP().d_($$1.dp()).d());
         $$1.x($$1.y() && this.gx());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dP() instanceof aqm)) {
         return false;
      } else {
         aqm $$2 = (aqm)this.dP();
         bso $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bso) {
            $$3 = (bso)$$0.d();
         }

         if ($$3 != null && this.dP().ak() == bpr.d && (double)this.ah.i() < this.g(btw.u) && this.dP().aa().b(dat.e)) {
            int $$4 = ayd.a(this.du());
            int $$5 = ayd.a(this.dw());
            int $$6 = ayd.a(this.dA());
            cjv $$7 = new cjv(this.dP());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ayd.a(this.ah, 7, 40) * ayd.a(this.ah, -1, 1);
               int $$10 = $$5 + ayd.a(this.ah, 7, 40) * ayd.a(this.ah, -1, 1);
               int $$11 = $$6 + ayd.a(this.ah, 7, 40) * ayd.a(this.ah, -1, 1);
               io $$12 = new io($$9, $$10, $$11);
               bsa<?> $$13 = $$7.ak();
               if (btk.a($$13, this.dP(), $$12) && btk.a($$13, $$2, bss.j, $$12, this.dP().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dP().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dP().f($$7) && this.dP().g($$7) && !this.dP().d($$7.cK())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dP().d_($$7.dp()), bss.j, null);
                     $$2.a_($$7);
                     this.f(btw.u).d(new btu("Zombie reinforcement caller charge", -0.05F, btu.a.a));
                     $$7.f(btw.u).d(new btu("Zombie reinforcement callee charge", -0.05F, btu.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bru $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dP().d_(this.dp()).b();
         if (this.eX().e() && this.bQ() && this.ah.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected avg v() {
      return avh.Dp;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.Dz;
   }

   @Override
   protected avg o_() {
      return avh.Du;
   }

   protected avg gp() {
      return avh.DF;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(this.gp(), 0.15F, 1.0F);
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dP().ak() == bpr.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bsb.a, new cto(ctr.pa));
         } else {
            this.a(bsb.a, new cto(ctr.pb));
         }
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gx());
      $$0.a("InWaterTime", this.be() ? this.ci : -1);
      $$0.a("DrownedConversionTime", this.gw() ? this.cj : -1);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ci = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aqm $$0, bso $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bpr.c || $$0.ak() == bpr.d) && $$1 instanceof clj $$3) {
         if ($$0.ak() != bpr.d && this.ah.h()) {
            return $$2;
         }

         cjw $$4 = $$3.a(bsa.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dp()), bss.i, new cjv.b(false, true));
            $$4.a($$3.gA());
            $$4.a($$3.gK().a(ur.a));
            $$4.a($$3.gr().a());
            $$4.b($$3.u());
            if (!this.aW()) {
               $$0.a(null, 1026, this.dp(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public brx e(bta $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   public boolean j(cto $$0) {
      return $$0.a(ctr.qR) && this.p_() && this.bR() ? false : super.j($$0);
   }

   @Override
   public boolean k(cto $$0) {
      return $$0.a(ctr.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ayk $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new cjv.b(a($$4), true);
      }

      if ($$3 instanceof cjv.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cej> $$7 = $$0.a(cej.class, this.cK().c(5.0, 3.0, 5.0), brz.c);
                  if (!$$7.isEmpty()) {
                     cej $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cej $$9 = bsa.t.a(this.dP());
                  if ($$9 != null) {
                     $$9.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
                     $$9.a($$0, $$1, bss.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x(this.y() && $$4.i() < $$5 * 0.1F);
         this.a($$4, $$1);
         this.b($$4, $$1);
      }

      if (this.a(bsb.f).e()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bsb.f, new cto($$4.i() < 0.1F ? dea.ef : dea.ee));
            this.bV[bsb.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(ayk $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gy();
      this.f(btw.n).d(new btu("Random spawn bonus", this.ah.j() * 0.05F, btu.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(btw.k).d(new btu("Random zombie-spawn bonus", $$1, btu.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(btw.u).d(new btu("Leader zombie bonus", this.ah.j() * 0.25 + 0.5, btu.a.a));
         this.f(btw.q).d(new btu("Leader zombie bonus", this.ah.j() * 3.0 + 1.0, btu.a.c));
         this.x(this.y());
      }
   }

   protected void gy() {
      this.f(btw.u).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(bqn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cio $$4 && $$4.gq()) {
         cto $$5 = this.gq();
         if (!$$5.e()) {
            $$4.gr();
            this.b($$5);
         }
      }
   }

   protected cto gq() {
      return new cto(ctr.uo);
   }

   class a extends cao {
      a(bsx $$0, double $$1, int $$2) {
         super(dea.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(day $$0, io $$1) {
         $$0.a(null, $$1, avh.Dv, avi.f, 0.5F, 0.9F + cjv.this.ah.i() * 0.2F);
      }

      @Override
      public void a(dax $$0, io $$1) {
         $$0.a(null, $$1, avh.Af, avi.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bth {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
