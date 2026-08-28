import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clv extends bva {
   private static final Logger f = LogUtils.getLogger();
   private dxq g = dkg.L.m();
   public int a;
   public boolean b = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public tq c;
   public boolean d;
   protected static final ajx<ji> e = akb.a(clv.class, ajz.o);

   public clv(bvi<? extends clv> $$0, dgz $$1) {
      super($$0, $$1);
   }

   private clv(dgz $$0, double $$1, double $$2, double $$3, dxq $$4) {
      this(bvi.X, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.i(fbx.c);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.du());
   }

   public static clv a(dgz $$0, ji $$1, dxq $$2) {
      clv $$3 = new clv($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dyg.I) ? $$2.b(dyg.I, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Override
   public final boolean a(ard $$0, btp $$1, float $$2) {
      if (!this.d($$1)) {
         this.bB();
      }

      return false;
   }

   public void a(ji $$0) {
      this.al.a(e, $$0);
   }

   public ji f() {
      return this.al.a(e);
   }

   @Override
   protected bva.c bg() {
      return bva.c.a;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(e, ji.c);
   }

   @Override
   public boolean bF() {
      return !this.dP();
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      if (this.g.l()) {
         this.at();
      } else {
         dke $$0 = this.g.b();
         this.a++;
         this.bf();
         this.a(bwc.a, this.dx());
         this.aK();
         this.bV();
         if (this.dU() instanceof ard $$1 && (this.bJ() || this.d)) {
            ji $$2 = this.du();
            boolean $$3 = this.g.b() instanceof dlq;
            boolean $$4 = $$3 && this.dU().b_($$2).a(awv.a);
            double $$5 = this.dx().h();
            if ($$3 && $$5 > 1.0) {
               fbt $$6 = this.dU().a(new dgi(new fbx(this.K, this.L, this.M), this.ds(), dgi.a.a, dgi.b.b, this));
               if ($$6.d() != fbv.a.a && this.dU().b_($$6.b()).a(awv.a)) {
                  $$2 = $$6.b();
                  $$4 = true;
               }
            }

            if (!this.aJ() && !$$4) {
               if (this.a > 100 && ($$2.v() <= this.dU().G_() || $$2.v() > this.dU().ao()) || this.a > 600) {
                  if (this.b && $$1.O().b(dgv.i)) {
                     this.a($$1, $$0);
                  }

                  this.at();
               }
            } else {
               dxq $$7 = this.dU().a_($$2);
               this.i(this.dx().d(0.7, -0.5, 0.7));
               if (!$$7.a(dkg.bX)) {
                  if (!this.h) {
                     boolean $$8 = $$7.a(new day(this.dU(), $$2, jn.a, cxh.k, jn.b));
                     boolean $$9 = dnb.n(this.dU().a_($$2.e())) && (!$$3 || !$$4);
                     boolean $$10 = this.g.a((dhc)this.dU(), $$2) && !$$9;
                     if ($$8 && $$10) {
                        if (this.g.b(dyg.I) && this.dU().b_($$2).a() == etx.c) {
                           this.g = this.g.b(dyg.I, Boolean.valueOf(true));
                        }

                        if (this.dU().a($$2, this.g, 3)) {
                           ((ard)this.dU()).m().a.a(this, new abt($$2, this.dU().a_($$2)));
                           this.at();
                           if ($$0 instanceof dna) {
                              ((dna)$$0).a(this.dU(), $$2, this.g, $$7, this);
                           }

                           if (this.c != null && this.g.x()) {
                              dus $$11 = this.dU().c_($$2);
                              if ($$11 != null) {
                                 tq $$12 = $$11.d(this.dU().F_());

                                 for (String $$13 : this.c.e()) {
                                    $$12.a($$13, this.c.c($$13).d());
                                 }

                                 try {
                                    $$11.c($$12, this.dU().F_());
                                 } catch (Exception var16) {
                                    f.error("Failed to load block entity from falling block", var16);
                                 }

                                 $$11.e();
                              }
                           }
                        } else if (this.b && $$1.O().b(dgv.i)) {
                           this.at();
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     } else {
                        this.at();
                        if (this.b && $$1.O().b(dgv.i)) {
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     }
                  } else {
                     this.at();
                     this.a($$0, $$2);
                  }
               }
            }
         }

         this.i(this.dx().c(0.98));
      }
   }

   public void a(dke $$0, ji $$1) {
      if ($$0 instanceof dna) {
         ((dna)$$0).a(this.dU(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, btp $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = ayz.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bva> $$4 = bvg.e.and(bvg.b);
            btp $$6 = this.g.b() instanceof dna $$5 ? $$5.a(this) : this.dV().a(this);
            float $$7 = (float)Math.min(ayz.d((float)$$3 * this.k), this.j);
            this.dU().a(this, this.cQ(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(awp.O);
            if ($$8 && $$7 > 0.0F && this.ae.i() < 0.05F + (float)$$3 * 0.05F) {
               dxq $$9 = dje.e(this.g);
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
   protected void b(tq $$0) {
      $$0.a("BlockState", uf.a(this.g));
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
   protected void a(tq $$0) {
      this.g = uf.a(this.dU().a(mc.f), $$0.p("BlockState"));
      this.a = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(awp.O)) {
         this.i = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.b = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.c = $$0.p("TileEntityData").i();
      }

      this.h = $$0.q("CancelDrop");
      if (this.g.l()) {
         this.g = dkg.L.m();
      }
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
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dxq j() {
      return this.g;
   }

   @Override
   protected wp cy() {
      return wp.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, $$0, dke.j(this.j()));
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      this.g = dke.a($$0.p());
      this.I = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.du());
   }

   @Nullable
   @Override
   public bva b(euw $$0) {
      akt<dgz> $$1 = $$0.b().aj();
      akt<dgz> $$2 = this.dU().aj();
      boolean $$3 = ($$2 == dgz.k || $$1 == dgz.k) && $$2 != $$1;
      bva $$4 = super.b($$0);
      this.d = $$4 != null && $$3;
      return $$4;
   }
}
