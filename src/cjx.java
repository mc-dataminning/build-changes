import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjx extends cjd {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final btt c = new btt(b, "Baby speed boost", 0.5, btt.a.b);
   private static final ajy<Boolean> d = akc.a(cjx.class, aka.k);
   private static final ajy<Integer> ck = akc.a(cjx.class, aka.b);
   private static final ajy<Boolean> cl = akc.a(cjx.class, aka.k);
   private static final ajy<Boolean> cm = akc.a(cjx.class, aka.k);
   public static final float e = 0.05F;
   public static final int ch = 50;
   public static final int ci = 40;
   public static final int cj = 7;
   private static final bry cn = bsb.by.n().a(0.5F).b(0.93F);
   private static final float co = 0.1F;
   private static final Predicate<bpx> cp = $$0 -> $$0 == bpx.d;
   private final byv cq = new byv(this, cp);
   private boolean cr;
   private int cs;
   private int ct;

   public cjx(bsb<? extends cjx> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cjx(dca $$0) {
      this(bsb.by, $$0);
   }

   @Override
   protected void y() {
      this.cb.a(4, new cjx.a(this, 1.0, 3));
      this.cb.a(8, new bzt(this, cly.class, 8.0F));
      this.cb.a(8, new cag(this));
      this.t();
   }

   protected void t() {
      this.cb.a(2, new cba<>(this, 1.0, false));
      this.cb.a(6, new bzx(this, 1.0, true, 4, this::gI));
      this.cb.a(7, new cay(this, 1.0));
      this.cc.a(1, new cbd(this).a(cjz.class));
      this.cc.a(2, new cbe<>(this, cly.class, true));
      this.cc.a(3, new cbe<>(this, clg.class, false));
      this.cc.a(3, new cbe<>(this, ceq.class, true));
      this.cc.a(5, new cbe<>(this, cff.class, 10, true, false, cff.ch));
   }

   public static btu.a gD() {
      return cjd.gG().a(btv.k, 35.0).a(btv.r, 0.23F).a(btv.c, 3.0).a(btv.a, 2.0).a(btv.u);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(d, false);
      $$0.a(ck, 0);
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   public boolean gE() {
      return this.ap().a(cl);
   }

   public boolean gH() {
      return this.ap().a(cm);
   }

   public boolean gI() {
      return this.cr;
   }

   public void x(boolean $$0) {
      if (this.x() && cdj.a(this)) {
         if (this.cr != $$0) {
            this.cr = $$0;
            ((cby)this.J()).b($$0);
            if ($$0) {
               this.cb.a(1, this.cq);
            } else {
               this.cb.a(this.cq);
            }
         }
      } else if (this.cr) {
         this.cb.a(this.cq);
         this.cr = false;
      }
   }

   protected boolean x() {
      return true;
   }

   @Override
   public boolean o_() {
      return this.ap().a(d);
   }

   @Override
   public int er() {
      if (this.o_()) {
         this.bW = (int)((double)this.bW * 2.5);
      }

      return super.er();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (this.dU() != null && !this.dU().C) {
         btr $$1 = this.f(btv.r);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(ajy<?> $$0) {
      if (d.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   protected boolean gA() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dU().C && this.bI() && !this.go()) {
         if (this.gH()) {
            this.gJ();
         } else if (this.gE()) {
            this.ct--;
            if (this.ct < 0) {
               this.ad_();
            }
         } else if (this.gA()) {
            if (this.a(awj.a)) {
               this.cs++;
               if (this.cs >= 600) {
                  this.b(300);
               }
            } else {
               this.cs = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      if (this.bI()) {
         boolean $$0 = this.ae_() && this.gs();
         if ($$0) {
            cuh $$1 = this.d(bsc.f);
            if (!$$1.d()) {
               if ($$1.k()) {
                  $$1.b($$1.m() + this.al.a(2));
                  if ($$1.m() >= $$1.n()) {
                     this.e(bsc.f);
                     this.a(bsc.f, cuh.i);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.g(8);
            }
         }
      }

      super.m_();
   }

   private void b(int $$0) {
      this.ct = $$0;
      this.ap().a(cl, true);
   }

   protected void ad_() {
      this.b(bsb.D);
      if (!this.ba()) {
         this.dU().a(null, 1040, this.du(), 0);
      }
   }

   private void gC() {
      this.ap().a(cm, true);
   }

   protected void gJ() {
      this.b(bsb.bz);
      if (!this.ba()) {
         this.dU().a(null, 1040, this.du(), 0);
      }
   }

   protected void b(bsb<? extends cjx> $$0) {
      cjx $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dU().d_($$1.du()).d());
         $$1.x($$1.x() && this.gI());
      }
   }

   protected boolean ae_() {
      return true;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dU() instanceof aqt)) {
         return false;
      } else {
         aqt $$2 = (aqt)this.dU();
         bso $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bso) {
            $$3 = (bso)$$0.d();
         }

         if ($$3 != null && this.dU().al() == bpx.d && (double)this.al.i() < this.g(btv.u) && this.dU().ab().b(dbw.e)) {
            int $$4 = aym.a(this.dz());
            int $$5 = aym.a(this.dB());
            int $$6 = aym.a(this.dF());
            cjx $$7 = new cjx(this.dU());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + aym.a(this.al, 7, 40) * aym.a(this.al, -1, 1);
               int $$10 = $$5 + aym.a(this.al, 7, 40) * aym.a(this.al, -1, 1);
               int $$11 = $$6 + aym.a(this.al, 7, 40) * aym.a(this.al, -1, 1);
               ir $$12 = new ir($$9, $$10, $$11);
               bsb<?> $$13 = $$7.ak();
               if (btj.a($$13, this.dU(), $$12) && btj.a($$13, $$2, bss.j, $$12, this.dU().A)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dU().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dU().f($$7) && this.dU().g($$7) && !this.dU().d($$7.cP())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dU().d_($$7.du()), bss.j, null);
                     $$2.a_($$7);
                     this.f(btv.u).d(new btt("Zombie reinforcement caller charge", -0.05F, btt.a.a));
                     $$7.f(btv.u).d(new btt("Zombie reinforcement callee charge", -0.05F, btt.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(brv $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dU().d_(this.du()).b();
         if (this.fg().d() && this.bV() && this.al.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected avn u() {
      return avo.DN;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.DX;
   }

   @Override
   protected avn n_() {
      return avo.DS;
   }

   protected avn gy() {
      return avo.Ej;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(this.gy(), 0.15F, 1.0F);
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dU().al() == bpx.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bsc.a, new cuh(cuk.qt));
         } else {
            this.a(bsc.a, new cuh(cuk.qu));
         }
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gI());
      $$0.a("InWaterTime", this.bi() ? this.cs : -1);
      $$0.a("DrownedConversionTime", this.gE() ? this.ct : -1);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cs = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aqt $$0, bso $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == bpx.c || $$0.al() == bpx.d) && $$1 instanceof cll $$3) {
         if ($$0.al() != bpx.d && this.al.h()) {
            return $$2;
         }

         cjy $$4 = $$3.a(bsb.bB, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.du()), bss.i, new cjx.b(false, true));
            $$4.a($$3.gL());
            $$4.a($$3.gT().a(uy.a));
            $$4.a($$3.gA().a());
            $$4.b($$3.t());
            if (!this.ba()) {
               $$0.a(null, 1026, this.du(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? cn : super.e($$0);
   }

   @Override
   public boolean j(cuh $$0) {
      return $$0.a(cuk.so) && this.o_() && this.bW() ? false : super.j($$0);
   }

   @Override
   public boolean k(cuh $$0) {
      return $$0.a(cuk.sD) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ayt $$4 = $$0.F_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new cjx.b(a($$4), true);
      }

      if ($$3 instanceof cjx.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cej> $$7 = $$0.a(cej.class, this.cP().c(5.0, 3.0, 5.0), bsa.c);
                  if (!$$7.isEmpty()) {
                     cej $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cej $$9 = bsb.v.a(this.dU());
                  if ($$9 != null) {
                     $$9.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
                     $$9.a($$0, $$1, bss.g, null);
                     $$9.w(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x(this.x() && $$4.i() < $$5 * 0.1F);
         this.a($$4, $$1);
         this.b($$4, $$1);
      }

      if (this.d(bsc.f).d()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bsc.f, new cuh($$4.i() < 0.1F ? dfe.eX : dfe.eU));
            this.ce[bsc.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(ayt $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gK();
      this.f(btv.n).d(new btt("Random spawn bonus", this.al.j() * 0.05F, btt.a.a));
      double $$1 = this.al.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(btv.k).d(new btt("Random zombie-spawn bonus", $$1, btt.a.c));
      }

      if (this.al.i() < $$0 * 0.05F) {
         this.f(btv.u).d(new btt("Leader zombie bonus", this.al.j() * 0.25 + 0.5, btt.a.a));
         this.f(btv.q).d(new btt("Leader zombie bonus", this.al.j() * 3.0 + 1.0, btt.a.c));
         this.x(this.x());
      }
   }

   protected void gK() {
      this.f(btv.u).a(this.al.j() * 0.1F);
   }

   @Override
   protected void a(bqt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cio $$4 && $$4.gz()) {
         cuh $$5 = this.gz();
         if (!$$5.d()) {
            $$4.gA();
            this.b($$5);
         }
      }
   }

   protected cuh gz() {
      return new cuh(cuk.vZ);
   }

   class a extends can {
      a(bsw $$0, double $$1, int $$2) {
         super(dfe.nd, $$0, $$1, $$2);
      }

      @Override
      public void a(dcb $$0, ir $$1) {
         $$0.a(null, $$1, avo.DT, avq.f, 0.5F, 0.9F + cjx.this.al.i() * 0.2F);
      }

      @Override
      public void a(dca $$0, ir $$1) {
         $$0.a(null, $$1, avo.AD, avq.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements btg {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
