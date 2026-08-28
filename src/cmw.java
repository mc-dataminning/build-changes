import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmw extends bwa {
   private static final Logger f = LogUtils.getLogger();
   private dzo g = dlw.L.m();
   public int a;
   public boolean b = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public tx c;
   public boolean d;
   protected static final akh<iu> e = akl.a(cmw.class, akj.o);

   public cmw(bwj<? extends cmw> $$0, dip $$1) {
      super($$0, $$1);
   }

   private cmw(dip $$0, double $$1, double $$2, double $$3, dzo $$4) {
      this(bwj.X, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.i(fdw.c);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dv());
   }

   public static cmw a(dip $$0, iu $$1, dzo $$2) {
      cmw $$3 = new cmw($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(eae.I) ? $$2.b(eae.I, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public final boolean a(aro $$0, bup $$1, float $$2) {
      if (!this.d($$1)) {
         this.bC();
      }

      return false;
   }

   public void a(iu $$0) {
      this.al.a(e, $$0);
   }

   public iu f() {
      return this.al.a(e);
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.a;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(e, iu.c);
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
         dlu $$0 = this.g.b();
         this.a++;
         this.bf();
         this.a(bxd.a, this.dy());
         this.aK();
         this.bW();
         if (this.dV() instanceof aro $$1 && (this.bK() || this.d)) {
            iu $$2 = this.dv();
            boolean $$3 = this.g.b() instanceof dng;
            boolean $$4 = $$3 && this.dV().b_($$2).a(axf.a);
            double $$5 = this.dy().h();
            if ($$3 && $$5 > 1.0) {
               fds $$6 = this.dV().a(new dhy(new fdw(this.K, this.L, this.M), this.dt(), dhy.a.a, dhy.b.b, this));
               if ($$6.d() != fdu.a.a && this.dV().b_($$6.b()).a(axf.a)) {
                  $$2 = $$6.b();
                  $$4 = true;
               }
            }

            if (!this.aJ() && !$$4) {
               if (this.a > 100 && ($$2.v() <= this.dV().G_() || $$2.v() > this.dV().ao()) || this.a > 600) {
                  if (this.b && $$1.O().c(dil.i)) {
                     this.a($$1, $$0);
                  }

                  this.at();
               }
            } else {
               dzo $$7 = this.dV().a_($$2);
               this.i(this.dy().d(0.7, -0.5, 0.7));
               if (!$$7.a(dlw.bX)) {
                  if (!this.h) {
                     boolean $$8 = $$7.a(new dcm(this.dV(), $$2, ja.a, cys.k, ja.b));
                     boolean $$9 = dor.n(this.dV().a_($$2.e())) && (!$$3 || !$$4);
                     boolean $$10 = this.g.a((dis)this.dV(), $$2) && !$$9;
                     if ($$8 && $$10) {
                        if (this.g.b(eae.I) && this.dV().b_($$2).a() == evw.c) {
                           this.g = this.g.b(eae.I, Boolean.valueOf(true));
                        }

                        if (this.dV().a($$2, this.g, 3)) {
                           ((aro)this.dV()).m().a.a(this, new aca($$2, this.dV().a_($$2)));
                           this.at();
                           if ($$0 instanceof doq) {
                              ((doq)$$0).a(this.dV(), $$2, this.g, $$7, this);
                           }

                           if (this.c != null && this.g.x()) {
                              dwn $$11 = this.dV().c_($$2);
                              if ($$11 != null) {
                                 tx $$12 = $$11.d(this.dV().F_());

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
                        } else if (this.b && $$1.O().c(dil.i)) {
                           this.at();
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     } else {
                        this.at();
                        if (this.b && $$1.O().c(dil.i)) {
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

   public void a(dlu $$0, iu $$1) {
      if ($$0 instanceof doq) {
         ((doq)$$0).a(this.dV(), $$1, this);
      }
   }

   @Override
   public boolean a(double $$0, float $$1, bup $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = azk.c($$0 - 1.0);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bwa> $$4 = bwh.e.and(bwh.b);
            bup $$6 = this.g.b() instanceof doq $$5 ? $$5.a(this) : this.dW().a(this);
            float $$7 = (float)Math.min(azk.d((float)$$3 * this.k), this.j);
            this.dV().a(this, this.cR(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(axa.O);
            if ($$8 && $$7 > 0.0F && this.ae.i() < 0.05F + (float)$$3 * 0.05F) {
               dzo $$9 = dku.e(this.g);
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
   protected void b(tx $$0) {
      $$0.a("BlockState", um.a(this.g));
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
   protected void a(tx $$0) {
      this.g = um.a(this.dV().a(mg.i), $$0.p("BlockState"));
      this.a = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(axa.O)) {
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
         this.g = dlw.L.m();
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

   public dzo j() {
      return this.g;
   }

   @Override
   protected ww cz() {
      return ww.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public zd<abs> a(arm $$0) {
      return new abt(this, $$0, dlu.j(this.j()));
   }

   @Override
   public void a(abt $$0) {
      super.a($$0);
      this.g = dlu.a($$0.p());
      this.I = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dv());
   }

   @Nullable
   @Override
   public bwa b(ewv $$0) {
      ald<dip> $$1 = $$0.b().aj();
      ald<dip> $$2 = this.dV().aj();
      boolean $$3 = ($$2 == dip.k || $$1 == dip.k) && $$2 != $$1;
      bwa $$4 = super.b($$0);
      this.d = $$4 != null && $$3;
      return $$4;
   }
}
