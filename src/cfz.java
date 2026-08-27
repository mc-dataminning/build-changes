import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfz extends cfg {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bqc c = new bqc(b, "Baby speed boost", 0.5, bqc.a.b);
   private static final aii<Boolean> d = ail.a(cfz.class, aik.k);
   private static final aii<Integer> bY = ail.a(cfz.class, aik.b);
   private static final aii<Boolean> bZ = ail.a(cfz.class, aik.k);
   public static final float e = 0.05F;
   public static final int bV = 50;
   public static final int bW = 40;
   public static final int bX = 7;
   private static final boi ca = bol.bs.n().a(0.5F).b(0.93F);
   private static final float cb = 0.1F;
   private static final Predicate<bmi> cc = $$0 -> $$0 == bmi.d;
   private final bve cd = new bve(this, cc);
   private boolean ce;
   private int cf;
   private int cg;

   public cfz(bol<? extends cfz> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cfz(cwe $$0) {
      this(bol.bs, $$0);
   }

   @Override
   protected void B() {
      this.bP.a(4, new cfz.a(this, 1.0, 3));
      this.bP.a(8, new bwc(this, cia.class, 8.0F));
      this.bP.a(8, new bwp(this));
      this.w();
   }

   protected void w() {
      this.bP.a(2, new bxj(this, 1.0, false));
      this.bP.a(6, new bwg(this, 1.0, true, 4, this::gt));
      this.bP.a(7, new bxh(this, 1.0));
      this.bQ.a(1, new bxm(this).a(cgb.class));
      this.bQ.a(2, new bxn<>(this, cia.class, true));
      this.bQ.a(3, new bxn<>(this, chi.class, false));
      this.bQ.a(3, new bxn<>(this, cay.class, true));
      this.bQ.a(5, new bxn<>(this, cbn.class, 10, true, false, cbn.bW));
   }

   public static bqd.a gp() {
      return cfg.gr().a(bqe.i, 35.0).a(bqe.o, 0.23F).a(bqe.c, 3.0).a(bqe.a, 2.0).a(bqe.q);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(d, false);
      this.an().a(bY, 0);
      this.an().a(bZ, false);
   }

   public boolean gs() {
      return this.an().b(bZ);
   }

   public boolean gt() {
      return this.ce;
   }

   public void x(boolean $$0) {
      if (this.A() && bzs.a(this)) {
         if (this.ce != $$0) {
            this.ce = $$0;
            ((byh)this.N()).b($$0);
            if ($$0) {
               this.bP.a(1, this.cd);
            } else {
               this.bP.a(this.cd);
            }
         }
      } else if (this.ce) {
         this.bP.a(this.cd);
         this.ce = false;
      }
   }

   protected boolean A() {
      return true;
   }

   @Override
   public boolean o_() {
      return this.an().b(d);
   }

   @Override
   public int ed() {
      if (this.o_()) {
         this.bK = (int)((double)this.bK * 2.5);
      }

      return super.ed();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (this.dJ() != null && !this.dJ().B) {
         bqa $$1 = this.f(bqe.o);
         $$1.b(c.a());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(aii<?> $$0) {
      if (d.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   protected boolean gn() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dJ().B && this.bx() && !this.gb()) {
         if (this.gs()) {
            this.cg--;
            if (this.cg < 0) {
               this.ae_();
            }
         } else if (this.gn()) {
            if (this.a(auj.a)) {
               this.cf++;
               if (this.cf >= 600) {
                  this.b(300);
               }
            } else {
               this.cf = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void d_() {
      if (this.bx()) {
         boolean $$0 = this.af_() && this.gf();
         if ($$0) {
            cpq $$1 = this.c(bom.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.l() + this.af.a(2));
                  if ($$1.l() >= $$1.m()) {
                     this.d(bom.f);
                     this.a(bom.f, cpq.h);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.g(8);
            }
         }
      }

      super.d_();
   }

   private void b(int $$0) {
      this.cg = $$0;
      this.an().b(bZ, true);
   }

   protected void ae_() {
      this.b(bol.A);
      if (!this.aU()) {
         this.dJ().a(null, 1040, this.dj(), 0);
      }
   }

   protected void b(bol<? extends cfz> $$0) {
      cfz $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dJ().d_($$1.dj()).d());
         $$1.x($$1.A() && this.gt());
      }
   }

   protected boolean af_() {
      return true;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dJ() instanceof apa)) {
         return false;
      } else {
         apa $$2 = (apa)this.dJ();
         box $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof box) {
            $$3 = (box)$$0.d();
         }

         if ($$3 != null && this.dJ().aj() == bmi.d && (double)this.af.i() < this.g(bqe.q) && this.dJ().Z().b(cwa.e)) {
            int $$4 = awm.a(this.do());
            int $$5 = awm.a(this.dq());
            int $$6 = awm.a(this.du());
            cfz $$7 = new cfz(this.dJ());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + awm.a(this.af, 7, 40) * awm.a(this.af, -1, 1);
               int $$10 = $$5 + awm.a(this.af, 7, 40) * awm.a(this.af, -1, 1);
               int $$11 = $$6 + awm.a(this.af, 7, 40) * awm.a(this.af, -1, 1);
               ib $$12 = new ib($$9, $$10, $$11);
               bol<?> $$13 = $$7.ai();
               if (bps.a($$13, this.dJ(), $$12) && bps.a($$13, $$2, bpb.j, $$12, this.dJ().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dJ().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dJ().f($$7) && this.dJ().g($$7) && !this.dJ().d($$7.cE())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dJ().d_($$7.dj()), bpb.j, null);
                     $$2.a_($$7);
                     this.f(bqe.q).d(new bqc("Zombie reinforcement caller charge", -0.05F, bqc.a.a));
                     $$7.f(bqe.q).d(new bqc("Zombie reinforcement callee charge", -0.05F, bqc.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean B(bof $$0) {
      boolean $$1 = super.B($$0);
      if ($$1) {
         float $$2 = this.dJ().d_(this.dj()).b();
         if (this.eR().b() && this.bK() && this.af.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected ato y() {
      return atp.CF;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.CP;
   }

   @Override
   protected ato n_() {
      return atp.CK;
   }

   protected ato gl() {
      return atp.CV;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(this.gl(), 0.15F, 1.0F);
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dJ().aj() == bmi.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bom.a, new cpq(cpt.oZ));
         } else {
            this.a(bom.a, new cpq(cpt.pa));
         }
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gt());
      $$0.a("InWaterTime", this.aZ() ? this.cf : -1);
      $$0.a("DrownedConversionTime", this.gs() ? this.cg : -1);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cf = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(apa $$0, box $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.aj() == bmi.c || $$0.aj() == bmi.d) && $$1 instanceof chn $$3) {
         if ($$0.aj() != bmi.d && this.af.h()) {
            return $$2;
         }

         cga $$4 = $$3.a(bol.bu, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dj()), bpb.i, new cfz.b(false, true));
            $$4.a($$3.gw());
            $$4.a($$3.gG().a(tm.a));
            $$4.a($$3.gn().a());
            $$4.b($$3.w());
            if (!this.aU()) {
               $$0.a(null, 1026, this.dj(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? ca : super.e($$0);
   }

   @Override
   public boolean j(cpq $$0) {
      return $$0.a(cpt.qQ) && this.o_() && this.bL() ? false : super.j($$0);
   }

   @Override
   public boolean k(cpq $$0) {
      return $$0.a(cpt.rf) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      awt $$4 = $$0.F_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      this.s($$4.i() < 0.55F * $$5);
      if ($$3 == null) {
         $$3 = new cfz.b(a($$4), true);
      }

      if ($$3 instanceof cfz.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<car> $$7 = $$0.a(car.class, this.cE().c(5.0, 3.0, 5.0), bok.c);
                  if (!$$7.isEmpty()) {
                     car $$8 = $$7.get(0);
                     $$8.w(true);
                     this.m($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  car $$9 = bol.s.a(this.dJ());
                  if ($$9 != null) {
                     $$9.b(this.do(), this.dq(), this.du(), this.dz(), 0.0F);
                     $$9.a($$0, $$1, bpb.g, null);
                     $$9.w(true);
                     this.m($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.x(this.A() && $$4.i() < $$5 * 0.1F);
         this.a($$4, $$1);
         this.b($$4, $$1);
      }

      if (this.c(bom.f).b()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bom.f, new cpq($$4.i() < 0.1F ? czh.ef : czh.ee));
            this.bS[bom.f.b()] = 0.0F;
         }
      }

      this.E($$5);
      return $$3;
   }

   public static boolean a(awt $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gu();
      this.f(bqe.k).d(new bqc("Random spawn bonus", this.af.j() * 0.05F, bqc.a.a));
      double $$1 = this.af.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bqe.i).d(new bqc("Random zombie-spawn bonus", $$1, bqc.a.c));
      }

      if (this.af.i() < $$0 * 0.05F) {
         this.f(bqe.q).d(new bqc("Leader zombie bonus", this.af.j() * 0.25 + 0.5, bqc.a.a));
         this.f(bqe.n).d(new bqc("Leader zombie bonus", this.af.j() * 3.0 + 1.0, bqc.a.c));
         this.x(this.A());
      }
   }

   protected void gu() {
      this.f(bqe.q).a(this.af.j() * 0.1F);
   }

   @Override
   protected void a(bne $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ces $$4 && $$4.gm()) {
         cpq $$5 = this.gm();
         if (!$$5.b()) {
            $$4.gn();
            this.b($$5);
         }
      }
   }

   protected cpq gm() {
      return new cpq(cpt.uk);
   }

   class a extends bww {
      a(bpf $$0, double $$1, int $$2) {
         super(czh.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cwf $$0, ib $$1) {
         $$0.a(null, $$1, atp.CL, atq.f, 0.5F, 0.9F + cfz.this.af.i() * 0.2F);
      }

      @Override
      public void a(cwe $$0, ib $$1) {
         $$0.a(null, $$1, atp.zB, atq.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bpp {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
