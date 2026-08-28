import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cma extends bvk {
   private static final Logger f = LogUtils.getLogger();
   private dxv g = dko.L.m();
   public int a;
   public boolean b = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public ux c;
   public boolean d;
   protected static final alc<jh> e = alg.a(cma.class, ale.o);

   public cma(bvr<? extends cma> $$0, dhi $$1) {
      super($$0, $$1);
   }

   private cma(dhi $$0, double $$1, double $$2, double $$3, dxv $$4) {
      this(bvr.Y, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.h(fby.c);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dw());
   }

   public static cma a(dhi $$0, jh $$1, dxv $$2) {
      cma $$3 = new cma($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dyl.D) ? $$2.b(dyl.D, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public final boolean a(ash $$0, bua $$1, float $$2) {
      if (!this.d($$1)) {
         this.bD();
      }

      return false;
   }

   public void a(jh $$0) {
      this.al.a(e, $$0);
   }

   public jh l() {
      return this.al.a(e);
   }

   @Override
   protected bvk.c bg() {
      return bvk.c.a;
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(e, jh.c);
   }

   @Override
   public boolean bH() {
      return !this.dR();
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
         dkm $$0 = this.g.b();
         this.a++;
         this.bf();
         this.a(bwk.a, this.dz());
         this.aK();
         this.bW();
         if (this.dW() instanceof ash $$1 && (this.bL() || this.d)) {
            jh $$2 = this.dw();
            boolean $$3 = this.g.b() instanceof dlz;
            boolean $$4 = $$3 && this.dW().b_($$2).a(aya.a);
            double $$5 = this.dz().h();
            if ($$3 && $$5 > 1.0) {
               fbu $$6 = this.dW().a(new dgq(new fby(this.K, this.L, this.M), this.du(), dgq.a.a, dgq.b.b, this));
               if ($$6.d() != fbw.a.a && this.dW().b_($$6.b()).a(aya.a)) {
                  $$2 = $$6.b();
                  $$4 = true;
               }
            }

            if (!this.aJ() && !$$4) {
               if (this.a > 100 && ($$2.v() <= this.dW().L_() || $$2.v() > this.dW().am()) || this.a > 600) {
                  if (this.b && $$1.N().b(dhe.i)) {
                     this.a($$1, $$0);
                  }

                  this.at();
               }
            } else {
               dxv $$7 = this.dW().a_($$2);
               this.h(this.dz().d(0.7, -0.5, 0.7));
               if (!$$7.a(dko.bX)) {
                  if (!this.h) {
                     boolean $$8 = $$7.a(new dbh(this.dW(), $$2, jm.a, cxp.j, jm.b));
                     boolean $$9 = dnj.n(this.dW().a_($$2.e())) && (!$$3 || !$$4);
                     boolean $$10 = this.g.a((dhl)this.dW(), $$2) && !$$9;
                     if ($$8 && $$10) {
                        if (this.g.b(dyl.D) && this.dW().b_($$2).a() == ety.c) {
                           this.g = this.g.b(dyl.D, Boolean.valueOf(true));
                        }

                        if (this.dW().a($$2, this.g, 3)) {
                           ((ash)this.dW()).m().a.a(this, new ada($$2, this.dW().a_($$2)));
                           this.at();
                           if ($$0 instanceof dni) {
                              ((dni)$$0).a(this.dW(), $$2, this.g, $$7, this);
                           }

                           if (this.c != null && this.g.x()) {
                              dux $$11 = this.dW().c_($$2);
                              if ($$11 != null) {
                                 ux $$12 = $$11.d(this.dW().K_());

                                 for (String $$13 : this.c.e()) {
                                    $$12.a($$13, this.c.c($$13).d());
                                 }

                                 try {
                                    $$11.c($$12, this.dW().K_());
                                 } catch (Exception var16) {
                                    f.error("Failed to load block entity from falling block", var16);
                                 }

                                 $$11.e();
                              }
                           }
                        } else if (this.b && $$1.N().b(dhe.i)) {
                           this.at();
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     } else {
                        this.at();
                        if (this.b && $$1.N().b(dhe.i)) {
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

         this.h(this.dz().c(0.98));
      }
   }

   public void a(dkm $$0, jh $$1) {
      if ($$0 instanceof dni) {
         ((dni)$$0).a(this.dW(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bua $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = bae.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bvk> $$4 = bvp.e.and(bvp.b);
            bua $$6 = this.g.b() instanceof dni $$5 ? $$5.a(this) : this.dX().a(this);
            float $$7 = (float)Math.min(bae.d((float)$$3 * this.k), this.j);
            this.dW().a(this, this.cR(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(axu.O);
            if ($$8 && $$7 > 0.0F && this.ae.i() < 0.05F + (float)$$3 * 0.05F) {
               dxv $$9 = djm.e(this.g);
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
   protected void b(ux $$0) {
      $$0.a("BlockState", vm.a(this.g));
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
   protected void a(ux $$0) {
      this.g = vm.a(this.dW().a(mb.f), $$0.p("BlockState"));
      this.a = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(axu.O)) {
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
         this.g = dko.L.m();
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

   public dxv p() {
      return this.g;
   }

   @Override
   protected xv cz() {
      return xv.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cW() {
      return true;
   }

   @Override
   public aac<acr> a(asf $$0) {
      return new acs(this, $$0, dkm.j(this.p()));
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      this.g = dkm.a($$0.p());
      this.I = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dw());
   }

   @Nullable
   @Override
   public bvk b(eux $$0) {
      aly<dhi> $$1 = $$0.b().ah();
      aly<dhi> $$2 = this.dW().ah();
      boolean $$3 = ($$2 == dhi.k || $$1 == dhi.k) && $$2 != $$1;
      bvk $$4 = super.b($$0);
      this.d = $$4 != null && $$3;
      return $$4;
   }
}
