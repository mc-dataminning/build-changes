import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnq extends bwi {
   private static final Logger f = LogUtils.getLogger();
   private eat g = dmt.L.m();
   public int a;
   public boolean b = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public tz c;
   public boolean d;
   protected static final akj<iv> e = akn.a(cnq.class, akl.o);

   public cnq(bwr<? extends cnq> $$0, djm $$1) {
      super($$0, $$1);
   }

   private cnq(djm $$0, double $$1, double $$2, double $$3, eat $$4) {
      this(bwr.X, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.i(ffc.c);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.du());
   }

   public static cnq a(djm $$0, iv $$1, eat $$2) {
      cnq $$3 = new cnq($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(ebj.I) ? $$2.b(ebj.I, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      if (!this.d($$1)) {
         this.bA();
      }

      return false;
   }

   public void a(iv $$0) {
      this.al.a(e, $$0);
   }

   public iv f() {
      return this.al.a(e);
   }

   @Override
   protected bwi.c be() {
      return bwi.c.a;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, iv.c);
   }

   @Override
   public boolean bE() {
      return !this.dP();
   }

   @Override
   protected double bb() {
      return 0.04;
   }

   @Override
   public void h() {
      if (this.g.l()) {
         this.aq();
      } else {
         dmr $$0 = this.g.b();
         this.a++;
         this.bd();
         this.a(bxn.a, this.dx());
         this.aI();
         this.bU();
         if (this.dU() instanceof arq $$1 && (this.bI() || this.d)) {
            iv $$2 = this.du();
            boolean $$3 = this.g.b() instanceof doe;
            boolean $$4 = $$3 && this.dU().b_($$2).a(axh.a);
            double $$5 = this.dx().h();
            if ($$3 && $$5 > 1.0) {
               fey $$6 = this.dU().a(new dit(new ffc(this.K, this.L, this.M), this.ds(), dit.a.a, dit.b.b, this));
               if ($$6.d() != ffa.a.a && this.dU().b_($$6.b()).a(axh.a)) {
                  $$2 = $$6.b();
                  $$4 = true;
               }
            }

            if (!this.aH() && !$$4) {
               if (this.a > 100 && ($$2.v() <= this.dU().G_() || $$2.v() > this.dU().ao()) || this.a > 600) {
                  if (this.b && $$1.O().c(dji.j)) {
                     this.a($$1, $$0);
                  }

                  this.aq();
               }
            } else {
               eat $$7 = this.dU().a_($$2);
               this.i(this.dx().d(0.7, -0.5, 0.7));
               if (!$$7.a(dmt.ca)) {
                  if (!this.h) {
                     boolean $$8 = $$7.a(new ddh(this.dU(), $$2, jb.a, czn.k, jb.b));
                     boolean $$9 = dpp.n(this.dU().a_($$2.e())) && (!$$3 || !$$4);
                     boolean $$10 = this.g.a((djp)this.dU(), $$2) && !$$9;
                     if ($$8 && $$10) {
                        if (this.g.b(ebj.I) && this.dU().b_($$2).a() == exb.c) {
                           this.g = this.g.b(ebj.I, Boolean.valueOf(true));
                        }

                        if (this.dU().a($$2, this.g, 3)) {
                           ((arq)this.dU()).m().a.a(this, new acc($$2, this.dU().a_($$2)));
                           this.aq();
                           if ($$0 instanceof dpo) {
                              ((dpo)$$0).a(this.dU(), $$2, this.g, $$7, this);
                           }

                           if (this.c != null && this.g.x()) {
                              dxr $$11 = this.dU().c_($$2);
                              if ($$11 != null) {
                                 tz $$12 = $$11.d(this.dU().F_());

                                 for (String $$13 : this.c.e()) {
                                    $$12.a($$13, this.c.a($$13).d());
                                 }

                                 try {
                                    $$11.c($$12, this.dU().F_());
                                 } catch (Exception var16) {
                                    f.error("Failed to load block entity from falling block", var16);
                                 }

                                 $$11.e();
                              }
                           }
                        } else if (this.b && $$1.O().c(dji.j)) {
                           this.aq();
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     } else {
                        this.aq();
                        if (this.b && $$1.O().c(dji.j)) {
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     }
                  } else {
                     this.aq();
                     this.a($$0, $$2);
                  }
               }
            }
         }

         this.i(this.dx().c(0.98));
      }
   }

   public void a(dmr $$0, iv $$1) {
      if ($$0 instanceof dpo) {
         ((dpo)$$0).a(this.dU(), $$1, this);
      }
   }

   @Override
   public boolean a(double $$0, float $$1, bux $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = azm.c($$0 - 1.0);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bwi> $$4 = bwp.e.and(bwp.b);
            bux $$6 = this.g.b() instanceof dpo $$5 ? $$5.a(this) : this.dV().a(this);
            float $$7 = (float)Math.min(azm.d((float)$$3 * this.k), this.j);
            this.dU().a(this, this.cQ(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(axc.O);
            if ($$8 && $$7 > 0.0F && this.ae.i() < 0.05F + (float)$$3 * 0.05F) {
               eat $$9 = dlr.e(this.g);
               if ($$9 == null) {
                  this.h = true;
               } else {
                  this.g = $$9;
               }
            }

            return false;
         }
      }
   }

   @Override
   protected void b(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("BlockState", eat.a, $$1, this.g);
      $$0.a("Time", this.a);
      $$0.a("DropItem", this.b);
      $$0.a("HurtEntities", this.i);
      $$0.a("FallHurtAmount", this.k);
      $$0.a("FallHurtMax", this.j);
      if (this.c != null) {
         $$0.a("TileEntityData", this.c);
      }

      $$0.a("CancelDrop", this.h);
   }

   @Override
   protected void a(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      this.g = $$0.<eat>a("BlockState", eat.a, $$1).orElse(dmt.L.m());
      this.a = $$0.f("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.o("HurtEntities");
         this.k = $$0.h("FallHurtAmount");
         this.j = $$0.f("FallHurtMax");
      } else if (this.g.a(axc.O)) {
         this.i = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.b = $$0.o("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.c = $$0.n("TileEntityData").i();
      }

      this.h = $$0.o("CancelDrop");
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   public void g() {
      this.h = true;
   }

   @Override
   public boolean cE() {
      return false;
   }

   @Override
   public void a(q $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public eat j() {
      return this.g;
   }

   @Override
   protected wy cy() {
      return wy.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public zf<abu> a(aro $$0) {
      return new abv(this, $$0, dmr.j(this.j()));
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.g = dmr.a($$0.p());
      this.I = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.du());
   }

   @Nullable
   @Override
   public bwi b(eya $$0) {
      alf<djm> $$1 = $$0.b().aj();
      alf<djm> $$2 = this.dU().aj();
      boolean $$3 = ($$2 == djm.k || $$1 == djm.k) && $$2 != $$1;
      bwi $$4 = super.b($$0);
      this.d = $$4 != null && $$3;
      return $$4;
   }
}
