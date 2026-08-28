import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cji extends bsw {
   private static final Logger f = LogUtils.getLogger();
   private dse g = dfd.I.o();
   public int b;
   public boolean c = true;
   private boolean h;
   private boolean i;
   private int j = 40;
   private float k;
   @Nullable
   public us d;
   protected static final akk<iz> e = ako.a(cji.class, akm.o);

   public cji(btc<? extends cji> $$0, dca $$1) {
      super($$0, $$1);
   }

   private cji(dca $$0, double $$1, double $$2, double $$3, dse $$4) {
      this(btc.O, $$0);
      this.g = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.h(evt.b);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.dp());
   }

   public static cji a(dca $$0, iz $$1, dse $$2) {
      cji $$3 = new cji($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dsu.C) ? $$2.a(dsu.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.u().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean ct() {
      return false;
   }

   public void a(iz $$0) {
      this.ao.a(e, $$0);
   }

   public iz p() {
      return this.ao.a(e);
   }

   @Override
   protected bsw.b bb() {
      return bsw.b.a;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(e, iz.c);
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
         dfb $$0 = this.g.b();
         this.b++;
         this.ba();
         this.a(btw.a, this.ds());
         if (!this.dP().B) {
            iz $$1 = this.dp();
            boolean $$2 = this.g.b() instanceof dgn;
            boolean $$3 = $$2 && this.dP().b_($$1).a(awv.a);
            double $$4 = this.ds().g();
            if ($$2 && $$4 > 1.0) {
               evp $$5 = this.dP().a(new dbj(new evt(this.L, this.M, this.N), this.dn(), dbj.a.a, dbj.b.b, this));
               if ($$5.c() != evr.a.a && this.dP().b_($$5.a()).a(awv.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.aE() || $$3) {
               dse $$6 = this.dP().a_($$1);
               this.h(this.ds().d(0.7, -0.5, 0.7));
               if (!$$6.a(dfd.bQ)) {
                  if (!this.h) {
                     boolean $$7 = $$6.a(new cyd(this.dP(), $$1, je.a, cur.l, je.b));
                     boolean $$8 = dhx.m(this.dP().a_($$1.d())) && (!$$2 || !$$3);
                     boolean $$9 = this.g.a((dcd)this.dP(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.g.b(dsu.C) && this.dP().b_($$1).a() == eny.c) {
                           this.g = this.g.a(dsu.C, Boolean.valueOf(true));
                        }

                        if (this.dP().a($$1, this.g, 3)) {
                           ((arf)this.dP()).l().a.a(this, new acr($$1, this.dP().a_($$1)));
                           this.ao();
                           if ($$0 instanceof dhw) {
                              ((dhw)$$0).a(this.dP(), $$1, this.g, $$6, this);
                           }

                           if (this.d != null && this.g.t()) {
                              dpj $$10 = this.dP().c_($$1);
                              if ($$10 != null) {
                                 us $$11 = $$10.d(this.dP().H_());

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
                        } else if (this.c && this.dP().ab().b(dbw.i)) {
                           this.ao();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ao();
                        if (this.c && this.dP().ab().b(dbw.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.ao();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dP().B && (this.b > 100 && ($$1.v() <= this.dP().I_() || $$1.v() > this.dP().am()) || this.b > 600)) {
               if (this.c && this.dP().ab().b(dbw.i)) {
                  this.a($$0);
               }

               this.ao();
            }
         }

         this.h(this.ds().a(0.98));
      }
   }

   public void a(dfb $$0, iz $$1) {
      if ($$0 instanceof dhw) {
         ((dhw)$$0).a(this.dP(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, brp $$2) {
      if (!this.i) {
         return false;
      } else {
         int $$3 = ayz.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bsw> $$4 = btb.e.and(btb.b);
            brp $$6 = this.g.b() instanceof dhw $$5 ? $$5.a(this) : this.dQ().a(this);
            float $$7 = (float)Math.min(ayz.d((float)$$3 * this.k), this.j);
            this.dP().a(this, this.cK(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.g.a(awp.M);
            if ($$8 && $$7 > 0.0F && this.ah.i() < 0.05F + (float)$$3 * 0.05F) {
               dse $$9 = deb.e(this.g);
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
   protected void b(us $$0) {
      $$0.a("BlockState", vh.a(this.g));
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
   protected void a(us $$0) {
      this.g = vh.a(this.dP().a(lq.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.i = $$0.q("HurtEntities");
         this.k = $$0.j("FallHurtAmount");
         this.j = $$0.h("FallHurtMax");
      } else if (this.g.a(awp.M)) {
         this.i = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.c = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.d = $$0.p("TileEntityData").i();
      }

      this.h = $$0.q("CancelDrop");
      if (this.g.i()) {
         this.g = dfd.I.o();
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

   public dse u() {
      return this.g;
   }

   @Override
   protected xp cr() {
      return xp.a("entity.minecraft.falling_block_type", this.g.b().f());
   }

   @Override
   public boolean cP() {
      return true;
   }

   @Override
   public zw<aci> dl() {
      return new acj(this, dfb.i(this.u()));
   }

   @Override
   public void a(acj $$0) {
      super.a($$0);
      this.g = dfb.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dp());
   }
}
