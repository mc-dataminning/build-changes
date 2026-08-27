import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cbd extends blf {
   private static final Logger f = LogUtils.getLogger();
   private dip g = cwb.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public sj d;
   protected static final afz<hv> e = agc.a(cbd.class, agb.n);

   public cbd(blj<? extends cbd> $$0, csy $$1) {
      super($$0, $$1);
   }

   private cbd(csy $$0, double $$1, double $$2, double $$3, dip $$4) {
      this(blj.M, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.g(elb.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dm());
   }

   public static cbd a(csy $$0, hv $$1, dip $$2) {
      cbd $$3 = new cbd($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(djf.C) ? $$2.a(djf.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cq() {
      return false;
   }

   public void a(hv $$0) {
      this.an.b(e, $$0);
   }

   public hv q() {
      return this.an.b(e);
   }

   @Override
   protected blf.b aW() {
      return blf.b.a;
   }

   @Override
   protected void c_() {
      this.an.a(e, hv.b);
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
         cvz $$0 = this.g.b();
         this.b++;
         if (!this.aV()) {
            this.g(this.dp().b(0.0, -0.04, 0.0));
         }

         this.a(bmb.a, this.dp());
         if (!this.dM().B) {
            hv $$1 = this.dm();
            boolean $$2 = this.g.b() instanceof cxl;
            boolean $$3 = $$2 && this.dM().b_($$1).a(arw.a);
            double $$4 = this.dp().g();
            if ($$2 && $$4 > 1.0) {
               ekx $$5 = this.dM().a(new csh(new elb(this.K, this.L, this.M), this.dk(), csh.a.a, csh.b.b, this));
               if ($$5.c() != ekz.a.a && this.dM().b_($$5.a()).a(arw.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aC() || $$3) {
               dip $$6 = this.dM().a_($$1);
               this.g(this.dp().d(0.7, -0.5, 0.7));
               if (!$$6.a(cwb.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cor(this.dM(), $$1, ia.a, cmh.f, ia.b));
                     boolean $$8 = cyv.h(this.dM().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((ctb)this.dM(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(djf.C) && this.dM().b_($$1).a() == eea.c) {
                           this.g = this.g.a(djf.C, Boolean.valueOf(true));
                        }

                        if (this.dM().a($$1, this.g, 3)) {
                           ((amp)this.dM()).k().a.a(this, new yx($$1, this.dM().a_($$1)));
                           this.am();
                           if ($$0 instanceof cyu) {
                              ((cyu)$$0).a(this.dM(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dgd $$10 = this.dM().c_($$1);
                              if ($$10 != null) {
                                 sj $$11 = $$10.q();

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
                        } else if (this.c && this.dM().Y().b(csu.i)) {
                           this.am();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.am();
                        if (this.c && this.dM().Y().b(csu.i)) {
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
               if (this.c && this.dM().Y().b(csu.i)) {
                  this.a($$0);
               }

               this.am();
            }
         }

         this.g(this.dp().a(0.98));
      }
   }

   public void a(cvz $$0, hv $$1) {
      if ($$0 instanceof cyu) {
         ((cyu)$$0).a(this.dM(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bkd $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = aty.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<blf> $$4 = bli.e.and(bli.b);
            bkd $$6 = this.g.b() instanceof cyu $$5 ? $$5.a(this) : this.dN().a(this);
            float $$7 = (float)Math.min(aty.d((float)$$3 * this.k), this.j);
            this.dM().a(this, this.cH(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(arr.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               dip $$9 = cuz.e(this.g);
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
   protected void b(sj $$0) {
      $$0.a("BlockState", sy.a(this.g));
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
   protected void a(sj $$0) {
      this.g = sy.a(this.dM().a(kc.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(arr.M)) {
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
         this.g = cwb.I.o();
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

   public dip u() {
      return this.g;
   }

   @Override
   protected vb co() {
      return vb.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public wu<yo> dj() {
      return new yp(this, cvz.i(this.u()));
   }

   @Override
   public void a(yp $$0) {
      super.a($$0);
      this.g = cvz.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.a_($$1, $$2, $$3);
      this.a(this.dm());
   }
}
