import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class byh extends bil {
   private static final Logger f = LogUtils.getLogger();
   private dfe g = csr.I.n();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public qu d;
   protected static final aec<gw> e = aef.a(byh.class, aee.n);

   public byh(bip<? extends byh> $$0, cpq $$1) {
      super($$0, $$1);
   }

   private byh(cpq $$0, double $$1, double $$2, double $$3, dfe $$4) {
      this(bip.L, $$0);
      this.g = $$4;
      this.I = true;
      this.e($$1, $$2, $$3);
      this.f(ehi.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dk());
   }

   public static byh a(cpq $$0, gw $$1, dfe $$2) {
      byh $$3 = new byh($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dfu.C) ? $$2.a(dfu.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cp() {
      return false;
   }

   public void a(gw $$0) {
      this.an.b(e, $$0);
   }

   public gw j() {
      return this.an.b(e);
   }

   @Override
   protected bil.b aU() {
      return bil.b.a;
   }

   @Override
   protected void a_() {
      this.an.a(e, gw.b);
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
         csq $$0 = this.g.b();
         this.b++;
         if (!this.aT()) {
            this.f(this.dn().b(0.0, -0.04, 0.0));
         }

         this.a(bjh.a, this.dn());
         if (!this.dK().B) {
            gw $$1 = this.dk();
            boolean $$2 = this.g.b() instanceof cua;
            boolean $$3 = $$2 && this.dK().b_($$1).a(apt.a);
            double $$4 = this.dn().g();
            if ($$2 && $$4 > 1.0) {
               ehe $$5 = this.dK().a(new coz(new ehi(this.K, this.L, this.M), this.di(), coz.a.a, coz.b.b, this));
               if ($$5.c() != ehg.a.a && this.dK().b_($$5.a()).a(apt.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aA() || $$3) {
               dfe $$6 = this.dK().a_($$1);
               this.f(this.dn().d(0.7, -0.5, 0.7));
               if (!$$6.a(csr.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new clj(this.dK(), $$1, hc.a, cja.b, hc.b));
                     boolean $$8 = cvi.h(this.dK().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cpt)this.dK(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dfu.C) && this.dK().b_($$1).a() == eai.c) {
                           this.g = this.g.a(dfu.C, Boolean.valueOf(true));
                        }

                        if (this.dK().a($$1, this.g, 3)) {
                           ((akn)this.dK()).k().a.a(this, new xc($$1, this.dK().a_($$1)));
                           this.ak();
                           if ($$0 instanceof cvh) {
                              ((cvh)$$0).a(this.dK(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dcq $$10 = this.dK().c_($$1);
                              if ($$10 != null) {
                                 qu $$11 = $$10.o();

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
                        } else if (this.c && this.dK().X().b(cpm.h)) {
                           this.ak();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ak();
                        if (this.c && this.dK().X().b(cpm.h)) {
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
               if (this.c && this.dK().X().b(cpm.h)) {
                  this.a($$0);
               }

               this.ak();
            }
         }

         this.f(this.dn().a(0.98));
      }
   }

   public void a(csq $$0, gw $$1) {
      if ($$0 instanceof cvh) {
         ((cvh)$$0).a(this.dK(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhj $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = ars.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bil> $$4 = bio.e.and(bio.b);
            bhj $$6 = this.g.b() instanceof cvh $$5 ? $$5.a(this) : this.dL().a(this);
            float $$7 = (float)Math.min(ars.d((float)$$3 * this.k), this.j);
            this.dK().a(this, this.cG(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(apo.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               dfe $$9 = crr.e(this.g);
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
   protected void b(qu $$0) {
      $$0.a("BlockState", rg.a(this.g));
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
   protected void a(qu $$0) {
      this.g = rg.a(this.dK().a(je.e), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(apo.M)) {
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
         this.g = csr.I.n();
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

   public dfe o() {
      return this.g;
   }

   @Override
   protected ti cn() {
      return ti.a("entity.minecraft.falling_block_type", this.g.b().e());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public va<ws> U() {
      return new wt(this, csq.i(this.o()));
   }

   @Override
   public void a(wt $$0) {
      super.a($$0);
      this.g = csq.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.e($$1, $$2, $$3);
      this.a(this.dk());
   }
}
