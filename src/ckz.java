import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckz extends buj {
   private static final Logger f = LogUtils.getLogger();
   private dwv g = djm.L.m();
   public int a;
   public boolean b = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public tq c;
   public boolean d;
   protected static final ajx<ji> e = akb.a(ckz.class, ajz.o);

   public ckz(buq<? extends ckz> $$0, dgg $$1) {
      super($$0, $$1);
   }

   private ckz(dgg $$0, double $$1, double $$2, double $$3, dwv $$4) {
      this(buq.X, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.h(fay.c);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dw());
   }

   public static ckz a(dgg $$0, ji $$1, dwv $$2) {
      ckz $$3 = new ckz($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dxl.J) ? $$2.b(dxl.J, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public final boolean a(arc $$0, bsz $$1, float $$2) {
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
   protected buj.c bg() {
      return buj.c.a;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(e, ji.c);
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
         djk $$0 = this.g.b();
         this.a++;
         this.bf();
         this.a(bvj.a, this.dz());
         this.aK();
         this.bW();
         if (this.dW() instanceof arc $$1 && (this.bL() || this.d)) {
            ji $$2 = this.dw();
            boolean $$3 = this.g.b() instanceof dkw;
            boolean $$4 = $$3 && this.dW().b_($$2).a(awu.a);
            double $$5 = this.dz().h();
            if ($$3 && $$5 > 1.0) {
               fau $$6 = this.dW().a(new dfo(new fay(this.K, this.L, this.M), this.du(), dfo.a.a, dfo.b.b, this));
               if ($$6.d() != faw.a.a && this.dW().b_($$6.b()).a(awu.a)) {
                  $$2 = $$6.b();
                  $$4 = true;
               }
            }

            if (!this.aJ() && !$$4) {
               if (this.a > 100 && ($$2.v() <= this.dW().L_() || $$2.v() > this.dW().an()) || this.a > 600) {
                  if (this.b && $$1.O().b(dgc.i)) {
                     this.a($$1, $$0);
                  }

                  this.at();
               }
            } else {
               dwv $$7 = this.dW().a_($$2);
               this.h(this.dz().d(0.7, -0.5, 0.7));
               if (!$$7.a(djm.bX)) {
                  if (!this.h) {
                     boolean $$8 = $$7.a(new daf(this.dW(), $$2, jn.a, cwn.j, jn.b));
                     boolean $$9 = dmh.n(this.dW().a_($$2.e())) && (!$$3 || !$$4);
                     boolean $$10 = this.g.a((dgj)this.dW(), $$2) && !$$9;
                     if ($$8 && $$10) {
                        if (this.g.b(dxl.J) && this.dW().b_($$2).a() == esy.c) {
                           this.g = this.g.b(dxl.J, Boolean.valueOf(true));
                        }

                        if (this.dW().a($$2, this.g, 3)) {
                           ((arc)this.dW()).m().a.a(this, new abt($$2, this.dW().a_($$2)));
                           this.at();
                           if ($$0 instanceof dmg) {
                              ((dmg)$$0).a(this.dW(), $$2, this.g, $$7, this);
                           }

                           if (this.c != null && this.g.x()) {
                              dtx $$11 = this.dW().c_($$2);
                              if ($$11 != null) {
                                 tq $$12 = $$11.d(this.dW().K_());

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
                        } else if (this.b && $$1.O().b(dgc.i)) {
                           this.at();
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     } else {
                        this.at();
                        if (this.b && $$1.O().b(dgc.i)) {
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

   public void a(djk $$0, ji $$1) {
      if ($$0 instanceof dmg) {
         ((dmg)$$0).a(this.dW(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsz $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = ayy.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<buj> $$4 = buo.e.and(buo.b);
            bsz $$6 = this.g.b() instanceof dmg $$5 ? $$5.a(this) : this.dX().a(this);
            float $$7 = (float)Math.min(ayy.d((float)$$3 * this.k), this.j);
            this.dW().a(this, this.cR(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(awo.O);
            if ($$8 && $$7 > 0.0F && this.ae.i() < 0.05F + (float)$$3 * 0.05F) {
               dwv $$9 = dik.e(this.g);
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
      this.g = uf.a(this.dW().a(mc.f), $$0.p("BlockState"));
      this.a = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(awo.O)) {
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
         this.g = djm.L.m();
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

   public dwv p() {
      return this.g;
   }

   @Override
   protected wo cz() {
      return wo.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cW() {
      return true;
   }

   @Override
   public yv<abk> a(ara $$0) {
      return new abl(this, $$0, djk.j(this.p()));
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      this.g = djk.a($$0.p());
      this.I = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dw());
   }

   @Nullable
   @Override
   public buj b(etx $$0) {
      akt<dgg> $$1 = $$0.b().ai();
      akt<dgg> $$2 = this.dW().ai();
      boolean $$3 = ($$2 == dgg.k || $$1 == dgg.k) && $$2 != $$1;
      buj $$4 = super.b($$0);
      this.d = $$4 != null && $$3;
      return $$4;
   }
}
