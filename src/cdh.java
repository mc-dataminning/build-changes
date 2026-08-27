import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdh extends cco {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bno c = new bno(b, "Baby speed boost", 0.5, bno.a.b);
   private static final agm<Boolean> d = agp.a(cdh.class, ago.k);
   private static final agm<Integer> bX = agp.a(cdh.class, ago.b);
   private static final agm<Boolean> bY = agp.a(cdh.class, ago.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bjx> ca = $$0 -> $$0 == bjx.d;
   private final bsq cb = new bsq(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public cdh(bly<? extends cdh> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cdh(cto $$0) {
      this(bly.br, $$0);
   }

   @Override
   protected void B() {
      this.bO.a(4, new cdh.a(this, 1.0, 3));
      this.bO.a(8, new bto(this, cfh.class, 8.0F));
      this.bO.a(8, new bub(this));
      this.u();
   }

   @Override
   protected void u() {
      this.bO.a(2, new buv(this, 1.0, false));
      this.bO.a(6, new bts(this, 1.0, true, 4, this::gm));
      this.bO.a(7, new but(this, 1.0));
      this.bP.a(1, new buy(this).a(cdj.class));
      this.bP.a(2, new buz<>(this, cfh.class, true));
      this.bP.a(3, new buz<>(this, cep.class, false));
      this.bP.a(3, new buz<>(this, byj.class, true));
      this.bP.a(5, new buz<>(this, byy.class, 10, true, false, byy.bU));
   }

   public static bnp.a gi() {
      return cco.gk().a(bnq.g, 35.0).a(bnq.m, 0.23F).a(bnq.c, 3.0).a(bnq.a, 2.0).a(bnq.n);
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
      if (this.w() && bxd.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bvt)this.N()).b($$0);
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
         bnm $$1 = this.a(bnq.m);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(agm<?> $$0) {
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
            if (this.a(asl.a)) {
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
            cmx $$1 = this.c(blz.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(blz.f);
                     this.a(blz.f, cmx.f);
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
      this.b(bly.z);
      if (!this.aU()) {
         this.dM().a(null, 1040, this.dm(), 0);
      }
   }

   protected void b(bly<? extends cdh> $$0) {
      cdh $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dM().d_($$1.dm()).d());
         $$1.x($$1.w() && this.gm());
      }
   }

   protected boolean ae_() {
      return true;
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dM() instanceof and)) {
         return false;
      } else {
         and $$2 = (and)this.dM();
         bmk $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof bmk) {
            $$3 = (bmk)$$0.d();
         }

         if ($$3 != null && this.dM().ak() == bjx.d && (double)this.ag.i() < this.b(bnq.n) && this.dM().Z().b(ctk.e)) {
            int $$4 = aun.a(this.dr());
            int $$5 = aun.a(this.dt());
            int $$6 = aun.a(this.dx());
            cdh $$7 = new cdh(this.dM());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + aun.a(this.ag, 7, 40) * aun.a(this.ag, -1, 1);
               int $$10 = $$5 + aun.a(this.ag, 7, 40) * aun.a(this.ag, -1, 1);
               int $$11 = $$6 + aun.a(this.ag, 7, 40) * aun.a(this.ag, -1, 1);
               hx $$12 = new hx($$9, $$10, $$11);
               bly<?> $$13 = $$7.ai();
               bne.c $$14 = bne.a($$13);
               if (ctz.a($$14, this.dM(), $$12, $$13) && bne.a($$13, $$2, bmo.j, $$12, this.dM().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dM().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dM().f($$7) && this.dM().g($$7) && !this.dM().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dM().d_($$7.dm()), bmo.j, null, null);
                     $$2.a_($$7);
                     this.a(bnq.n).c(new bno("Zombie reinforcement caller charge", -0.05F, bno.a.a));
                     $$7.a(bnq.n).c(new bno("Zombie reinforcement callee charge", -0.05F, bno.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(blu $$0) {
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
   protected arq y() {
      return arr.Cc;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.Cm;
   }

   @Override
   protected arq n_() {
      return arr.Ch;
   }

   protected arq A() {
      return arr.Cs;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(this.A(), 0.15F, 1.0F);
   }

   @Override
   public bmp eS() {
      return bmp.b;
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dM().ak() == bjx.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(blz.a, new cmx(cna.oX));
         } else {
            this.a(blz.a, new cmx(cna.oY));
         }
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gm());
      $$0.a("InWaterTime", this.aZ() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gl() ? this.ce : -1);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(and $$0, bmk $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bjx.c || $$0.ak() == bjx.d) && $$1 instanceof ceu $$3) {
         if ($$0.ak() != bjx.d && this.ag.h()) {
            return $$2;
         }

         cdi $$4 = $$3.a(bly.bt, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dm()), bmo.i, new cdh.b(false, true), null);
            $$4.a($$3.gp());
            $$4.a($$3.gz().a(tb.a));
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
   protected float b(bmw $$0, blv $$1) {
      return this.o_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(cmx $$0) {
      return $$0.a(cna.qO) && this.o_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(cmx $$0) {
      return $$0.a(cna.rd) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      auu $$5 = $$0.F_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new cdh.b(a($$5), true);
      }

      if ($$3 instanceof cdh.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<byc> $$8 = $$0.a(byc.class, this.cH().c(5.0, 3.0, 5.0), blx.c);
                  if (!$$8.isEmpty()) {
                     byc $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  byc $$10 = bly.r.a(this.dM());
                  if ($$10 != null) {
                     $$10.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
                     $$10.a($$0, $$1, bmo.g, null, null);
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

      if (this.c(blz.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(blz.f, new cmx($$5.i() < 0.1F ? cwr.ef : cwr.ee));
            this.bR[blz.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(auu $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gn();
      this.a(bnq.i).c(new bno("Random spawn bonus", this.ag.j() * 0.05F, bno.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bnq.g).c(new bno("Random zombie-spawn bonus", $$1, bno.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bnq.n).c(new bno("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bno.a.a));
         this.a(bnq.l).c(new bno("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bno.a.c));
         this.x(this.w());
      }
   }

   protected void gn() {
      this.a(bnq.n).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(blu $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bks $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cca $$4 && $$4.gf()) {
         cmx $$5 = this.ge();
         if (!$$5.b()) {
            $$4.gg();
            this.b($$5);
         }
      }
   }

   protected cmx ge() {
      return new cmx(cna.uh);
   }

   class a extends bui {
      a(bmt $$0, double $$1, int $$2) {
         super(cwr.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(ctp $$0, hx $$1) {
         $$0.a(null, $$1, arr.Ci, ars.f, 0.5F, 0.9F + cdh.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cto $$0, hx $$1) {
         $$0.a(null, $$1, arr.zl, ars.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bnd {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
