import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cbn extends blp {
   private static final Logger f = LogUtils.getLogger();
   private dja g = cwl.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public sl d;
   protected static final agj<hx> e = agm.a(cbn.class, agl.n);

   public cbn(blt<? extends cbn> $$0, cti $$1) {
      super($$0, $$1);
   }

   private cbn(cti $$0, double $$1, double $$2, double $$3, dja $$4) {
      this(blt.M, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.g(elm.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dm());
   }

   public static cbn a(cti $$0, hx $$1, dja $$2) {
      cbn $$3 = new cbn($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(djq.C) ? $$2.a(djq.C, Boolean.valueOf(false)) : $$2);
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
   protected blp.b aW() {
      return blp.b.a;
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
         cwj $$0 = this.g.b();
         this.b++;
         if (!this.aV()) {
            this.g(this.dp().b(0.0, -0.04, 0.0));
         }

         this.a(bml.a, this.dp());
         if (!this.dM().B) {
            hx $$1 = this.dm();
            boolean $$2 = this.g.b() instanceof cxv;
            boolean $$3 = $$2 && this.dM().b_($$1).a(asg.a);
            double $$4 = this.dp().g();
            if ($$2 && $$4 > 1.0) {
               eli $$5 = this.dM().a(new csr(new elm(this.K, this.L, this.M), this.dk(), csr.a.a, csr.b.b, this));
               if ($$5.c() != elk.a.a && this.dM().b_($$5.a()).a(asg.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aC() || $$3) {
               dja $$6 = this.dM().a_($$1);
               this.g(this.dp().d(0.7, -0.5, 0.7));
               if (!$$6.a(cwl.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cpb(this.dM(), $$1, ic.a, cmr.f, ic.b));
                     boolean $$8 = czf.h(this.dM().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((ctl)this.dM(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(djq.C) && this.dM().b_($$1).a() == eel.c) {
                           this.g = this.g.a(djq.C, Boolean.valueOf(true));
                        }

                        if (this.dM().a($$1, this.g, 3)) {
                           ((amz)this.dM()).l().a.a(this, new zg($$1, this.dM().a_($$1)));
                           this.am();
                           if ($$0 instanceof cze) {
                              ((cze)$$0).a(this.dM(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dgo $$10 = this.dM().c_($$1);
                              if ($$10 != null) {
                                 sl $$11 = $$10.q();

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
                        } else if (this.c && this.dM().Z().b(cte.i)) {
                           this.am();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.am();
                        if (this.c && this.dM().Z().b(cte.i)) {
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
               if (this.c && this.dM().Z().b(cte.i)) {
                  this.a($$0);
               }

               this.am();
            }
         }

         this.g(this.dp().a(0.98));
      }
   }

   public void a(cwj $$0, hx $$1) {
      if ($$0 instanceof cze) {
         ((cze)$$0).a(this.dM(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bkn $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = aui.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<blp> $$4 = bls.e.and(bls.b);
            bkn $$6 = this.g.b() instanceof cze $$5 ? $$5.a(this) : this.dN().a(this);
            float $$7 = (float)Math.min(aui.d((float)$$3 * this.k), this.j);
            this.dM().a(this, this.cH(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(asb.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               dja $$9 = cvj.e(this.g);
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
   protected void b(sl $$0) {
      $$0.a("BlockState", ta.a(this.g));
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
   protected void a(sl $$0) {
      this.g = ta.a(this.dM().a(ke.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(asb.M)) {
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
         this.g = cwl.I.o();
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

   public dja u() {
      return this.g;
   }

   @Override
   protected vd co() {
      return vd.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public xd<yx> dj() {
      return new yy(this, cwj.i(this.u()));
   }

   @Override
   public void a(yy $$0) {
      super.a($$0);
      this.g = cwj.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.a_($$1, $$2, $$3);
      this.a(this.dm());
   }
}
