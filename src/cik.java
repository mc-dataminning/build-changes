import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cik extends chr {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bsj c = new bsj(b, "Baby speed boost", 0.5, bsj.a.b);
   private static final ajk<Boolean> d = ajo.a(cik.class, ajm.k);
   private static final ajk<Integer> cb = ajo.a(cik.class, ajm.b);
   private static final ajk<Boolean> cc = ajo.a(cik.class, ajm.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final bqo cd = bqr.bt.n().a(0.5F).b(0.93F);
   private static final float ce = 0.1F;
   private static final Predicate<bon> cf = $$0 -> $$0 == bon.d;
   private final bxl cg = new bxl(this, cf);
   private boolean ch;
   private int ci;
   private int cj;

   public cik(bqr<? extends cik> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cik(czu $$0) {
      this(bqr.bt, $$0);
   }

   @Override
   protected void z() {
      this.bS.a(4, new cik.a(this, 1.0, 3));
      this.bS.a(8, new byj(this, ckl.class, 8.0F));
      this.bS.a(8, new byw(this));
      this.u();
   }

   protected void u() {
      this.bS.a(2, new bzq(this, 1.0, false));
      this.bS.a(6, new byn(this, 1.0, true, 4, this::gx));
      this.bS.a(7, new bzo(this, 1.0));
      this.bT.a(1, new bzt(this).a(cim.class));
      this.bT.a(2, new bzu<>(this, ckl.class, true));
      this.bT.a(3, new bzu<>(this, cjt.class, false));
      this.bT.a(3, new bzu<>(this, cdf.class, true));
      this.bT.a(5, new bzu<>(this, cdu.class, 10, true, false, cdu.bZ));
   }

   public static bsk.a gt() {
      return chr.gv().a(bsl.k, 35.0).a(bsl.r, 0.23F).a(bsl.c, 3.0).a(bsl.a, 2.0).a(bsl.u);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(d, false);
      $$0.a(cb, 0);
      $$0.a(cc, false);
   }

   public boolean gw() {
      return this.an().a(cc);
   }

   public boolean gx() {
      return this.ch;
   }

   public void x(boolean $$0) {
      if (this.y() && cbz.a(this)) {
         if (this.ch != $$0) {
            this.ch = $$0;
            ((cao)this.K()).b($$0);
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
      return this.an().a(d);
   }

   @Override
   public int eh() {
      if (this.p_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.eh();
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(d, $$0);
      if (this.dN() != null && !this.dN().B) {
         bsh $$1 = this.f(bsl.r);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(ajk<?> $$0) {
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
      if (!this.dN().B && this.bB() && !this.gf()) {
         if (this.gw()) {
            this.cj--;
            if (this.cj < 0) {
               this.ac_();
            }
         } else if (this.gr()) {
            if (this.a(avt.a)) {
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
      if (this.bB()) {
         boolean $$0 = this.ad_() && this.gj();
         if ($$0) {
            csd $$1 = this.d(bqs.f);
            if (!$$1.d()) {
               if ($$1.k()) {
                  $$1.b($$1.m() + this.ah.a(2));
                  if ($$1.m() >= $$1.n()) {
                     this.e(bqs.f);
                     this.a(bqs.f, csd.i);
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
      this.an().a(cc, true);
   }

   protected void ac_() {
      this.b(bqr.B);
      if (!this.aU()) {
         this.dN().a(null, 1040, this.dn(), 0);
      }
   }

   protected void b(bqr<? extends cik> $$0) {
      cik $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dN().d_($$1.dn()).d());
         $$1.x($$1.y() && this.gx());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dN() instanceof aqe)) {
         return false;
      } else {
         aqe $$2 = (aqe)this.dN();
         bre $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bre) {
            $$3 = (bre)$$0.d();
         }

         if ($$3 != null && this.dN().ak() == bon.d && (double)this.ah.i() < this.g(bsl.u) && this.dN().aa().b(czq.e)) {
            int $$4 = axw.a(this.ds());
            int $$5 = axw.a(this.du());
            int $$6 = axw.a(this.dy());
            cik $$7 = new cik(this.dN());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + axw.a(this.ah, 7, 40) * axw.a(this.ah, -1, 1);
               int $$10 = $$5 + axw.a(this.ah, 7, 40) * axw.a(this.ah, -1, 1);
               int $$11 = $$6 + axw.a(this.ah, 7, 40) * axw.a(this.ah, -1, 1);
               im $$12 = new im($$9, $$10, $$11);
               bqr<?> $$13 = $$7.ai();
               if (brz.a($$13, this.dN(), $$12) && brz.a($$13, $$2, bri.j, $$12, this.dN().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dN().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dN().f($$7) && this.dN().g($$7) && !this.dN().d($$7.cI())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dN().d_($$7.dn()), bri.j, null);
                     $$2.a_($$7);
                     this.f(bsl.u).d(new bsj("Zombie reinforcement caller charge", -0.05F, bsj.a.a));
                     $$7.f(bsl.u).d(new bsj("Zombie reinforcement callee charge", -0.05F, bsj.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bql $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dN().d_(this.dn()).b();
         if (this.eV().d() && this.bO() && this.ah.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected auy v() {
      return auz.Dd;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.Dn;
   }

   @Override
   protected auy o_() {
      return auz.Di;
   }

   protected auy gp() {
      return auz.Dt;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(this.gp(), 0.15F, 1.0F);
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dN().ak() == bon.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bqs.a, new csd(csg.pa));
         } else {
            this.a(bqs.a, new csd(csg.pb));
         }
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gx());
      $$0.a("InWaterTime", this.bc() ? this.ci : -1);
      $$0.a("DrownedConversionTime", this.gw() ? this.cj : -1);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ci = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aqe $$0, bre $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bon.c || $$0.ak() == bon.d) && $$1 instanceof cjy $$3) {
         if ($$0.ak() != bon.d && this.ah.h()) {
            return $$2;
         }

         cil $$4 = $$3.a(bqr.bv, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dn()), bri.i, new cik.b(false, true));
            $$4.a($$3.gA());
            $$4.a($$3.gK().a(um.a));
            $$4.a($$3.gr().a());
            $$4.b($$3.u());
            if (!this.aU()) {
               $$0.a(null, 1026, this.dn(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   public boolean j(csd $$0) {
      return $$0.a(csg.qR) && this.p_() && this.bP() ? false : super.j($$0);
   }

   @Override
   public boolean k(csd $$0) {
      return $$0.a(csg.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      ayd $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new cik.b(a($$4), true);
      }

      if ($$3 instanceof cik.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<ccy> $$7 = $$0.a(ccy.class, this.cI().c(5.0, 3.0, 5.0), bqq.c);
                  if (!$$7.isEmpty()) {
                     ccy $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  ccy $$9 = bqr.t.a(this.dN());
                  if ($$9 != null) {
                     $$9.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
                     $$9.a($$0, $$1, bri.g, null);
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

      if (this.d(bqs.f).d()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bqs.f, new csd($$4.i() < 0.1F ? dcx.ef : dcx.ee));
            this.bV[bqs.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(ayd $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gy();
      this.f(bsl.n).d(new bsj("Random spawn bonus", this.ah.j() * 0.05F, bsj.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bsl.k).d(new bsj("Random zombie-spawn bonus", $$1, bsj.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(bsl.u).d(new bsj("Leader zombie bonus", this.ah.j() * 0.25 + 0.5, bsj.a.a));
         this.f(bsl.q).d(new bsj("Leader zombie bonus", this.ah.j() * 3.0 + 1.0, bsj.a.c));
         this.x(this.y());
      }
   }

   protected void gy() {
      this.f(bsl.u).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(bpj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof chd $$4 && $$4.gq()) {
         csd $$5 = this.gq();
         if (!$$5.d()) {
            $$4.gr();
            this.b($$5);
         }
      }
   }

   protected csd gq() {
      return new csd(csg.uo);
   }

   class a extends bzd {
      a(brm $$0, double $$1, int $$2) {
         super(dcx.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(czv $$0, im $$1) {
         $$0.a(null, $$1, auz.Dj, ava.f, 0.5F, 0.9F + cik.this.ah.i() * 0.2F);
      }

      @Override
      public void a(czu $$0, im $$1) {
         $$0.a(null, $$1, auz.zT, ava.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements brw {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
