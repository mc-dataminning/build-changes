import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdv extends bnq {
   private static final Logger f = LogUtils.getLogger();
   private dlj g = cyu.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public sw d;
   protected static final aie<hz> e = aih.a(cdv.class, aig.n);

   public cdv(bnw<? extends cdv> $$0, cvr $$1) {
      super($$0, $$1);
   }

   private cdv(cvr $$0, double $$1, double $$2, double $$3, dlj $$4) {
      this(bnw.N, $$0);
      this.g = $$4;
      this.H = true;
      this.a_($$1, $$2, $$3);
      this.g(enz.b);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
      this.a(this.dm());
   }

   public static cdv a(cvr $$0, hz $$1, dlj $$2) {
      cdv $$3 = new cdv($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dlz.C) ? $$2.a(dlz.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cq() {
      return false;
   }

   public void a(hz $$0) {
      this.am.b(e, $$0);
   }

   public hz q() {
      return this.am.b(e);
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.a;
   }

   @Override
   protected void c_() {
      this.am.a(e, hz.c);
   }

   @Override
   public boolean bt() {
      return !this.dH();
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.am();
      } else {
         cys $$0 = this.g.b();
         this.b++;
         if (!this.aV()) {
            this.g(this.dp().b(0.0, -0.04, 0.0));
         }

         this.a(bon.a, this.dp());
         if (!this.dM().B) {
            hz $$1 = this.dm();
            boolean $$2 = this.g.b() instanceof dae;
            boolean $$3 = $$2 && this.dM().b_($$1).a(auf.a);
            double $$4 = this.dp().g();
            if ($$2 && $$4 > 1.0) {
               env $$5 = this.dM().a(new cva(new enz(this.J, this.K, this.L), this.dk(), cva.a.a, cva.b.b, this));
               if ($$5.c() != enx.a.a && this.dM().b_($$5.a()).a(auf.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aC() || $$3) {
               dlj $$6 = this.dM().a_($$1);
               this.g(this.dp().d(0.7, -0.5, 0.7));
               if (!$$6.a(cyu.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new crl(this.dM(), $$1, ie.a, cpd.h, ie.b));
                     boolean $$8 = dbo.m(this.dM().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cvu)this.dM(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dlz.C) && this.dM().b_($$1).a() == egx.c) {
                           this.g = this.g.a(dlz.C, Boolean.valueOf(true));
                        }

                        if (this.dM().a($$1, this.g, 3)) {
                           ((aow)this.dM()).l().a.a(this, new aap($$1, this.dM().a_($$1)));
                           this.am();
                           if ($$0 instanceof dbn) {
                              ((dbn)$$0).a(this.dM(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dix $$10 = this.dM().c_($$1);
                              if ($$10 != null) {
                                 sw $$11 = $$10.q();

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.a($$11);
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dM().Z().b(cvn.i)) {
                           this.am();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.am();
                        if (this.c && this.dM().Z().b(cvn.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.am();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dM().B && (this.b > 100 && ($$1.v() <= this.dM().J_() || $$1.v() > this.dM().ak()) || this.b > 600)) {
               if (this.c && this.dM().Z().b(cvn.i)) {
                  this.a($$0);
               }

               this.am();
            }
         }

         this.g(this.dp().a(0.98));
      }
   }

   public void a(cys $$0, hz $$1) {
      if ($$0 instanceof dbn) {
         ((dbn)$$0).a(this.dM(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bmp $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = awi.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bnq> $$4 = bnv.e.and(bnv.b);
            bmp $$6 = this.g.b() instanceof dbn $$5 ? $$5.a(this) : this.dN().a(this);
            float $$7 = (float)Math.min(awi.d((float)$$3 * this.k), this.j);
            this.dM().a(this, this.cH(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(aua.M);
            if ($$8 && $$7 > 0.0F && this.af.i() < 0.05F + (float)$$3 * 0.05F) {
               dlj $$9 = cxs.e(this.g);
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
   protected void b(sw $$0) {
      $$0.a("BlockState", tl.a(this.g));
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
   protected void a(sw $$0) {
      this.g = tl.a(this.dM().a(kg.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(aua.M)) {
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
         this.g = cyu.I.o();
      }
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   @Override
   public void s() {
      this.h = true;
   }

   @Override
   public boolean cv() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dlj u() {
      return this.g;
   }

   @Override
   protected vq co() {
      return vq.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public xx<aag> di() {
      return new aah(this, cys.i(this.u()));
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      this.g = cys.a($$0.p());
      this.H = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dm());
   }
}
