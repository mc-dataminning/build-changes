import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class byd extends big {
   private static final Logger f = LogUtils.getLogger();
   private dey g = csl.I.n();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public qs d;
   protected static final adx<gv> e = aea.a(byd.class, adz.n);

   public byd(bik<? extends byd> $$0, cpk $$1) {
      super($$0, $$1);
   }

   private byd(cpk $$0, double $$1, double $$2, double $$3, dey $$4) {
      this(bik.L, $$0);
      this.g = $$4;
      this.I = true;
      this.e($$1, $$2, $$3);
      this.f(ehf.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dk());
   }

   public static byd a(cpk $$0, gv $$1, dey $$2) {
      byd $$3 = new byd($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dfo.C) ? $$2.a(dfo.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cp() {
      return false;
   }

   public void a(gv $$0) {
      this.an.b(e, $$0);
   }

   public gv j() {
      return this.an.b(e);
   }

   @Override
   protected big.b aU() {
      return big.b.a;
   }

   @Override
   protected void a_() {
      this.an.a(e, gv.b);
   }

   @Override
   public boolean br() {
      return !this.dF();
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.ak();
      } else {
         csk $$0 = this.g.b();
         this.b++;
         if (!this.aT()) {
            this.f(this.dn().b(0.0, -0.04, 0.0));
         }

         this.a(bjc.a, this.dn());
         if (!this.dK().B) {
            gv $$1 = this.dk();
            boolean $$2 = this.g.b() instanceof ctu;
            boolean $$3 = $$2 && this.dK().b_($$1).a(apo.a);
            double $$4 = this.dn().g();
            if ($$2 && $$4 > 1.0) {
               ehb $$5 = this.dK().a(new cot(new ehf(this.K, this.L, this.M), this.di(), cot.a.a, cot.b.b, this));
               if ($$5.c() != ehd.a.a && this.dK().b_($$5.a()).a(apo.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aA() || $$3) {
               dey $$6 = this.dK().a_($$1);
               this.f(this.dn().d(0.7, -0.5, 0.7));
               if (!$$6.a(csl.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new clf(this.dK(), $$1, hb.a, ciw.b, hb.b));
                     boolean $$8 = cvc.h(this.dK().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cpn)this.dK(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dfo.C) && this.dK().b_($$1).a() == eac.c) {
                           this.g = this.g.a(dfo.C, Boolean.valueOf(true));
                        }

                        if (this.dK().a($$1, this.g, 3)) {
                           ((aki)this.dK()).k().a.a(this, new wy($$1, this.dK().a_($$1)));
                           this.ak();
                           if ($$0 instanceof cvb) {
                              ((cvb)$$0).a(this.dK(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dck $$10 = this.dK().c_($$1);
                              if ($$10 != null) {
                                 qs $$11 = $$10.o();

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
                        } else if (this.c && this.dK().X().b(cpg.h)) {
                           this.ak();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ak();
                        if (this.c && this.dK().X().b(cpg.h)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.ak();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dK().B && (this.b > 100 && ($$1.v() <= this.dK().C_() || $$1.v() > this.dK().aj()) || this.b > 600)) {
               if (this.c && this.dK().X().b(cpg.h)) {
                  this.a($$0);
               }

               this.ak();
            }
         }

         this.f(this.dn().a(0.98));
      }
   }

   public void a(csk $$0, gv $$1) {
      if ($$0 instanceof cvb) {
         ((cvb)$$0).a(this.dK(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhe $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = aro.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<big> $$4 = bij.e.and(bij.b);
            bhe $$6 = this.g.b() instanceof cvb $$5 ? $$5.a(this) : this.dL().a(this);
            float $$7 = (float)Math.min(aro.d((float)$$3 * this.k), this.j);
            this.dK().a(this, this.cG(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(apj.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               dey $$9 = crl.e(this.g);
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
   protected void b(qs $$0) {
      $$0.a("BlockState", re.a(this.g));
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
   protected void a(qs $$0) {
      this.g = re.a(this.dK().a(jd.e), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(apj.M)) {
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
         this.g = csl.I.n();
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
   public boolean cu() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dey o() {
      return this.g;
   }

   @Override
   protected te cn() {
      return te.a("entity.minecraft.falling_block_type", this.g.b().e());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public uw<wo> U() {
      return new wp(this, csk.i(this.o()));
   }

   @Override
   public void a(wp $$0) {
      super.a($$0);
      this.g = csk.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.e($$1, $$2, $$3);
      this.a(this.dk());
   }
}
