import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckp extends btz {
   private static final Logger g = LogUtils.getLogger();
   private dvd h = dia.I.m();
   public int b;
   public boolean c = true;
   private boolean i;
   private boolean j;
   private int k = 40;
   private float l;
   @Nullable
   public uj d;
   public boolean e;
   protected static final akk<jg> f = ako.a(ckp.class, akm.o);

   public ckp(bug<? extends ckp> $$0, dev $$1) {
      super($$0, $$1);
   }

   private ckp(dev $$0, double $$1, double $$2, double $$3, dvd $$4) {
      this(bug.O, $$0);
      this.h = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.h(ezh.c);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.dx());
   }

   public static ckp a(dev $$0, jg $$1, dvd $$2) {
      ckp $$3 = new ckp($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dvt.C) ? $$2.b(dvt.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cC() {
      return false;
   }

   public void a(jg $$0) {
      this.am.a(f, $$0);
   }

   public jg m() {
      return this.am.a(f);
   }

   @Override
   protected btz.b bh() {
      return btz.b.a;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(f, jg.c);
   }

   @Override
   public boolean bI() {
      return !this.dS();
   }

   @Override
   protected double be() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.h.l()) {
         this.au();
      } else {
         dhy $$0 = this.h.b();
         this.b++;
         this.bg();
         this.a(buz.a, this.dA());
         this.aK();
         this.bX();
         if (!this.dX().C && (this.bM() || this.e)) {
            jg $$1 = this.dx();
            boolean $$2 = this.h.b() instanceof djk;
            boolean $$3 = $$2 && this.dX().b_($$1).a(axf.a);
            double $$4 = this.dA().h();
            if ($$2 && $$4 > 1.0) {
               ezd $$5 = this.dX().a(new ded(new ezh(this.L, this.M, this.N), this.dv(), ded.a.a, ded.b.b, this));
               if ($$5.d() != ezf.a.a && this.dX().b_($$5.b()).a(axf.a)) {
                  $$1 = $$5.b();
                  $$3 = true;
               }
            }

            if (this.aJ() || $$3) {
               dvd $$6 = this.dX().a_($$1);
               this.h(this.dA().d(0.7, -0.5, 0.7));
               if (!$$6.a(dia.bQ)) {
                  if (!this.i) {
                     boolean $$7 = $$6.a(new czn(this.dX(), $$1, jl.a, cvx.k, jl.b));
                     boolean $$8 = dkt.n(this.dX().a_($$1.e())) && (!$$2 || !$$3);
                     boolean $$9 = this.h.a((dey)this.dX(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.h.b(dvt.C) && this.dX().b_($$1).a() == erf.c) {
                           this.h = this.h.b(dvt.C, Boolean.valueOf(true));
                        }

                        if (this.dX().a($$1, this.h, 3)) {
                           ((arm)this.dX()).l().a.a(this, new acm($$1, this.dX().a_($$1)));
                           this.au();
                           if ($$0 instanceof dks) {
                              ((dks)$$0).a(this.dX(), $$1, this.h, $$6, this);
                           }

                           if (this.d != null && this.h.x()) {
                              dsg $$10 = this.dX().c_($$1);
                              if ($$10 != null) {
                                 uj $$11 = $$10.d(this.dX().H_());

                                 for (String $$12 : this.d.e()) {
                                    $$11.a($$12, this.d.c($$12).d());
                                 }

                                 try {
                                    $$10.c($$11, this.dX().H_());
                                 } catch (Exception var15) {
                                    g.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.dX().ac().b(der.i)) {
                           this.au();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.au();
                        if (this.c && this.dX().ac().b(der.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.au();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dX().C && (this.b > 100 && ($$1.v() <= this.dX().I_() || $$1.v() > this.dX().an()) || this.b > 600)) {
               if (this.c && this.dX().ac().b(der.i)) {
                  this.a($$0);
               }

               this.au();
            }
         }

         this.h(this.dA().c(0.98));
      }
   }

   public void a(dhy $$0, jg $$1) {
      if ($$0 instanceof dks) {
         ((dks)$$0).a(this.dX(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsp $$2) {
      if (!this.j) {
         return false;
      } else {
         int $$3 = azj.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<btz> $$4 = bue.e.and(bue.b);
            bsp $$6 = this.h.b() instanceof dks $$5 ? $$5.a(this) : this.dY().a(this);
            float $$7 = (float)Math.min(azj.d((float)$$3 * this.l), this.k);
            this.dX().a(this, this.cS(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.h.a(awz.N);
            if ($$8 && $$7 > 0.0F && this.af.i() < 0.05F + (float)$$3 * 0.05F) {
               dvd $$9 = dgy.e(this.h);
               if ($$9 == null) {
                  this.i = true;
               } else {
                  this.h = $$9;
               }
            }

            return false;
         }
      }
   }

   @Override
   protected void b(uj $$0) {
      $$0.a("BlockState", uy.a(this.h));
      $$0.a("Time", this.b);
      $$0.a("DropItem", this.c);
      $$0.a("HurtEntities", this.j);
      $$0.a("FallHurtAmount", this.l);
      $$0.a("FallHurtMax", this.k);
      if (this.d != null) {
         $$0.a("TileEntityData", this.d);
      }

      $$0.a("CancelDrop", this.i);
   }

   @Override
   protected void a(uj $$0) {
      this.h = uy.a(this.dX().a(ly.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.j = $$0.q("HurtEntities");
         this.l = $$0.j("FallHurtAmount");
         this.k = $$0.h("FallHurtMax");
      } else if (this.h.a(awz.N)) {
         this.j = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.c = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.d = $$0.p("TileEntityData").i();
      }

      this.i = $$0.q("CancelDrop");
      if (this.h.l()) {
         this.h = dia.I.m();
      }
   }

   public void b(float $$0, int $$1) {
      this.j = true;
      this.l = $$0;
      this.k = $$1;
   }

   @Override
   public void o() {
      this.i = true;
   }

   @Override
   public boolean cG() {
      return false;
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.h.toString());
   }

   public dvd q() {
      return this.h;
   }

   @Override
   protected xh cA() {
      return xh.a("entity.minecraft.falling_block_type", this.h.b().f());
   }

   @Override
   public boolean cX() {
      return true;
   }

   @Override
   public zo<acd> a(arl $$0) {
      return new ace(this, $$0, dhy.j(this.q()));
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      this.h = dhy.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dx());
   }

   @Nullable
   @Override
   public btz b(esc $$0) {
      alg<dev> $$1 = $$0.a().ag();
      alg<dev> $$2 = this.dX().ag();
      boolean $$3 = ($$2 == dev.k || $$1 == dev.k) && $$2 != $$1;
      btz $$4 = super.b($$0);
      this.e = $$4 != null && $$3;
      return $$4;
   }
}
