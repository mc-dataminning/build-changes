import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cbt extends blv {
   private static final Logger f = LogUtils.getLogger();
   private djh g = cws.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public sn d;
   protected static final agm<hx> e = agp.a(cbt.class, ago.n);

   public cbt(blz<? extends cbt> $$0, ctp $$1) {
      super($$0, $$1);
   }

   private cbt(ctp $$0, double $$1, double $$2, double $$3, djh $$4) {
      this(blz.M, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.g(elt.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dm());
   }

   public static cbt a(ctp $$0, hx $$1, djh $$2) {
      cbt $$3 = new cbt($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(djx.C) ? $$2.a(djx.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cq() {
      return false;
   }

   public void a(hx $$0) {
      this.an.b(e, $$0);
   }

   public hx q() {
      return this.an.b(e);
   }

   @Override
   protected blv.b aW() {
      return blv.b.a;
   }

   @Override
   protected void c_() {
      this.an.a(e, hx.b);
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
         cwq $$0 = this.g.b();
         this.b++;
         if (!this.aV()) {
            this.g(this.dp().b(0.0, -0.04, 0.0));
         }

         this.a(bmr.a, this.dp());
         if (!this.dM().B) {
            hx $$1 = this.dm();
            boolean $$2 = this.g.b() instanceof cyc;
            boolean $$3 = $$2 && this.dM().b_($$1).a(asm.a);
            double $$4 = this.dp().g();
            if ($$2 && $$4 > 1.0) {
               elp $$5 = this.dM().a(new csy(new elt(this.K, this.L, this.M), this.dk(), csy.a.a, csy.b.b, this));
               if ($$5.c() != elr.a.a && this.dM().b_($$5.a()).a(asm.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aC() || $$3) {
               djh $$6 = this.dM().a_($$1);
               this.g(this.dp().d(0.7, -0.5, 0.7));
               if (!$$6.a(cws.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cpi(this.dM(), $$1, ic.a, cmy.f, ic.b));
                     boolean $$8 = czm.h(this.dM().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cts)this.dM(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(djx.C) && this.dM().b_($$1).a() == ees.c) {
                           this.g = this.g.a(djx.C, Boolean.valueOf(true));
                        }

                        if (this.dM().a($$1, this.g, 3)) {
                           ((and)this.dM()).l().a.a(this, new zj($$1, this.dM().a_($$1)));
                           this.am();
                           if ($$0 instanceof czl) {
                              ((czl)$$0).a(this.dM(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dgv $$10 = this.dM().c_($$1);
                              if ($$10 != null) {
                                 sn $$11 = $$10.q();

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
                        } else if (this.c && this.dM().Z().b(ctl.i)) {
                           this.am();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.am();
                        if (this.c && this.dM().Z().b(ctl.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.am();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dM().B && (this.b > 100 && ($$1.v() <= this.dM().J_() || $$1.v() > this.dM().al()) || this.b > 600)) {
               if (this.c && this.dM().Z().b(ctl.i)) {
                  this.a($$0);
               }

               this.am();
            }
         }

         this.g(this.dp().a(0.98));
      }
   }

   public void a(cwq $$0, hx $$1) {
      if ($$0 instanceof czl) {
         ((czl)$$0).a(this.dM(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bkt $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = auo.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<blv> $$4 = bly.e.and(bly.b);
            bkt $$6 = this.g.b() instanceof czl $$5 ? $$5.a(this) : this.dN().a(this);
            float $$7 = (float)Math.min(auo.d((float)$$3 * this.k), this.j);
            this.dM().a(this, this.cH(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(ash.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               djh $$9 = cvq.e(this.g);
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
   protected void b(sn $$0) {
      $$0.a("BlockState", tc.a(this.g));
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
   protected void a(sn $$0) {
      this.g = tc.a(this.dM().a(ke.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(ash.M)) {
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
         this.g = cws.I.o();
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

   public djh u() {
      return this.g;
   }

   @Override
   protected vf co() {
      return vf.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public xf<za> dj() {
      return new zb(this, cwq.i(this.u()));
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      this.g = cwq.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.a_($$1, $$2, $$3);
      this.a(this.dm());
   }
}
