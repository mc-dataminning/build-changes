import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdp extends ccw {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bns c = new bns(b, "Baby speed boost", 0.5, bns.a.b);
   private static final agn<Boolean> d = agq.a(cdp.class, agp.k);
   private static final agn<Integer> bX = agq.a(cdp.class, agp.b);
   private static final agn<Boolean> bY = agq.a(cdp.class, agp.k);
   public static final float e = 0.05F;
   public static final int bU = 50;
   public static final int bV = 40;
   public static final int bW = 7;
   private static final blz bZ = bmc.bs.n().a(0.5F).b(0.93F);
   private static final float ca = 0.1F;
   private static final Predicate<bjz> cb = $$0 -> $$0 == bjz.d;
   private final bsu cc = new bsu(this, cb);
   private boolean cd;
   private int ce;
   private int cf;

   public cdp(bmc<? extends cdp> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cdp(ctx $$0) {
      this(bmc.bs, $$0);
   }

   @Override
   protected void B() {
      this.bP.a(4, new cdp.a(this, 1.0, 3));
      this.bP.a(8, new bts(this, cfq.class, 8.0F));
      this.bP.a(8, new buf(this));
      this.w();
   }

   protected void w() {
      this.bP.a(2, new buz(this, 1.0, false));
      this.bP.a(6, new btw(this, 1.0, true, 4, this::gn));
      this.bP.a(7, new bux(this, 1.0));
      this.bQ.a(1, new bvc(this).a(cdr.class));
      this.bQ.a(2, new bvd<>(this, cfq.class, true));
      this.bQ.a(3, new bvd<>(this, cey.class, false));
      this.bQ.a(3, new bvd<>(this, byo.class, true));
      this.bQ.a(5, new bvd<>(this, bzd.class, 10, true, false, bzd.bV));
   }

   public static bnt.a gj() {
      return ccw.gl().a(bnu.i, 35.0).a(bnu.o, 0.23F).a(bnu.c, 3.0).a(bnu.a, 2.0).a(bnu.q);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(d, false);
      this.an().a(bX, 0);
      this.an().a(bY, false);
   }

   public boolean gm() {
      return this.an().b(bY);
   }

   public boolean gn() {
      return this.cd;
   }

   public void x(boolean $$0) {
      if (this.A() && bxi.a(this)) {
         if (this.cd != $$0) {
            this.cd = $$0;
            ((bvx)this.N()).b($$0);
            if ($$0) {
               this.bP.a(1, this.cc);
            } else {
               this.bP.a(this.cc);
            }
         }
      } else if (this.cd) {
         this.bP.a(this.cc);
         this.cd = false;
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
   public int ee() {
      if (this.o_()) {
         this.bK = (int)((double)this.bK * 2.5);
      }

      return super.ee();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (this.dL() != null && !this.dL().B) {
         bnq $$1 = this.f(bnu.o);
         $$1.b(c.a());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(agn<?> $$0) {
      if (d.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   protected boolean gh() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dL().B && this.bx() && !this.fV()) {
         if (this.gm()) {
            this.cf--;
            if (this.cf < 0) {
               this.ae_();
            }
         } else if (this.gh()) {
            if (this.a(asn.a)) {
               this.ce++;
               if (this.ce >= 600) {
                  this.b(300);
               }
            } else {
               this.ce = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void d_() {
      if (this.bx()) {
         boolean $$0 = this.af_() && this.fZ();
         if ($$0) {
            cng $$1 = this.c(bmd.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bmd.f);
                     this.a(bmd.f, cng.f);
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
      this.cf = $$0;
      this.an().b(bY, true);
   }

   protected void ae_() {
      this.b(bmc.A);
      if (!this.aU()) {
         this.dL().a(null, 1040, this.dl(), 0);
      }
   }

   protected void b(bmc<? extends cdp> $$0) {
      cdp $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.D($$1.dL().d_($$1.dl()).d());
         $$1.x($$1.A() && this.gn());
      }
   }

   protected boolean af_() {
      return true;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dL() instanceof ane)) {
         return false;
      } else {
         ane $$2 = (ane)this.dL();
         bmo $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof bmo) {
            $$3 = (bmo)$$0.d();
         }

         if ($$3 != null && this.dL().ak() == bjz.d && (double)this.ag.i() < this.g(bnu.q) && this.dL().Z().b(ctt.e)) {
            int $$4 = aup.a(this.dq());
            int $$5 = aup.a(this.ds());
            int $$6 = aup.a(this.dw());
            cdp $$7 = new cdp(this.dL());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + aup.a(this.ag, 7, 40) * aup.a(this.ag, -1, 1);
               int $$10 = $$5 + aup.a(this.ag, 7, 40) * aup.a(this.ag, -1, 1);
               int $$11 = $$6 + aup.a(this.ag, 7, 40) * aup.a(this.ag, -1, 1);
               hx $$12 = new hx($$9, $$10, $$11);
               bmc<?> $$13 = $$7.ai();
               bni.c $$14 = bni.a($$13);
               if (cui.a($$14, this.dL(), $$12, $$13) && bni.a($$13, $$2, bms.j, $$12, this.dL().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dL().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dL().f($$7) && this.dL().g($$7) && !this.dL().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dL().d_($$7.dl()), bms.j, null, null);
                     $$2.a_($$7);
                     this.f(bnu.q).d(new bns("Zombie reinforcement caller charge", -0.05F, bns.a.a));
                     $$7.f(bnu.q).d(new bns("Zombie reinforcement callee charge", -0.05F, bns.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean B(blw $$0) {
      boolean $$1 = super.B($$0);
      if ($$1) {
         float $$2 = this.dL().d_(this.dl()).b();
         if (this.eT().b() && this.bN() && this.ag.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected ars y() {
      return art.Cr;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.CB;
   }

   @Override
   protected ars n_() {
      return art.Cw;
   }

   protected ars gf() {
      return art.CH;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(this.gf(), 0.15F, 1.0F);
   }

   @Override
   public bmt eS() {
      return bmt.b;
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dL().ak() == bjz.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bmd.a, new cng(cnj.oZ));
         } else {
            this.a(bmd.a, new cng(cnj.pa));
         }
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gn());
      $$0.a("InWaterTime", this.aZ() ? this.ce : -1);
      $$0.a("DrownedConversionTime", this.gm() ? this.cf : -1);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.ce = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(ane $$0, bmo $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bjz.c || $$0.ak() == bjz.d) && $$1 instanceof cfd $$3) {
         if ($$0.ak() != bjz.d && this.ag.h()) {
            return $$2;
         }

         cdq $$4 = $$3.a(bmc.bu, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dl()), bms.i, new cdp.b(false, true), null);
            $$4.a($$3.gq());
            $$4.a($$3.gA().a(tc.a));
            $$4.c($$3.gh().a());
            $$4.b($$3.w());
            if (!this.aU()) {
               $$0.a(null, 1026, this.dl(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? bZ : super.e($$0);
   }

   @Override
   public boolean j(cng $$0) {
      return $$0.a(cnj.qQ) && this.o_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(cng $$0) {
      return $$0.a(cnj.rf) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      auw $$5 = $$0.F_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new cdp.b(a($$5), true);
      }

      if ($$3 instanceof cdp.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<byh> $$8 = $$0.a(byh.class, this.cH().c(5.0, 3.0, 5.0), bmb.c);
                  if (!$$8.isEmpty()) {
                     byh $$9 = $$8.get(0);
                     $$9.w(true);
                     this.m($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  byh $$10 = bmc.s.a(this.dL());
                  if ($$10 != null) {
                     $$10.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
                     $$10.a($$0, $$1, bms.g, null, null);
                     $$10.w(true);
                     this.m($$10);
                     $$0.b($$10);
                  }
               }
            }
         }

         this.x(this.A() && $$5.i() < $$6 * 0.1F);
         this.a($$5, $$1);
         this.b($$5, $$1);
      }

      if (this.c(bmd.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bmd.f, new cng($$5.i() < 0.1F ? cxa.ef : cxa.ee));
            this.bS[bmd.f.b()] = 0.0F;
         }
      }

      this.D($$6);
      return $$3;
   }

   public static boolean a(auw $$0) {
      return $$0.i() < 0.05F;
   }

   protected void D(float $$0) {
      this.go();
      this.f(bnu.k).d(new bns("Random spawn bonus", this.ag.j() * 0.05F, bns.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bnu.i).d(new bns("Random zombie-spawn bonus", $$1, bns.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.f(bnu.q).d(new bns("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bns.a.a));
         this.f(bnu.n).d(new bns("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bns.a.c));
         this.x(this.A());
      }
   }

   protected void go() {
      this.f(bnu.q).a(this.ag.j() * 0.1F);
   }

   @Override
   protected void a(bkv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cci $$4 && $$4.gg()) {
         cng $$5 = this.gg();
         if (!$$5.b()) {
            $$4.gh();
            this.b($$5);
         }
      }
   }

   protected cng gg() {
      return new cng(cnj.uk);
   }

   class a extends bum {
      a(bmx $$0, double $$1, int $$2) {
         super(cxa.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cty $$0, hx $$1) {
         $$0.a(null, $$1, art.Cx, aru.f, 0.5F, 0.9F + cdp.this.ag.i() * 0.2F);
      }

      @Override
      public void a(ctx $$0, hx $$1) {
         $$0.a(null, $$1, art.zA, aru.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bnh {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
