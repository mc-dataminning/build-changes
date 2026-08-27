import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccg extends cbn {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bmp c = new bmp(b, "Baby speed boost", 0.5, bmp.a.b);
   private static final afs<Boolean> d = afv.a(ccg.class, afu.k);
   private static final afs<Integer> bX = afv.a(ccg.class, afu.b);
   private static final afs<Boolean> bY = afv.a(ccg.class, afu.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<biy> ca = $$0 -> $$0 == biy.d;
   private final brq cb = new brq(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public ccg(bkz<? extends ccg> $$0, csf $$1) {
      super($$0, $$1);
   }

   public ccg(csf $$0) {
      this(bkz.bp, $$0);
   }

   @Override
   protected void B() {
      this.bO.a(4, new ccg.a(this, 1.0, 3));
      this.bO.a(8, new bso(this, cdz.class, 8.0F));
      this.bO.a(8, new btb(this));
      this.u();
   }

   @Override
   protected void u() {
      this.bO.a(2, new btv(this, 1.0, false));
      this.bO.a(6, new bss(this, 1.0, true, 4, this::gn));
      this.bO.a(7, new btt(this, 1.0));
      this.bP.a(1, new bty(this).a(cci.class));
      this.bP.a(2, new btz<>(this, cdz.class, true));
      this.bP.a(3, new btz<>(this, cdh.class, false));
      this.bP.a(3, new btz<>(this, bxi.class, true));
      this.bP.a(5, new btz<>(this, bxx.class, 10, true, false, bxx.bU));
   }

   public static bmq.a gj() {
      return cbn.gl().a(bmr.g, 35.0).a(bmr.m, 0.23F).a(bmr.c, 3.0).a(bmr.a, 2.0).a(bmr.n);
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
      return this.cc;
   }

   public void x(boolean $$0) {
      if (this.w() && bwc.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((but)this.N()).b($$0);
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
      if (this.dN() != null && !this.dN().B) {
         bmn $$1 = this.a(bmr.m);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(afs<?> $$0) {
      if (d.equals($$0)) {
         this.k_();
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
            if (this.a(arp.a)) {
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
         boolean $$0 = this.ae_() && this.fZ();
         if ($$0) {
            clo $$1 = this.c(bla.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(bla.f);
                     this.a(bla.f, clo.b);
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
      this.an().b(bY, true);
   }

   protected void gi() {
      this.b(bkz.y);
      if (!this.aU()) {
         this.dN().a(null, 1040, this.dn(), 0);
      }
   }

   protected void b(bkz<? extends ccg> $$0) {
      ccg $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dN().d_($$1.dn()).d());
         $$1.x($$1.w() && this.gn());
      }
   }

   protected boolean ae_() {
      return true;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dN() instanceof ami)) {
         return false;
      } else {
         ami $$2 = (ami)this.dN();
         bll $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof bll) {
            $$3 = (bll)$$0.d();
         }

         if ($$3 != null && this.dN().aj() == biy.d && (double)this.ag.i() < this.b(bmr.n) && this.dN().Y().b(csb.e)) {
            int $$4 = atq.a(this.ds());
            int $$5 = atq.a(this.du());
            int $$6 = atq.a(this.dy());
            ccg $$7 = new ccg(this.dN());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + atq.a(this.ag, 7, 40) * atq.a(this.ag, -1, 1);
               int $$10 = $$5 + atq.a(this.ag, 7, 40) * atq.a(this.ag, -1, 1);
               int $$11 = $$6 + atq.a(this.ag, 7, 40) * atq.a(this.ag, -1, 1);
               hx $$12 = new hx($$9, $$10, $$11);
               bkz<?> $$13 = $$7.ai();
               bmf.c $$14 = bmf.a($$13);
               if (csq.a($$14, this.dN(), $$12, $$13) && bmf.a($$13, $$2, blp.j, $$12, this.dN().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dN().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dN().f($$7) && this.dN().g($$7) && !this.dN().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dN().d_($$7.dn()), blp.j, null, null);
                     $$2.a_($$7);
                     this.a(bmr.n).c(new bmp("Zombie reinforcement caller charge", -0.05F, bmp.a.a));
                     $$7.a(bmr.n).c(new bmp("Zombie reinforcement callee charge", -0.05F, bmp.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(bkv $$0) {
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
   protected aqu y() {
      return aqv.BG;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.BQ;
   }

   @Override
   protected aqu n_() {
      return aqv.BL;
   }

   protected aqu A() {
      return aqv.BW;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(this.A(), 0.15F, 1.0F);
   }

   @Override
   public blq eT() {
      return blq.b;
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dN().aj() == biy.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bla.a, new clo(clr.oX));
         } else {
            this.a(bla.a, new clo(clr.oY));
         }
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gn());
      $$0.a("InWaterTime", this.aZ() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gm() ? this.ce : -1);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(ami $$0, bll $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.aj() == biy.c || $$0.aj() == biy.d) && $$1 instanceof cdm $$3) {
         if ($$0.aj() != biy.d && this.ag.h()) {
            return $$2;
         }

         cch $$4 = $$3.a(bkz.br, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dn()), blp.i, new ccg.b(false, true), null);
            $$4.a($$3.gq());
            $$4.a($$3.gA().a(sr.a));
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
   protected float b(blx $$0, bkw $$1) {
      return this.o_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(clo $$0) {
      return $$0.a(clr.qO) && this.o_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(clo $$0) {
      return $$0.a(clr.rd) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      atw $$5 = $$0.F_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new ccg.b(a($$5), true);
      }

      if ($$3 instanceof ccg.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bxb> $$8 = $$0.a(bxb.class, this.cH().c(5.0, 3.0, 5.0), bky.c);
                  if (!$$8.isEmpty()) {
                     bxb $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bxb $$10 = bkz.q.a(this.dN());
                  if ($$10 != null) {
                     $$10.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
                     $$10.a($$0, $$1, blp.g, null, null);
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

      if (this.c(bla.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bla.f, new clo($$5.i() < 0.1F ? cvh.ef : cvh.ee));
            this.bR[bla.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(atw $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.go();
      this.a(bmr.i).c(new bmp("Random spawn bonus", this.ag.j() * 0.05F, bmp.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bmr.g).c(new bmp("Random zombie-spawn bonus", $$1, bmp.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bmr.n).c(new bmp("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bmp.a.a));
         this.a(bmr.l).c(new bmp("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bmp.a.c));
         this.x(this.w());
      }
   }

   protected void go() {
      this.a(bmr.n).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(bkv $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bjt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof caz $$4 && $$4.gg()) {
         clo $$5 = this.gf();
         if (!$$5.b()) {
            $$4.gh();
            this.b($$5);
         }
      }
   }

   protected clo gf() {
      return new clo(clr.ug);
   }

   class a extends bti {
      a(blu $$0, double $$1, int $$2) {
         super(cvh.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(csg $$0, hx $$1) {
         $$0.a(null, $$1, aqv.BM, aqw.f, 0.5F, 0.9F + ccg.this.ag.i() * 0.2F);
      }

      @Override
      public void a(csf $$0, hx $$1) {
         $$0.a(null, $$1, aqv.yQ, aqw.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bme {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
