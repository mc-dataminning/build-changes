import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwv extends bwc {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bhe c = new bhe(b, "Baby speed boost", 0.5, bhe.a.b);
   private static final aby<Boolean> d = acb.a(bwv.class, aca.k);
   private static final aby<Integer> bX = acb.a(bwv.class, aca.b);
   private static final aby<Boolean> bY = acb.a(bwv.class, aca.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bdu> ca = $$0 -> $$0 == bdu.d;
   private final bmf cb = new bmf(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public bwv(bfn<? extends bwv> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bwv(cmm $$0) {
      this(bfn.bp, $$0);
   }

   @Override
   protected void x() {
      this.bO.a(4, new bwv.a(this, 1.0, 3));
      this.bO.a(8, new bnd(this, byo.class, 8.0F));
      this.bO.a(8, new bnq(this));
      this.q();
   }

   @Override
   protected void q() {
      this.bO.a(2, new bok(this, 1.0, false));
      this.bO.a(6, new bnh(this, 1.0, true, 4, this::gg));
      this.bO.a(7, new boi(this, 1.0));
      this.bP.a(1, new bon(this).a(bwx.class));
      this.bP.a(2, new boo<>(this, byo.class, true));
      this.bP.a(3, new boo<>(this, bxw.class, false));
      this.bP.a(3, new boo<>(this, brx.class, true));
      this.bP.a(5, new boo<>(this, bsm.class, 10, true, false, bsm.bU));
   }

   public static bhf.a gc() {
      return bwc.ge().a(bhg.b, 35.0).a(bhg.d, 0.23F).a(bhg.f, 3.0).a(bhg.i, 2.0).a(bhg.l);
   }

   @Override
   protected void a_() {
      super.a_();
      this.aj().a(d, false);
      this.aj().a(bX, 0);
      this.aj().a(bY, false);
   }

   public boolean gf() {
      return this.aj().b(bY);
   }

   public boolean gg() {
      return this.cc;
   }

   public void x(boolean $$0) {
      if (this.r() && bqr.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bpi)this.J()).b($$0);
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

   protected boolean r() {
      return true;
   }

   @Override
   public boolean h_() {
      return this.aj().b(d);
   }

   @Override
   public int ea() {
      if (this.h_()) {
         this.bJ = (int)((double)this.bJ * 2.5);
      }

      return super.ea();
   }

   @Override
   public void a(boolean $$0) {
      this.aj().b(d, $$0);
      if (this.dI() != null && !this.dI().B) {
         bhc $$1 = this.a(bhg.d);
         $$1.d(c);
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(aby<?> $$0) {
      if (d.equals($$0)) {
         this.d_();
      }

      super.a($$0);
   }

   protected boolean fZ() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dI().B && this.bs() && !this.fQ()) {
         if (this.gf()) {
            this.ce--;
            if (this.ce < 0) {
               this.gb();
            }
         } else if (this.fZ()) {
            if (this.a(anb.a)) {
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
      if (this.bs()) {
         boolean $$0 = this.X_() && this.fT();
         if ($$0) {
            cfz $$1 = this.c(bfo.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.af.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bfo.f);
                     this.a(bfo.f, cfz.b);
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
      this.aj().b(bY, true);
   }

   protected void gb() {
      this.b(bfn.y);
      if (!this.aQ()) {
         this.dI().a(null, 1040, this.di(), 0);
      }
   }

   protected void b(bfn<? extends bwv> $$0) {
      bwv $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.D($$1.dI().d_($$1.di()).d());
         $$1.x($$1.r() && this.gg());
      }
   }

   protected boolean X_() {
      return true;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dI() instanceof aif)) {
         return false;
      } else {
         aif $$2 = (aif)this.dI();
         bfz $$3 = this.j();
         if ($$3 == null && $$0.d() instanceof bfz) {
            $$3 = (bfz)$$0.d();
         }

         if ($$3 != null && this.dI().ai() == bdu.d && (double)this.af.i() < this.b(bhg.l) && this.dI().X().b(cmi.e)) {
            int $$4 = apa.a(this.dn());
            int $$5 = apa.a(this.dp());
            int $$6 = apa.a(this.dt());
            bwv $$7 = new bwv(this.dI());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + apa.a(this.af, 7, 40) * apa.a(this.af, -1, 1);
               int $$10 = $$5 + apa.a(this.af, 7, 40) * apa.a(this.af, -1, 1);
               int $$11 = $$6 + apa.a(this.af, 7, 40) * apa.a(this.af, -1, 1);
               gu $$12 = new gu($$9, $$10, $$11);
               bfn<?> $$13 = $$7.ae();
               bgu.c $$14 = bgu.a($$13);
               if (cmx.a($$14, this.dI(), $$12, $$13) && bgu.a($$13, $$2, bgd.j, $$12, this.dI().z)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dI().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dI().f($$7) && this.dI().g($$7) && !this.dI().d($$7.cE())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dI().d_($$7.di()), bgd.j, null, null);
                     $$2.a_($$7);
                     this.a(bhg.l).c(new bhe("Zombie reinforcement caller charge", -0.05F, bhe.a.a));
                     $$7.a(bhg.l).c(new bhe("Zombie reinforcement callee charge", -0.05F, bhe.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean z(bfj $$0) {
      boolean $$1 = super.z($$0);
      if ($$1) {
         float $$2 = this.dI().d_(this.di()).b();
         if (this.eO().b() && this.bL() && this.af.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected amg s() {
      return amh.AP;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.AZ;
   }

   @Override
   protected amg g_() {
      return amh.AU;
   }

   protected amg w() {
      return amh.Bf;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(this.w(), 0.15F, 1.0F);
   }

   @Override
   public bge eN() {
      return bge.b;
   }

   @Override
   protected void a(apf $$0, bdv $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dI().ai() == bdu.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bfo.a, new cfz(cgc.om));
         } else {
            this.a(bfo.a, new cfz(cgc.on));
         }
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.h_());
      $$0.a("CanBreakDoors", this.gg());
      $$0.a("InWaterTime", this.aV() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gf() ? this.ce : -1);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(aif $$0, bfz $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ai() == bdu.c || $$0.ai() == bdu.d) && $$1 instanceof byb $$3) {
         if ($$0.ai() != bdu.d && this.af.h()) {
            return $$2;
         }

         bww $$4 = $$3.a(bfn.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.di()), bgd.i, new bwv.b(false, true), null);
            $$4.a($$3.gj());
            $$4.a($$3.gt().a(rc.a));
            $$4.c($$3.ga().a());
            $$4.b($$3.r());
            if (!this.aQ()) {
               $$0.a(null, 1026, this.di(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return this.h_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(cfz $$0) {
      return $$0.a(cgc.qd) && this.h_() && this.bM() ? false : super.j($$0);
   }

   @Override
   public boolean k(cfz $$0) {
      return $$0.a(cgc.qs) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      apf $$5 = $$0.y_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new bwv.b(a($$5), true);
      }

      if ($$3 instanceof bwv.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<brq> $$8 = $$0.a(brq.class, this.cE().c(5.0, 3.0, 5.0), bfm.c);
                  if (!$$8.isEmpty()) {
                     brq $$9 = $$8.get(0);
                     $$9.w(true);
                     this.k($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  brq $$10 = bfn.q.a(this.dI());
                  if ($$10 != null) {
                     $$10.b(this.dn(), this.dp(), this.dt(), this.dy(), 0.0F);
                     $$10.a($$0, $$1, bgd.g, null, null);
                     $$10.w(true);
                     this.k($$10);
                     $$0.b($$10);
                  }
               }
            }
         }

         this.x(this.r() && $$5.i() < $$6 * 0.1F);
         this.a($$5, $$1);
         this.b($$5, $$1);
      }

      if (this.c(bfo.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bfo.f, new cfz($$5.i() < 0.1F ? cpo.eg : cpo.ef));
            this.bR[bfo.f.b()] = 0.0F;
         }
      }

      this.D($$6);
      return $$3;
   }

   public static boolean a(apf $$0) {
      return $$0.i() < 0.05F;
   }

   protected void D(float $$0) {
      this.gh();
      this.a(bhg.c).c(new bhe("Random spawn bonus", this.af.j() * 0.05F, bhe.a.a));
      double $$1 = this.af.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bhg.b).c(new bhe("Random zombie-spawn bonus", $$1, bhe.a.c));
      }

      if (this.af.i() < $$0 * 0.05F) {
         this.a(bhg.l).c(new bhe("Leader zombie bonus", this.af.j() * 0.25 + 0.5, bhe.a.a));
         this.a(bhg.a).c(new bhe("Leader zombie bonus", this.af.j() * 3.0 + 1.0, bhe.a.c));
         this.x(this.r());
      }
   }

   protected void gh() {
      this.a(bhg.l).a(this.af.j() * 0.1F);
   }

   @Override
   public double bw() {
      return this.h_() ? 0.0 : -0.45;
   }

   @Override
   protected void a(ben $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bvo $$4 && $$4.fZ()) {
         cfz $$5 = this.fY();
         if (!$$5.b()) {
            $$4.ga();
            this.b($$5);
         }
      }
   }

   protected cfz fY() {
      return new cfz(cgc.tu);
   }

   class a extends bnx {
      a(bgi $$0, double $$1, int $$2) {
         super(cpo.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(cmn $$0, gu $$1) {
         $$0.a(null, $$1, amh.AV, ami.f, 0.5F, 0.9F + bwv.this.af.i() * 0.2F);
      }

      @Override
      public void a(cmm $$0, gu $$1) {
         $$0.a(null, $$1, amh.yf, ami.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bgt {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
