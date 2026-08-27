import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cif extends brv {
   private static final Logger f = LogUtils.getLogger();
   private dtc g = dfe.ao.n();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public uk d;
   protected static final ajy<ir> e = akc.a(cif.class, aka.o);

   public cif(bsb<? extends cif> $$0, dca $$1) {
      super($$0, $$1);
   }

   private cif(dca $$0, double $$1, double $$2, double $$3, dtc $$4) {
      this(bsb.Q, $$0);
      this.g = $$4;
      this.K = true;
      this.a_($$1, $$2, $$3);
      this.g(ewu.b);
      this.M = $$1;
      this.N = $$2;
      this.O = $$3;
      this.a(this.du());
   }

   public static cif a(dca $$0, ir $$1, dtc $$2) {
      cif $$3 = new cif($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dts.C) ? $$2.a(dts.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cy() {
      return false;
   }

   public void a(ir $$0) {
      this.as.a(e, $$0);
   }

   public ir p() {
      return this.as.a(e);
   }

   @Override
   protected brv.c bf() {
      return brv.c.a;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(e, ir.c);
   }

   @Override
   public boolean bE() {
      return !this.dP();
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.ao();
      } else {
         dfc $$0 = this.g.b();
         this.b++;
         this.be();
         this.a(bst.a, this.dx());
         if (!this.dU().C) {
            ir $$1 = this.du();
            boolean $$2 = this.g.b() instanceof dgo;
            boolean $$3 = $$2 && this.dU().b_($$1).a(awj.a);
            double $$4 = this.dx().g();
            if ($$2 && $$4 > 1.0) {
               ewq $$5 = this.dU().a(new dbj(new ewu(this.M, this.N, this.O), this.ds(), dbj.a.a, dbj.b.b, this));
               if ($$5.c() != ews.a.a && this.dU().b_($$5.a()).a(awj.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aE() || $$3) {
               dtc $$6 = this.dU().a_($$1);
               this.g(this.dx().d(0.7, -0.5, 0.7));
               if (!$$6.a(dfe.cA)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cye(this.dU(), $$1, iw.a, cuh.i, iw.b));
                     boolean $$8 = dib.m(this.dU().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((dcd)this.dU(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dts.C) && this.dU().b_($$1).a() == epf.c) {
                           this.g = this.g.a(dts.C, Boolean.valueOf(true));
                        }

                        if (this.dU().a($$1, this.g, 3)) {
                           ((aqt)this.dU()).l().a.a(this, new acg($$1, this.dU().a_($$1)));
                           this.ao();
                           if ($$0 instanceof dia) {
                              ((dia)$$0).a(this.dU(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dqc $$10 = this.dU().c_($$1);
                              if ($$10 != null) {
                                 uk $$11 = $$10.d(this.dU().I_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.a($$11, this.dU().I_());
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dU().ab().b(dbw.i)) {
                           this.ao();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ao();
                        if (this.c && this.dU().ab().b(dbw.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.ao();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dU().C && (this.b > 100 && ($$1.v() <= this.dU().J_() || $$1.v() > this.dU().am()) || this.b > 600)) {
               if (this.c && this.dU().ab().b(dbw.i)) {
                  this.a($$0);
               }

               this.ao();
            }
         }

         this.g(this.dx().a(0.98));
      }
   }

   public void a(dfc $$0, ir $$1) {
      if ($$0 instanceof dia) {
         ((dia)$$0).a(this.dU(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bqt $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = aym.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<brv> $$4 = bsa.e.and(bsa.b);
            bqt $$6 = this.g.b() instanceof dia $$5 ? $$5.a(this) : this.dX().a(this);
            float $$7 = (float)Math.min(aym.d((float)$$3 * this.k), this.j);
            this.dU().a(this, this.cP(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(awe.M);
            if ($$8 && $$7 > 0.0F && this.al.i() < 0.05F + (float)$$3 * 0.05F) {
               dtc $$9 = deb.e(this.g);
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
   protected void b(uk $$0) {
      $$0.a("BlockState", uz.a(this.g));
      $$0.a("Time", this.b);
      $$0.a("DropItem", this.c);
      $$0.a("HurtEntities", this.i);
      $$0.a("FallHurtAmount", this.k);
      $$0.a("FallHurtMax", this.j);
      if (this.d != null) {
         $$0.a("TileEntityData", this.d);
      }

      $$0.a("CancelDrop", this.h);
   }

   @Override
   protected void a(uk $$0) {
      this.g = uz.a(this.dU().a(li.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(awe.M)) {
         this.i = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.c = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.d = $$0.p("TileEntityData").h();
      }

      this.h = $$0.q("CancelDrop");
      if (this.g.i()) {
         this.g = dfe.ao.n();
      }
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   @Override
   public void r() {
      this.h = true;
   }

   @Override
   public boolean cD() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dtc t() {
      return this.g;
   }

   @Override
   protected xe cw() {
      return xe.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cU() {
      return true;
   }

   @Override
   public zl<abw> dq() {
      return new abx(this, dfc.i(this.t()));
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      this.g = dfc.a($$0.p());
      this.K = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.du());
   }
}
