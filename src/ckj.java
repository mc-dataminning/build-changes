import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckj extends cjq {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final buh c = new buh(b, "Baby speed boost", 0.5, buh.a.b);
   private static final ajp<Boolean> d = ajt.a(ckj.class, ajr.k);
   private static final ajp<Integer> cd = ajt.a(ckj.class, ajr.b);
   private static final ajp<Boolean> ce = ajt.a(ckj.class, ajr.k);
   public static final float e = 0.05F;
   public static final int ca = 50;
   public static final int cb = 40;
   public static final int cc = 7;
   private static final bsj cf = bsm.bu.n().a(0.5F).b(0.93F);
   private static final float cg = 0.1F;
   private static final Predicate<bqd> ch = $$0 -> $$0 == bqd.d;
   private final bzj ci = new bzj(this, ch);
   private boolean cj;
   private int ck;
   private int cl;

   public ckj(bsm<? extends ckj> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public ckj(dcf $$0) {
      this(bsm.bu, $$0);
   }

   @Override
   protected void z() {
      this.bU.a(4, new ckj.a(this, 1.0, 3));
      this.bU.a(8, new cah(this, cmk.class, 8.0F));
      this.bU.a(8, new cau(this));
      this.u();
   }

   protected void u() {
      this.bU.a(2, new cbo(this, 1.0, false));
      this.bU.a(6, new cal(this, 1.0, true, 4, this::gw));
      this.bU.a(7, new cbm(this, 1.0));
      this.bV.a(1, new cbr(this).a(ckl.class));
      this.bV.a(2, new cbs<>(this, cmk.class, true));
      this.bV.a(3, new cbs<>(this, cls.class, false));
      this.bV.a(3, new cbs<>(this, cfd.class, true));
      this.bV.a(5, new cbs<>(this, cfs.class, 10, true, false, cfs.ca));
   }

   public static bui.a gs() {
      return cjq.gu().a(buj.m, 35.0).a(buj.v, 0.23F).a(buj.c, 3.0).a(buj.a, 2.0).a(buj.A);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, false);
      $$0.a(cd, 0);
      $$0.a(ce, false);
   }

   public boolean gv() {
      return this.aq().a(ce);
   }

   public boolean gw() {
      return this.cj;
   }

   public void x(boolean $$0) {
      if (this.y() && cdx.a(this)) {
         if (this.cj != $$0) {
            this.cj = $$0;
            ((ccm)this.K()).b($$0);
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

   protected boolean y() {
      return true;
   }

   @Override
   public boolean p_() {
      return this.aq().a(d);
   }

   @Override
   protected int eh() {
      if (this.p_()) {
         this.bP = (int)((double)this.bP * 2.5);
      }

      return super.eh();
   }

   @Override
   public void a(boolean $$0) {
      this.aq().a(d, $$0);
      if (this.dQ() != null && !this.dQ().B) {
         buf $$1 = this.f(buj.v);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      if (d.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gq() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dQ().B && this.bE() && !this.gd()) {
         if (this.gv()) {
            this.cl--;
            if (this.cl < 0) {
               this.ac_();
            }
         } else if (this.gq()) {
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
   public void n_() {
      if (this.bE()) {
         boolean $$0 = this.ad_() && this.gi();
         if ($$0) {
            cuc $$1 = this.a(bsn.f);
            if (!$$1.e()) {
               if ($$1.l()) {
                  $$1.b($$1.n() + this.ah.a(2));
                  if ($$1.n() >= $$1.o()) {
                     this.e(bsn.f);
                     this.a(bsn.f, cuc.l);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.d(8.0F);
            }
         }
      }

      super.n_();
   }

   private void b(int $$0) {
      this.cl = $$0;
      this.aq().a(ce, true);
   }

   protected void ac_() {
      this.b(bsm.B);
      if (!this.aX()) {
         this.dQ().a(null, 1040, this.dq(), 0);
      }
   }

   protected void b(bsm<? extends ckj> $$0) {
      ckj $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.H($$1.dQ().d_($$1.dq()).d());
         $$1.x($$1.y() && this.gw());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dQ() instanceof aqm)) {
         return false;
      } else {
         aqm $$2 = (aqm)this.dQ();
         btb $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof btb) {
            $$3 = (btb)$$0.d();
         }

         if ($$3 != null && this.dQ().al() == bqd.d && (double)this.ah.i() < this.g(buj.A) && this.dQ().ab().b(dcb.e)) {
            int $$4 = ayg.a(this.dv());
            int $$5 = ayg.a(this.dx());
            int $$6 = ayg.a(this.dB());
            ckj $$7 = new ckj(this.dQ());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + ayg.a(this.ah, 7, 40) * ayg.a(this.ah, -1, 1);
               int $$10 = $$5 + ayg.a(this.ah, 7, 40) * ayg.a(this.ah, -1, 1);
               int $$11 = $$6 + ayg.a(this.ah, 7, 40) * ayg.a(this.ah, -1, 1);
               ja $$12 = new ja($$9, $$10, $$11);
               bsm<?> $$13 = $$7.al();
               if (btx.a($$13, this.dQ(), $$12) && btx.a($$13, $$2, btf.j, $$12, this.dQ().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dQ().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dQ().f($$7) && this.dQ().g($$7) && !this.dQ().d($$7.cL())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dQ().d_($$7.dq()), btf.j, null);
                     $$2.a_($$7);
                     this.f(buj.A).d(new buh("Zombie reinforcement caller charge", -0.05F, buh.a.a));
                     $$7.f(buj.A).d(new buh("Zombie reinforcement callee charge", -0.05F, buh.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean D(bsg $$0) {
      boolean $$1 = super.D($$0);
      if ($$1) {
         float $$2 = this.dQ().d_(this.dq()).b();
         if (this.eU().e() && this.bR() && this.ah.i() < $$2 * 0.3F) {
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
   protected avg d(bqz $$0) {
      return avh.DC;
   }

   @Override
   protected avg o_() {
      return avh.Dx;
   }

   protected avg go() {
      return avh.DI;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(this.go(), 0.15F, 1.0F);
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dQ().al() == bqd.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bsn.a, new cuc(cuf.pb));
         } else {
            this.a(bsn.a, new cuc(cuf.pc));
         }
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gw());
      $$0.a("InWaterTime", this.bf() ? this.ck : -1);
      $$0.a("DrownedConversionTime", this.gv() ? this.cl : -1);
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
   public boolean a(aqm $$0, btb $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.al() == bqd.c || $$0.al() == bqd.d) && $$1 instanceof clx $$3) {
         if ($$0.al() != bqd.d && this.ah.h()) {
            return $$2;
         }

         ckk $$4 = $$3.a(bsm.bw, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dq()), btf.i, new ckj.b(false, true));
            $$4.a($$3.gz());
            $$4.a($$3.gJ().a(ul.a));
            $$4.a($$3.gq().a());
            $$4.b($$3.u());
            if (!this.aX()) {
               $$0.a(null, 1026, this.dq(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? cf : super.e($$0);
   }

   @Override
   public boolean j(cuc $$0) {
      return $$0.a(cuf.qR) && this.p_() && this.bS() ? false : super.j($$0);
   }

   @Override
   public boolean k(cuc $$0) {
      return $$0.a(cuf.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      ayo $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new ckj.b(a($$4), true);
      }

      if ($$3 instanceof ckj.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cew> $$7 = $$0.a(cew.class, this.cL().c(5.0, 3.0, 5.0), bsl.c);
                  if (!$$7.isEmpty()) {
                     cew $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cew $$9 = bsm.t.a(this.dQ());
                  if ($$9 != null) {
                     $$9.b(this.dv(), this.dx(), this.dB(), this.dG(), 0.0F);
                     $$9.a($$0, $$1, btf.g, null);
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

      if (this.a(bsn.f).e()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bsn.f, new cuc($$4.i() < 0.1F ? dfj.ef : dfj.ee));
            this.bX[bsn.f.b()] = 0.0F;
         }
      }

      this.H($$5);
      return $$3;
   }

   public static boolean a(ayo $$0) {
      return $$0.i() < 0.05F;
   }

   protected void H(float $$0) {
      this.gx();
      this.f(buj.p).d(new buh("Random spawn bonus", this.ah.j() * 0.05F, buh.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(buj.m).d(new buh("Random zombie-spawn bonus", $$1, buh.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(buj.A).d(new buh("Leader zombie bonus", this.ah.j() * 0.25 + 0.5, buh.a.a));
         this.f(buj.s).d(new buh("Leader zombie bonus", this.ah.j() * 3.0 + 1.0, buh.a.c));
         this.x(this.y());
      }
   }

   protected void gx() {
      this.f(buj.A).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(bqz $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$0.d() instanceof cjc $$3 && $$3.gp()) {
         cuc $$4 = this.gp();
         if (!$$4.e()) {
            $$3.gq();
            this.b($$4);
         }
      }
   }

   protected cuc gp() {
      return new cuc(cuf.uo);
   }

   class a extends cbb {
      a(final btk $$0, final double $$1, final int $$2) {
         super(dfj.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dcg $$0, ja $$1) {
         $$0.a(null, $$1, avh.Dy, avi.f, 0.5F, 0.9F + ckj.this.ah.i() * 0.2F);
      }

      @Override
      public void a(dcf $$0, ja $$1) {
         $$0.a(null, $$1, avh.Ai, avi.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements btu {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
