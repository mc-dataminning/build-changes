import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdc extends ccj {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bnj c = new bnj(b, "Baby speed boost", 0.5, bnj.a.b);
   private static final agj<Boolean> d = agm.a(cdc.class, agl.k);
   private static final agj<Integer> bX = agm.a(cdc.class, agl.b);
   private static final agj<Boolean> bY = agm.a(cdc.class, agl.k);
   public static final float e = 0.05F;
   public static final int bT = 50;
   public static final int bU = 40;
   public static final int bV = 7;
   protected static final float bW = 0.81F;
   private static final float bZ = 0.1F;
   private static final Predicate<bjs> ca = $$0 -> $$0 == bjs.d;
   private final bsl cb = new bsl(this, ca);
   private boolean cc;
   private int cd;
   private int ce;

   public cdc(blt<? extends cdc> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cdc(cti $$0) {
      this(blt.br, $$0);
   }

   @Override
   protected void B() {
      this.bO.a(4, new cdc.a(this, 1.0, 3));
      this.bO.a(8, new btj(this, cfb.class, 8.0F));
      this.bO.a(8, new btw(this));
      this.u();
   }

   @Override
   protected void u() {
      this.bO.a(2, new buq(this, 1.0, false));
      this.bO.a(6, new btn(this, 1.0, true, 4, this::gm));
      this.bO.a(7, new buo(this, 1.0));
      this.bP.a(1, new but(this).a(cde.class));
      this.bP.a(2, new buu<>(this, cfb.class, true));
      this.bP.a(3, new buu<>(this, cej.class, false));
      this.bP.a(3, new buu<>(this, bye.class, true));
      this.bP.a(5, new buu<>(this, byt.class, 10, true, false, byt.bU));
   }

   public static bnk.a gi() {
      return ccj.gk().a(bnl.g, 35.0).a(bnl.m, 0.23F).a(bnl.c, 3.0).a(bnl.a, 2.0).a(bnl.n);
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
      if (this.w() && bwy.a(this)) {
         if (this.cc != $$0) {
            this.cc = $$0;
            ((bvo)this.N()).b($$0);
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
         bnh $$1 = this.a(bnl.m);
         $$1.b(c.a());
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(agj<?> $$0) {
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
            if (this.a(asg.a)) {
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
            cmr $$1 = this.c(blu.f);
            if (!$$1.b()) {
               if ($$1.i()) {
                  $$1.b($$1.k() + this.ag.a(2));
                  if ($$1.k() >= $$1.l()) {
                     this.d(blu.f);
                     this.a(blu.f, cmr.f);
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
      this.b(blt.z);
      if (!this.aU()) {
         this.dM().a(null, 1040, this.dm(), 0);
      }
   }

   protected void b(blt<? extends cdc> $$0) {
      cdc $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.E($$1.dM().d_($$1.dm()).d());
         $$1.x($$1.w() && this.gm());
      }
   }

   protected boolean ae_() {
      return true;
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.dM() instanceof amz)) {
         return false;
      } else {
         amz $$2 = (amz)this.dM();
         bmf $$3 = this.q();
         if ($$3 == null && $$0.d() instanceof bmf) {
            $$3 = (bmf)$$0.d();
         }

         if ($$3 != null && this.dM().ak() == bjs.d && (double)this.ag.i() < this.b(bnl.n) && this.dM().Z().b(cte.e)) {
            int $$4 = aui.a(this.dr());
            int $$5 = aui.a(this.dt());
            int $$6 = aui.a(this.dx());
            cdc $$7 = new cdc(this.dM());

            for (int $$8 = 0; $$8 < 50; $$8++) {
               int $$9 = $$4 + aui.a(this.ag, 7, 40) * aui.a(this.ag, -1, 1);
               int $$10 = $$5 + aui.a(this.ag, 7, 40) * aui.a(this.ag, -1, 1);
               int $$11 = $$6 + aui.a(this.ag, 7, 40) * aui.a(this.ag, -1, 1);
               hx $$12 = new hx($$9, $$10, $$11);
               blt<?> $$13 = $$7.ai();
               bmz.c $$14 = bmz.a($$13);
               if (ctt.a($$14, this.dM(), $$12, $$13) && bmz.a($$13, $$2, bmj.j, $$12, this.dM().z)) {
                  $$7.a_((double)$$9, (double)$$10, (double)$$11);
                  if (!this.dM().a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.dM().f($$7) && this.dM().g($$7) && !this.dM().d($$7.cH())) {
                     $$7.h($$3);
                     $$7.a($$2, this.dM().d_($$7.dm()), bmj.j, null, null);
                     $$2.a_($$7);
                     this.a(bnl.n).c(new bnj("Zombie reinforcement caller charge", -0.05F, bnj.a.a));
                     $$7.a(bnl.n).c(new bnj("Zombie reinforcement callee charge", -0.05F, bnj.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean C(blp $$0) {
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
   protected arl y() {
      return arm.Cc;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.Cm;
   }

   @Override
   protected arl n_() {
      return arm.Ch;
   }

   protected arl A() {
      return arm.Cs;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(this.A(), 0.15F, 1.0F);
   }

   @Override
   public bmk eS() {
      return bmk.b;
   }

   @Override
   protected void a(aup $$0, bjt $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dM().ak() == bjs.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(blu.a, new cmr(cmu.oX));
         } else {
            this.a(blu.a, new cmr(cmu.oY));
         }
      }
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.o_());
      $$0.a("CanBreakDoors", this.gm());
      $$0.a("InWaterTime", this.aZ() ? this.cd : -1);
      $$0.a("DrownedConversionTime", this.gl() ? this.ce : -1);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CanBreakDoors"));
      this.cd = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.b($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(amz $$0, bmf $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bjs.c || $$0.ak() == bjs.d) && $$1 instanceof ceo $$3) {
         if ($$0.ak() != bjs.d && this.ag.h()) {
            return $$2;
         }

         cdd $$4 = $$3.a(blt.bt, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.dm()), bmj.i, new cdc.b(false, true), null);
            $$4.a($$3.gp());
            $$4.a($$3.gz().a(sz.a));
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
   protected float b(bmr $$0, blq $$1) {
      return this.o_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean j(cmr $$0) {
      return $$0.a(cmu.qO) && this.o_() && this.bO() ? false : super.j($$0);
   }

   @Override
   public boolean k(cmr $$0) {
      return $$0.a(cmu.rd) ? false : super.k($$0);
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      aup $$5 = $$0.F_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.s($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new cdc.b(a($$5), true);
      }

      if ($$3 instanceof cdc.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bxx> $$8 = $$0.a(bxx.class, this.cH().c(5.0, 3.0, 5.0), bls.c);
                  if (!$$8.isEmpty()) {
                     bxx $$9 = $$8.get(0);
                     $$9.w(true);
                     this.n($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bxx $$10 = blt.r.a(this.dM());
                  if ($$10 != null) {
                     $$10.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
                     $$10.a($$0, $$1, bmj.g, null, null);
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

      if (this.c(blu.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(blu.f, new cmr($$5.i() < 0.1F ? cwl.ef : cwl.ee));
            this.bR[blu.f.b()] = 0.0F;
         }
      }

      this.E($$6);
      return $$3;
   }

   public static boolean a(aup $$0) {
      return $$0.i() < 0.05F;
   }

   protected void E(float $$0) {
      this.gn();
      this.a(bnl.i).c(new bnj("Random spawn bonus", this.ag.j() * 0.05F, bnj.a.a));
      double $$1 = this.ag.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bnl.g).c(new bnj("Random zombie-spawn bonus", $$1, bnj.a.c));
      }

      if (this.ag.i() < $$0 * 0.05F) {
         this.a(bnl.n).c(new bnj("Leader zombie bonus", this.ag.j() * 0.25 + 0.5, bnj.a.a));
         this.a(bnl.l).c(new bnj("Leader zombie bonus", this.ag.j() * 3.0 + 1.0, bnj.a.c));
         this.x(this.w());
      }
   }

   protected void gn() {
      this.a(bnl.n).a(this.ag.j() * 0.1F);
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected float l(blp $$0) {
      return -0.7F;
   }

   @Override
   protected void a(bkn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cbv $$4 && $$4.gf()) {
         cmr $$5 = this.ge();
         if (!$$5.b()) {
            $$4.gg();
            this.b($$5);
         }
      }
   }

   protected cmr ge() {
      return new cmr(cmu.uh);
   }

   class a extends bud {
      a(bmo $$0, double $$1, int $$2) {
         super(cwl.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(ctj $$0, hx $$1) {
         $$0.a(null, $$1, arm.Ci, arn.f, 0.5F, 0.9F + cdc.this.ag.i() * 0.2F);
      }

      @Override
      public void a(cti $$0, hx $$1) {
         $$0.a(null, $$1, arm.zl, arn.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bmy {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
