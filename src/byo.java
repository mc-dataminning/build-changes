import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class byo extends bis {
   private static final Logger f = LogUtils.getLogger();
   private dfl g = csy.I.n();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public qy d;
   protected static final aeg<gw> e = aej.a(byo.class, aei.n);

   public byo(biw<? extends byo> $$0, cpx $$1) {
      super($$0, $$1);
   }

   private byo(cpx $$0, double $$1, double $$2, double $$3, dfl $$4) {
      this(biw.L, $$0);
      this.g = $$4;
      this.I = true;
      this.e($$1, $$2, $$3);
      this.f(ehp.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dl());
   }

   public static byo a(cpx $$0, gw $$1, dfl $$2) {
      byo $$3 = new byo($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dgb.C) ? $$2.a(dgb.C, Boolean.valueOf(false)) : $$2);
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

   public gw q() {
      return this.an.b(e);
   }

   @Override
   protected bis.b aU() {
      return bis.b.a;
   }

   @Override
   protected void a_() {
      this.an.a(e, gw.b);
   }

   @Override
   public boolean br() {
      return !this.dG();
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.ak();
      } else {
         csx $$0 = this.g.b();
         this.b++;
         if (!this.aT()) {
            this.f(this.do().b(0.0, -0.04, 0.0));
         }

         this.a(bjo.a, this.do());
         if (!this.dL().B) {
            gw $$1 = this.dl();
            boolean $$2 = this.g.b() instanceof cuh;
            boolean $$3 = $$2 && this.dL().b_($$1).a(apz.a);
            double $$4 = this.do().g();
            if ($$2 && $$4 > 1.0) {
               ehl $$5 = this.dL().a(new cpg(new ehp(this.K, this.L, this.M), this.dj(), cpg.a.a, cpg.b.b, this));
               if ($$5.c() != ehn.a.a && this.dL().b_($$5.a()).a(apz.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aA() || $$3) {
               dfl $$6 = this.dL().a_($$1);
               this.f(this.do().d(0.7, -0.5, 0.7));
               if (!$$6.a(csy.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new clq(this.dL(), $$1, hc.a, cjh.b, hc.b));
                     boolean $$8 = cvp.h(this.dL().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cqa)this.dL(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dgb.C) && this.dL().b_($$1).a() == eap.c) {
                           this.g = this.g.a(dgb.C, Boolean.valueOf(true));
                        }

                        if (this.dL().a($$1, this.g, 3)) {
                           ((aks)this.dL()).k().a.a(this, new xh($$1, this.dL().a_($$1)));
                           this.ak();
                           if ($$0 instanceof cvo) {
                              ((cvo)$$0).a(this.dL(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dcx $$10 = this.dL().c_($$1);
                              if ($$10 != null) {
                                 qy $$11 = $$10.o();

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
                        } else if (this.c && this.dL().X().b(cpt.h)) {
                           this.ak();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ak();
                        if (this.c && this.dL().X().b(cpt.h)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.ak();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dL().B && (this.b > 100 && ($$1.v() <= this.dL().H_() || $$1.v() > this.dL().aj()) || this.b > 600)) {
               if (this.c && this.dL().X().b(cpt.h)) {
                  this.a($$0);
               }

               this.ak();
            }
         }

         this.f(this.do().a(0.98));
      }
   }

   public void a(csx $$0, gw $$1) {
      if ($$0 instanceof cvo) {
         ((cvo)$$0).a(this.dL(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhq $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = ary.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bis> $$4 = biv.e.and(biv.b);
            bhq $$6 = this.g.b() instanceof cvo $$5 ? $$5.a(this) : this.dM().a(this);
            float $$7 = (float)Math.min(ary.d((float)$$3 * this.k), this.j);
            this.dL().a(this, this.cG(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(apu.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               dfl $$9 = cry.e(this.g);
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
   protected void b(qy $$0) {
      $$0.a("BlockState", rl.a(this.g));
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
   protected void a(qy $$0) {
      this.g = rl.a(this.dL().a(je.e), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(apu.M)) {
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
         this.g = csy.I.n();
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
   public boolean cu() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public dfl t() {
      return this.g;
   }

   @Override
   protected tn cn() {
      return tn.a("entity.minecraft.falling_block_type", this.g.b().e());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public vf<wy> di() {
      return new wz(this, csx.i(this.t()));
   }

   @Override
   public void a(wz $$0) {
      super.a($$0);
      this.g = csx.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.e($$1, $$2, $$3);
      this.a(this.dl());
   }
}
