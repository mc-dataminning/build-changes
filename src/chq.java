import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chq extends brh {
   private static final Logger f = LogUtils.getLogger();
   private dqh g = ddg.I.n();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public ua d;
   protected static final ajm<in> e = ajq.a(chq.class, ajo.o);

   public chq(brn<? extends chq> $$0, dad $$1) {
      super($$0, $$1);
   }

   private chq(dad $$0, double $$1, double $$2, double $$3, dqh $$4) {
      this(brn.O, $$0);
      this.g = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.g(etp.b);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.dn());
   }

   public static chq a(dad $$0, in $$1, dqh $$2) {
      chq $$3 = new chq($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dqx.C) ? $$2.a(dqx.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cr() {
      return false;
   }

   public void a(in $$0) {
      this.ao.a(e, $$0);
   }

   public in p() {
      return this.ao.a(e);
   }

   @Override
   protected brh.b aZ() {
      return brh.b.a;
   }

   @Override
   protected void a(ajq.a $$0) {
      $$0.a(e, in.c);
   }

   @Override
   public boolean bx() {
      return !this.dI();
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.am();
      } else {
         dde $$0 = this.g.b();
         this.b++;
         this.aY();
         this.a(bsf.a, this.dq());
         if (!this.dN().B) {
            in $$1 = this.dn();
            boolean $$2 = this.g.b() instanceof deq;
            boolean $$3 = $$2 && this.dN().b_($$1).a(avw.a);
            double $$4 = this.dq().g();
            if ($$2 && $$4 > 1.0) {
               etl $$5 = this.dN().a(new czm(new etp(this.L, this.M, this.N), this.dl(), czm.a.a, czm.b.b, this));
               if ($$5.c() != etn.a.a && this.dN().b_($$5.a()).a(avw.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aC() || $$3) {
               dqh $$6 = this.dN().a_($$1);
               this.g(this.dq().d(0.7, -0.5, 0.7));
               if (!$$6.a(ddg.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cwj(this.dN(), $$1, is.a, csz.i, is.b));
                     boolean $$8 = dga.m(this.dN().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((dag)this.dN(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dqx.C) && this.dN().b_($$1).a() == emb.c) {
                           this.g = this.g.a(dqx.C, Boolean.valueOf(true));
                        }

                        if (this.dN().a($$1, this.g, 3)) {
                           ((aqh)this.dN()).l().a.a(this, new abv($$1, this.dN().a_($$1)));
                           this.am();
                           if ($$0 instanceof dfz) {
                              ((dfz)$$0).a(this.dN(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dnm $$10 = this.dN().c_($$1);
                              if ($$10 != null) {
                                 ua $$11 = $$10.d(this.dN().H_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.a($$11, this.dN().H_());
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dN().aa().b(czz.i)) {
                           this.am();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.am();
                        if (this.c && this.dN().aa().b(czz.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.am();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dN().B && (this.b > 100 && ($$1.v() <= this.dN().I_() || $$1.v() > this.dN().al()) || this.b > 600)) {
               if (this.c && this.dN().aa().b(czz.i)) {
                  this.a($$0);
               }

               this.am();
            }
         }

         this.g(this.dq().a(0.98));
      }
   }

   public void a(dde $$0, in $$1) {
      if ($$0 instanceof dfz) {
         ((dfz)$$0).a(this.dN(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bqf $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = axz.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<brh> $$4 = brm.e.and(brm.b);
            bqf $$6 = this.g.b() instanceof dfz $$5 ? $$5.a(this) : this.dO().a(this);
            float $$7 = (float)Math.min(axz.d((float)$$3 * this.k), this.j);
            this.dN().a(this, this.cI(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(avr.M);
            if ($$8 && $$7 > 0.0F && this.ah.i() < 0.05F + (float)$$3 * 0.05F) {
               dqh $$9 = dce.e(this.g);
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
   protected void b(ua $$0) {
      $$0.a("BlockState", up.a(this.g));
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
   protected void a(ua $$0) {
      this.g = up.a(this.dN().a(le.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(avr.M)) {
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
         this.g = ddg.I.n();
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
   public boolean cw() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dqh u() {
      return this.g;
   }

   @Override
   protected wu cp() {
      return wu.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cN() {
      return true;
   }

   @Override
   public zb<abm> dj() {
      return new abn(this, dde.i(this.u()));
   }

   @Override
   public void a(abn $$0) {
      super.a($$0);
      this.g = dde.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dn());
   }
}
