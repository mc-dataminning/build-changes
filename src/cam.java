import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cam extends bkq {
   private static final Logger f = LogUtils.getLogger();
   private dhi g = cvc.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public rz d;
   protected static final afo<ht> e = afr.a(cam.class, afq.n);

   public cam(bku<? extends cam> $$0, csa $$1) {
      super($$0, $$1);
   }

   private cam(csa $$0, double $$1, double $$2, double $$3, dhi $$4) {
      this(bku.L, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.g(eju.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dn());
   }

   public static cam a(csa $$0, ht $$1, dhi $$2) {
      cam $$3 = new cam($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dhy.C) ? $$2.a(dhy.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cq() {
      return false;
   }

   public void a(ht $$0) {
      this.an.b(e, $$0);
   }

   public ht q() {
      return this.an.b(e);
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.a;
   }

   @Override
   protected void b_() {
      this.an.a(e, ht.b);
   }

   @Override
   public boolean bt() {
      return !this.dI();
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.am();
      } else {
         cva $$0 = this.g.b();
         this.b++;
         if (!this.aV()) {
            this.g(this.dq().b(0.0, -0.04, 0.0));
         }

         this.a(blm.a, this.dq());
         if (!this.dN().B) {
            ht $$1 = this.dn();
            boolean $$2 = this.g.b() instanceof cwm;
            boolean $$3 = $$2 && this.dN().b_($$1).a(arl.a);
            double $$4 = this.dq().g();
            if ($$2 && $$4 > 1.0) {
               ejq $$5 = this.dN().a(new crj(new eju(this.K, this.L, this.M), this.dl(), crj.a.a, crj.b.b, this));
               if ($$5.c() != ejs.a.a && this.dN().b_($$5.a()).a(arl.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aC() || $$3) {
               dhi $$6 = this.dN().a_($$1);
               this.g(this.dq().d(0.7, -0.5, 0.7));
               if (!$$6.a(cvc.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cns(this.dN(), $$1, hx.a, clj.b, hx.b));
                     boolean $$8 = cxw.h(this.dN().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((csd)this.dN(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dhy.C) && this.dN().b_($$1).a() == ect.c) {
                           this.g = this.g.a(dhy.C, Boolean.valueOf(true));
                        }

                        if (this.dN().a($$1, this.g, 3)) {
                           ((ame)this.dN()).k().a.a(this, new ym($$1, this.dN().a_($$1)));
                           this.am();
                           if ($$0 instanceof cxv) {
                              ((cxv)$$0).a(this.dN(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dfd $$10 = this.dN().c_($$1);
                              if ($$10 != null) {
                                 rz $$11 = $$10.o();

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
                        } else if (this.c && this.dN().Y().b(crw.i)) {
                           this.am();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.am();
                        if (this.c && this.dN().Y().b(crw.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.am();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dN().B && (this.b > 100 && ($$1.v() <= this.dN().I_() || $$1.v() > this.dN().ak()) || this.b > 600)) {
               if (this.c && this.dN().Y().b(crw.i)) {
                  this.a($$0);
               }

               this.am();
            }
         }

         this.g(this.dq().a(0.98));
      }
   }

   public void a(cva $$0, ht $$1) {
      if ($$0 instanceof cxv) {
         ((cxv)$$0).a(this.dN(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bjo $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = atm.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bkq> $$4 = bkt.e.and(bkt.b);
            bjo $$6 = this.g.b() instanceof cxv $$5 ? $$5.a(this) : this.dO().a(this);
            float $$7 = (float)Math.min(atm.d((float)$$3 * this.k), this.j);
            this.dN().a(this, this.cH(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(arg.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               dhi $$9 = cua.e(this.g);
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
   protected void b(rz $$0) {
      $$0.a("BlockState", so.a(this.g));
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
   protected void a(rz $$0) {
      this.g = so.a(this.dN().a(jz.e), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(arg.M)) {
         this.i = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.c = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.d = $$0.p("TileEntityData");
      }

      this.h = $$0.q("CancelDrop");
      if (this.g.i()) {
         this.g = cvc.I.o();
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

   public dhi u() {
      return this.g;
   }

   @Override
   protected ur co() {
      return ur.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cN() {
      return true;
   }

   @Override
   public wk<yd> dk() {
      return new ye(this, cva.i(this.u()));
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      this.g = cva.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.a_($$1, $$2, $$3);
      this.a(this.dn());
   }
}
