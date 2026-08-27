import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccb extends cbi {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bmk c = new bmk(b, "Baby speed boost", 0.5, bmk.a.b);
   private static final afo<Boolean> d = afr.a(ccb.class, afq.k);
   private static final afo<Integer> bX = afr.a(ccb.class, afq.b);
   private static final afo<Boolean> bY = afr.a(ccb.class, afq.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<biu> ca = $$0 -> $$0 == biu.d;
   private final brl cb = new brl(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public ccb(bku<? extends ccb> $$0, csa $$1) {
      super($$0, $$1);
   }

   public ccb(csa $$0) {
      this(bku.bp, $$0);
   }

   @Override
   protected void B() {
      this.bO.a(4, new ccb.a(this, 1.0, 3));
      this.bO.a(8, new bsj(this, cdu.class, 8.0F));
      this.bO.a(8, new bsw(this));
      this.u();
   }

   @Override
   protected void u() {
      this.bO.a(2, new btq(this, 1.0, false));
      this.bO.a(6, new bsn(this, 1.0, true, 4, this::gn));
      this.bO.a(7, new bto(this, 1.0));
      this.bP.a(1, new btt(this).a(ccd.class));
      this.bP.a(2, new btu<>(this, cdu.class, true));
      this.bP.a(3, new btu<>(this, cdc.class, false));
      this.bP.a(3, new btu<>(this, bxd.class, true));
      this.bP.a(5, new btu<>(this, bxs.class, 10, true, false, bxs.bU));
   }

   public static bml.a gj() {
      return cbi.gl().a(bmm.g, 35.0).a(bmm.m, 0.23F).a(bmm.c, 3.0).a(bmm.a, 2.0).a(bmm.n);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an().a(d, false);
      this.an().a(bX, 0);
      this.an().a(bY, false);
   }

   public boolean gm() {
      return this.an().b(bY);
   }

   public boolean gn() {
      return this.cc;
   }

   public void x(boolean $$0) {
      if (this.w() && bvx.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((buo)this.N()).b($$0);
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

   protected boolean w() {
      return true;
   }

   @Override
   public boolean n_() {
      return this.an().b(d);
   }

   @Override
   public int ef() {
      if (this.n_()) {
         this.bJ = (int)((double)this.bJ * 2.5);
      }

      return super.ef();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (this.dN() != null && !this.dN().B) {
         bmi $$1 = this.a(bmm.m);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(afo<?> $$0) {
      if (d.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gg() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dN().B && this.bx() && !this.fV()) {
         if (this.gm()) {
            this.ce--;
            if (this.ce < 0) {
               this.gi();
            }
         } else if (this.gg()) {
            if (this.a(arl.a)) {
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
   public void c_() {
      if (this.bx()) {
         boolean $$0 = this.ad_() && this.fZ();
         if ($$0) {
            clj $$1 = this.c(bkv.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bkv.f);
                     this.a(bkv.f, clj.b);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.g(8);
            }
         }
      }

      super.c_();
   }

   private void b(int $$0) {
      this.ce = $$0;
      this.an().b(bY, true);
   }

   protected void gi() {
      this.b(bku.y);
      if (!this.aU()) {
         this.dN().a(null, 1040, this.dn(), 0);
      }
   }

   protected void b(bku<? extends ccb> $$0) {
      ccb $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dN().d_($$1.dn()).d());
         $$1.x($$1.w() && this.gn());
      }
   }

   protected boolean ad_() {
      return true;
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dN() instanceof ame)) {
         return false;
      } else {
         ame $$2 = (ame)this.dN();
         blg $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof blg) {
            $$3 = (blg)$$0.d();
         }

         if ($$3 != null && this.dN().aj() == biu.d && (double)this.ag.i() < this.b(bmm.n) && this.dN().Y().b(crw.e)) {
            int $$4 = atm.a(this.ds());
            int $$5 = atm.a(this.du());
            int $$6 = atm.a(this.dy());
            ccb $$7 = new ccb(this.dN());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + atm.a(this.ag, 7, 40) * atm.a(this.ag, -1, 1);
               int $$10 = $$5 + atm.a(this.ag, 7, 40) * atm.a(this.ag, -1, 1);
               int $$11 = $$6 + atm.a(this.ag, 7, 40) * atm.a(this.ag, -1, 1);
               ht $$12 = new ht($$9, $$10, $$11);
               bku<?> $$13 = $$7.ai();
               bma.c $$14 = bma.a($$13);
               if (csl.a($$14, this.dN(), $$12, $$13) && bma.a($$13, $$2, blk.j, $$12, this.dN().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dN().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dN().f($$7) && this.dN().g($$7) && !this.dN().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dN().d_($$7.dn()), blk.j, null, null);
                     $$2.a_($$7);
                     this.a(bmm.n).c(new bmk("Zombie reinforcement caller charge", -0.05F, bmk.a.a));
                     $$7.a(bmm.n).c(new bmk("Zombie reinforcement callee charge", -0.05F, bmk.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bkq $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dN().d_(this.dn()).b();
         if (this.eU().b() && this.bN() && this.ag.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected aqq y() {
      return aqr.BG;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.BQ;
   }

   @Override
   protected aqq m_() {
      return aqr.BL;
   }

   protected aqq A() {
      return aqr.BW;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(this.A(), 0.15F, 1.0F);
   }

   @Override
   public bll eT() {
      return bll.b;
   }

   @Override
   protected void a(ats $$0, biv $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dN().aj() == biu.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bkv.a, new clj(clm.oX));
         } else {
            this.a(bkv.a, new clj(clm.oY));
         }
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.n_());
      $$0.a("CanBreakDoors", this.gn());
      $$0.a("InWaterTime", this.aZ() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gm() ? this.ce : -1);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(ame $$0, blg $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.aj() == biu.c || $$0.aj() == biu.d) && $$1 instanceof cdh $$3) {
         if ($$0.aj() != biu.d && this.ag.h()) {
            return $$2;
         }

         ccc $$4 = $$3.a(bku.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dn()), blk.i, new ccb.b(false, true), null);
            $$4.a($$3.gq());
            $$4.a($$3.gA().a(sn.a));
            $$4.c($$3.gh().a());
            $$4.b($$3.w());
            if (!this.aU()) {
               $$0.a(null, 1026, this.dn(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return this.n_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(clj $$0) {
      return $$0.a(clm.qO) && this.n_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(clj $$0) {
      return $$0.a(clm.rd) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ats $$5 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new ccb.b(a($$5), true);
      }

      if ($$3 instanceof ccb.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bww> $$8 = $$0.a(bww.class, this.cH().c(5.0, 3.0, 5.0), bkt.c);
                  if (!$$8.isEmpty()) {
                     bww $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bww $$10 = bku.q.a(this.dN());
                  if ($$10 != null) {
                     $$10.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
                     $$10.a($$0, $$1, blk.g, null, null);
                     $$10.w(true);
                     this.n($$10);
                     $$0.b($$10);
                  }
               }
            }
         }

         this.x(this.w() && $$5.i() < $$6 * 0.1F);
         this.a($$5, $$1);
         this.b($$5, $$1);
      }

      if (this.c(bkv.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bkv.f, new clj($$5.i() < 0.1F ? cvc.ef : cvc.ee));
            this.bR[bkv.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(ats $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.go();
      this.a(bmm.i).c(new bmk("Random spawn bonus", this.ag.j() * 0.05F, bmk.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bmm.g).c(new bmk("Random zombie-spawn bonus", $$1, bmk.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bmm.n).c(new bmk("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bmk.a.a));
         this.a(bmm.l).c(new bmk("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bmk.a.c));
         this.x(this.w());
      }
   }

   protected void go() {
      this.a(bmm.n).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(bkq $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bjo $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cau $$4 && $$4.gg()) {
         clj $$5 = this.gf();
         if (!$$5.b()) {
            $$4.gh();
            this.b($$5);
         }
      }
   }

   protected clj gf() {
      return new clj(clm.ug);
   }

   class a extends btd {
      a(blp $$0, double $$1, int $$2) {
         super(cvc.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(csb $$0, ht $$1) {
         $$0.a(null, $$1, aqr.BM, aqs.f, 0.5F, 0.9F + ccb.this.ag.i() * 0.2F);
      }

      @Override
      public void a(csa $$0, ht $$1) {
         $$0.a(null, $$1, aqr.yQ, aqs.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements blz {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
