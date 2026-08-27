import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bym extends biq {
   private static final Logger f = LogUtils.getLogger();
   private dfj g = csw.I.n();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public qx d;
   protected static final aef<gw> e = aei.a(bym.class, aeh.n);

   public bym(biu<? extends bym> $$0, cpv $$1) {
      super($$0, $$1);
   }

   private bym(cpv $$0, double $$1, double $$2, double $$3, dfj $$4) {
      this(biu.L, $$0);
      this.g = $$4;
      this.I = true;
      this.e($$1, $$2, $$3);
      this.f(ehn.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dl());
   }

   public static bym a(cpv $$0, gw $$1, dfj $$2) {
      bym $$3 = new bym($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dfz.C) ? $$2.a(dfz.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cq() {
      return false;
   }

   public void a(gw $$0) {
      this.an.b(e, $$0);
   }

   public gw q() {
      return this.an.b(e);
   }

   @Override
   protected biq.b aV() {
      return biq.b.a;
   }

   @Override
   protected void a_() {
      this.an.a(e, gw.b);
   }

   @Override
   public boolean bs() {
      return !this.dG();
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.al();
      } else {
         csv $$0 = this.g.b();
         this.b++;
         if (!this.aU()) {
            this.f(this.do().b(0.0, -0.04, 0.0));
         }

         this.a(bjm.a, this.do());
         if (!this.dL().B) {
            gw $$1 = this.dl();
            boolean $$2 = this.g.b() instanceof cuf;
            boolean $$3 = $$2 && this.dL().b_($$1).a(apy.a);
            double $$4 = this.do().g();
            if ($$2 && $$4 > 1.0) {
               ehj $$5 = this.dL().a(new cpe(new ehn(this.K, this.L, this.M), this.dj(), cpe.a.a, cpe.b.b, this));
               if ($$5.c() != ehl.a.a && this.dL().b_($$5.a()).a(apy.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aB() || $$3) {
               dfj $$6 = this.dL().a_($$1);
               this.f(this.do().d(0.7, -0.5, 0.7));
               if (!$$6.a(csw.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new clo(this.dL(), $$1, hc.a, cjf.b, hc.b));
                     boolean $$8 = cvn.h(this.dL().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cpy)this.dL(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dfz.C) && this.dL().b_($$1).a() == ean.c) {
                           this.g = this.g.a(dfz.C, Boolean.valueOf(true));
                        }

                        if (this.dL().a($$1, this.g, 3)) {
                           ((akr)this.dL()).k().a.a(this, new xg($$1, this.dL().a_($$1)));
                           this.al();
                           if ($$0 instanceof cvm) {
                              ((cvm)$$0).a(this.dL(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dcv $$10 = this.dL().c_($$1);
                              if ($$10 != null) {
                                 qx $$11 = $$10.o();

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
                        } else if (this.c && this.dL().X().b(cpr.h)) {
                           this.al();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.al();
                        if (this.c && this.dL().X().b(cpr.h)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.al();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dL().B && (this.b > 100 && ($$1.v() <= this.dL().H_() || $$1.v() > this.dL().aj()) || this.b > 600)) {
               if (this.c && this.dL().X().b(cpr.h)) {
                  this.a($$0);
               }

               this.al();
            }
         }

         this.f(this.do().a(0.98));
      }
   }

   public void a(csv $$0, gw $$1) {
      if ($$0 instanceof cvm) {
         ((cvm)$$0).a(this.dL(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bho $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = arx.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<biq> $$4 = bit.e.and(bit.b);
            bho $$6 = this.g.b() instanceof cvm $$5 ? $$5.a(this) : this.dM().a(this);
            float $$7 = (float)Math.min(arx.d((float)$$3 * this.k), this.j);
            this.dL().a(this, this.cH(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(apt.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               dfj $$9 = crw.e(this.g);
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
   protected void b(qx $$0) {
      $$0.a("BlockState", rj.a(this.g));
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
   protected void a(qx $$0) {
      this.g = rj.a(this.dL().a(je.e), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(apt.M)) {
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
         this.g = csw.I.n();
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

   public dfj t() {
      return this.g;
   }

   @Override
   protected tl co() {
      return tl.a("entity.minecraft.falling_block_type", this.g.b().e());
   }

   @Override
   public boolean cN() {
      return true;
   }

   @Override
   public vd<ww> V() {
      return new wx(this, csv.i(this.t()));
   }

   @Override
   public void a(wx $$0) {
      super.a($$0);
      this.g = csv.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.e($$1, $$2, $$3);
      this.a(this.dl());
   }
}
