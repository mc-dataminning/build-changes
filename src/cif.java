import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cif extends bru {
   private static final Logger f = LogUtils.getLogger();
   private drb g = dea.I.n();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public ud d;
   protected static final ajr<io> e = ajv.a(cif.class, ajt.o);

   public cif(bsa<? extends cif> $$0, dax $$1) {
      super($$0, $$1);
   }

   private cif(dax $$0, double $$1, double $$2, double $$3, drb $$4) {
      this(bsa.O, $$0);
      this.g = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.g(euk.b);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.dp());
   }

   public static cif a(dax $$0, io $$1, drb $$2) {
      cif $$3 = new cif($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(drr.C) ? $$2.a(drr.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean ct() {
      return false;
   }

   public void a(io $$0) {
      this.ao.a(e, $$0);
   }

   public io p() {
      return this.ao.a(e);
   }

   @Override
   protected bru.b bb() {
      return bru.b.a;
   }

   @Override
   protected void a(ajv.a $$0) {
      $$0.a(e, io.c);
   }

   @Override
   public boolean bz() {
      return !this.dK();
   }

   @Override
   protected double aY() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.g.i()) {
         this.ao();
      } else {
         ddy $$0 = this.g.b();
         this.b++;
         this.ba();
         this.a(bst.a, this.ds());
         if (!this.dP().B) {
            io $$1 = this.dp();
            boolean $$2 = this.g.b() instanceof dfk;
            boolean $$3 = $$2 && this.dP().b_($$1).a(awb.a);
            double $$4 = this.ds().g();
            if ($$2 && $$4 > 1.0) {
               eug $$5 = this.dP().a(new dag(new euk(this.L, this.M, this.N), this.dn(), dag.a.a, dag.b.b, this));
               if ($$5.c() != eui.a.a && this.dP().b_($$5.a()).a(awb.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aE() || $$3) {
               drb $$6 = this.dP().a_($$1);
               this.g(this.ds().d(0.7, -0.5, 0.7));
               if (!$$6.a(dea.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cxa(this.dP(), $$1, it.a, cto.i, it.b));
                     boolean $$8 = dgu.m(this.dP().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((dba)this.dP(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(drr.C) && this.dP().b_($$1).a() == emv.c) {
                           this.g = this.g.a(drr.C, Boolean.valueOf(true));
                        }

                        if (this.dP().a($$1, this.g, 3)) {
                           ((aqm)this.dP()).l().a.a(this, new abz($$1, this.dP().a_($$1)));
                           this.ao();
                           if ($$0 instanceof dgt) {
                              ((dgt)$$0).a(this.dP(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dog $$10 = this.dP().c_($$1);
                              if ($$10 != null) {
                                 ud $$11 = $$10.d(this.dP().H_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.c($$11, this.dP().H_());
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dP().aa().b(dat.i)) {
                           this.ao();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ao();
                        if (this.c && this.dP().aa().b(dat.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.ao();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dP().B && (this.b > 100 && ($$1.v() <= this.dP().I_() || $$1.v() > this.dP().al()) || this.b > 600)) {
               if (this.c && this.dP().aa().b(dat.i)) {
                  this.a($$0);
               }

               this.ao();
            }
         }

         this.g(this.ds().a(0.98));
      }
   }

   public void a(ddy $$0, io $$1) {
      if ($$0 instanceof dgt) {
         ((dgt)$$0).a(this.dP(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bqn $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = ayd.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bru> $$4 = brz.e.and(brz.b);
            bqn $$6 = this.g.b() instanceof dgt $$5 ? $$5.a(this) : this.dQ().a(this);
            float $$7 = (float)Math.min(ayd.d((float)$$3 * this.k), this.j);
            this.dP().a(this, this.cK(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(avw.M);
            if ($$8 && $$7 > 0.0F && this.ah.i() < 0.05F + (float)$$3 * 0.05F) {
               drb $$9 = dcy.e(this.g);
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
   protected void b(ud $$0) {
      $$0.a("BlockState", us.a(this.g));
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
   protected void a(ud $$0) {
      this.g = us.a(this.dP().a(lf.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(avw.M)) {
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
         this.g = dea.I.n();
      }
   }

   public void b(float $$0, int $$1) {
      this.i = true;
      this.k = $$0;
      this.j = $$1;
   }

   public void s() {
      this.h = true;
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.g.toString());
   }

   public drb u() {
      return this.g;
   }

   @Override
   protected wx cr() {
      return wx.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cP() {
      return true;
   }

   @Override
   public ze<abq> dl() {
      return new abr(this, ddy.i(this.u()));
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      this.g = ddy.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dp());
   }
}
