import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmm extends bvs {
   private static final Logger f = LogUtils.getLogger();
   private dym g = dkw.L.m();
   public int a;
   public boolean b = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public tw c;
   public boolean d;
   protected static final akg<jj> e = akk.a(cmm.class, aki.o);

   public cmm(bwb<? extends cmm> $$0, dhp $$1) {
      super($$0, $$1);
   }

   private cmm(dhp $$0, double $$1, double $$2, double $$3, dym $$4) {
      this(bwb.X, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.i(fcu.c);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dv());
   }

   public static cmm a(dhp $$0, jj $$1, dym $$2) {
      cmm $$3 = new cmm($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dzc.I) ? $$2.b(dzc.I, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public final boolean a(arn $$0, buh $$1, float $$2) {
      if (!this.d($$1)) {
         this.bC();
      }

      return false;
   }

   public void a(jj $$0) {
      this.al.a(e, $$0);
   }

   public jj f() {
      return this.al.a(e);
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.a;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(e, jj.c);
   }

   @Override
   public boolean bG() {
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
         dku $$0 = this.g.b();
         this.a++;
         this.bf();
         this.a(bwv.a, this.dy());
         this.aK();
         this.bW();
         if (this.dV() instanceof arn $$1 && (this.bK() || this.d)) {
            jj $$2 = this.dv();
            boolean $$3 = this.g.b() instanceof dmg;
            boolean $$4 = $$3 && this.dV().b_($$2).a(axf.a);
            double $$5 = this.dy().h();
            if ($$3 && $$5 > 1.0) {
               fcq $$6 = this.dV().a(new dgy(new fcu(this.K, this.L, this.M), this.dt(), dgy.a.a, dgy.b.b, this));
               if ($$6.d() != fcs.a.a && this.dV().b_($$6.b()).a(axf.a)) {
                  $$2 = $$6.b();
                  $$4 = true;
               }
            }

            if (!this.aJ() && !$$4) {
               if (this.a > 100 && ($$2.v() <= this.dV().G_() || $$2.v() > this.dV().ao()) || this.a > 600) {
                  if (this.b && $$1.O().c(dhl.i)) {
                     this.a($$1, $$0);
                  }

                  this.at();
               }
            } else {
               dym $$7 = this.dV().a_($$2);
               this.i(this.dy().d(0.7, -0.5, 0.7));
               if (!$$7.a(dkw.bX)) {
                  if (!this.h) {
                     boolean $$8 = $$7.a(new dbo(this.dV(), $$2, jo.a, cxy.k, jo.b));
                     boolean $$9 = dnr.n(this.dV().a_($$2.e())) && (!$$3 || !$$4);
                     boolean $$10 = this.g.a((dhs)this.dV(), $$2) && !$$9;
                     if ($$8 && $$10) {
                        if (this.g.b(dzc.I) && this.dV().b_($$2).a() == euu.c) {
                           this.g = this.g.b(dzc.I, Boolean.valueOf(true));
                        }

                        if (this.dV().a($$2, this.g, 3)) {
                           ((arn)this.dV()).m().a.a(this, new abz($$2, this.dV().a_($$2)));
                           this.at();
                           if ($$0 instanceof dnq) {
                              ((dnq)$$0).a(this.dV(), $$2, this.g, $$7, this);
                           }

                           if (this.c != null && this.g.x()) {
                              dvl $$11 = this.dV().c_($$2);
                              if ($$11 != null) {
                                 tw $$12 = $$11.d(this.dV().F_());

                                 for (String $$13 : this.c.e()) {
                                    $$12.a($$13, this.c.c($$13).d());
                                 }

                                 try {
                                    $$11.c($$12, this.dV().F_());
                                 } catch (Exception var16) {
                                    f.error("Failed to load block entity from falling block", var16);
                                 }

                                 $$11.e();
                              }
                           }
                        } else if (this.b && $$1.O().c(dhl.i)) {
                           this.at();
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     } else {
                        this.at();
                        if (this.b && $$1.O().c(dhl.i)) {
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

   public void a(dku $$0, jj $$1) {
      if ($$0 instanceof dnq) {
         ((dnq)$$0).a(this.dV(), $$1, this);
      }
   }

   @Override
   public boolean a(double $$0, float $$1, buh $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = azk.c($$0 - 1.0);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bvs> $$4 = bvz.e.and(bvz.b);
            buh $$6 = this.g.b() instanceof dnq $$5 ? $$5.a(this) : this.dW().a(this);
            float $$7 = (float)Math.min(azk.d((float)$$3 * this.k), this.j);
            this.dV().a(this, this.cR(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(awz.O);
            if ($$8 && $$7 > 0.0F && this.ae.i() < 0.05F + (float)$$3 * 0.05F) {
               dym $$9 = dju.e(this.g);
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
   protected void b(tw $$0) {
      $$0.a("BlockState", ul.a(this.g));
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
   protected void a(tw $$0) {
      this.g = ul.a(this.dV().a(me.f), $$0.p("BlockState"));
      this.a = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(awz.O)) {
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
         this.g = dkw.L.m();
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
   public boolean cF() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dym j() {
      return this.g;
   }

   @Override
   protected wv cz() {
      return wv.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public zc<abr> a(arl $$0) {
      return new abs(this, $$0, dku.j(this.j()));
   }

   @Override
   public void a(abs $$0) {
      super.a($$0);
      this.g = dku.a($$0.p());
      this.I = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dv());
   }

   @Nullable
   @Override
   public bvs b(evt $$0) {
      alc<dhp> $$1 = $$0.b().aj();
      alc<dhp> $$2 = this.dV().aj();
      boolean $$3 = ($$2 == dhp.k || $$1 == dhp.k) && $$2 != $$1;
      bvs $$4 = super.b($$0);
      this.d = $$4 != null && $$3;
      return $$4;
   }
}
