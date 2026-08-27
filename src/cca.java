import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cca extends blw {
   private static final Logger f = LogUtils.getLogger();
   private djp g = cxa.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public so d;
   protected static final agn<hx> e = agq.a(cca.class, agp.n);

   public cca(bmc<? extends cca> $$0, ctx $$1) {
      super($$0, $$1);
   }

   private cca(ctx $$0, double $$1, double $$2, double $$3, djp $$4) {
      this(bmc.N, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.g(emc.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dl());
   }

   public static cca a(ctx $$0, hx $$1, djp $$2) {
      cca $$3 = new cca($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dkf.C) ? $$2.a(dkf.C, Boolean.valueOf(false)) : $$2);
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
   protected blw.b aW() {
      return blw.b.a;
   }

   @Override
   protected void c_() {
      this.an.a(e, hx.b);
   }

   @Override
   public boolean bt() {
      return !this.dG();
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.am();
      } else {
         cwy $$0 = this.g.b();
         this.b++;
         if (!this.aV()) {
            this.g(this.do().b(0.0, -0.04, 0.0));
         }

         this.a(bmu.a, this.do());
         if (!this.dL().B) {
            hx $$1 = this.dl();
            boolean $$2 = this.g.b() instanceof cyk;
            boolean $$3 = $$2 && this.dL().b_($$1).a(asn.a);
            double $$4 = this.do().g();
            if ($$2 && $$4 > 1.0) {
               ely $$5 = this.dL().a(new ctg(new emc(this.K, this.L, this.M), this.dj(), ctg.a.a, ctg.b.b, this));
               if ($$5.c() != ema.a.a && this.dL().b_($$5.a()).a(asn.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aC() || $$3) {
               djp $$6 = this.dL().a_($$1);
               this.g(this.do().d(0.7, -0.5, 0.7));
               if (!$$6.a(cxa.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cpq(this.dL(), $$1, ic.a, cng.f, ic.b));
                     boolean $$8 = czu.h(this.dL().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cua)this.dL(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dkf.C) && this.dL().b_($$1).a() == efa.c) {
                           this.g = this.g.a(dkf.C, Boolean.valueOf(true));
                        }

                        if (this.dL().a($$1, this.g, 3)) {
                           ((ane)this.dL()).l().a.a(this, new zk($$1, this.dL().a_($$1)));
                           this.am();
                           if ($$0 instanceof czt) {
                              ((czt)$$0).a(this.dL(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dhd $$10 = this.dL().c_($$1);
                              if ($$10 != null) {
                                 so $$11 = $$10.q();

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
                        } else if (this.c && this.dL().Z().b(ctt.i)) {
                           this.am();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.am();
                        if (this.c && this.dL().Z().b(ctt.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.am();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dL().B && (this.b > 100 && ($$1.v() <= this.dL().J_() || $$1.v() > this.dL().al()) || this.b > 600)) {
               if (this.c && this.dL().Z().b(ctt.i)) {
                  this.a($$0);
               }

               this.am();
            }
         }

         this.g(this.do().a(0.98));
      }
   }

   public void a(cwy $$0, hx $$1) {
      if ($$0 instanceof czt) {
         ((czt)$$0).a(this.dL(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bkv $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = aup.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<blw> $$4 = bmb.e.and(bmb.b);
            bkv $$6 = this.g.b() instanceof czt $$5 ? $$5.a(this) : this.dM().a(this);
            float $$7 = (float)Math.min(aup.d((float)$$3 * this.k), this.j);
            this.dL().a(this, this.cH(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(asi.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               djp $$9 = cvy.e(this.g);
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
   protected void b(so $$0) {
      $$0.a("BlockState", td.a(this.g));
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
   protected void a(so $$0) {
      this.g = td.a(this.dL().a(ke.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(asi.M)) {
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
         this.g = cxa.I.o();
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

   public djp u() {
      return this.g;
   }

   @Override
   protected vg co() {
      return vg.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public xg<zb> di() {
      return new zc(this, cwy.i(this.u()));
   }

   @Override
   public void a(zc $$0) {
      super.a($$0);
      this.g = cwy.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.a_($$1, $$2, $$3);
      this.a(this.dl());
   }
}
