import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clb extends bul {
   private static final Logger f = LogUtils.getLogger();
   private dwx g = djo.L.m();
   public int a;
   public boolean b = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public tq c;
   public boolean d;
   protected static final ajy<ji> e = akc.a(clb.class, aka.o);

   public clb(bus<? extends clb> $$0, dgi $$1) {
      super($$0, $$1);
   }

   private clb(dgi $$0, double $$1, double $$2, double $$3, dwx $$4) {
      this(bus.X, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.i(fba.c);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dv());
   }

   public static clb a(dgi $$0, ji $$1, dwx $$2) {
      clb $$3 = new clb($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dxn.J) ? $$2.b(dxn.J, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public final boolean a(ard $$0, btb $$1, float $$2) {
      if (!this.d($$1)) {
         this.bD();
      }

      return false;
   }

   public void a(ji $$0) {
      this.al.a(e, $$0);
   }

   public ji l() {
      return this.al.a(e);
   }

   @Override
   protected bul.c bg() {
      return bul.c.a;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(e, ji.c);
   }

   @Override
   public boolean bH() {
      return !this.dQ();
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
         djm $$0 = this.g.b();
         this.a++;
         this.bf();
         this.a(bvl.a, this.dy());
         this.aK();
         this.bW();
         if (this.dV() instanceof ard $$1 && (this.bL() || this.d)) {
            ji $$2 = this.dv();
            boolean $$3 = this.g.b() instanceof dky;
            boolean $$4 = $$3 && this.dV().b_($$2).a(awv.a);
            double $$5 = this.dy().h();
            if ($$3 && $$5 > 1.0) {
               faw $$6 = this.dV().a(new dfq(new fba(this.K, this.L, this.M), this.dt(), dfq.a.a, dfq.b.b, this));
               if ($$6.d() != fay.a.a && this.dV().b_($$6.b()).a(awv.a)) {
                  $$2 = $$6.b();
                  $$4 = true;
               }
            }

            if (!this.aJ() && !$$4) {
               if (this.a > 100 && ($$2.v() <= this.dV().L_() || $$2.v() > this.dV().an()) || this.a > 600) {
                  if (this.b && $$1.O().b(dge.i)) {
                     this.a($$1, $$0);
                  }

                  this.at();
               }
            } else {
               dwx $$7 = this.dV().a_($$2);
               this.i(this.dy().d(0.7, -0.5, 0.7));
               if (!$$7.a(djo.bX)) {
                  if (!this.h) {
                     boolean $$8 = $$7.a(new dah(this.dV(), $$2, jn.a, cwp.j, jn.b));
                     boolean $$9 = dmj.n(this.dV().a_($$2.e())) && (!$$3 || !$$4);
                     boolean $$10 = this.g.a((dgl)this.dV(), $$2) && !$$9;
                     if ($$8 && $$10) {
                        if (this.g.b(dxn.J) && this.dV().b_($$2).a() == eta.c) {
                           this.g = this.g.b(dxn.J, Boolean.valueOf(true));
                        }

                        if (this.dV().a($$2, this.g, 3)) {
                           ((ard)this.dV()).m().a.a(this, new abu($$2, this.dV().a_($$2)));
                           this.at();
                           if ($$0 instanceof dmi) {
                              ((dmi)$$0).a(this.dV(), $$2, this.g, $$7, this);
                           }

                           if (this.c != null && this.g.x()) {
                              dtz $$11 = this.dV().c_($$2);
                              if ($$11 != null) {
                                 tq $$12 = $$11.d(this.dV().K_());

                                 for (String $$13 : this.c.e()) {
                                    $$12.a($$13, this.c.c($$13).d());
                                 }

                                 try {
                                    $$11.c($$12, this.dV().K_());
                                 } catch (Exception var16) {
                                    f.error("Failed to load block entity from falling block", var16);
                                 }

                                 $$11.e();
                              }
                           }
                        } else if (this.b && $$1.O().b(dge.i)) {
                           this.at();
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     } else {
                        this.at();
                        if (this.b && $$1.O().b(dge.i)) {
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

         this.i(this.dy().c(0.98));
      }
   }

   public void a(djm $$0, ji $$1) {
      if ($$0 instanceof dmi) {
         ((dmi)$$0).a(this.dV(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, btb $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = ayz.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bul> $$4 = buq.e.and(buq.b);
            btb $$6 = this.g.b() instanceof dmi $$5 ? $$5.a(this) : this.dW().a(this);
            float $$7 = (float)Math.min(ayz.d((float)$$3 * this.k), this.j);
            this.dV().a(this, this.cR(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(awp.O);
            if ($$8 && $$7 > 0.0F && this.ae.i() < 0.05F + (float)$$3 * 0.05F) {
               dwx $$9 = dim.e(this.g);
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
      this.g = uf.a(this.dV().a(mc.f), $$0.p("BlockState"));
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
         this.g = djo.L.m();
      }
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   @Override
   public void m() {
      this.h = true;
   }

   @Override
   public boolean cF() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dwx p() {
      return this.g;
   }

   @Override
   protected wp cz() {
      return wp.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, $$0, djm.j(this.p()));
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      this.g = djm.a($$0.p());
      this.I = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dv());
   }

   @Nullable
   @Override
   public bul b(etz $$0) {
      aku<dgi> $$1 = $$0.b().ai();
      aku<dgi> $$2 = this.dV().ai();
      boolean $$3 = ($$2 == dgi.k || $$1 == dgi.k) && $$2 != $$1;
      bul $$4 = super.b($$0);
      this.d = $$4 != null && $$3;
      return $$4;
   }
}
