import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cku extends bue {
   private static final Logger g = LogUtils.getLogger();
   private dvj h = dig.I.m();
   public int b;
   public boolean c = true;
   private boolean i;
   private boolean j;
   private int k = 40;
   private float l;
   @Nullable
   public uk d;
   public boolean e;
   protected static final akl<jh> f = akp.a(cku.class, akn.o);

   public cku(bul<? extends cku> $$0, dfb $$1) {
      super($$0, $$1);
   }

   private cku(dfb $$0, double $$1, double $$2, double $$3, dvj $$4) {
      this(bul.O, $$0);
      this.h = $$4;
      this.J = true;
      this.a_($$1, $$2, $$3);
      this.h(ezn.c);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.a(this.dx());
   }

   public static cku a(dfb $$0, jh $$1, dvj $$2) {
      cku $$3 = new cku($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(dvz.C) ? $$2.b(dvz.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cC() {
      return false;
   }

   public void a(jh $$0) {
      this.am.a(f, $$0);
   }

   public jh m() {
      return this.am.a(f);
   }

   @Override
   protected bue.b bh() {
      return bue.b.a;
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(f, jh.c);
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
         this.av();
      } else {
         die $$0 = this.h.b();
         this.b++;
         this.bg();
         this.a(bve.a, this.dA());
         this.aL();
         this.bX();
         if (!this.dX().C && (this.bM() || this.e)) {
            jh $$1 = this.dx();
            boolean $$2 = this.h.b() instanceof djq;
            boolean $$3 = $$2 && this.dX().b_($$1).a(axg.a);
            double $$4 = this.dA().h();
            if ($$2 && $$4 > 1.0) {
               ezj $$5 = this.dX().a(new dej(new ezn(this.L, this.M, this.N), this.dv(), dej.a.a, dej.b.b, this));
               if ($$5.d() != ezl.a.a && this.dX().b_($$5.b()).a(axg.a)) {
                  $$1 = $$5.b();
                  $$3 = true;
               }
            }

            if (this.aK() || $$3) {
               dvj $$6 = this.dX().a_($$1);
               this.h(this.dA().d(0.7, -0.5, 0.7));
               if (!$$6.a(dig.bQ)) {
                  if (!this.i) {
                     boolean $$7 = $$6.a(new czt(this.dX(), $$1, jm.a, cwb.k, jm.b));
                     boolean $$8 = dkz.n(this.dX().a_($$1.e())) && (!$$2 || !$$3);
                     boolean $$9 = this.h.a((dfe)this.dX(), $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.h.b(dvz.C) && this.dX().b_($$1).a() == erl.c) {
                           this.h = this.h.b(dvz.C, Boolean.valueOf(true));
                        }

                        if (this.dX().a($$1, this.h, 3)) {
                           ((arn)this.dX()).l().a.a(this, new acn($$1, this.dX().a_($$1)));
                           this.av();
                           if ($$0 instanceof dky) {
                              ((dky)$$0).a(this.dX(), $$1, this.h, $$6, this);
                           }

                           if (this.d != null && this.h.x()) {
                              dsm $$10 = this.dX().c_($$1);
                              if ($$10 != null) {
                                 uk $$11 = $$10.d(this.dX().H_());

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
                        } else if (this.c && this.dX().ac().b(dex.i)) {
                           this.av();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.av();
                        if (this.c && this.dX().ac().b(dex.i)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.av();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.dX().C && (this.b > 100 && ($$1.v() <= this.dX().I_() || $$1.v() > this.dX().al()) || this.b > 600)) {
               if (this.c && this.dX().ac().b(dex.i)) {
                  this.a($$0);
               }

               this.av();
            }
         }

         this.h(this.dA().c(0.98));
      }
   }

   public void a(die $$0, jh $$1) {
      if ($$0 instanceof dky) {
         ((dky)$$0).a(this.dX(), $$1, this);
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsu $$2) {
      if (!this.j) {
         return false;
      } else {
         int $$3 = azk.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bue> $$4 = buj.e.and(buj.b);
            bsu $$6 = this.h.b() instanceof dky $$5 ? $$5.a(this) : this.dY().a(this);
            float $$7 = (float)Math.min(azk.d((float)$$3 * this.l), this.k);
            this.dX().a(this, this.cS(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.h.a(axa.N);
            if ($$8 && $$7 > 0.0F && this.af.i() < 0.05F + (float)$$3 * 0.05F) {
               dvj $$9 = dhe.e(this.h);
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
   protected void b(uk $$0) {
      $$0.a("BlockState", uz.a(this.h));
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
   protected void a(uk $$0) {
      this.h = uz.a(this.dX().a(lz.f), $$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.j = $$0.q("HurtEntities");
         this.l = $$0.j("FallHurtAmount");
         this.k = $$0.h("FallHurtMax");
      } else if (this.h.a(axa.N)) {
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
         this.h = dig.I.m();
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

   public dvj q() {
      return this.h;
   }

   @Override
   protected xi cA() {
      return xi.a("entity.minecraft.falling_block_type", this.h.b().f());
   }

   @Override
   public boolean cX() {
      return true;
   }

   @Override
   public zp<ace> a(arm $$0) {
      return new acf(this, $$0, die.j(this.q()));
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      this.h = die.a($$0.p());
      this.J = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dx());
   }

   @Nullable
   @Override
   public bue b(esi $$0) {
      alh<dfb> $$1 = $$0.a().ag();
      alh<dfb> $$2 = this.dX().ag();
      boolean $$3 = ($$2 == dfb.k || $$1 == dfb.k) && $$2 != $$1;
      bue $$4 = super.b($$0);
      this.e = $$4 != null && $$3;
      return $$4;
   }
}
