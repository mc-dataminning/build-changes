import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccs extends cbz {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bmz c = new bmz(b, "Baby speed boost", 0.5, bmz.a.b);
   private static final afz<Boolean> d = agc.a(ccs.class, agb.k);
   private static final afz<Integer> bX = agc.a(ccs.class, agb.b);
   private static final afz<Boolean> bY = agc.a(ccs.class, agb.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bji> ca = $$0 -> $$0 == bji.d;
   private final bsb cb = new bsb(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public ccs(blj<? extends ccs> $$0, csy $$1) {
      super($$0, $$1);
   }

   public ccs(csy $$0) {
      this(blj.br, $$0);
   }

   @Override
   protected void B() {
      this.bO.a(4, new ccs.a(this, 1.0, 3));
      this.bO.a(8, new bsz(this, cer.class, 8.0F));
      this.bO.a(8, new btm(this));
      this.u();
   }

   @Override
   protected void u() {
      this.bO.a(2, new bug(this, 1.0, false));
      this.bO.a(6, new btd(this, 1.0, true, 4, this::gm));
      this.bO.a(7, new bue(this, 1.0));
      this.bP.a(1, new buj(this).a(ccu.class));
      this.bP.a(2, new buk<>(this, cer.class, true));
      this.bP.a(3, new buk<>(this, cdz.class, false));
      this.bP.a(3, new buk<>(this, bxu.class, true));
      this.bP.a(5, new buk<>(this, byj.class, 10, true, false, byj.bU));
   }

   public static bna.a gi() {
      return cbz.gk().a(bnb.g, 35.0).a(bnb.m, 0.23F).a(bnb.c, 3.0).a(bnb.a, 2.0).a(bnb.n);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(d, false);
      this.an().a(bX, 0);
      this.an().a(bY, false);
   }

   public boolean gl() {
      return this.an().b(bY);
   }

   public boolean gm() {
      return this.cc;
   }

   public void x(boolean $$0) {
      if (this.w() && bwo.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bve)this.N()).b($$0);
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
   public int ee() {
      if (this.o_()) {
         this.bJ = (int)((double)this.bJ * 2.5);
      }

      return super.ee();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (this.dM() != null && !this.dM().B) {
         bmx $$1 = this.a(bnb.m);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(afz<?> $$0) {
      if (d.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   protected boolean gf() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && !this.fU()) {
         if (this.gl()) {
            this.ce--;
            if (this.ce < 0) {
               this.gh();
            }
         } else if (this.gf()) {
            if (this.a(arw.a)) {
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
         boolean $$0 = this.ae_() && this.fY();
         if ($$0) {
            cmh $$1 = this.c(blk.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(blk.f);
                     this.a(blk.f, cmh.f);
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

   protected void gh() {
      this.b(blj.z);
      if (!this.aU()) {
         this.dM().a(null, 1040, this.dm(), 0);
      }
   }

   protected void b(blj<? extends ccs> $$0) {
      ccs $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dM().d_($$1.dm()).d());
         $$1.x($$1.w() && this.gm());
      }
   }

   protected boolean ae_() {
      return true;
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dM() instanceof amp)) {
         return false;
      } else {
         amp $$2 = (amp)this.dM();
         blv $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof blv) {
            $$3 = (blv)$$0.d();
         }

         if ($$3 != null && this.dM().aj() == bji.d && (double)this.ag.i() < this.b(bnb.n) && this.dM().Y().b(csu.e)) {
            int $$4 = aty.a(this.dr());
            int $$5 = aty.a(this.dt());
            int $$6 = aty.a(this.dx());
            ccs $$7 = new ccs(this.dM());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + aty.a(this.ag, 7, 40) * aty.a(this.ag, -1, 1);
               int $$10 = $$5 + aty.a(this.ag, 7, 40) * aty.a(this.ag, -1, 1);
               int $$11 = $$6 + aty.a(this.ag, 7, 40) * aty.a(this.ag, -1, 1);
               hv $$12 = new hv($$9, $$10, $$11);
               blj<?> $$13 = $$7.ai();
               bmp.c $$14 = bmp.a($$13);
               if (ctj.a($$14, this.dM(), $$12, $$13) && bmp.a($$13, $$2, blz.j, $$12, this.dM().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dM().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dM().f($$7) && this.dM().g($$7) && !this.dM().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dM().d_($$7.dm()), blz.j, null, null);
                     $$2.a_($$7);
                     this.a(bnb.n).c(new bmz("Zombie reinforcement caller charge", -0.05F, bmz.a.a));
                     $$7.a(bnb.n).c(new bmz("Zombie reinforcement callee charge", -0.05F, bmz.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(blf $$0) {
      boolean $$1 = super.C($$0);
      if ($$1) {
         float $$2 = this.dM().d_(this.dm()).b();
         if (this.eT().b() && this.bN() && this.ag.i() < $$2 * 0.3F) {
            $$0.g(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected arb y() {
      return arc.Cc;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.Cm;
   }

   @Override
   protected arb n_() {
      return arc.Ch;
   }

   protected arb A() {
      return arc.Cs;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(this.A(), 0.15F, 1.0F);
   }

   @Override
   public bma eS() {
      return bma.b;
   }

   @Override
   protected void a(auf $$0, bjj $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dM().aj() == bji.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(blk.a, new cmh(cmk.oX));
         } else {
            this.a(blk.a, new cmh(cmk.oY));
         }
      }
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gm());
      $$0.a("InWaterTime", this.aZ() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gl() ? this.ce : -1);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(amp $$0, blv $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.aj() == bji.c || $$0.aj() == bji.d) && $$1 instanceof cee $$3) {
         if ($$0.aj() != bji.d && this.ag.h()) {
            return $$2;
         }

         cct $$4 = $$3.a(blj.bt, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dm()), blz.i, new ccs.b(false, true), null);
            $$4.a($$3.gp());
            $$4.a($$3.gz().a(sx.a));
            $$4.c($$3.gg().a());
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
   protected float b(bmh $$0, blg $$1) {
      return this.o_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(cmh $$0) {
      return $$0.a(cmk.qO) && this.o_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(cmh $$0) {
      return $$0.a(cmk.rd) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      auf $$5 = $$0.F_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new ccs.b(a($$5), true);
      }

      if ($$3 instanceof ccs.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bxn> $$8 = $$0.a(bxn.class, this.cH().c(5.0, 3.0, 5.0), bli.c);
                  if (!$$8.isEmpty()) {
                     bxn $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bxn $$10 = blj.r.a(this.dM());
                  if ($$10 != null) {
                     $$10.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
                     $$10.a($$0, $$1, blz.g, null, null);
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

      if (this.c(blk.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(blk.f, new cmh($$5.i() < 0.1F ? cwb.ef : cwb.ee));
            this.bR[blk.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(auf $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gn();
      this.a(bnb.i).c(new bmz("Random spawn bonus", this.ag.j() * 0.05F, bmz.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bnb.g).c(new bmz("Random zombie-spawn bonus", $$1, bmz.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bnb.n).c(new bmz("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bmz.a.a));
         this.a(bnb.l).c(new bmz("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bmz.a.c));
         this.x(this.w());
      }
   }

   protected void gn() {
      this.a(bnb.n).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(blf $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bkd $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cbl $$4 && $$4.gf()) {
         cmh $$5 = this.ge();
         if (!$$5.b()) {
            $$4.gg();
            this.b($$5);
         }
      }
   }

   protected cmh ge() {
      return new cmh(cmk.uh);
   }

   class a extends btt {
      a(bme $$0, double $$1, int $$2) {
         super(cwb.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(csz $$0, hv $$1) {
         $$0.a(null, $$1, arc.Ci, ard.f, 0.5F, 0.9F + ccs.this.ag.i() * 0.2F);
      }

      @Override
      public void a(csy $$0, hv $$1) {
         $$0.a(null, $$1, arc.zl, ard.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bmo {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
