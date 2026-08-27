import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfd extends box {
   private static final Logger f = LogUtils.getLogger();
   private dnb g = dae.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public ta d;
   protected static final aim<ib> e = aiq.a(cfd.class, aio.n);

   public cfd(bpd<? extends cfd> $$0, cxb $$1) {
      super($$0, $$1);
   }

   private cfd(cxb $$0, double $$1, double $$2, double $$3, dnb $$4) {
      this(bpd.P, $$0);
      this.g = $$4;
      this.I = true;
      this.a_($$1, $$2, $$3);
      this.g(ept.b);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.a(this.dm());
   }

   public static cfd a(cxb $$0, ib $$1, dnb $$2) {
      cfd $$3 = new cfd($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dnr.C) ? $$2.a(dnr.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cq() {
      return false;
   }

   public void a(ib $$0) {
      this.an.a(e, $$0);
   }

   public ib p() {
      return this.an.a(e);
   }

   @Override
   protected box.b aZ() {
      return box.b.a;
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(e, ib.c);
   }

   @Override
   public boolean bw() {
      return !this.dH();
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.am();
      } else {
         dac $$0 = this.g.b();
         this.b++;
         this.aY();
         this.a(bpu.a, this.dp());
         if (!this.dM().B) {
            ib $$1 = this.dm();
            boolean $$2 = this.g.b() instanceof dbo;
            boolean $$3 = $$2 && this.dM().b_($$1).a(aus.a);
            double $$4 = this.dp().g();
            if ($$2 && $$4 > 1.0) {
               epp $$5 = this.dM().a(new cwk(new ept(this.K, this.L, this.M), this.dk(), cwk.a.a, cwk.b.b, this));
               if ($$5.c() != epr.a.a && this.dM().b_($$5.a()).a(aus.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aC() || $$3) {
               dnb $$6 = this.dM().a_($$1);
               this.g(this.dp().d(0.7, -0.5, 0.7));
               if (!$$6.a(dae.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new csv(this.dM(), $$1, ih.a, cqm.h, ih.b));
                     boolean $$8 = dcy.m(this.dM().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((cxe)this.dM(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dnr.C) && this.dM().b_($$1).a() == eiq.c) {
                           this.g = this.g.a(dnr.C, Boolean.valueOf(true));
                        }

                        if (this.dM().a($$1, this.g, 3)) {
                           ((apf)this.dM()).l().a.a(this, new aav($$1, this.dM().a_($$1)));
                           this.am();
                           if ($$0 instanceof dcx) {
                              ((dcx)$$0).a(this.dM(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dki $$10 = this.dM().c_($$1);
                              if ($$10 != null) {
                                 ta $$11 = $$10.d(this.dM().H_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.a($$11, this.dM().H_());
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dM().Z().b(cwx.i)) {
                           this.am();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.am();
                        if (this.c && this.dM().Z().b(cwx.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.am();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dM().B && (this.b > 100 && ($$1.v() <= this.dM().I_() || $$1.v() > this.dM().ak()) || this.b > 600)) {
               if (this.c && this.dM().Z().b(cwx.i)) {
                  this.a($$0);
               }

               this.am();
            }
         }

         this.g(this.dp().a(0.98));
      }
   }

   public void a(dac $$0, ib $$1) {
      if ($$0 instanceof dcx) {
         ((dcx)$$0).a(this.dM(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bnw $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = aww.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<box> $$4 = bpc.e.and(bpc.b);
            bnw $$6 = this.g.b() instanceof dcx $$5 ? $$5.a(this) : this.dN().a(this);
            float $$7 = (float)Math.min(aww.d((float)$$3 * this.k), this.j);
            this.dM().a(this, this.cH(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(aun.M);
            if ($$8 && $$7 > 0.0F && this.ag.i() < 0.05F + (float)$$3 * 0.05F) {
               dnb $$9 = czc.e(this.g);
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
   protected void b(ta $$0) {
      $$0.a("BlockState", tp.a(this.g));
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
   protected void a(ta $$0) {
      this.g = tp.a(this.dM().a(kj.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(aun.M)) {
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
         this.g = dae.I.o();
      }
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   @Override
   public void r() {
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

   public dnb s() {
      return this.g;
   }

   @Override
   protected vu co() {
      return vu.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   public yb<aam> di() {
      return new aan(this, dac.i(this.s()));
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      this.g = dac.a($$0.p());
      this.I = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dm());
   }
}
