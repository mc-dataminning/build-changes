import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjg extends cin {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final btf c = new btf(b, "Baby speed boost", 0.5, btf.a.b);
   private static final ajm<Boolean> d = ajq.a(cjg.class, ajo.k);
   private static final ajm<Integer> cb = ajq.a(cjg.class, ajo.b);
   private static final ajm<Boolean> cc = ajq.a(cjg.class, ajo.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final brk cd = brn.bt.n().a(0.5F).b(0.93F);
   private static final float ce = 0.1F;
   private static final Predicate<bpj> cf = $$0 -> $$0 == bpj.d;
   private final byh cg = new byh(this, cf);
   private boolean ch;
   private int ci;
   private int cj;

   public cjg(brn<? extends cjg> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cjg(dad $$0) {
      this(brn.bt, $$0);
   }

   @Override
   protected void z() {
      this.bS.a(4, new cjg.a(this, 1.0, 3));
      this.bS.a(8, new bzf(this, clh.class, 8.0F));
      this.bS.a(8, new bzs(this));
      this.u();
   }

   protected void u() {
      this.bS.a(2, new cam(this, 1.0, false));
      this.bS.a(6, new bzj(this, 1.0, true, 4, this::gx));
      this.bS.a(7, new cak(this, 1.0));
      this.bT.a(1, new cap(this).a(cji.class));
      this.bT.a(2, new caq<>(this, clh.class, true));
      this.bT.a(3, new caq<>(this, ckp.class, false));
      this.bT.a(3, new caq<>(this, ceb.class, true));
      this.bT.a(5, new caq<>(this, ceq.class, 10, true, false, ceq.bY));
   }

   public static btg.a gt() {
      return cin.gv().a(bth.k, 35.0).a(bth.r, 0.23F).a(bth.c, 3.0).a(bth.a, 2.0).a(bth.u);
   }

   @Override
   protected void a(ajq.a $$0) {
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
      if (this.y() && ccv.a(this)) {
         if (this.ch != $$0) {
            this.ch = $$0;
            ((cbk)this.K()).b($$0);
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
         btd $$1 = this.f(bth.r);
         $$1.b(c.b());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(ajm<?> $$0) {
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
            if (this.a(avw.a)) {
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
            csz $$1 = this.d(bro.f);
            if (!$$1.d()) {
               if ($$1.k()) {
                  $$1.b($$1.m() + this.ah.a(2));
                  if ($$1.m() >= $$1.n()) {
                     this.e(bro.f);
                     this.a(bro.f, csz.i);
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
      this.b(brn.B);
      if (!this.aU()) {
         this.dN().a(null, 1040, this.dn(), 0);
      }
   }

   protected void b(brn<? extends cjg> $$0) {
      cjg $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.G($$1.dN().d_($$1.dn()).d());
         $$1.x($$1.y() && this.gx());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dN() instanceof aqh)) {
         return false;
      } else {
         aqh $$2 = (aqh)this.dN();
         bsa $$3 = this.p();
         if ($$3 == null && $$0.d() instanceof bsa) {
            $$3 = (bsa)$$0.d();
         }

         if ($$3 != null && this.dN().ak() == bpj.d && (double)this.ah.i() < this.g(bth.u) && this.dN().aa().b(czz.e)) {
            int $$4 = axz.a(this.ds());
            int $$5 = axz.a(this.du());
            int $$6 = axz.a(this.dy());
            cjg $$7 = new cjg(this.dN());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + axz.a(this.ah, 7, 40) * axz.a(this.ah, -1, 1);
               int $$10 = $$5 + axz.a(this.ah, 7, 40) * axz.a(this.ah, -1, 1);
               int $$11 = $$6 + axz.a(this.ah, 7, 40) * axz.a(this.ah, -1, 1);
               in $$12 = new in($$9, $$10, $$11);
               brn<?> $$13 = $$7.ai();
               if (bsv.a($$13, this.dN(), $$12) && bsv.a($$13, $$2, bse.j, $$12, this.dN().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dN().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dN().f($$7) && this.dN().g($$7) && !this.dN().d($$7.cI())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dN().d_($$7.dn()), bse.j, null);
                     $$2.a_($$7);
                     this.f(bth.u).d(new btf("Zombie reinforcement caller charge", -0.05F, btf.a.a));
                     $$7.f(bth.u).d(new btf("Zombie reinforcement callee charge", -0.05F, btf.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(brh $$0) {
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
   protected avb v() {
      return avc.De;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.Do;
   }

   @Override
   protected avb o_() {
      return avc.Dj;
   }

   protected avb gp() {
      return avc.Du;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(this.gp(), 0.15F, 1.0F);
   }

   @Override
   protected void a(ayg $$0, bpk $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dN().ak() == bpj.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bro.a, new csz(ctc.pa));
         } else {
            this.a(bro.a, new csz(ctc.pb));
         }
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gx());
      $$0.a("InWaterTime", this.bc() ? this.ci : -1);
      $$0.a("DrownedConversionTime", this.gw() ? this.cj : -1);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ci = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aqh $$0, bsa $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bpj.c || $$0.ak() == bpj.d) && $$1 instanceof cku $$3) {
         if ($$0.ak() != bpj.d && this.ah.h()) {
            return $$2;
         }

         cjh $$4 = $$3.a(brn.bv, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dn()), bse.i, new cjg.b(false, true));
            $$4.a($$3.gA());
            $$4.a($$3.gK().a(uo.a));
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
   public brk e(bsl $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   public boolean j(csz $$0) {
      return $$0.a(ctc.qR) && this.p_() && this.bP() ? false : super.j($$0);
   }

   @Override
   public boolean k(csz $$0) {
      return $$0.a(ctc.rg) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ayg $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.a_($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new cjg.b(a($$4), true);
      }

      if ($$3 instanceof cjg.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cdu> $$7 = $$0.a(cdu.class, this.cI().c(5.0, 3.0, 5.0), brm.c);
                  if (!$$7.isEmpty()) {
                     cdu $$8 = $$7.get(0);
                     $$8.w(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cdu $$9 = brn.t.a(this.dN());
                  if ($$9 != null) {
                     $$9.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
                     $$9.a($$0, $$1, bse.g, null);
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

      if (this.d(bro.f).d()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bro.f, new csz($$4.i() < 0.1F ? ddg.ef : ddg.ee));
            this.bV[bro.f.b()] = 0.0F;
         }
      }

      this.G($$5);
      return $$3;
   }

   public static boolean a(ayg $$0) {
      return $$0.i() < 0.05F;
   }

   protected void G(float $$0) {
      this.gy();
      this.f(bth.n).d(new btf("Random spawn bonus", this.ah.j() * 0.05F, btf.a.a));
      double $$1 = this.ah.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bth.k).d(new btf("Random zombie-spawn bonus", $$1, btf.a.c));
      }

      if (this.ah.i() < $$0 * 0.05F) {
         this.f(bth.u).d(new btf("Leader zombie bonus", this.ah.j() * 0.25 + 0.5, btf.a.a));
         this.f(bth.q).d(new btf("Leader zombie bonus", this.ah.j() * 3.0 + 1.0, btf.a.c));
         this.x(this.y());
      }
   }

   protected void gy() {
      this.f(bth.u).a(this.ah.j() * 0.1F);
   }

   @Override
   protected void a(bqf $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof chz $$4 && $$4.gq()) {
         csz $$5 = this.gq();
         if (!$$5.d()) {
            $$4.gr();
            this.b($$5);
         }
      }
   }

   protected csz gq() {
      return new csz(ctc.uo);
   }

   class a extends bzz {
      a(bsi $$0, double $$1, int $$2) {
         super(ddg.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dae $$0, in $$1) {
         $$0.a(null, $$1, avc.Dk, avd.f, 0.5F, 0.9F + cjg.this.ah.i() * 0.2F);
      }

      @Override
      public void a(dad $$0, in $$1) {
         $$0.a(null, $$1, avc.zU, avd.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bss {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
