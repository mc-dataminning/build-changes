import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bys extends biw {
   private static final Logger f = LogUtils.getLogger();
   private dfd g = cte.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public qw d;
   protected static final aef<gw> e = aei.a(bys.class, aeh.n);

   public bys(bja<? extends bys> $$0, cqb $$1) {
      super($$0, $$1);
   }

   private bys(cqb $$0, double $$1, double $$2, double $$3, dfd $$4) {
      this(bja.L, $$0);
      this.g = $$4;
      this.I = true;
      this.e($$1, $$2, $$3);
      this.f(ehh.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dl());
   }

   public static bys a(cqb $$0, gw $$1, dfd $$2) {
      bys $$3 = new bys($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dft.C) ? $$2.a(dft.C, Boolean.valueOf(false)) : $$2);
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
   protected biw.b aU() {
      return biw.b.a;
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
         ctc $$0 = this.g.b();
         this.b++;
         if (!this.aT()) {
            this.f(this.do().b(0.0, -0.04, 0.0));
         }

         this.a(bjs.a, this.do());
         if (!this.dL().B) {
            gw $$1 = this.dl();
            boolean $$2 = this.g.b() instanceof cuo;
            boolean $$3 = $$2 && this.dL().b_($$1).a(aqa.a);
            double $$4 = this.do().g();
            if ($$2 && $$4 > 1.0) {
               ehd $$5 = this.dL().a(new cpk(new ehh(this.K, this.L, this.M), this.dj(), cpk.a.a, cpk.b.b, this));
               if ($$5.c() != ehf.a.a && this.dL().b_($$5.a()).a(aqa.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aA() || $$3) {
               dfd $$6 = this.dL().a_($$1);
               this.f(this.do().d(0.7, -0.5, 0.7));
               if (!$$6.a(cte.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new clu(this.dL(), $$1, ha.a, cjl.b, ha.b));
                     boolean $$8 = cvw.h(this.dL().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cqe)this.dL(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dft.C) && this.dL().b_($$1).a() == eah.c) {
                           this.g = this.g.a(dft.C, Boolean.valueOf(true));
                        }

                        if (this.dL().a($$1, this.g, 3)) {
                           ((akt)this.dL()).k().a.a(this, new xg($$1, this.dL().a_($$1)));
                           this.ak();
                           if ($$0 instanceof cvv) {
                              ((cvv)$$0).a(this.dL(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dcz $$10 = this.dL().c_($$1);
                              if ($$10 != null) {
                                 qw $$11 = $$10.o();

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
                        } else if (this.c && this.dL().X().b(cpx.h)) {
                           this.ak();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ak();
                        if (this.c && this.dL().X().b(cpx.h)) {
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
               if (this.c && this.dL().X().b(cpx.h)) {
                  this.a($$0);
               }

               this.ak();
            }
         }

         this.f(this.do().a(0.98));
      }
   }

   public void a(ctc $$0, gw $$1) {
      if ($$0 instanceof cvv) {
         ((cvv)$$0).a(this.dL(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhu $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = asb.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<biw> $$4 = biz.e.and(biz.b);
            bhu $$6 = this.g.b() instanceof cvv $$5 ? $$5.a(this) : this.dM().a(this);
            float $$7 = (float)Math.min(asb.d((float)$$3 * this.k), this.j);
            this.dL().a(this, this.cG(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(apv.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               dfd $$9 = csc.e(this.g);
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
   protected void b(qw $$0) {
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
   protected void a(qw $$0) {
      this.g = rj.a(this.dL().a(jc.e), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(apv.M)) {
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
         this.g = cte.I.o();
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

   public dfd t() {
      return this.g;
   }

   @Override
   protected tl cn() {
      return tl.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public ve<wx> di() {
      return new wy(this, ctc.i(this.t()));
   }

   @Override
   public void a(wy $$0) {
      super.a($$0);
      this.g = ctc.a($$0.o());
      this.I = true;
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      this.e($$1, $$2, $$3);
      this.a(this.dl());
   }
}
