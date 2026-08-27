import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfg extends cen {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bpj c = new bpj(b, "Baby speed boost", 0.5, bpj.a.b);
   private static final aie<Boolean> d = aih.a(cfg.class, aig.k);
   private static final aie<Integer> bW = aih.a(cfg.class, aig.b);
   private static final aie<Boolean> bX = aih.a(cfg.class, aig.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   private static final bnr bY = bnu.bs.n().a(0.5F).b(0.93F);
   private static final float bZ = 0.1F;
   private static final Predicate<blr> ca = $$0 -> $$0 == blr.d;
   private final bul cb = new bul(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public cfg(bnu<? extends cfg> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cfg(cvn $$0) {
      this(bnu.bs, $$0);
   }

   @Override
   protected void B() {
      this.bO.a(4, new cfg.a(this, 1.0, 3));
      this.bO.a(8, new bvj(this, chh.class, 8.0F));
      this.bO.a(8, new bvw(this));
      this.w();
   }

   protected void w() {
      this.bO.a(2, new bwq(this, 1.0, false));
      this.bO.a(6, new bvn(this, 1.0, true, 4, this::go));
      this.bO.a(7, new bwo(this, 1.0));
      this.bP.a(1, new bwt(this).a(cfi.class));
      this.bP.a(2, new bwu<>(this, chh.class, true));
      this.bP.a(3, new bwu<>(this, cgp.class, false));
      this.bP.a(3, new bwu<>(this, caf.class, true));
      this.bP.a(5, new bwu<>(this, cau.class, 10, true, false, cau.bU));
   }

   public static bpk.a gk() {
      return cen.gm().a(bpl.i, 35.0).a(bpl.o, 0.23F).a(bpl.c, 3.0).a(bpl.a, 2.0).a(bpl.q);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(d, false);
      this.an().a(bW, 0);
      this.an().a(bX, false);
   }

   public boolean gn() {
      return this.an().b(bX);
   }

   public boolean go() {
      return this.cc;
   }

   public void x(boolean $$0) {
      if (this.A() && byz.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bxo)this.N()).b($$0);
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

   protected boolean A() {
      return true;
   }

   @Override
   public boolean o_() {
      return this.an().b(d);
   }

   @Override
   public int ef() {
      if (this.o_()) {
         this.bJ = (int)((double)this.bJ * 2.5);
      }

      return super.ef();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (this.dM() != null && !this.dM().B) {
         bph $$1 = this.f(bpl.o);
         $$1.b(c.a());
         if ($$0) {
            $$1.c(c);
         }
      }
   }

   @Override
   public void a(aie<?> $$0) {
      if (d.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   protected boolean gi() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && !this.fW()) {
         if (this.gn()) {
            this.ce--;
            if (this.ce < 0) {
               this.ae_();
            }
         } else if (this.gi()) {
            if (this.a(aue.a)) {
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
   public void d_() {
      if (this.bx()) {
         boolean $$0 = this.af_() && this.ga();
         if ($$0) {
            coz $$1 = this.c(bnv.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.l() + this.af.a(2));
                  if ($$1.l() >= $$1.m()) {
                     this.d(bnv.f);
                     this.a(bnv.f, coz.h);
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
      this.ce = $$0;
      this.an().b(bX, true);
   }

   protected void ae_() {
      this.b(bnu.A);
      if (!this.aU()) {
         this.dM().a(null, 1040, this.dm(), 0);
      }
   }

   protected void b(bnu<? extends cfg> $$0) {
      cfg $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dM().d_($$1.dm()).d());
         $$1.x($$1.A() && this.go());
      }
   }

   protected boolean af_() {
      return true;
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dM() instanceof aov)) {
         return false;
      } else {
         aov $$2 = (aov)this.dM();
         bog $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof bog) {
            $$3 = (bog)$$0.d();
         }

         if ($$3 != null && this.dM().ak() == blr.d && (double)this.af.i() < this.g(bpl.q) && this.dM().Z().b(cvj.e)) {
            int $$4 = awh.a(this.dr());
            int $$5 = awh.a(this.dt());
            int $$6 = awh.a(this.dx());
            cfg $$7 = new cfg(this.dM());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + awh.a(this.af, 7, 40) * awh.a(this.af, -1, 1);
               int $$10 = $$5 + awh.a(this.af, 7, 40) * awh.a(this.af, -1, 1);
               int $$11 = $$6 + awh.a(this.af, 7, 40) * awh.a(this.af, -1, 1);
               hz $$12 = new hz($$9, $$10, $$11);
               bnu<?> $$13 = $$7.ai();
               boz.c $$14 = boz.a($$13);
               if (cvy.a($$14, this.dM(), $$12, $$13) && boz.a($$13, $$2, bok.j, $$12, this.dM().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dM().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dM().f($$7) && this.dM().g($$7) && !this.dM().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dM().d_($$7.dm()), bok.j, null, null);
                     $$2.a_($$7);
                     this.f(bpl.q).d(new bpj("Zombie reinforcement caller charge", -0.05F, bpj.a.a));
                     $$7.f(bpl.q).d(new bpj("Zombie reinforcement callee charge", -0.05F, bpj.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean B(bno $$0) {
      boolean $$1 = super.B($$0);
      if ($$1) {
         float $$2 = this.dM().d_(this.dm()).b();
         if (this.eT().b() && this.bN() && this.af.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected atj y() {
      return atk.Cr;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.CB;
   }

   @Override
   protected atj n_() {
      return atk.Cw;
   }

   protected atj gg() {
      return atk.CH;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(this.gg(), 0.15F, 1.0F);
   }

   @Override
   protected void a(awo $$0, bls $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dM().ak() == blr.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bnv.a, new coz(cpc.oZ));
         } else {
            this.a(bnv.a, new coz(cpc.pa));
         }
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.go());
      $$0.a("InWaterTime", this.aZ() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gn() ? this.ce : -1);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aov $$0, bog $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == blr.c || $$0.ak() == blr.d) && $$1 instanceof cgu $$3) {
         if ($$0.ak() != blr.d && this.af.h()) {
            return $$2;
         }

         cfh $$4 = $$3.a(bnu.bu, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dm()), bok.i, new cfg.b(false, true), null);
            $$4.a($$3.gr());
            $$4.a($$3.gB().a(tk.a));
            $$4.c($$3.gi().a());
            $$4.b($$3.w());
            if (!this.aU()) {
               $$0.a(null, 1026, this.dm(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? bY : super.e($$0);
   }

   @Override
   public boolean j(coz $$0) {
      return $$0.a(cpc.qQ) && this.o_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(coz $$0) {
      return $$0.a(cpc.rf) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      awo $$5 = $$0.F_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new cfg.b(a($$5), true);
      }

      if ($$3 instanceof cfg.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bzy> $$8 = $$0.a(bzy.class, this.cH().c(5.0, 3.0, 5.0), bnt.c);
                  if (!$$8.isEmpty()) {
                     bzy $$9 = $$8.get(0);
                     $$9.w(true);
                     this.m($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bzy $$10 = bnu.s.a(this.dM());
                  if ($$10 != null) {
                     $$10.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
                     $$10.a($$0, $$1, bok.g, null, null);
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

      if (this.c(bnv.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bnv.f, new coz($$5.i() < 0.1F ? cyq.ef : cyq.ee));
            this.bR[bnv.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(awo $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gp();
      this.f(bpl.k).d(new bpj("Random spawn bonus", this.af.j() * 0.05F, bpj.a.a));
      double $$1 = this.af.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.f(bpl.i).d(new bpj("Random zombie-spawn bonus", $$1, bpj.a.c));
      }

      if (this.af.i() < $$0 * 0.05F) {
         this.f(bpl.q).d(new bpj("Leader zombie bonus", this.af.j() * 0.25 + 0.5, bpj.a.a));
         this.f(bpl.n).d(new bpj("Leader zombie bonus", this.af.j() * 3.0 + 1.0, bpj.a.c));
         this.x(this.A());
      }
   }

   protected void gp() {
      this.f(bpl.q).a(this.af.j() * 0.1F);
   }

   @Override
   protected void a(bmn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cdz $$4 && $$4.gh()) {
         coz $$5 = this.gh();
         if (!$$5.b()) {
            $$4.gi();
            this.b($$5);
         }
      }
   }

   protected coz gh() {
      return new coz(cpc.uk);
   }

   class a extends bwd {
      a(boo $$0, double $$1, int $$2) {
         super(cyq.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cvo $$0, hz $$1) {
         $$0.a(null, $$1, atk.Cx, atl.f, 0.5F, 0.9F + cfg.this.af.i() * 0.2F);
      }

      @Override
      public void a(cvn $$0, hz $$1) {
         $$0.a(null, $$1, atk.zA, atl.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements boy {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
